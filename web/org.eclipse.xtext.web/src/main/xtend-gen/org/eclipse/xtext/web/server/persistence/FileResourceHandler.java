/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.web.server.persistence;

import com.google.inject.Provider;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import javax.inject.Inject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.xtext.parser.IEncodingProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.web.server.model.IXtextWebDocument;
import org.eclipse.xtext.web.server.model.XtextWebDocument;
import org.eclipse.xtext.web.server.persistence.IResourceBaseProvider;
import org.eclipse.xtext.web.server.persistence.IServerResourceHandler;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class FileResourceHandler implements IServerResourceHandler {
  @Inject
  private IResourceBaseProvider resourceBaseProvider;
  
  @Inject
  private Provider<XtextResourceSet> resourceSetProvider;
  
  @Inject
  private Provider<XtextWebDocument> documentProvider;
  
  @Inject
  private IEncodingProvider encodingProvider;
  
  @Override
  public XtextWebDocument get(final String resourceId) throws IOException {
    try {
      try {
        final URI uri = this.resourceBaseProvider.getFileURI(resourceId);
        if ((uri == null)) {
          throw new IOException("The requested resource does not exist.");
        }
        final XtextResourceSet resourceSet = this.resourceSetProvider.get();
        Resource _resource = resourceSet.getResource(uri, true);
        final XtextResource resource = ((XtextResource) _resource);
        XtextWebDocument _get = this.documentProvider.get();
        final Procedure1<XtextWebDocument> _function = new Procedure1<XtextWebDocument>() {
          @Override
          public void apply(final XtextWebDocument it) {
            it.setInput(resource, resourceId);
          }
        };
        return ObjectExtensions.<XtextWebDocument>operator_doubleArrow(_get, _function);
      } catch (final Throwable _t) {
        if (_t instanceof WrappedException) {
          final WrappedException exception = (WrappedException)_t;
          throw exception.getCause();
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Override
  public void put(final IXtextWebDocument document) throws IOException {
    try {
      try {
        String _resourceId = document.getResourceId();
        final URI uri = this.resourceBaseProvider.getFileURI(_resourceId);
        XtextResource _resource = document.getResource();
        ResourceSet _resourceSet = _resource.getResourceSet();
        URIConverter _uRIConverter = _resourceSet.getURIConverter();
        final OutputStream outputStream = _uRIConverter.createOutputStream(uri);
        String _encoding = this.encodingProvider.getEncoding(uri);
        final OutputStreamWriter writer = new OutputStreamWriter(outputStream, _encoding);
        String _text = document.getText();
        writer.write(_text);
        writer.close();
      } catch (final Throwable _t) {
        if (_t instanceof WrappedException) {
          final WrappedException exception = (WrappedException)_t;
          throw exception.getCause();
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
