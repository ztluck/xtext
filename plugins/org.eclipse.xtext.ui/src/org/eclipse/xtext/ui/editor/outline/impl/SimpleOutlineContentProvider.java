/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ui.editor.outline.impl;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.outline.AbstractOutlineContentProvider;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import com.google.common.base.Function;
import com.google.common.collect.Iterables;

/**
 * @author koehnlein - Initial contribution and API
 */
public class SimpleOutlineContentProvider extends AbstractOutlineContentProvider implements ITreeContentProvider {

	public Object[] getElements(Object parent) {
		final IOutlineNode parentNode = asOutlineNode(parent);
		Iterable<IOutlineNode> childNodes = xtextDocument.readOnly(new IUnitOfWork<Iterable<IOutlineNode>, XtextResource>() {
			public Iterable<IOutlineNode> exec(XtextResource resource) throws Exception {
				Object parentElement = nodeFactory.resolveElement(parentNode, resource);
				return Iterables.transform(treeProvider.getChildren(parentElement), new Function<Object, IOutlineNode>() {
					public IOutlineNode apply(Object childElement) {
						return nodeFactory.createOutlineNode(childElement);
					}
				});
			}
		});
		return Iterables.toArray(childNodes, Object.class);
	}

	public Object[] getChildren(Object parent) {
		return getElements(parent);
	}

	@Override
	public Object getParent(Object element) {
		final IOutlineNode elementNode = asOutlineNode(element);
		IOutlineNode parentNode = xtextDocument.readOnly(new IUnitOfWork<IOutlineNode, XtextResource>() {
			public IOutlineNode exec(XtextResource resource) throws Exception {
				Object element = nodeFactory.resolveElement(elementNode, resource);
				Object parentElement = treeProvider.getParent(element);
				return nodeFactory.createOutlineNode(parentElement);
			}
		});
		return parentNode;
	}

	public boolean hasChildren(Object parent) {
		final IOutlineNode parentNode = asOutlineNode(parent);
		return xtextDocument.readOnly(new IUnitOfWork<Boolean, XtextResource>() {
			public Boolean exec(XtextResource resource) throws Exception {
				Object parentElement = nodeFactory.resolveElement(parentNode, resource);
				return !Iterables.isEmpty(treeProvider.getChildren(parentElement));
			}
		});
	}

}
