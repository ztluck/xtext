/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtend.core.tests.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.xtend.core.jvmmodel.IXtendJvmAssociations;
import org.eclipse.xtend.core.tests.AbstractXtendTestCase;
import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtend.core.xtend.XtendFile;
import org.eclipse.xtend.core.xtend.XtendPackage;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.compiler.IGeneratorConfigProvider;
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator;
import org.eclipse.xtext.xbase.compiler.OnTheFlyJavaCompiler.EclipseRuntimeDependentJavaCompiler;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.junit.Before;
import org.junit.Test;

import testdata.Annotation1;
import testdata.Annotation2;
import testdata.Properties1;

import com.google.common.base.Function;
import com.google.inject.ImplementedBy;
import com.google.inject.Inject;
import com.google.inject.Singleton;

/**
 * @author Sven Efftinge - Initial contribution and API
 */
public class AnnotationsCompilerTest extends AbstractXtendTestCase {
	
	@Test public void testSimpleAnnotationOnType() throws Exception {
		final String text = "@com.google.inject.Singleton() class Foo {}";
		assertNotNull(getAnnotationOnClass(text, Singleton.class));
	}
	
	@Test public void testParameterizedAnnotationOnType_01() throws Exception {
		final String text = "@com.google.inject.ImplementedBy(typeof(String)) class Foo {}";
		ImplementedBy implementedBy = getAnnotationOnClass(text, ImplementedBy.class);
		assertTrue(implementedBy.value() == String.class);
	}
	
	@Test public void testParameterizedAnnotationOnType_02() throws Exception {
		final String text = "@com.google.inject.ImplementedBy(String) class Foo {}";
		ImplementedBy implementedBy = getAnnotationOnClass(text, ImplementedBy.class);
		assertTrue(implementedBy.value() == String.class);
	}
	
	@Test public void testParameterizedAnnotationOnType_03() throws Exception {
		final String text = "@com.google.inject.ImplementedBy(java.lang.String) class Foo {}";
		ImplementedBy implementedBy = getAnnotationOnClass(text, ImplementedBy.class);
		assertTrue(implementedBy.value() == String.class);
	}
	
	@Test public void testParameterizedAnnotationOnType_04() throws Exception {
		final String text = "@com.google.inject.ImplementedBy(java.util.Map.Entry) class Foo {}";
		ImplementedBy implementedBy = getAnnotationOnClass(text, ImplementedBy.class);
		assertTrue(implementedBy.value() == Map.Entry.class);
	}
	
	@Test public void testParameterizedAnnotationOnType_05() throws Exception {
		final String text = "@com.google.inject.ImplementedBy(java.util.Map$Entry) class Foo {}";
		ImplementedBy implementedBy = getAnnotationOnClass(text, ImplementedBy.class);
		assertTrue(implementedBy.value() == Map.Entry.class);
	}
	
	@Test public void testKeyValueParameterizedAnnotationOnType_01() throws Exception {
		final String text = "@com.google.inject.ImplementedBy( value = typeof(String)) class Foo {}";
		ImplementedBy implementedBy = getAnnotationOnClass(text, ImplementedBy.class);
		assertTrue(implementedBy.value() == String.class);
	}
	
	@Test public void testKeyValueParameterizedAnnotationOnType_02() throws Exception {
		final String text = "@com.google.inject.ImplementedBy( value = String) class Foo {}";
		ImplementedBy implementedBy = getAnnotationOnClass(text, ImplementedBy.class);
		assertTrue(implementedBy.value() == String.class);
	}
	
	@Test public void testKeyValueParameterizedAnnotationOnType_03() throws Exception {
		final String text = "@com.google.inject.ImplementedBy( value = java.lang.String) class Foo {}";
		ImplementedBy implementedBy = getAnnotationOnClass(text, ImplementedBy.class);
		assertTrue(implementedBy.value() == String.class);
	}
	@Test public void testKeyValueParameterizedAnnotationOnType_04() throws Exception {
		final String text = "@com.google.inject.ImplementedBy( value = java.util.Map.Entry) class Foo {}";
		ImplementedBy implementedBy = getAnnotationOnClass(text, ImplementedBy.class);
		assertTrue(implementedBy.value() == Map.Entry.class);
	}
	@Test public void testKeyValueParameterizedAnnotationOnType_05() throws Exception {
		final String text = "@com.google.inject.ImplementedBy( value = java.util.Map$Entry) class Foo {}";
		ImplementedBy implementedBy = getAnnotationOnClass(text, ImplementedBy.class);
		assertTrue(implementedBy.value() == Map.Entry.class);
	}
	
	@Test public void testKeyValueParameterizedAnnotationOnField() throws Exception {
		final String text = "class Foo { @com.google.inject.Inject(optional = true) String string }";
		Inject inject = getAnnotationOnField(text, Inject.class);
		assertTrue(inject.optional());
	}
	
	@Test public void testKeyValueParameterizedAnnotationOnField_02() throws Exception {
		final String text = "class Foo { @com.google.inject.Inject(optional = b) String string static val b = true }";
		Inject inject = getAnnotationOnField(text, Inject.class);
		assertTrue(inject.optional());
	}
	
	@Test public void testKeyValueParameterizedAnnotationOnField_03() throws Exception {
		final String text = "class Foo { @com.google.inject.Inject(optional = Foo.b) String string static val b = true }";
		Inject inject = getAnnotationOnField(text, Inject.class);
		assertTrue(inject.optional());
	}
	
	@Test public void testKeyValueParameterizedAnnotationOnField_04() throws Exception {
		final String text = "class Foo { @com.google.inject.Inject(optional = Foo::b) String string static val b = true }";
		Inject inject = getAnnotationOnField(text, Inject.class);
		assertTrue(inject.optional());
	}
	
	@Test public void testKeyValueParameterizedAnnotationOnMethod() throws Exception {
		final String text = "class Foo { @com.google.inject.Inject(optional = true) def String string() {} }";
		Inject inject = getAnnotationOnMethod(text, Inject.class);
		assertTrue(inject.optional());
	}
	
	@Test public void testMarkerAnnotationOnField() throws Exception {
		final String text = "class Foo { @com.google.inject.Inject String string }";
		Inject inject = getAnnotationOnField(text, Inject.class);
		assertNotNull(inject);
	}
	
	@Test public void testAnnotationOnField() throws Exception {
		final String text = "class Foo { @com.google.inject.Inject() String string }";
		Inject inject = getAnnotationOnField(text, Inject.class);
		assertNotNull(inject);
	}
	
	@Test public void testBug351554_01() throws Exception {
		final String text = 
			"class Foo {\n" +
			"	@org.eclipse.xtext.validation.Check(org::eclipse::xtext::validation::CheckType::NORMAL)\n" +
			"	def void checkSomething(Object o) {}\n" +
			"}";
		Check check = getAnnotationOnMethod(text, Check.class);
		assertNotNull(check);
		assertEquals(CheckType.NORMAL, check.value());
	}
	
	@Test public void testBug351554_02() throws Exception {
		final String text = 
				"class Foo {\n" +
				"	@org.eclipse.xtext.validation.Check(org.eclipse.xtext.validation.CheckType::NORMAL)\n" +
				"	def void checkSomething(Object o) {}\n" +
				"}";
		Check check = getAnnotationOnMethod(text, Check.class);
		assertNotNull(check);
		assertEquals(CheckType.NORMAL, check.value());
	}
	
	@Test public void testBug351554_03() throws Exception {
		final String text = 
				"class Foo {\n" +
				"	@org.eclipse.xtext.validation.Check(org.eclipse.xtext.validation.CheckType.NORMAL)\n" +
				"	def void checkSomething(Object o) {}\n" +
				"}";
		Check check = getAnnotationOnMethod(text, Check.class);
		assertNotNull(check);
		assertEquals(CheckType.NORMAL, check.value());
	}

	@Test public void testBug351554_04() throws Exception {
		final String text = 
			"@testdata.Annotation1(children = @testdata.Annotation2(#['a', 'b']), value=true)\n" +
			"class Foo {}";
		Annotation1 annotation = getAnnotationOnClass(text, Annotation1.class);
		assertNotNull(annotation);
		assertNotNull(annotation.children());
		assertEquals(1, annotation.children().length);
		Annotation2 nestedAnnotation = annotation.children()[0];
		assertNotNull(nestedAnnotation);
		assertNotNull(nestedAnnotation.value());
		assertEquals(2, nestedAnnotation.value().length);
		assertEquals("a", nestedAnnotation.value()[0]);
		assertEquals("b", nestedAnnotation.value()[1]);
	}
	
	protected <T extends Annotation> T getAnnotationOnClass(final String text, Class<T> annotation) throws Exception {
		Class<?> class1 = compileToClass(text);
		return class1.getAnnotation(annotation);
	}
	
	protected <T extends Annotation> T getAnnotationOnField(final String text, Class<T> annotation) throws Exception {
		Class<?> class1 = compileToClass(text);
		Field field = class1.getDeclaredFields()[0];
		return field.getAnnotation(annotation);
	}
	
	protected <T extends Annotation> T getAnnotationOnMethod(final String text, Class<T> annotation) throws Exception {
		Class<?> class1 = compileToClass(text);
		Method method = class1.getDeclaredMethods()[0];
		return method.getAnnotation(annotation);
	}

	protected Class<?> compileToClass(final String text) throws Exception {
		XtendFile file = parseHelper.parse(text);
		validationHelper.assertNoErrors(file);
		JvmGenericType inferredType = associations.getInferredType((XtendClass) file.getXtendTypes().get(0));
		CharSequence javaCode = generator.generateType(inferredType, generatorConfigProvider.get(file));
		Class<?> class1 = javaCompiler.compileToClass("Foo", javaCode.toString());
		return class1;
	}
	
	@Inject
	private EclipseRuntimeDependentJavaCompiler javaCompiler;

	@Inject
	private ParseHelper<XtendFile> parseHelper;

	@Inject
	private ValidationTestHelper validationHelper;
	
	@Inject
	private IXtendJvmAssociations associations;
	
	@Inject
	private JvmModelGenerator generator;
	
	@Inject
	private IGeneratorConfigProvider generatorConfigProvider;

	@Before
	public void setUp() throws Exception {
		javaCompiler.addClassPathOfClass(getClass());
		javaCompiler.addClassPathOfClass(Check.class);
		javaCompiler.addClassPathOfClass(Test.class);
		javaCompiler.addClassPathOfClass(StringExtensions.class);
		javaCompiler.addClassPathOfClass(Notifier.class);
		javaCompiler.addClassPathOfClass(EcorePackage.class);
		javaCompiler.addClassPathOfClass(XbasePackage.class);
		javaCompiler.addClassPathOfClass(XtendPackage.class);
		javaCompiler.addClassPathOfClass(Inject.class);
		javaCompiler.addClassPathOfClass(Properties1.class);
		javaCompiler.addClassPathOfClass(Function.class);
		javaCompiler.addClassPathOfClass(StringConcatenation.class);
	}
}
