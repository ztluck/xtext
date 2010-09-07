/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ui.editor.outline.impl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.IOutlineTreeProvider;
import org.eclipse.xtext.ui.editor.outline.old.OutlineLabelProvider;
import org.eclipse.xtext.util.PolymorphicDispatcher;

import com.google.inject.Inject;

public class DefaultOutlineTreeProvider implements IOutlineTreeProvider {

	@Inject
	@OutlineLabelProvider
	private ILabelProvider labelProvider;

	private PolymorphicDispatcher<Void> createChildrenDispatcher = PolymorphicDispatcher.createForSingleTarget(
			"createChildren", 2, 2, this);

	private PolymorphicDispatcher<AbstractOutlineNode> createNodeDispatcher = PolymorphicDispatcher
			.createForSingleTarget("createNode", 2, 2, this);

	public IOutlineNode createRoot(IXtextDocument document, Resource resource) {
		DocumentNode documentNode = new DocumentNode(document, resource, null, labelProvider.getImage(document),
				labelProvider.getText(document), true);
		return documentNode;
	}

	public void createChildren(IOutlineNode parent, Resource resource) {
		createChildrenDispatcher.invoke(parent, resource);
	}

	protected void createChildren(Object parent, Resource resource) {
	}

	protected void createChildren(DocumentNode parent, Resource resource) {
		createNodeDispatcher.invoke(parent, resource);
	}

	protected void createChildren(final ResourceNode parentNode, Resource resource) {
		for (EObject childElement : resource.getContents())
			createNodeDispatcher.invoke(parentNode, childElement);
	}

	protected void createChildren(final EObjectNode parentNode, Resource resource) {
		EObject eObject = resource.getEObject(parentNode.getEObjectURI().fragment());
		for (EObject childElement : eObject.eContents())
			createNodeDispatcher.invoke(parentNode, childElement);
	}

	protected IOutlineNode createNode(IOutlineNode parentNode, EObject eObject) {
		String text = labelProvider.getText(eObject);
		Image image = labelProvider.getImage(eObject);
		EObjectNode eObjectNode = new EObjectNode(eObject, parentNode, image, text, !eObject.eContents().isEmpty());
		return eObjectNode;
	}

	protected IOutlineNode createNode(IOutlineNode parentNode, Resource resource) {
		Image image = labelProvider.getImage(resource);
		ResourceNode resourceNode = new ResourceNode(resource, parentNode, image, !resource.getContents().isEmpty());
		return resourceNode;
	}

	protected IOutlineNode createNode(Object object0, Object object1) {
		throw new IllegalArgumentException("Could not find method createNode(" + nullSafeClassName(object0) + ","
				+ nullSafeClassName(object1));
	}

	private String nullSafeClassName(Object object) {
		return (object != null) ? object.getClass().getName() : "null";
	}

}
