/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ui.editor.outline;

import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;

import com.google.inject.ImplementedBy;

/**
 * Defines the containement structure of elements in the outline.
 * 
 * @author koehnlein - Initial contribution and API
 */
@ImplementedBy(DefaultOutlineTreeProvider.class)
public interface IOutlineTreeProvider {

	Iterable<? extends Object> getChildren(Object element);

	Object getParent(Object element);
	
}
