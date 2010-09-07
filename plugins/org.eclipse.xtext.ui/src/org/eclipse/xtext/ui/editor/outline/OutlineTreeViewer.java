/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ui.editor.outline;

import java.util.Collection;
import java.util.Set;

import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.events.TreeEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Item;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import com.google.common.collect.Sets;

/**
 * @author koehnlein - Initial contribution and API
 */
public class OutlineTreeViewer extends TreeViewer {

	private IOutlineTreeProvider treeProvider;
	
	private IXtextDocument xtextDocument;
	
	public OutlineTreeViewer(Composite parent, int styles) {
		super(parent, styles);
	}

	public void setTreeProvider(IOutlineTreeProvider treeProvider) {
		this.treeProvider = treeProvider;
	}
	
	public void setXtextDocument(IXtextDocument xtextDocument) {
		this.xtextDocument = xtextDocument;
	}
	
	/**
	 * Copied from {@link TreeViewer} and introduced HashSet.
	 */
	@Override
	public void setExpandedElements(Object[] elements) {
		assertElementsNotNull(elements);
		if (checkBusy()) {
			return;
		}
		Set<Object> expandedElements = Sets.newHashSet();
		for (int i = 0; i < elements.length; ++i) {
			Object element = elements[i];
			// Ensure item exists for element. This will materialize items for
			// each element and their parents, if possible. This is important
			// to support expanding of inner tree nodes without necessarily
			// expanding their parents.
			internalExpand(element, false);
			expandedElements.add(element);
		}
		// this will traverse all existing items, and create children for
		// elements that need to be expanded. If the tree contains multiple
		// equal elements, and those are in the set of elements to be expanded,
		// only the first item found for each element will be expanded.
		internalSetExpanded(expandedElements, getControl());
	}

	/**
	 * Copied from {@link TreeViewer} and adapted for performance reasons.
	 * See TODO bug ID 
	 */
	protected void internalSetExpanded(Collection<?> expandedElements, Widget widget) {
		Item[] items = getChildren(widget);
		for (int i = 0; i < items.length; i++) {
			Item item = items[i];
			Object data = item.getData();
			if (data != null) {
				// remove the element to avoid an infinite loop
				// if the same element appears on a child item
				boolean expanded = expandedElements.remove(data);
				if (expanded != getExpanded(item)) {
					if (expanded) {
						createChildren(item);
					}
					setExpanded(item, expanded);
				}
				if (expandedElements.size() > 0) {
					internalSetExpanded(expandedElements, item);
				}
			} 
		}
	}
	
	@Override
	protected void handleTreeExpand(TreeEvent event) {
		Object node = event.item.getData();
		Assert.isLegal(node instanceof IOutlineNode);
		calculateOutlineNodeChildren((IOutlineNode) node);
		super.handleTreeExpand(event);
	}

	@Override
	public void expandToLevel(Object elementOrTreePath, int level) {
		if (elementOrTreePath instanceof IOutlineNode) {
			IOutlineNode node = (IOutlineNode) elementOrTreePath;
			calculateOutlineNodeChildren(node);
		}
		super.expandToLevel(elementOrTreePath, level);
	}
	
	protected void calculateOutlineNodeChildren(final IOutlineNode node) {
		if(node.needsCreateChildren()) {
			xtextDocument.readOnly(new IUnitOfWork.Void<XtextResource>(){
				@Override
				public void process(XtextResource state) throws Exception {
					treeProvider.createChildren(node, state);				
				}
			});
		}
	}
}
