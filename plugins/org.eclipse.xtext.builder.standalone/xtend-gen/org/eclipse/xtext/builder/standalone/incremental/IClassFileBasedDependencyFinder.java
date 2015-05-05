/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.builder.standalone.incremental;

import com.google.common.collect.Iterables;
import com.google.inject.ImplementedBy;
import org.eclipse.emf.common.util.URI;

/**
 * @author Jan Koehnlein - Initial contribution and API
 */
@ImplementedBy(IClassFileBasedDependencyFinder.NullImpl.class)
@SuppressWarnings("all")
public interface IClassFileBasedDependencyFinder {
  public static class NullImpl implements IClassFileBasedDependencyFinder {
    @Override
    public Iterable<URI> getDependentJavaFiles(final Iterable<URI> dirtyJavaFiles, final Iterable<URI> deletedJavaFiles) {
      return Iterables.<URI>concat(dirtyJavaFiles, deletedJavaFiles);
    }
  }
  
  public abstract Iterable<URI> getDependentJavaFiles(final Iterable<URI> dirtyJavaFiles, final Iterable<URI> deletedJavaFiles);
}
