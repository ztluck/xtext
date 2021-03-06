/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.builder.standalone.incremental;

import com.google.common.base.Objects;
import java.io.File;
import java.util.Map;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend.lib.annotations.Data;
import org.eclipse.xtext.builder.standalone.LanguageAccess;
import org.eclipse.xtext.builder.standalone.incremental.ClusteringStorageAwareResourceLoader;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.resource.clustering.IResourceClusteringPolicy;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * @author Jan Koehnlein - Initial contribution and API
 * @since 2.9
 */
@Data
@SuppressWarnings("all")
public class BuildContext {
  private final Map<String, LanguageAccess> languages;
  
  private final XtextResourceSet resourceSet;
  
  private final IResourceClusteringPolicy clusteringPolicy;
  
  private final File tempDir;
  
  private transient ClusteringStorageAwareResourceLoader loader;
  
  public <T extends Object> Iterable<T> executeClustered(final Iterable<URI> uri, final Function1<? super Resource, ? extends T> operation) {
    Iterable<T> _xblockexpression = null;
    {
      boolean _equals = Objects.equal(this.loader, null);
      if (_equals) {
        ClusteringStorageAwareResourceLoader _clusteringStorageAwareResourceLoader = new ClusteringStorageAwareResourceLoader(this);
        this.loader = _clusteringStorageAwareResourceLoader;
      }
      _xblockexpression = this.loader.<T>executeClustered(uri, operation);
    }
    return _xblockexpression;
  }
  
  public LanguageAccess getLanguageAccess(final URI uri) {
    String _fileExtension = uri.fileExtension();
    return this.languages.get(_fileExtension);
  }
  
  public BuildContext(final Map<String, LanguageAccess> languages, final XtextResourceSet resourceSet, final IResourceClusteringPolicy clusteringPolicy, final File tempDir) {
    super();
    this.languages = languages;
    this.resourceSet = resourceSet;
    this.clusteringPolicy = clusteringPolicy;
    this.tempDir = tempDir;
  }
  
  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this.languages== null) ? 0 : this.languages.hashCode());
    result = prime * result + ((this.resourceSet== null) ? 0 : this.resourceSet.hashCode());
    result = prime * result + ((this.clusteringPolicy== null) ? 0 : this.clusteringPolicy.hashCode());
    result = prime * result + ((this.tempDir== null) ? 0 : this.tempDir.hashCode());
    return result;
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    BuildContext other = (BuildContext) obj;
    if (this.languages == null) {
      if (other.languages != null)
        return false;
    } else if (!this.languages.equals(other.languages))
      return false;
    if (this.resourceSet == null) {
      if (other.resourceSet != null)
        return false;
    } else if (!this.resourceSet.equals(other.resourceSet))
      return false;
    if (this.clusteringPolicy == null) {
      if (other.clusteringPolicy != null)
        return false;
    } else if (!this.clusteringPolicy.equals(other.clusteringPolicy))
      return false;
    if (this.tempDir == null) {
      if (other.tempDir != null)
        return false;
    } else if (!this.tempDir.equals(other.tempDir))
      return false;
    return true;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("languages", this.languages);
    b.add("resourceSet", this.resourceSet);
    b.add("clusteringPolicy", this.clusteringPolicy);
    b.add("tempDir", this.tempDir);
    return b.toString();
  }
  
  @Pure
  public Map<String, LanguageAccess> getLanguages() {
    return this.languages;
  }
  
  @Pure
  public XtextResourceSet getResourceSet() {
    return this.resourceSet;
  }
  
  @Pure
  public IResourceClusteringPolicy getClusteringPolicy() {
    return this.clusteringPolicy;
  }
  
  @Pure
  public File getTempDir() {
    return this.tempDir;
  }
}
