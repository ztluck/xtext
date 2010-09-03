/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ui.editor.outline;

import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import com.google.inject.Inject;

/**
 * @author koehnlein - Initial contribution and API
 */
public abstract class AbstractOutlineContentProvider implements IContentProvider {

	@Inject
	protected IOutlineTreeProvider treeProvider;
	
	@Inject
	protected IOutlineNode.IFactory nodeFactory;
	
	protected IXtextDocument xtextDocument;

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		if (!(viewer instanceof TreeViewer))
			throw new IllegalArgumentException("viewer is not a TreeViewer");
		if(!(newInput instanceof IOutlineNode) && newInput != null )
			throw new IllegalArgumentException("input must be an IOutlineNode");
	}
	
	public IOutlineNode createInput(Object input) {
		return nodeFactory.createOutlineNode(input);
	}

	public void setXtextDocument(IXtextDocument xtextDocument) {
		this.xtextDocument = xtextDocument;
	}

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
	
	public void dispose() {
	}


	protected IOutlineNode asOutlineNode(Object element) {
		if (!(element instanceof IOutlineNode))
			throw new IllegalArgumentException("Node is not an IContentOutlineNode");
		final IOutlineNode elementNode = (IOutlineNode) element;
		return elementNode;
	}

}
