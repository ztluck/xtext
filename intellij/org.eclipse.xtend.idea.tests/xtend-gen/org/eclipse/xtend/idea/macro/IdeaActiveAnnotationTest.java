/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtend.idea.macro;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.projectRoots.Sdk;
import com.intellij.openapi.projectRoots.impl.JavaAwareProjectJdkTableImpl;
import com.intellij.openapi.roots.ModuleRootModificationUtil;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiManager;
import com.intellij.testFramework.PlatformTestCase;
import com.intellij.testFramework.builders.JavaModuleFixtureBuilder;
import com.intellij.testFramework.fixtures.IdeaProjectTestFixture;
import com.intellij.testFramework.fixtures.IdeaTestFixtureFactory;
import com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture;
import com.intellij.testFramework.fixtures.JavaTestFixtureFactory;
import com.intellij.testFramework.fixtures.ModuleFixture;
import com.intellij.testFramework.fixtures.TempDirTestFixture;
import com.intellij.testFramework.fixtures.TestFixtureBuilder;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.core.idea.lang.XtendLanguage;
import org.eclipse.xtend.core.macro.declaration.CompilationUnitImpl;
import org.eclipse.xtend.core.tests.macro.AbstractReusableActiveAnnotationTests;
import org.eclipse.xtend.core.xtend.XtendFile;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.idea.tests.LibraryUtil;
import org.eclipse.xtext.idea.tests.TestDecorator;
import org.eclipse.xtext.psi.impl.BaseXtextFile;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@TestDecorator
@SuppressWarnings("all")
public class IdeaActiveAnnotationTest extends PlatformTestCase {
  private static class Delegate extends AbstractReusableActiveAnnotationTests {
    private IdeaActiveAnnotationTest owner;
    
    @Inject
    private IResourceValidator validator;
    
    @Inject
    private Provider<CompilationUnitImpl> compilationUnitProvider;
    
    public Delegate(final IdeaActiveAnnotationTest owner) {
      this.owner = owner;
    }
    
    @Override
    public void assertProcessing(final Pair<String, String> macroFile, final Pair<String, String> clientFile, final Procedure1<? super CompilationUnitImpl> expectations) {
      String _key = macroFile.getKey();
      String _plus = ("macroModule/" + _key);
      String _value = macroFile.getValue();
      this.owner.writeFile(_plus, _value);
      String _key_1 = clientFile.getKey();
      String _plus_1 = ("clientModule/" + _key_1);
      String _value_1 = clientFile.getValue();
      final BaseXtextFile psiFile = this.owner.writeFile(_plus_1, _value_1);
      final XtextResource resource = psiFile.getResource();
      EcoreUtil2.resolveLazyCrossReferences(resource, CancelIndicator.NullImpl);
      this.validator.validate(resource, CheckMode.FAST_ONLY, CancelIndicator.NullImpl);
      final CompilationUnitImpl unit = this.compilationUnitProvider.get();
      EList<EObject> _contents = resource.getContents();
      Iterable<XtendFile> _filter = Iterables.<XtendFile>filter(_contents, XtendFile.class);
      XtendFile _head = IterableExtensions.<XtendFile>head(_filter);
      unit.setXtendFile(_head);
      expectations.apply(unit);
    }
  }
  
  private IdeaActiveAnnotationTest.Delegate delegate;
  
  public IdeaActiveAnnotationTest() {
    IdeaActiveAnnotationTest.Delegate _delegate = new IdeaActiveAnnotationTest.Delegate(this);
    this.delegate = _delegate;
    XtendLanguage.INSTANCE.injectMembers(this.delegate);
  }
  
  private JavaCodeInsightTestFixture myFixture;
  
  @Override
  protected void setUp() throws Exception {
    super.setUp();
    IdeaTestFixtureFactory _fixtureFactory = IdeaTestFixtureFactory.getFixtureFactory();
    String _name = this.getName();
    final TestFixtureBuilder<IdeaProjectTestFixture> projectBuilder = _fixtureFactory.createFixtureBuilder(_name);
    JavaTestFixtureFactory _fixtureFactory_1 = JavaTestFixtureFactory.getFixtureFactory();
    IdeaProjectTestFixture _fixture = projectBuilder.getFixture();
    JavaCodeInsightTestFixture _createCodeInsightFixture = _fixtureFactory_1.createCodeInsightFixture(_fixture);
    this.myFixture = _createCodeInsightFixture;
    final JavaModuleFixtureBuilder macroFixtureBuilder = projectBuilder.<JavaModuleFixtureBuilder>addModule(JavaModuleFixtureBuilder.class);
    TempDirTestFixture _tempDirFixture = this.myFixture.getTempDirFixture();
    final VirtualFile macroModuleDir = _tempDirFixture.findOrCreateDir("macroModule");
    String _path = macroModuleDir.getPath();
    macroFixtureBuilder.addSourceContentRoot(_path);
    final JavaModuleFixtureBuilder clientFixtureBuilder = projectBuilder.<JavaModuleFixtureBuilder>addModule(JavaModuleFixtureBuilder.class);
    TempDirTestFixture _tempDirFixture_1 = this.myFixture.getTempDirFixture();
    final VirtualFile clientModuleDir = _tempDirFixture_1.findOrCreateDir("clientModule");
    String _path_1 = clientModuleDir.getPath();
    clientFixtureBuilder.addSourceContentRoot(_path_1);
    this.myFixture.setUp();
    ModuleFixture _fixture_1 = macroFixtureBuilder.getFixture();
    final Module macroModule = _fixture_1.getModule();
    ModuleFixture _fixture_2 = clientFixtureBuilder.getFixture();
    final Module clientModule = _fixture_2.getModule();
    Sdk _testProjectJdk = this.getTestProjectJdk();
    ModuleRootModificationUtil.setModuleSdk(macroModule, _testProjectJdk);
    Sdk _testProjectJdk_1 = this.getTestProjectJdk();
    ModuleRootModificationUtil.setModuleSdk(clientModule, _testProjectJdk_1);
    LibraryUtil.addXtendLibrary(macroModule);
    LibraryUtil.addXtendLibrary(clientModule);
    ModuleRootModificationUtil.addDependency(clientModule, macroModule);
  }
  
  @Override
  protected Sdk getTestProjectJdk() {
    JavaAwareProjectJdkTableImpl _instanceEx = JavaAwareProjectJdkTableImpl.getInstanceEx();
    return _instanceEx.getInternalJdk();
  }
  
  @Override
  protected void tearDown() throws Exception {
    this.myFixture.tearDown();
    super.tearDown();
  }
  
  public BaseXtextFile writeFile(final String projectRelatveName, final String content) {
    try {
      BaseXtextFile _xblockexpression = null;
      {
        TempDirTestFixture _tempDirFixture = this.myFixture.getTempDirFixture();
        final VirtualFile vf = _tempDirFixture.createFile(projectRelatveName, content);
        PsiManager _psiManager = this.myFixture.getPsiManager();
        PsiFile _findFile = _psiManager.findFile(vf);
        _xblockexpression = ((BaseXtextFile) _findFile);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void testAccessAndModifyEnumerationValueDeclaration() {
    delegate.testAccessAndModifyEnumerationValueDeclaration();
  }
  
  public void testAddAnnotationValue() {
    delegate.testAddAnnotationValue();
  }
  
  public void testAddConstructor() {
    delegate.testAddConstructor();
  }
  
  public void testAddDefaultConstructor() {
    delegate.testAddDefaultConstructor();
  }
  
  public void testAddDefaultConstructorWithTemplate() {
    delegate.testAddDefaultConstructorWithTemplate();
  }
  
  public void testAddDispatchCase() {
    delegate.testAddDispatchCase();
  }
  
  public void testAnnotationArrayValueGetting_01() {
    delegate.testAnnotationArrayValueGetting_01();
  }
  
  public void testAnnotationArrayValueGetting_02() {
    delegate.testAnnotationArrayValueGetting_02();
  }
  
  public void testAnnotationDefaultValuesBug463161() {
    delegate.testAnnotationDefaultValuesBug463161();
  }
  
  public void testAnnotationDefaultValues_01() {
    delegate.testAnnotationDefaultValues_01();
  }
  
  public void testAnnotationDefaultValues_02() {
    delegate.testAnnotationDefaultValues_02();
  }
  
  public void testAnnotationValueSetting_1() {
    delegate.testAnnotationValueSetting_1();
  }
  
  public void testAnnotationValueSetting_2() {
    delegate.testAnnotationValueSetting_2();
  }
  
  public void testAnnotationValueSetting_3() {
    delegate.testAnnotationValueSetting_3();
  }
  
  public void testAnnotationValueSetting_AsExpression() {
    delegate.testAnnotationValueSetting_AsExpression();
  }
  
  public void testBug441081() {
    delegate.testBug441081();
  }
  
  public void testBug453273() {
    delegate.testBug453273();
  }
  
  public void testChangeDispatchHierachy() {
    delegate.testChangeDispatchHierachy();
  }
  
  public void testChangeJavaDoc() {
    delegate.testChangeJavaDoc();
  }
  
  public void testConstantExpressionEvaluation() {
    delegate.testConstantExpressionEvaluation();
  }
  
  public void testCreateTypeFromUsage() {
    delegate.testCreateTypeFromUsage();
  }
  
  public void testDeterministicExecutionOrder_01() {
    delegate.testDeterministicExecutionOrder_01();
  }
  
  public void testDeterministicExecutionOrder_02() {
    delegate.testDeterministicExecutionOrder_02();
  }
  
  public void testFileSystemSupport_01() {
    delegate.testFileSystemSupport_01();
  }
  
  public void testImportFromTypeReference_01() {
    delegate.testImportFromTypeReference_01();
  }
  
  public void testImportFromTypeReference_02() {
    delegate.testImportFromTypeReference_02();
  }
  
  public void testInferredMethodReturnType() {
    delegate.testInferredMethodReturnType();
  }
  
  public void testInferredTypeReferences() {
    delegate.testInferredTypeReferences();
  }
  
  public void testIntroduceNewTypeAndWorkWithIt() {
    delegate.testIntroduceNewTypeAndWorkWithIt();
  }
  
  public void testIntroduceNewTypes() {
    delegate.testIntroduceNewTypes();
  }
  
  public void testMarkAsDeprecated() {
    delegate.testMarkAsDeprecated();
  }
  
  public void testMarkAsDeprecated_02() {
    delegate.testMarkAsDeprecated_02();
  }
  
  public void testMarkReadAndInitialized() {
    delegate.testMarkReadAndInitialized();
  }
  
  public void testMarkReadAndInitialized2() {
    delegate.testMarkReadAndInitialized2();
  }
  
  public void testModifyTypeParameters() {
    delegate.testModifyTypeParameters();
  }
  
  public void testMovingComputedTypes() {
    delegate.testMovingComputedTypes();
  }
  
  public void testMovingComputedTypes_02() {
    delegate.testMovingComputedTypes_02();
  }
  
  public void testNoMutationInValidationPhase() {
    delegate.testNoMutationInValidationPhase();
  }
  
  public void testParameterAnnotation() {
    delegate.testParameterAnnotation();
  }
  
  public void testPropertyAnnotation() {
    delegate.testPropertyAnnotation();
  }
  
  public void testRemove() {
    delegate.testRemove();
  }
  
  public void testRemoveAnnotation() {
    delegate.testRemoveAnnotation();
  }
  
  public void testRemoveTypeParameters() {
    delegate.testRemoveTypeParameters();
  }
  
  public void testSetDocumentation() {
    delegate.testSetDocumentation();
  }
  
  public void testSetEmptyListAsAnnotationValue() {
    delegate.testSetEmptyListAsAnnotationValue();
  }
  
  public void testSetUpperBoundsForMutableTypeParameterDeclaration() {
    delegate.testSetUpperBoundsForMutableTypeParameterDeclaration();
  }
  
  public void testSimpleModification() {
    delegate.testSimpleModification();
  }
  
  public void testSwapExpressions() {
    delegate.testSwapExpressions();
  }
  
  public void testSwapExpressions_01() {
    delegate.testSwapExpressions_01();
  }
  
  public void testThrowsAndTypeParam() {
    delegate.testThrowsAndTypeParam();
  }
  
  public void testTracing() {
    delegate.testTracing();
  }
  
  public void testTracing2() {
    delegate.testTracing2();
  }
  
  public void testTracing3() {
    delegate.testTracing3();
  }
  
  public void testTracing4() {
    delegate.testTracing4();
  }
  
  public void testValidateLater() {
    delegate.testValidateLater();
  }
  
  public void testValidation() {
    delegate.testValidation();
  }
  
  public void testValidationPhase() {
    delegate.testValidationPhase();
  }
}
