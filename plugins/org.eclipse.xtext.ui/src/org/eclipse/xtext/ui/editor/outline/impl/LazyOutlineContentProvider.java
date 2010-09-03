/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ui.editor.outline.impl;

import org.eclipse.jface.viewers.ILazyTreeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.outline.AbstractOutlineContentProvider;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import com.google.common.collect.Iterables;

/**
 * @author koehnlein - Initial contribution and API
 */
public class LazyOutlineContentProvider extends AbstractOutlineContentProvider implements ILazyTreeContentProvider {

	private TreeViewer viewer;

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		super.inputChanged(viewer, oldInput, newInput);
		this.viewer = (TreeViewer) viewer;
	}

	public void updateElement(Object parent, final int index) {
		final IOutlineNode parentNode = asOutlineNode(parent);
		//System.out.println("Updating " + parentNode.getText() + "[" + index + "]");
		IOutlineNode childNode = xtextDocument.readOnly(new IUnitOfWork<IOutlineNode, XtextResource>() {
			public IOutlineNode exec(XtextResource resource) throws Exception {
				Object parentElement = nodeFactory.resolveElement(parentNode, resource);
				Object childElement = Iterables.get(treeProvider.getChildren(parentElement), index);
				IOutlineNode childNode = nodeFactory.createOutlineNode(childElement);
				return childNode;
			}
		});
		if (childNode != null) {
			viewer.replace(parentNode, index, childNode);
			updateChildCount(childNode, -1);
		}
	}

	public void updateChildCount(Object parent, int currentChildCount) {
		final IOutlineNode parentNode = asOutlineNode(parent);
		if (currentChildCount == -1 || currentChildCount != parentNode.getChildCount()) {
			int childCount = xtextDocument.readOnly(new IUnitOfWork<Integer, XtextResource>() {
				public Integer exec(XtextResource resource) throws Exception {
					Object parentElement = nodeFactory.resolveElement(parentNode, resource);
					Iterable<? extends Object> children = treeProvider.getChildren(parentElement);
					return Iterables.size(children);
				}
			});
			parentNode.setChildCount(childCount);
			viewer.setChildCount(parentNode, childCount);
		} else {
			viewer.setChildCount(parentNode, currentChildCount);
		}
	}

}
