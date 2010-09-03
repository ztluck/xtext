/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ui.editor.outline;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineNodeFactory;
import org.eclipse.xtext.ui.editor.outline.impl.EObjectNode;

import com.google.inject.ImplementedBy;

/**
 * A model for a node in the outline.
 * 
 * @author koehnlein - Initial contribution and API
 */
@ImplementedBy(EObjectNode.class)
public interface IOutlineNode extends IAdaptable {

	Object getID();
	
	Object getText();

	Image getImage();
	
	int getChildCount();
	
	void setChildCount(int index);
	
	/**
	 * Only called from within {@link org.eclipse.xtext.util.concurrent.IUnitOfWork}s.
	 * 
	 * @author koehnlein - Initial contribution and API
	 */
	@ImplementedBy(DefaultOutlineNodeFactory.class)
	interface IFactory {
		IOutlineNode createOutlineNode(Object element);
	
		Object resolveElement(IOutlineNode node, Resource resource);
	}


}
