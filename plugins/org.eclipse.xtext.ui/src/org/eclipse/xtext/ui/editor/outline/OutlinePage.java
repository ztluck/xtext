/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ui.editor.outline;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.ISourceViewerAware;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.IXtextModelListener;
import org.eclipse.xtext.ui.editor.model.XtextDocumentUtil;
import org.eclipse.xtext.ui.editor.outline.impl.InternalOutlineLabelProvider;
import org.eclipse.xtext.ui.editor.outline.impl.SimpleOutlineContentProvider;
import org.eclipse.xtext.ui.internal.Activator;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.inject.Inject;

/**
 * @author koehnlein - Initial contribution and API
 */
public class OutlinePage extends AbstractVirtualTreeContentOutlinePage implements ISourceViewerAware,
		IXtextModelListener {

	private static final Logger LOG = Logger.getLogger(OutlinePage.class);

	@Inject
	private InternalOutlineLabelProvider labelProvider;

	@Inject
	private SimpleOutlineContentProvider contentProvider;

	@Inject
	private IOutlineTreeProvider treeProvider;

	private IXtextDocument xtextDocument;

	private Job refreshJob;

	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);
		TreeViewer treeViewer = getTreeViewer();
		treeViewer.setLabelProvider(labelProvider);
		treeViewer.setContentProvider(contentProvider);
		treeViewer.setUseHashlookup(true);
		if (treeViewer instanceof OutlineTreeViewer) {
			((OutlineTreeViewer) treeViewer).setTreeProvider(treeProvider);
			((OutlineTreeViewer) treeViewer).setXtextDocument(xtextDocument);
		}
		IOutlineNode rootNode = xtextDocument.readOnly(new IUnitOfWork<IOutlineNode, XtextResource>() {
			public IOutlineNode exec(XtextResource resource) throws Exception {
				IOutlineNode rootNode = treeProvider.createRoot(xtextDocument, resource);
				return rootNode;
			}
		});
		refreshViewer(rootNode, Collections.singletonList(rootNode), Collections.<IOutlineNode> emptyList());
		xtextDocument.addModelListener(this);
	}

	@Override
	public void dispose() {
		xtextDocument.removeModelListener(this);
		super.dispose();
	}

	public void setSourceViewer(ISourceViewer sourceViewer) {
		IDocument document = sourceViewer.getDocument();
		xtextDocument = XtextDocumentUtil.get(document);
	}

	protected synchronized Job getRefreshJob() {
		if (refreshJob == null) {
			refreshJob = new Job("Refreshing outline") {
				@Override
				protected IStatus run(IProgressMonitor monitor) {
					try {
						System.out.println("Refreshing outline...");
						List<IOutlineNode> expandedNodes = getExpandedNodes();
						IOutlineNode rootNode = refreshOutlineModel(monitor, expandedNodes);
						if (!monitor.isCanceled())
							refreshViewer(rootNode, expandedNodes, Collections.<IOutlineNode> emptyList());
						System.out.println("...done");
						return Status.OK_STATUS;
					} catch (Throwable t) {
						return new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Error refreshing outline", t);
					}
				}
			};
		}
		return refreshJob;
	}

	protected IOutlineNode refreshOutlineModel(final IProgressMonitor monitor,
			final List<IOutlineNode> nodesToBeExpanded) {
		IOutlineNode rootNode = xtextDocument.readOnly(new IUnitOfWork<IOutlineNode, XtextResource>() {
			public IOutlineNode exec(XtextResource resource) throws Exception {
				IOutlineNode rootNode = treeProvider.createRoot(xtextDocument, resource);
				List<IOutlineNode> createdNodes = Lists.newArrayList();
				createdNodes.add(rootNode);
				if (rootNode.hasChildren()) {
					createdNodes.addAll(rootNode.getChildren());
				}
				for (Iterator<IOutlineNode> nodesToBeExpandedIter = nodesToBeExpanded.iterator(); 
					nodesToBeExpandedIter.hasNext(); ) {
					IOutlineNode nodeToBeExpanded = nodesToBeExpandedIter.next();
					if (monitor.isCanceled())
						return null;
					int index = createdNodes.indexOf(nodeToBeExpanded);
					if (index != -1) {
						IOutlineNode newNode = createdNodes.get(index);
						treeProvider.createChildren(newNode, resource);
						createdNodes.addAll(newNode.getChildren());
					} else {
						nodesToBeExpandedIter.remove();
					}
				}
				return rootNode;
			}
		});
		return rootNode;
	}

	public void modelChanged(XtextResource resource) {
		try {
			Job refreshJob = getRefreshJob();
			refreshJob.cancel();
			refreshJob.schedule();
		} catch (Throwable t) {
			LOG.error("Error refreshing outline", t);
		}
	}

	protected void refreshViewer(final IOutlineNode rootNode, final List<IOutlineNode> expandedNodes,
			final List<IOutlineNode> selectedNodes) {
		runInSWTThread(new Runnable() {
			public void run() {
				try {
					TreeViewer treeViewer = getTreeViewer();
					treeViewer.setInput(rootNode);
					treeViewer.setExpandedElements(Iterables.toArray(expandedNodes, IOutlineNode.class));
					treeViewer.setSelection(new StructuredSelection(selectedNodes));
				} catch (Throwable t) {
					LOG.error("Error refreshing outline", t);
				}
			}
		});
	}

	protected List<IOutlineNode> getExpandedNodes() {
		final List<IOutlineNode> expandedNodes = Lists.newArrayList();
		runInSWTThread(new Runnable() {
			public void run() {
				Object[] expandedElements = getTreeViewer().getExpandedElements();
				for (Object expandedElement : expandedElements) {
					if (!(expandedElement instanceof IOutlineNode))
						LOG.error("Content outline contains illegal node " + expandedElement);
					else
						expandedNodes.add((IOutlineNode) expandedElement);
				}
			}
		});
		return expandedNodes;
	}

	protected void runInSWTThread(Runnable runnable) {
		if (Display.getCurrent() == null) {
			Display.getDefault().asyncExec(runnable);
		} else {
			runnable.run();
		}
	}

}
