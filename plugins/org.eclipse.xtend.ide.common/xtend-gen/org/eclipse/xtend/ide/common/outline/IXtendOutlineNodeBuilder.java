/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtend.ide.common.outline;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.core.xtend.XtendFile;
import org.eclipse.xtend.ide.common.outline.IXtendOutlineContext;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmFeature;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.xbase.typesystem.override.IResolvedFeature;

/**
 * <p>
 * Builds platform specific outline nodes.
 * </p>
 * <p>
 * An implementation should not build children nodes. {@link IXtendOutlineTreeBuilder} is responsible for building an outline tree structure.
 * </p>
 * 
 * @author kosyakov - Initial contribution and API
 * @see IXtendOutlineTreeBuilder
 */
@SuppressWarnings("all")
public interface IXtendOutlineNodeBuilder {
  /**
   * Builds a platform specific outline node the given model element.
   */
  public abstract IXtendOutlineContext buildEObjectNode(final EObject modelElement, final IXtendOutlineContext context);
  
  /**
   * Builds a platform specific outline node for the given {@link org.eclipse.xtext.common.types.JvmType jvm type} or its source element.
   */
  public abstract IXtendOutlineContext buildXtendNode(final EObject modelElement, final IXtendOutlineContext context);
  
  /**
   * Builds a platform specific outline node for the given {@link org.eclipse.xtext.common.types.JvmFeature jvm feature} or its source element.
   */
  public abstract IXtendOutlineContext buildFeatureNode(final JvmDeclaredType inferredType, final EObject semanticFeature, final IXtendOutlineContext context);
  
  /**
   * Builds a platform specific outline node for the given {@link org.eclipse.xtext.common.types.JvmFeature dispatcher}.
   */
  public abstract IXtendOutlineContext buildDispatcherNode(final JvmDeclaredType baseType, final JvmFeature dispatcher, final List<JvmOperation> dispatchCases, final IXtendOutlineContext context);
  
  /**
   * Builds a platform specific outline node for a package of the given {@link org.eclipse.xtend.core.xtend.XtendFile Xtend file}.
   */
  public abstract IXtendOutlineContext buildPackageNode(final XtendFile xtendFile, final IXtendOutlineContext context);
  
  /**
   * Builds a platform specific outline node for an import section of the given {@link org.eclipse.xtend.core.xtend.XtendFile Xtend file}.
   */
  public abstract IXtendOutlineContext buildImportSectionNode(final XtendFile xtendFile, final IXtendOutlineContext context);
  
  /**
   * Builds a platform specific outline node for the given {@link org.eclipse.xtext.xbase.typesystem.override.IResolvedFeature resolved feature}.
   */
  public abstract IXtendOutlineContext buildResolvedFeatureNode(final JvmDeclaredType inferredType, final IResolvedFeature resolvedFeature, final IXtendOutlineContext context);
}