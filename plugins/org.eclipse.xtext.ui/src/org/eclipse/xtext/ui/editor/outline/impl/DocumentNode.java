/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ui.editor.outline.impl;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;

/**
 * @author koehnlein - Initial contribution and API
 */
public class DocumentNode extends AbstractOutlineNode {

	private IXtextDocument document;
	private Resource resource;

	public DocumentNode(IXtextDocument document, Resource resource, IOutlineNode parent, Image image, String text) {
		super(parent, image, text);
		this.document = document;
	}

	@Override
	public IXtextDocument getDocument() {
		return document;
	}

	public Resource internalGetResource() {
		return resource;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj) && document.equals(((DocumentNode) obj).getDocument());
	}
	
	@Override
	public int hashCode() {
		return super.hashCode() + 23 * document.hashCode();
	}
}
