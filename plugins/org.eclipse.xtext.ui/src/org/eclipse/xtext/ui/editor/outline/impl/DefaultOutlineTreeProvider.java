/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ui.editor.outline.impl;

import java.util.Collections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.ui.editor.outline.IOutlineTreeProvider;

public class DefaultOutlineTreeProvider implements IOutlineTreeProvider {

	public Iterable<? extends Object> getChildren(Object element) {
		if (element instanceof EObject) {
			return ((EObject) element).eContents();
		} else if (element instanceof Resource) {
			return ((Resource) element).getContents();
		}
		return Collections.emptyList();
	}

	public Object getParent(Object element) {
		if (element instanceof EObject) {
			Resource directResource = ((InternalEObject) element).eDirectResource();
			if (directResource != null) {
				return directResource;
			}
			return ((EObject) element).eContainer();
		}
		return null;
	}
}