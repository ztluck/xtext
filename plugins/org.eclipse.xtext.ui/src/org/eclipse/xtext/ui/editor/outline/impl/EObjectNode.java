/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ui.editor.outline.impl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.swt.graphics.Image;

public class EObjectNode extends AbstractOutlineNode {

	private URI eObjectURI;

	private EClass eClass;

	public EObjectNode(EObject eObject, Image image, Object text) {
		super(image, text);
		eObjectURI = EcoreUtil.getURI(eObject);
		eClass = eObject.eClass();
	}

	public Object getID() {
		return eObjectURI;
	}

	@Override
	@SuppressWarnings("rawtypes")
	public Object getAdapter(Class adapterType) {
		if (adapterType == EClass.class) {
			return eClass;
		}
		return super.getAdapter(adapterType);
	}



}