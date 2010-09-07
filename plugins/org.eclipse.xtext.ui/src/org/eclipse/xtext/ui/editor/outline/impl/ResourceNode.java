/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ui.editor.outline.impl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;

public class ResourceNode extends AbstractOutlineNode {

	private URI uri;

	public ResourceNode(Resource resource, IOutlineNode parent, Image image, boolean hasChildren) {
		super(parent, image, resource.getURI().lastSegment(), hasChildren);
		this.uri = resource.getURI();
	}

	public URI getURI() {
		return uri;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj) && uri.equals(((ResourceNode) obj).getURI());
	}

	@Override
	public int hashCode() {
		return super.hashCode() + 43 * uri.hashCode();
	}
}