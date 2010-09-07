/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ui.editor.outline;

import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.ISourceViewerAware;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.IXtextModelListener;
import org.eclipse.xtext.ui.editor.model.XtextDocumentUtil;
import org.eclipse.xtext.ui.editor.outline.impl.OutlineNodeContentProvider;
import org.eclipse.xtext.ui.editor.outline.impl.OutlineNodeLabelProvider;
import org.eclipse.xtext.ui.internal.Activator;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.inject.Inject;

/**
 * @author koehnlein - Initial contribution and API
 */
public class OutlinePage extends AbstractVirtualTreeContentOutlinePage implements ISourceViewerAware {

	protected class RefreshJob extends Job {
		private RefreshJob() {
			super("Refreshing outline");
		}

		@Override
		protected IStatus run(IProgressMonitor monitor) {
			try {
				//				System.out.println("Refreshing outline...");
				OutlineTreeState formerState = new OutlineTreeState(getTreeViewer());
				OutlineTreeState newState = new OutlineTreeState();
				IOutlineNode rootNode = refreshOutlineModel(monitor, formerState, newState);
				if (!monitor.isCanceled())
					refreshViewer(rootNode, newState.getExpandedNodes(),
							newState.getSelectedNodes());
				//				System.out.println("...done");
				return Status.OK_STATUS;
			} catch (Throwable t) {
				return new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Error refreshing outline", t);
			}
		}

		protected IOutlineNode refreshOutlineModel(final IProgressMonitor monitor,
				final OutlineTreeState formerState, final OutlineTreeState newState) {
			IOutlineNode rootNode = xtextDocument.readOnly(new IUnitOfWork<IOutlineNode, XtextResource>() {
				public IOutlineNode exec(XtextResource resource) throws Exception {
					IOutlineNode rootNode = treeProvider.createRoot(xtextDocument, resource);
					List<IOutlineNode> createdNodes = Lists.newArrayList();
					createdNodes.add(rootNode);
					newState.addExpandedNode(rootNode);
					for (IOutlineNode formerExpandedNode : formerState.getExpandedNodes()) {
						if (monitor.isCanceled())
							return null;
						expandParentsAndNode(monitor, resource, formerExpandedNode, newState, createdNodes);
					}
					for (IOutlineNode formerSelectedNode: formerState.getSelectedNodes()) {
						if (monitor.isCanceled())
							return null;
						IOutlineNode newSelectedNode = findEquivalentNode(formerSelectedNode, createdNodes);
						if(newSelectedNode != null)
							newState.addSelectedNode(newSelectedNode);
					}
					return rootNode;
				}
			});
			return rootNode;
		}

		protected IOutlineNode findEquivalentNode(IOutlineNode formerNode, List<IOutlineNode> createdNodes) {
			int index = createdNodes.indexOf(formerNode);
			if (index != -1)
				return createdNodes.get(index);
			return null;
		}

		protected boolean expandParentsAndNode(IProgressMonitor monitor, Resource resource,
				IOutlineNode formerExpandedNode, OutlineTreeState newState, List<IOutlineNode> createdNodes) {
			if (monitor.isCanceled())
				return false;
			IOutlineNode parent = formerExpandedNode.getParent();
			if (parent != null) {
				if (!expandParentsAndNode(monitor, resource, parent, newState, createdNodes))
					return false;
			}
			IOutlineNode newNode = findEquivalentNode(formerExpandedNode, createdNodes);
			if (newNode != null) {
				newState.addExpandedNode(newNode);
				if (newNode.needsCreateChildren()) {
					treeProvider.createChildren(newNode, resource);
					createdNodes.addAll(newNode.getChildren());
				}
				return true;
			}
			return false;
		}
	}

	private static final Logger LOG = Logger.getLogger(OutlinePage.class);

	@Inject
	private OutlineNodeLabelProvider labelProvider;

	@Inject
	private OutlineNodeContentProvider contentProvider;

	@Inject
	private IOutlineTreeProvider treeProvider;

	private IXtextModelListener modelListener;
	
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
				treeProvider.createChildren(rootNode, resource);
				return rootNode;
			}
		});
		refreshViewer(rootNode, Collections.singletonList(rootNode), Collections.<IOutlineNode> emptyList());
		modelListener = new IXtextModelListener() {
			public void modelChanged(XtextResource resource) {
				try {
					Job refreshJob = getRefreshJob();
					refreshJob.cancel();
					refreshJob.schedule();
				} catch (Throwable t) {
					LOG.error("Error refreshing outline", t);
				}
			}
		};
		xtextDocument.addModelListener(modelListener);
	}

	@Override
	public void dispose() {
		xtextDocument.removeModelListener(modelListener);
		super.dispose();
	}

	public void setSourceViewer(ISourceViewer sourceViewer) {
		IDocument document = sourceViewer.getDocument();
		xtextDocument = XtextDocumentUtil.get(document);
	}

	protected synchronized Job getRefreshJob() {
		if (refreshJob == null) {
			refreshJob = new RefreshJob();
		}
		return refreshJob;
	}

	protected void refreshViewer(final IOutlineNode rootNode, final List<IOutlineNode> nodesToBeExpanded,
			final List<IOutlineNode> selectedNodes) {
		DisplayRunHelper.runAsyncInDisplayThread(new Runnable() {
			public void run() {
				try {
					TreeViewer treeViewer = getTreeViewer();
					treeViewer.setInput(rootNode);
					treeViewer.expandToLevel(1);
					treeViewer.setExpandedElements(Iterables.toArray(nodesToBeExpanded, IOutlineNode.class));
					treeViewer.setSelection(new StructuredSelection(selectedNodes));
				} catch (Throwable t) {
					LOG.error("Error refreshing outline", t);
				}
			}
		});
	}

}
