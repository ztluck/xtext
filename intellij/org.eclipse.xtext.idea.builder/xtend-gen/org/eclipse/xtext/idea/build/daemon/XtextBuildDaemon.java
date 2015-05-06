/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.idea.build.daemon;

import com.google.common.base.Objects;
import com.google.common.collect.Multimap;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.channels.SelectionKey;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.channels.spi.AbstractSelector;
import java.nio.channels.spi.SelectorProvider;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.log4j.Category;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.TTCCLayout;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.builder.standalone.IIssueHandler;
import org.eclipse.xtext.builder.standalone.LanguageAccess;
import org.eclipse.xtext.builder.standalone.incremental.BuildRequest;
import org.eclipse.xtext.builder.standalone.incremental.FilesAndURIs;
import org.eclipse.xtext.builder.standalone.incremental.IncrementalStandaloneBuilder;
import org.eclipse.xtext.builder.standalone.incremental.IndexState;
import org.eclipse.xtext.idea.build.daemon.BuildDaemonModule;
import org.eclipse.xtext.idea.build.daemon.IBuildSessionSingletons;
import org.eclipse.xtext.idea.build.daemon.XtextBuildResultCollector;
import org.eclipse.xtext.idea.build.daemon.XtextLanguages;
import org.eclipse.xtext.idea.build.net.ObjectChannel;
import org.eclipse.xtext.idea.build.net.Protocol;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;

/**
 * @author Jan Koehnlein - Initial contribution and API
 */
@SuppressWarnings("all")
public class XtextBuildDaemon {
  public static class Arguments {
    private int port;
    
    private long timeout = (((1000 * 60) * 60) * 3);
    
    private long initialTimeout = 5000;
  }
  
  public static class Server {
    @Inject
    private XtextBuildDaemon.Worker worker;
    
    public void run(final XtextBuildDaemon.Arguments arguments) {
      try {
        ServerSocket serverSocket = null;
        try {
          XtextBuildDaemon.LOG.info((("Starting xtext build daemon at port " + Integer.valueOf(arguments.port)) + "..."));
          SelectorProvider _provider = SelectorProvider.provider();
          final AbstractSelector socketSelector = _provider.openSelector();
          final ServerSocketChannel serverChannel = ServerSocketChannel.open();
          serverChannel.configureBlocking(false);
          InetAddress _byName = InetAddress.getByName("127.0.0.1");
          final InetSocketAddress socketAddress = new InetSocketAddress(_byName, arguments.port);
          ServerSocket _socket = serverChannel.socket();
          _socket.bind(socketAddress);
          serverChannel.register(socketSelector, SelectionKey.OP_ACCEPT);
          XtextBuildDaemon.LOG.info("... success");
          long currentTimeout = arguments.initialTimeout;
          boolean shutdown = false;
          while ((!shutdown)) {
            {
              XtextBuildDaemon.LOG.info("Accepting connections...");
              try {
                socketSelector.select(currentTimeout);
                Set<SelectionKey> _selectedKeys = socketSelector.selectedKeys();
                for (final SelectionKey key : _selectedKeys) {
                  boolean _isAcceptable = key.isAcceptable();
                  if (_isAcceptable) {
                    SocketChannel socketChannel = null;
                    try {
                      SocketChannel _accept = serverChannel.accept();
                      socketChannel = _accept;
                      boolean _equals = Objects.equal(socketChannel, null);
                      if (_equals) {
                        XtextBuildDaemon.LOG.info((("No requests within " + Long.valueOf(currentTimeout)) + "ms."));
                        shutdown = true;
                      } else {
                        socketChannel.configureBlocking(true);
                        currentTimeout = arguments.timeout;
                        boolean _serve = this.worker.serve(socketChannel);
                        shutdown = _serve;
                      }
                    } finally {
                      if (socketChannel!=null) {
                        socketChannel.close();
                      }
                    }
                  }
                }
              } catch (final Throwable _t) {
                if (_t instanceof Exception) {
                  final Exception exc = (Exception)_t;
                  XtextBuildDaemon.LOG.error("Error during build", exc);
                } else {
                  throw Exceptions.sneakyThrow(_t);
                }
              }
            }
          }
        } catch (final Throwable _t) {
          if (_t instanceof Exception) {
            final Exception exc = (Exception)_t;
            XtextBuildDaemon.LOG.error("Error starting server socket", exc);
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
        XtextBuildDaemon.LOG.info("Shutting down");
        if (serverSocket!=null) {
          serverSocket.close();
        }
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
  }
  
  public static class Worker {
    @Inject
    private IncrementalStandaloneBuilder incrementalBuilder;
    
    @Inject
    private IBuildSessionSingletons.Impl singletons;
    
    @Inject
    private XtextBuildResultCollector xtextBuildResultCollector;
    
    @Inject
    private IIssueHandler issueHandler;
    
    private IndexState indexState;
    
    private ObjectChannel channel;
    
    public boolean serve(final SocketChannel socketChannel) {
      ObjectChannel _objectChannel = new ObjectChannel(socketChannel);
      this.channel = _objectChannel;
      try {
        final Serializable msg = this.channel.readObject();
        boolean _matched = false;
        if (!_matched) {
          if (msg instanceof Protocol.BuildRequestMessage) {
            _matched=true;
            XtextBuildDaemon.LOG.info("Received BuildRequest. Start build...");
            final Protocol.BuildResultMessage buildResult = this.build(((Protocol.BuildRequestMessage)msg));
            XtextBuildDaemon.LOG.info("...finished.");
            this.channel.writeObject(buildResult);
            XtextBuildDaemon.LOG.info("Result sent.");
          }
        }
        return false;
      } catch (final Throwable _t) {
        if (_t instanceof Exception) {
          final Exception exc = (Exception)_t;
          XtextBuildDaemon.LOG.error("Build failed", exc);
          Protocol.BuildFailureMessage _buildFailureMessage = new Protocol.BuildFailureMessage();
          final Procedure1<Protocol.BuildFailureMessage> _function = new Procedure1<Protocol.BuildFailureMessage>() {
            @Override
            public void apply(final Protocol.BuildFailureMessage it) {
              String _message = exc.getMessage();
              it.setMessage(_message);
            }
          };
          Protocol.BuildFailureMessage _doubleArrow = ObjectExtensions.<Protocol.BuildFailureMessage>operator_doubleArrow(_buildFailureMessage, _function);
          this.channel.writeObject(_doubleArrow);
          return false;
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    }
    
    public Protocol.BuildResultMessage build(final Protocol.BuildRequestMessage request) {
      final Procedure1<IBuildSessionSingletons.Impl> _function = new Procedure1<IBuildSessionSingletons.Impl>() {
        @Override
        public void apply(final IBuildSessionSingletons.Impl it) {
          it.setObjectChannel(Worker.this.channel);
          String _baseDir = request.getBaseDir();
          it.setModuleBaseURL(_baseDir);
        }
      };
      ObjectExtensions.<IBuildSessionSingletons.Impl>operator_doubleArrow(
        this.singletons, _function);
      BuildRequest _buildRequest = new BuildRequest();
      final Procedure1<BuildRequest> _function_1 = new Procedure1<BuildRequest>() {
        @Override
        public void apply(final BuildRequest it) {
          String _baseDir = request.getBaseDir();
          URI _asURI = FilesAndURIs.asURI(_baseDir);
          it.setBaseDir(_asURI);
          String _encoding = request.getEncoding();
          it.setDefaultEncoding(_encoding);
          List<String> _classpath = request.getClasspath();
          final Function1<String, URI> _function = new Function1<String, URI>() {
            @Override
            public URI apply(final String it) {
              return FilesAndURIs.asURI(it);
            }
          };
          List<URI> _map = ListExtensions.<String, URI>map(_classpath, _function);
          it.setClassPath(_map);
          List<String> _outputs = request.getOutputs();
          final Function1<String, URI> _function_1 = new Function1<String, URI>() {
            @Override
            public URI apply(final String it) {
              return FilesAndURIs.asURI(it);
            }
          };
          List<URI> _map_1 = ListExtensions.<String, URI>map(_outputs, _function_1);
          it.setOutputs(_map_1);
          List<String> _sourceRoots = request.getSourceRoots();
          final Function1<String, URI> _function_2 = new Function1<String, URI>() {
            @Override
            public URI apply(final String it) {
              return FilesAndURIs.asURI(it);
            }
          };
          List<URI> _map_2 = ListExtensions.<String, URI>map(_sourceRoots, _function_2);
          it.setSourceRoots(_map_2);
          List<String> _dirtyFiles = request.getDirtyFiles();
          final Function1<String, URI> _function_3 = new Function1<String, URI>() {
            @Override
            public URI apply(final String it) {
              return FilesAndURIs.asURI(it);
            }
          };
          List<URI> _map_3 = ListExtensions.<String, URI>map(_dirtyFiles, _function_3);
          it.setDirtyFiles(_map_3);
          List<String> _deletedFiles = request.getDeletedFiles();
          final Function1<String, URI> _function_4 = new Function1<String, URI>() {
            @Override
            public URI apply(final String it) {
              return FilesAndURIs.asURI(it);
            }
          };
          List<URI> _map_4 = ListExtensions.<String, URI>map(_deletedFiles, _function_4);
          it.setDeletedFiles(_map_4);
          it.setFailOnValidationError(false);
          boolean _notEquals = (!Objects.equal(Worker.this.indexState, null));
          if (_notEquals) {
            it.setPreviousState(Worker.this.indexState);
          } else {
            it.setIsFullBuild(true);
          }
          it.setIssueHandler(Worker.this.issueHandler);
          final Procedure2<URI, URI> _function_5 = new Procedure2<URI, URI>() {
            @Override
            public void apply(final URI source, final URI target) {
              Multimap<URI, URI> _generatedFile2sourceURI = Worker.this.xtextBuildResultCollector.getGeneratedFile2sourceURI();
              _generatedFile2sourceURI.put(source, target);
            }
          };
          it.setAfterGenerateFile(_function_5);
          final Procedure1<URI> _function_6 = new Procedure1<URI>() {
            @Override
            public void apply(final URI deleted) {
              Set<URI> _deletedFiles = Worker.this.xtextBuildResultCollector.getDeletedFiles();
              _deletedFiles.add(deleted);
            }
          };
          it.setAfterDeleteFile(_function_6);
        }
      };
      final BuildRequest buildRequest = ObjectExtensions.<BuildRequest>operator_doubleArrow(_buildRequest, _function_1);
      Map<String, LanguageAccess> _languageAccesses = XtextLanguages.getLanguageAccesses();
      IndexState _build = this.incrementalBuilder.build(buildRequest, _languageAccesses);
      this.indexState = _build;
      return this.xtextBuildResultCollector.getBuildResult();
    }
  }
  
  private final static Logger LOG = Logger.getLogger(XtextBuildDaemon.class);
  
  public static void main(final String[] args) {
    try {
      Category _parent = XtextBuildDaemon.LOG.getParent();
      TTCCLayout _tTCCLayout = new TTCCLayout();
      FileAppender _fileAppender = new FileAppender(_tTCCLayout, "xtext_builder_daemon.log", false);
      _parent.addAppender(_fileAppender);
      XtextBuildDaemon.LOG.setLevel(Level.INFO);
      BuildDaemonModule _buildDaemonModule = new BuildDaemonModule();
      final Injector injector = Guice.createInjector(_buildDaemonModule);
      XtextBuildDaemon.Server _instance = injector.<XtextBuildDaemon.Server>getInstance(XtextBuildDaemon.Server.class);
      XtextBuildDaemon.Arguments _parse = XtextBuildDaemon.parse(args);
      _instance.run(_parse);
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception exc = (Exception)_t;
        String _message = exc.getMessage();
        String _plus = ("Error " + _message);
        System.err.println(_plus);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  private static XtextBuildDaemon.Arguments parse(final String... args) {
    final XtextBuildDaemon.Arguments arguments = new XtextBuildDaemon.Arguments();
    final Iterator<String> i = ((List<String>)Conversions.doWrapArray(args)).iterator();
    while (i.hasNext()) {
      {
        final String arg = i.next();
        String _lowerCase = arg.toLowerCase();
        boolean _matched = false;
        if (!_matched) {
          if (Objects.equal(_lowerCase, "-port")) {
            _matched=true;
            String _next = i.next();
            int _parseInt = Integer.parseInt(_next);
            arguments.port = _parseInt;
          }
        }
        if (!_matched) {
          if (Objects.equal(_lowerCase, "-timeout")) {
            _matched=true;
            String _next_1 = i.next();
            long _parseLong = Long.parseLong(_next_1);
            arguments.timeout = _parseLong;
          }
        }
        if (!_matched) {
          if (Objects.equal(_lowerCase, "-initialtimeout")) {
            _matched=true;
            String _next_2 = i.next();
            long _parseLong_1 = Long.parseLong(_next_2);
            arguments.timeout = _parseLong_1;
          }
        }
        if (!_matched) {
          throw new IllegalArgumentException((("Invalid argument \'" + arg) + "\'"));
        }
      }
    }
    if ((arguments.port == 0)) {
      throw new IllegalArgumentException("Port number must be set");
    }
    return arguments;
  }
}
