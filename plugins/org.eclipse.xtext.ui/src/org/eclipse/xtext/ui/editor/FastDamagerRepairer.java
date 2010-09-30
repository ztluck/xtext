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
			length = getTokenLength(token);
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

		CommonToken token = null;

		do {
			token = (CommonToken) source.nextToken();
			TokenInfo info = createTokenInfo(token);
			result.add(info);
		} while (token != Token.EOF_TOKEN);

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
		if (e.getLength() == 0 && e.getText().length() == 0) {
			return new Region(0, 0);
		}

		int tokenInfoStart = -1;
		int nextTokenInfoStart = 0;

		assert tokenInfos.get(tokenInfos.size() - 1).type == Token.EOF;

		TokenSource source = createLexer(e.fDocument.get());
		CommonToken token = null;

		ListIterator<TokenInfo> tokenInfosIt = tokenInfos.listIterator();
		TokenInfo tokenInfo = null;

		/* At the end of this loop, we want to have found the first 
		 * token (if any) that does not correspond with the previous time we lexed or
		 * that lies within the modified region.  */

		while (true) {
			token = (CommonToken) source.nextToken();

			/* Note: there is always a EOF TokenInfo at the end of the list.  If we run
			 * into that then either the lexer will also have returned a EOF or not.
			 * If so then the loop will be ended at the bottom.  If not, the loop
			 * will be ended due to a mismatch.	 Therefore, we can safely fetch a
			 * tokenInfo without "hasNext". */
			tokenInfo = tokenInfosIt.next();

			tokenInfoStart = nextTokenInfoStart;
			nextTokenInfoStart = tokenInfoStart + tokenInfo.length;
			boolean inModifiedRegion = tokenInfoStart >= e.fOffset;

			if (!tokenCorrespondsToTokenInfo(token, tokenInfo, inModifiedRegion)) {
				/* Mismatch */
				break;
			}

			if (token.getType() == Token.EOF) {
				/* Perfect match all the way to the end of the file without running into the modified region. */
				return new Region(0, 0);
			}
		}
		
		/* At this point tokenInfo and token are the first mismatch.  
		 * tokenInfosIt points to the next mismatch (if any). */ 

		int regionOffset = tokenInfoStart;
		int lengthDiff = e.fText.length() - e.fLength;
		int afterRegion = e.fOffset + e.fText.length();

		/* We have to shift the accounting for the position of the tokens we've seen because
		 * we will be comparing them with the position of tokens _after_ the modified region. 
		 * We have to take the size of the new text into account. */
		
		tokenInfoStart += lengthDiff;
		nextTokenInfoStart += lengthDiff;
		
		/* Drop all the TokenInfos that are (partially) in or before the modified region. */
		while (tokenInfo.type != Token.EOF && tokenInfoStart < afterRegion) {
			tokenInfosIt.remove();

			tokenInfo = tokenInfosIt.next();
			tokenInfoStart = nextTokenInfoStart;
			nextTokenInfoStart = tokenInfoStart + tokenInfo.length;
		}
		
		tokenInfosIt.previous();
		
		/* At this point tokenInfosIt.next will produce the first TokenInfo that comes
		 * from after the modified region.  tokenInfosIt.prev should produce the last matched 
		 * TokenInfo before the region (if it exists).
		 * 
		 * tokenInfo is the first TokenInfo that is located completely after the modified region. 
		 */

		/* Parse all the tokens that are partially in or before the modified region. */
		while (token.getType() != Token.EOF && token.getStartIndex() < afterRegion) {
			tokenInfosIt.add(createTokenInfo(token));
			token = (CommonToken) source.nextToken();
		}
		
		/* At this point token is the first token located after the modified region */ 
		
		tokenInfosIt.next (); 
		
		/* At this point tokenInfosIt.next () will produce the second TokenInfo that comes
		 * after the modified region. 
		 * 
		 * token points to the first token completely located after the modified region. */
		
		/* Now we try to find a matching Token/TokenInfo pair located after the changed region.  */
		while (token != Token.EOF_TOKEN && tokenInfo.type != Token.EOF) {
			/* This loop removes all the TokenInfos that do not match 
			 * with the current or any subsequent Token and returns from the function 
			 * if a match is found */
			while (true) {
				if (tokenInfoStart > token.getStopIndex() || tokenInfo.type == Token.EOF) {
					/* We've rejected matching as many TokenInfos as we could on the basis
					 * of the current Token.  Go to next Token. */
					break;
				} else {
					if (tokenInfoStart == token.getStartIndex() && tokenCorrespondsToTokenInfo(token, tokenInfo, false)) {
						/* Match */ 
						return new Region(regionOffset, token.getStartIndex() - regionOffset);
					}
					else 
					{
						/* Mismatch */
						tokenInfosIt.remove();
						tokenInfo = tokenInfosIt.next();
						tokenInfoStart = nextTokenInfoStart;
						nextTokenInfoStart = tokenInfoStart + tokenInfo.length;
					}
				}
			}

			/* After this loop, tokenInfo points to EOF or to a TokenInfo that 
			 * is positioned strictly after the current Token.  The current Token didn't
			 * match the TokenInfos so it must replace the TokenInfos that were removed. */

			TokenInfo tokenInfoToAdd = createTokenInfo(token);
			tokenInfosIt.previous();
			tokenInfosIt.add(tokenInfoToAdd);
			tokenInfosIt.next (); 
			
			/* At this point tokenInfosIt.next () is again the TokenInfo 
			 * after the current tokenInfo value. */  

			token = (CommonToken) source.nextToken();
		}

		/* At this point, we either ran out of TokenInfos or Tokens without actually finding a match. */

		if (tokenInfo.type == Token.EOF) {
			/* If we ran out of TokenInfos then we have to drop the EOF 
			 * TokenInfo and append the remaining converted Tokens. */

			tokenInfosIt.remove();
			tokenInfosIt.add(createTokenInfo(token));
			while (token.getType() != Token.EOF) {
				token = (CommonToken) source.nextToken();
				tokenInfosIt.add(createTokenInfo(token));
			}
		} else {
			/* If we ran out of Tokens then we have to remove any 
			 * remaining TokenInfos and append EOF. */
			int size = tokenInfos.size();
			int nextIndex = tokenInfosIt.nextIndex();
			tokenInfos.subList(nextIndex - 1, size).clear();
			tokenInfos.add(createTokenInfo(token));
		}

		/* Region begins at the first mismatch all the way to the end of the document. */ 
		return new Region(regionOffset, e.fDocument.getLength() - regionOffset);
	}

	private boolean tokenCorrespondsToTokenInfo(CommonToken token, TokenInfo tokenInfo, boolean inModifiedRegion) {
		return !inModifiedRegion && tokenInfo.type == token.getType() && getTokenLength(token) == tokenInfo.length;
	}

	private static int getTokenLength(CommonToken token) {
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
