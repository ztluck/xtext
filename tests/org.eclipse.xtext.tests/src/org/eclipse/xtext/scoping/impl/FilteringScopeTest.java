/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.scoping.impl;

import java.util.Collections;

import junit.framework.TestCase;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class FilteringScopeTest extends TestCase {
	
	public void testEClass() {
		EClass clazz = EcoreFactory.eINSTANCE.createEClass();
		clazz.setName("FooBar");
		IScope delegate = Scopes.scopeFor(Collections.singleton(clazz));
		FilteringScope filteringScope = new FilteringScope(delegate, EcorePackage.Literals.ECLASS);
		assertSame(clazz, filteringScope.getContentByName("FooBar").getEObjectOrProxy());
	}
	
	public void testEClassifier() {
		EClass clazz = EcoreFactory.eINSTANCE.createEClass();
		clazz.setName("FooBar");
		IScope delegate = Scopes.scopeFor(Collections.singleton(clazz));
		FilteringScope filteringScope = new FilteringScope(delegate, EcorePackage.Literals.ECLASSIFIER);
		assertSame(clazz, filteringScope.getContentByName("FooBar").getEObjectOrProxy());
	}
	
	public void testEObject() {
		EClass clazz = EcoreFactory.eINSTANCE.createEClass();
		clazz.setName("FooBar");
		IScope delegate = Scopes.scopeFor(Collections.singleton(clazz));
		FilteringScope filteringScope = new FilteringScope(delegate, EcorePackage.Literals.EOBJECT);
		assertSame(clazz, filteringScope.getContentByName("FooBar").getEObjectOrProxy());
	}
	
	public void testEAnnotation() {
		EClass clazz = EcoreFactory.eINSTANCE.createEClass();
		clazz.setName("FooBar");
		IScope delegate = Scopes.scopeFor(Collections.singleton(clazz));
		FilteringScope filteringScope = new FilteringScope(delegate, EcorePackage.Literals.EANNOTATION);
		assertNull(filteringScope.getContentByName("FooBar"));
	}
	
}
