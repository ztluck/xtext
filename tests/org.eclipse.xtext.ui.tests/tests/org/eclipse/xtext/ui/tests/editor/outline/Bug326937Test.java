/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ui.tests.editor.outline;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.xtext.junit.util.IResourcesSetupUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.edit.IDocumentEditor;
import org.eclipse.xtext.ui.editor.outline.ContentOutlineNode;
import org.eclipse.xtext.ui.editor.outline.XtextContentOutlinePage;
import org.eclipse.xtext.ui.editor.outline.linking.LinkingHelper;
import org.eclipse.xtext.ui.tests.Activator;
import org.eclipse.xtext.ui.tests.editor.AbstractEditorTest;
import org.eclipse.xtext.ui.tests.editor.outline.bug326937TestLanguage.A;
import org.eclipse.xtext.ui.tests.editor.outline.bug326937TestLanguage.AorB;
import org.eclipse.xtext.ui.tests.editor.outline.bug326937TestLanguage.Bug326937TestLanguagePackage;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import com.google.inject.Injector;

/**
 * @author koehnlein - Initial contribution and API
 */
public class Bug326937Test extends AbstractEditorTest {

	private XtextContentOutlinePage outlinePage;
	private XtextEditor xtextEditor;
	private String textualModel;
	private IViewPart outlineView;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		textualModel = "A parent { A child1 B child2 }";
		IFile testFile = IResourcesSetupUtil.createFile("test/test.bug326937testlanguage", textualModel);
		xtextEditor = openEditor(testFile);
		outlineView = xtextEditor.getSite().getPage().showView("org.eclipse.ui.views.ContentOutline");
		LinkingHelper.setLinkingEnabled(true);
		outlinePage = (XtextContentOutlinePage) xtextEditor.getAdapter(IContentOutlinePage.class);
	}
	
	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		xtextEditor.close(false);
		xtextEditor.getSite().getPage().hideView(outlineView);
		LinkingHelper.setLinkingEnabled(false);
	}
	
	@Override
	protected String getEditorId() {
		return "org.eclipse.xtext.ui.tests.editor.outline.Bug326937TestLanguage";
	}

	public void testStaleEObjectHandle() throws Exception {
		ContentOutlineNode parentOutlineNode = getParentOutlineNode(outlinePage);
		assertEquals(Bug326937TestLanguagePackage.Literals.A, parentOutlineNode.getClazz());
		final ContentOutlineNode child1OutlineNode = parentOutlineNode.getChildren().get(0);
		assertEquals(Bug326937TestLanguagePackage.Literals.A, child1OutlineNode.getClazz());
		ContentOutlineNode child2OutlineNode = parentOutlineNode.getChildren().get(1);
		assertEquals(Bug326937TestLanguagePackage.Literals.B, child2OutlineNode.getClazz());
		outlinePage.setSelection(new StructuredSelection(child1OutlineNode));
		Injector injector = Activator.getInstance().getInjector(getEditorId());
		IDocumentEditor documentEditor = injector.getInstance(IDocumentEditor.class);
		documentEditor.process(new IUnitOfWork.Void<XtextResource>() {
			@Override
			public void process(XtextResource state) throws Exception {
				EObject parent = state.getContents().get(0);
				assertTrue(parent instanceof A);
				AorB removedChild = ((A)parent).getContents().remove(0);
				assertTrue(removedChild instanceof A);
				child1OutlineNode.readOnly(new IUnitOfWork.Void<EObject>() {
					@Override
					public void process(EObject state) throws Exception {
						fail("Unit of work should not be executed for deleted element");
					}
				});
			}
		}, xtextEditor.getDocument());
		Display.getDefault().readAndDispatch();
		parentOutlineNode = getParentOutlineNode(outlinePage);
		ContentOutlineNode newChild2OutlineNode = parentOutlineNode.getChildren().get(0);
		assertEquals(Bug326937TestLanguagePackage.Literals.B, newChild2OutlineNode.getClazz());
		ISelection selection = outlinePage.getSelection();
		assertTrue(selection instanceof IStructuredSelection);
		assertEquals(0, ((IStructuredSelection)selection).size());
	}
	
	private ContentOutlineNode getParentOutlineNode(XtextContentOutlinePage outlinePage) {
		Tree tree = (Tree) outlinePage.getControl();
		TreeItem parentTreeItem = tree.getItem(0);
		assertTrue(parentTreeItem.getData() instanceof ContentOutlineNode);
		ContentOutlineNode parentOutlineNode = (ContentOutlineNode) parentTreeItem.getData();
		return parentOutlineNode;
	}
	
}
