/**
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtend.core.macro.declaration;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.core.macro.declaration.SourceMemberDeclarationImpl;
import org.eclipse.xtend.core.xtend.XtendFile;
import org.eclipse.xtend.core.xtend.XtendTypeDeclaration;
import org.eclipse.xtend.lib.macro.declaration.SourceTypeDeclaration;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;

@SuppressWarnings("all")
public abstract class SourceTypeDeclarationImpl<T extends XtendTypeDeclaration> extends SourceMemberDeclarationImpl<T> implements SourceTypeDeclaration {
  public String getPackageName() {
    EObject _delegate = this.getDelegate();
    EObject _eContainer = _delegate.eContainer();
    return ((XtendFile) _eContainer).getPackage();
  }
  
  public String getSimpleName() {
    XtendTypeDeclaration _delegate = this.getDelegate();
    String _name = _delegate.getName();
    return _name;
  }
  
  public String getName() {
    String _xifexpression = null;
    String _packageName = this.getPackageName();
    boolean _notEquals = ObjectExtensions.operator_notEquals(_packageName, null);
    if (_notEquals) {
      String _packageName_1 = this.getPackageName();
      String _plus = (_packageName_1 + ".");
      String _simpleName = this.getSimpleName();
      String _plus_1 = (_plus + _simpleName);
      _xifexpression = _plus_1;
    } else {
      String _simpleName_1 = this.getSimpleName();
      _xifexpression = _simpleName_1;
    }
    return _xifexpression;
  }
}