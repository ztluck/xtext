/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ui.editor.outline.impl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.old.OutlineLabelProvider;

import com.google.inject.Inject;

public class DefaultOutlineNodeFactory implements IOutlineNode.IFactory {

	@Inject
	@OutlineLabelProvider
	private ILabelProvider labelProvider;

	public IOutlineNode createOutlineNode(Object element) {
		Image image = labelProvider.getImage(element);
		if (element instanceof EObject) {
			String text = labelProvider.getText(element);
			return new EObjectNode((EObject) element, image, text);
		} else if (element instanceof Resource) {
			return new ResourceNode((Resource) element, image);
		}
		return null;
	}

	public Object resolveElement(IOutlineNode node, Resource resource) {
		Object id = node.getID();
		if (id instanceof URI) {
			if (resource.getURI().equals(id))
				return resource;
			return resource.getEObject(((URI) id).fragment());
		}
		return null;
	}
}