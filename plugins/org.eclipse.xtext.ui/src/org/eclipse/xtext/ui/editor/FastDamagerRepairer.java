/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ui.editor;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenSource;
import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITypedRegion;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.rules.ITokenScanner;
import org.eclipse.xtext.parser.antlr.Lexer;
import org.eclipse.xtext.ui.LexerUIBindings;

import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.name.Named;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class FastDamagerRepairer extends AbstractDamagerRepairer {

	private static class TokenInfo {

		private final int length;
		private final int type;

		private TokenInfo(CommonToken token) {
			length = token.getStopIndex() - token.getStartIndex() + 1;
			type = token.getType();
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + length;
			result = prime * result + type;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			TokenInfo other = (TokenInfo) obj;
			if (length != other.length)
				return false;
			if (type != other.type)
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "TokenInfo [length=" + length + ", type=" + type + "]";
		}
	}

	private boolean checkInvariant = true;
	private List<TokenInfo> tokenInfos;
	private IRegion previousRegion;
	private DocumentEvent previousEvent;

	private final Provider<Lexer> lexer;

	@Inject
	public FastDamagerRepairer(ITokenScanner scanner, @Named(LexerUIBindings.HIGHLIGHTING) Provider<Lexer> lexer) {
		super(scanner);
		this.lexer = lexer;
	}

	@Override
	public void setDocument(IDocument document) {
		super.setDocument(document);
		tokenInfos = createTokenInfos(document.get());
	}

	private List<TokenInfo> createTokenInfos(String string) {
		List<TokenInfo> result = Lists.newLinkedList();
		TokenSource source = createLexer(string);
		CommonToken token = (CommonToken) source.nextToken();
		while (token != Token.EOF_TOKEN) {
			TokenInfo info = createTokenInfo(token);
			result.add(info);
			token = (CommonToken) source.nextToken();
		}
		return result;
	}

	protected TokenInfo createTokenInfo(CommonToken token) {
		TokenInfo info = new TokenInfo(token);
		return info;
	}

	@Override
	public IRegion getDamageRegion(ITypedRegion partition, final DocumentEvent e, boolean documentPartitioningChanged) {
		if (documentPartitioningChanged) {
			previousEvent = null;
			previousRegion = null;
			tokenInfos = Lists.newLinkedList();
			return partition;
		}
		if (previousEvent == e && previousRegion != null) {
			if (isCheckInvariant()) {
				doCheckInvariant(e);
			}
			return previousRegion;
		}
		previousEvent = e;
		previousRegion = computeDamageRegion(e);
		if (isCheckInvariant()) {
			doCheckInvariant(e);
		}
		return previousRegion;
	}

	protected void doCheckInvariant(final DocumentEvent e) {
		List<TokenInfo> parsedTokenInfos = createTokenInfos(e.fDocument.get());
		if (!parsedTokenInfos.equals(tokenInfos)) {
			throw new IllegalStateException("Expected: '" + parsedTokenInfos + "' but was: '" + tokenInfos + "'.");
		}
	}

	private IRegion computeDamageRegion(final DocumentEvent e) {
		// empty document -> no dirty region
		if (e.getDocument().getLength() == 0) {
			tokenInfos = createTokenInfos(e.fDocument.get());
			return new Region(0, 0);
		}

		// previously empty -> full document dirty
		if (tokenInfos.isEmpty()) {
			tokenInfos = createTokenInfos(e.fDocument.get());
			return new Region(0, e.getDocument().getLength());
		}
		
		/* If nothing is changed, return the empty region */ 
		if (e.getLength() == 0 && e.getText().length() == 0)
		{
			return new Region(0, 0);
		}

		int tokenStartsAt = 0;
		int nextTokenStartsAt = 0;
		int tokenInfoIdx = 0;

		TokenSource source = createLexer(e.fDocument.get());
		CommonToken token = (CommonToken) source.nextToken();

		ListIterator<TokenInfo> tokenInfosIt = tokenInfos.listIterator();
		TokenInfo tokenInfo = null;

		// find start idx
		while (true) {
			if (token == Token.EOF_TOKEN) {
				removeTillEnd(tokenInfosIt);
				break;
			}

			if (tokenInfosIt.hasNext()) {
				tokenInfo = tokenInfosIt.next();
			} else {
				break;
			}

			if (!tokenCorrespondsToTokenInfo(token, tokenInfo))
				break;

			nextTokenStartsAt = tokenStartsAt + tokenInfo.length;

			if (nextTokenStartsAt >= e.fOffset)
				break;

			tokenInfoIdx++;
			tokenStartsAt = nextTokenStartsAt;
			token = (CommonToken) source.nextToken();
		}

		int regionOffset = tokenStartsAt;
		int regionLength = e.fDocument.getLength() - tokenStartsAt;
		int lengthDiff = e.fText.length() - e.fLength;
		int afterRegion = e.fOffset + e.fText.length();

		tokenStartsAt += lengthDiff;
		nextTokenStartsAt += lengthDiff;

//		int j = tokenInfosIt.nextIndex(); 
		tokenInfosIt.previous(); 
//		tokenInfosIt = tokenInfos.listIterator(tokenInfoIdx);

		// compute region length
		while (true) {
			boolean removed = false;

			if (token == Token.EOF_TOKEN || !tokenInfosIt.hasNext())
				break;
			while (true) {
				if (tokenInfosIt.hasNext()) {
					tokenInfo = tokenInfosIt.next();
				} else {
					break;
				}

				if (token.getStartIndex() >= afterRegion) {
					if (tokenStartsAt == token.getStartIndex() && tokenCorrespondsToTokenInfo(token, tokenInfo)) {
						return new Region(regionOffset, token.getStartIndex() - regionOffset);
					}
				}

				nextTokenStartsAt = tokenStartsAt + tokenInfo.length;
				if (nextTokenStartsAt > token.getStopIndex() + 1)
					break;
				tokenInfosIt.remove();
				removed = true;

				tokenStartsAt = nextTokenStartsAt;
				if (tokenStartsAt > token.getStartIndex())
					break;
			}
			TokenInfo tokenInfoToAdd = createTokenInfo(token);
			tokenInfoIdx++;

			if (removed) {
				tokenInfosIt.add(tokenInfoToAdd);
			} else {
				tokenInfosIt.previous();
				tokenInfosIt.add(tokenInfoToAdd);
			}

			token = (CommonToken) source.nextToken();
		}

		int size = tokenInfos.size (); 
		int nextIndex = tokenInfosIt.nextIndex(); 
		
		tokenInfos.subList(nextIndex, size).clear();

		// add subsequent tokens

		while (token != Token.EOF_TOKEN) {
			tokenInfos.add(createTokenInfo(token));
			token = (CommonToken) source.nextToken();
		}

		return new Region(regionOffset, regionLength);
	}

	private void removeTillEnd(ListIterator<TokenInfo> tokenInfosIt) {
		tokenInfosIt.remove();
		while (tokenInfosIt.hasNext()) {
			tokenInfosIt.next();
			tokenInfosIt.remove();
		}
	}

	private boolean tokenCorrespondsToTokenInfo(CommonToken token, TokenInfo tokenInfo) {
		return tokenInfo.type == token.getType() && getTokenLength(token) == tokenInfo.length;
	}

	private int getTokenLength(CommonToken token) {
		return token.getStopIndex() - token.getStartIndex() + 1;
	}

	protected Lexer createLexer(String string) {
		Lexer l = lexer.get();
		l.setCharStream(new ANTLRStringStream(string));
		return l;
	}

	public void setCheckInvariant(boolean checkInvariant) {
		this.checkInvariant = checkInvariant;
	}

	public boolean isCheckInvariant() {
		return checkInvariant;
	}

}
