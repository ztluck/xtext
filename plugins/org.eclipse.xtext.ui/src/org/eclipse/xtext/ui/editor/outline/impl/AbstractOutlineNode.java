/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ui.editor.outline.impl;

import org.eclipse.core.runtime.Platform;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;

/**
 * @author koehnlein - Initial contribution and API
 */
public abstract class AbstractOutlineNode implements IOutlineNode {

	private int childCount = -1;

	private Image image;

	private Object text;

	protected AbstractOutlineNode(Image image, Object text) {
		this.text = text == null ? "<unnamed>" : text;
		this.image = image;
	}

	public int getChildCount() {
		return childCount;
	}

	public void setChildCount(int childCount) {
		this.childCount = childCount;
	}

	public Object getText() {
		return text;
	}

	public Image getImage() {
		return image;
	}

	@Override
	public String toString() {
		return "[" + getClass().getName() + "] " + text.toString();
	}

	@SuppressWarnings("rawtypes")
	public Object getAdapter(Class adapterType) {
		return Platform.getAdapterManager().getAdapter(this, adapterType);
	}

	@Override
	public boolean equals(Object object) {
		return (object != null) && (object.getClass() == getClass())
				&& ((AbstractOutlineNode) object).getID().equals(getID());
	}

	@Override
	public int hashCode() {
		return getID().hashCode();
	}
}
