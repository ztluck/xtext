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

public class ResourceNode extends AbstractOutlineNode {

	private URI uri;

	ResourceNode(Resource resource, Image image) {
		super(image, resource.getURI().lastSegment());
		uri = resource.getURI();
	}

	public Object getID() {
		return uri;
	}

}