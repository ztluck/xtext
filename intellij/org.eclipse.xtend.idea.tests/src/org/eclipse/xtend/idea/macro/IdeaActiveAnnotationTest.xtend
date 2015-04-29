/*******************************************************************************
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtend.idea.macro

import com.google.inject.Inject
import com.google.inject.Provider
import com.intellij.openapi.projectRoots.impl.JavaAwareProjectJdkTableImpl
import com.intellij.openapi.roots.ModuleRootModificationUtil
import com.intellij.testFramework.PlatformTestCase
import com.intellij.testFramework.builders.JavaModuleFixtureBuilder
import com.intellij.testFramework.fixtures.IdeaTestFixtureFactory
import com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture
import com.intellij.testFramework.fixtures.JavaTestFixtureFactory
import org.eclipse.xtend.core.idea.lang.XtendLanguage
import org.eclipse.xtend.core.macro.declaration.CompilationUnitImpl
import org.eclipse.xtend.core.tests.macro.AbstractReusableActiveAnnotationTests
import org.eclipse.xtend.core.xtend.XtendFile
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.idea.tests.LibraryUtil
import org.eclipse.xtext.idea.tests.TestDecorator
import org.eclipse.xtext.psi.impl.BaseXtextFile
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.xtext.validation.CheckMode
import org.eclipse.xtext.validation.IResourceValidator

@TestDecorator
class IdeaActiveAnnotationTest extends PlatformTestCase {

	Delegate delegate

	new() {
		this.delegate = new Delegate(this)
		XtendLanguage.INSTANCE.injectMembers(delegate)
	}

	JavaCodeInsightTestFixture myFixture

	override protected setUp() throws Exception {
		super.setUp

		val projectBuilder = IdeaTestFixtureFactory.getFixtureFactory.createFixtureBuilder(name)

		myFixture = JavaTestFixtureFactory.fixtureFactory.createCodeInsightFixture(projectBuilder.fixture)

		val macroFixtureBuilder = projectBuilder.addModule(JavaModuleFixtureBuilder)
		val macroModuleDir = myFixture.tempDirFixture.findOrCreateDir("macroModule")
		macroFixtureBuilder.addSourceContentRoot(macroModuleDir.path)

		val clientFixtureBuilder = projectBuilder.addModule(JavaModuleFixtureBuilder)
		val clientModuleDir = myFixture.tempDirFixture.findOrCreateDir("clientModule")
		clientFixtureBuilder.addSourceContentRoot(clientModuleDir.path)
		myFixture.setUp

		val macroModule = macroFixtureBuilder.fixture.module
		val clientModule = clientFixtureBuilder.fixture.module
		ModuleRootModificationUtil.setModuleSdk(macroModule, testProjectJdk)
		ModuleRootModificationUtil.setModuleSdk(clientModule, testProjectJdk)
		LibraryUtil.addXtendLibrary(macroModule)
		LibraryUtil.addXtendLibrary(clientModule)
		ModuleRootModificationUtil.addDependency(clientModule, macroModule)
	}

	override protected getTestProjectJdk() {
		JavaAwareProjectJdkTableImpl.instanceEx.internalJdk
	}

	override protected tearDown() throws Exception {
		myFixture.tearDown
		super.tearDown
	}

	def writeFile(String projectRelatveName, String content) {
		val vf = myFixture.tempDirFixture.createFile(projectRelatveName, content)
		myFixture.psiManager.findFile(vf) as BaseXtextFile
	}

	private static class Delegate extends AbstractReusableActiveAnnotationTests {

		IdeaActiveAnnotationTest owner
		@Inject IResourceValidator validator
		@Inject Provider<CompilationUnitImpl> compilationUnitProvider

		new(IdeaActiveAnnotationTest owner) {
			this.owner = owner
		}

		override assertProcessing(Pair<String, String> macroFile, Pair<String, String> clientFile,
			(CompilationUnitImpl)=>void expectations) {
			owner.writeFile("macroModule/" + macroFile.key, macroFile.value)
			val psiFile = owner.writeFile("clientModule/" + clientFile.key, clientFile.value)
			val resource = psiFile.resource
			EcoreUtil2.resolveLazyCrossReferences(resource, CancelIndicator.NullImpl)
			validator.validate(resource, CheckMode.FAST_ONLY, CancelIndicator.NullImpl)
			val unit = compilationUnitProvider.get
			unit.xtendFile = resource.contents.filter(XtendFile).head
			expectations.apply(unit)
		}
	}
}