/*******************************************************************************
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
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

public class EObjectNode extends AbstractOutlineNode {

	private URI eObjectURI;

	private EClass eClass;

	public EObjectNode(EObject eObject, IOutlineNode parent, Image image, Object text, boolean hasChildren) {
		super(parent, image, text, hasChildren);
		this.eObjectURI = EcoreUtil.getURI(eObject);
		this.eClass = eObject.eClass();
	}

	public URI getEObjectURI() {
		return eObjectURI;
	}

	public EClass getEClass() {
		return eClass;
	}

	@Override
	@SuppressWarnings("rawtypes")
	public Object getAdapter(Class adapterType) {
		if (adapterType == EClass.class) {
			return eClass;
		}
		return super.getAdapter(adapterType);
	}

	@Override
	public <T> T readOnly(final IUnitOfWork<T, EObject> work) {
		return getDocument().readOnly(new IUnitOfWork<T, XtextResource>() {
			public T exec(XtextResource state) throws Exception {
				EObject eObject = state.getEObject(eObjectURI.fragment());
				return work.exec(eObject);
			}
		});
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj) && eObjectURI.equals(((EObjectNode) obj).getEObjectURI())
				&& eClass.equals(((EObjectNode) obj).getEClass());
	}

	@Override
	public int hashCode() {
		return super.hashCode() + 37 * eObjectURI.hashCode() + 41 * eClass.hashCode();
	}

}