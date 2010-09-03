/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ui.editor.outline;

import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.ISourceViewerAware;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.IXtextModelListener;
import org.eclipse.xtext.ui.editor.model.XtextDocumentUtil;
import org.eclipse.xtext.ui.editor.outline.impl.InternalOutlineLabelProvider;
import org.eclipse.xtext.ui.editor.outline.impl.LazyOutlineContentProvider;
import org.eclipse.xtext.ui.editor.outline.impl.SimpleOutlineContentProvider;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import com.google.inject.Inject;

/**
 * @author koehnlein - Initial contribution and API
 */
public class OutlinePage extends AbstractVirtualTreeContentOutlinePage implements ISourceViewerAware,
		IXtextModelListener {

	@Inject
	private InternalOutlineLabelProvider labelProvider;

	@Inject
//	private SimpleOutlineContentProvider contentProvider;
	private LazyOutlineContentProvider contentProvider;

	private IXtextDocument xtextDocument;

	/**
	 * Create a new content outline page.
	 */
	protected OutlinePage() {
		super();
	}

	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);
		getTreeViewer().setLabelProvider(labelProvider);
		getTreeViewer().setContentProvider(contentProvider);
		getTreeViewer().setUseHashlookup(true);
		contentProvider.setXtextDocument(xtextDocument);
		xtextDocument.addModelListener(this);
		refreshViewer();
	}

	public void setSourceViewer(ISourceViewer sourceViewer) {
		IDocument document = sourceViewer.getDocument();
		xtextDocument = XtextDocumentUtil.get(document);
	}

	public IOutlineNode refreshViewer() {
		IOutlineNode rootNode = xtextDocument.readOnly(new IUnitOfWork<IOutlineNode, XtextResource>() {
			public IOutlineNode exec(XtextResource resource) throws Exception {
				IOutlineNode rootNode = contentProvider.createInput(resource);
				return rootNode;
			}
		});
		getTreeViewer().setInput(rootNode);
		getTreeViewer().expandToLevel(1);
		return rootNode;
	}

	private static volatile AtomicBoolean isUpdateScheduled = new AtomicBoolean(false);

	public void modelChanged(XtextResource resource) {
		if (!isUpdateScheduled.getAndSet(true)) {
			runInSWTThread(new Runnable() {
				public void run() {
					refreshViewerAndResetSelection();
				}

				private void refreshViewerAndResetSelection() {
					System.out.println("Model changed");
					long start = System.currentTimeMillis();
					isUpdateScheduled.set(false);
					TreeViewer treeViewer = getTreeViewer();
					Object[] expandedElements = treeViewer.getExpandedElements();
					ISelection selection = treeViewer.getSelection();
					refreshViewer();
					if (expandedElements != null && expandedElements.length > 0)
						treeViewer.setExpandedElements(expandedElements);
					if(selection != null)
						treeViewer.setSelection(selection);
					long time = System.currentTimeMillis()-start;
					System.out.println("Time to update tree: " + time);
				}
			});
		}
	}

	protected void runInSWTThread(Runnable runnable) {
		if (Display.getCurrent() == null) {
			Display.getDefault().asyncExec(runnable);
		} else {
			runnable.run();
		}
	}

}
