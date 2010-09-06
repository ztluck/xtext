/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ui.editor.outline.impl;

import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import com.google.common.collect.Lists;

/**
 * @author koehnlein - Initial contribution and API
 */
public abstract class AbstractOutlineNode implements IOutlineNode {

	private Image image;

	private Object text;

	private AbstractOutlineNode parent;

	private List<IOutlineNode> children;

	private boolean hasChildren = false;

	protected AbstractOutlineNode(IOutlineNode parent, Image image, Object text) {
		this.text = text == null ? "<unnamed>" : text;
		this.image = image;
		setParent(parent);
	}

	private void setParent(IOutlineNode newParent) {
		Assert.isLegal(newParent == null || newParent instanceof AbstractOutlineNode);
		if (parent != null) 
			parent.removeChild(this);
		parent = (AbstractOutlineNode) newParent;
		if (parent != null) 
			parent.addChild(this);
	}

	private boolean addChild(IOutlineNode outlineNode) {
		if (children == null)
			children = Lists.newArrayList();
		return children.add(outlineNode);
	}

	private boolean removeChild(IOutlineNode outlineNode) {
		if (children == null)
			return false;
		return children.remove(outlineNode);
	}

	public List<IOutlineNode> getChildren() {
		if (children == null)
			children = Lists.newArrayList();
		return Collections.unmodifiableList(children);
	}

	public IOutlineNode getParent() {
		return parent;
	}

	public boolean hasChildren() {
		return hasChildren || children != null && children.size() > 0;
	}

	public void setHasChildren(boolean hasChildren) {
		this.hasChildren = hasChildren;
	}

	public Object getText() {
		return text;
	}

	public Image getImage() {
		return image;
	}

	public IXtextDocument getDocument() {
		IOutlineNode parent = getParent();
		if (parent != null) {
			return parent.getDocument();
		}
		return null;
	}

	@Override
	public String toString() {
		return "[" + getClass().getSimpleName() + "] " + text.toString();
	}

	@SuppressWarnings("rawtypes")
	public Object getAdapter(Class adapterType) {
		return Platform.getAdapterManager().getAdapter(this, adapterType);
	}

	public <T> T readOnly(IUnitOfWork<T, EObject> work) {
		return null;
	}

	public <T> T modify(IUnitOfWork<T, EObject> work) {
		return null;
	}

	@Override
	public boolean equals(Object obj) {
		return obj != null
				&& obj.getClass().equals(getClass())
				&& ((parent != null && parent.equals(((IOutlineNode) obj).getParent())) 
						|| (parent == null && ((IOutlineNode) obj).getParent() == null));
	}
	
	@Override
	public int hashCode() {
		return getClass().hashCode() + ((parent == null) ? 0 : 11 * parent.hashCode());
	}
}
