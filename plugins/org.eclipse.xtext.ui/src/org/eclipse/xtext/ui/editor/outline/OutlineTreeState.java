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
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;

import com.google.common.collect.Lists;

/**
 * Either stores the expansion/selection of a tree viewer or aggregates the new expansion/selection state.
 * 
 * @author koehnlein - Initial contribution and API
 */
public class OutlineTreeState {

	private static final Logger LOG = Logger.getLogger(OutlineTreeState.class);

	private List<IOutlineNode> expandedNodes;
	private List<IOutlineNode> selectedNodes;

	public OutlineTreeState(TreeViewer treeViewer) {
		expandedNodes = Collections.unmodifiableList(getExpandedNodes(treeViewer));
		selectedNodes = Collections.unmodifiableList(getSelectedNodes(treeViewer));
	}

	public OutlineTreeState() {
		expandedNodes = Lists.newArrayList();
		selectedNodes = Lists.newArrayList();
	}

	protected List<IOutlineNode> getExpandedNodes(final TreeViewer treeViewer) {
		final List<IOutlineNode> expandedNodes = Lists.newArrayList();
		DisplayRunHelper.runSyncInDisplayThread(new Runnable() {
			public void run() {
				Object[] expandedElements = treeViewer.getExpandedElements();
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

	protected List<IOutlineNode> getSelectedNodes(final TreeViewer treeViewer) {
		DisplayRunHelper.runSyncInDisplayThread(new Runnable() {
			public void run() {
				selectedNodes = Lists.newArrayList();
				ISelection selection = treeViewer.getSelection();
				if (selection instanceof IStructuredSelection) {
					for (Iterator<?> selectionIter = ((IStructuredSelection) selection).iterator(); selectionIter
							.hasNext();) {
						Object selectedElement = selectionIter.next();
						if (!(selectedElement instanceof IOutlineNode))
							LOG.error("Content outline contains illegal node " + selectedElement);
						else
							selectedNodes.add((IOutlineNode) selectedElement);
					}
				}
			}
		});
		return selectedNodes;
	}

	public List<IOutlineNode> getSelectedNodes() {
		return selectedNodes;
	}

	public List<IOutlineNode> getExpandedNodes() {
		return expandedNodes;
	}

	public boolean addExpandedNode(IOutlineNode node) {
		if (expandedNodes.contains(node))
			return false;
		return expandedNodes.add(node);
	}

	public boolean addSelectedNode(IOutlineNode node) {
		if (selectedNodes.contains(node))
			return false;
		return selectedNodes.add(node);
	}

}
