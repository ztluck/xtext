/*
 * generated by Xtext
 */
grammar PsiInternalComplexReconstrTestLanguage;

options {
	superClass=AbstractPsiAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.parsetree.reconstr.idea.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.parsetree.reconstr.idea.parser.antlr.internal;

import org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser;
import org.eclipse.xtext.parsetree.reconstr.idea.lang.ComplexReconstrTestLanguageElementTypeProvider;
import org.eclipse.xtext.idea.parser.TokenTypeProvider;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parsetree.reconstr.services.ComplexReconstrTestLanguageGrammarAccess;

import com.intellij.lang.PsiBuilder;
}

@parser::members {

	protected ComplexReconstrTestLanguageGrammarAccess grammarAccess;

	protected ComplexReconstrTestLanguageElementTypeProvider elementTypeProvider;

	public PsiInternalComplexReconstrTestLanguageParser(PsiBuilder builder, TokenStream input, ComplexReconstrTestLanguageElementTypeProvider elementTypeProvider, ComplexReconstrTestLanguageGrammarAccess grammarAccess) {
		this(input);
		setPsiBuilder(builder);
    	this.grammarAccess = grammarAccess;
		this.elementTypeProvider = elementTypeProvider;
	}

	@Override
	protected String getFirstRuleName() {
		return "Root";
	}

}

//Entry rule entryRuleRoot
entryRuleRoot:
	{ markComposite(elementTypeProvider.getRootElementType()); }
	ruleRoot
	EOF;

// Rule Root
ruleRoot:
	(
		{
			markComposite(elementTypeProvider.getRoot_OpParserRuleCall_0ElementType());
		}
		ruleOp
		{
			doneComposite();
		}
		    |
		{
			markComposite(elementTypeProvider.getRoot_TrickyGParserRuleCall_1ElementType());
		}
		ruleTrickyG
		{
			doneComposite();
		}
	)
;

//Entry rule entryRuleOp
entryRuleOp:
	{ markComposite(elementTypeProvider.getOpElementType()); }
	ruleOp
	EOF;

// Rule Op
ruleOp:
	(
		{
			markComposite(elementTypeProvider.getOp_TermParserRuleCall_0ElementType());
		}
		ruleTerm
		{
			doneComposite();
		}
		(
			(
				(
					{
						precedeComposite(elementTypeProvider.getOp_AddAddOperandsAction_1_0_0ElementType());
						doneComposite();
					}
				)
				{
					markLeaf(elementTypeProvider.getOp_PlusSignKeyword_1_0_1ElementType());
				}
				otherlv_2='+'
				{
					doneLeaf(otherlv_2);
				}
				(
					(
						{
							markComposite(elementTypeProvider.getOp_AddOperandsTermParserRuleCall_1_0_2_0ElementType());
						}
						lv_addOperands_3_0=ruleTerm
						{
							doneComposite();
						}
					)
				)
			)
			    |
			(
				(
					{
						precedeComposite(elementTypeProvider.getOp_MinusMinusOperandsAction_1_1_0ElementType());
						doneComposite();
					}
				)
				{
					markLeaf(elementTypeProvider.getOp_HyphenMinusKeyword_1_1_1ElementType());
				}
				otherlv_5='-'
				{
					doneLeaf(otherlv_5);
				}
				(
					(
						{
							markComposite(elementTypeProvider.getOp_MinusOperandsTermParserRuleCall_1_1_2_0ElementType());
						}
						lv_minusOperands_6_0=ruleTerm
						{
							doneComposite();
						}
					)
				)
			)
		)*
	)
;

//Entry rule entryRuleTerm
entryRuleTerm:
	{ markComposite(elementTypeProvider.getTermElementType()); }
	ruleTerm
	EOF;

// Rule Term
ruleTerm:
	(
		{
			markComposite(elementTypeProvider.getTerm_AtomParserRuleCall_0ElementType());
		}
		ruleAtom
		{
			doneComposite();
		}
		    |
		{
			markComposite(elementTypeProvider.getTerm_ParensParserRuleCall_1ElementType());
		}
		ruleParens
		{
			doneComposite();
		}
	)
;

//Entry rule entryRuleAtom
entryRuleAtom:
	{ markComposite(elementTypeProvider.getAtomElementType()); }
	ruleAtom
	EOF;

// Rule Atom
ruleAtom:
	(
		(
			{
				markLeaf(elementTypeProvider.getAtom_NameIDTerminalRuleCall_0ElementType());
			}
			lv_name_0_0=RULE_ID
			{
				doneLeaf(lv_name_0_0);
			}
		)
	)
;

//Entry rule entryRuleParens
entryRuleParens:
	{ markComposite(elementTypeProvider.getParensElementType()); }
	ruleParens
	EOF;

// Rule Parens
ruleParens:
	(
		{
			markLeaf(elementTypeProvider.getParens_LeftParenthesisKeyword_0ElementType());
		}
		otherlv_0='('
		{
			doneLeaf(otherlv_0);
		}
		{
			markComposite(elementTypeProvider.getParens_OpParserRuleCall_1ElementType());
		}
		ruleOp
		{
			doneComposite();
		}
		{
			markLeaf(elementTypeProvider.getParens_RightParenthesisKeyword_2ElementType());
		}
		otherlv_2=')'
		{
			doneLeaf(otherlv_2);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getParens_EmExclamationMarkKeyword_3_0ElementType());
				}
				lv_em_3_0='!'
				{
					doneLeaf(lv_em_3_0);
				}
			)
		)?
	)
;

//Entry rule entryRuleTrickyG
entryRuleTrickyG:
	{ markComposite(elementTypeProvider.getTrickyGElementType()); }
	ruleTrickyG
	EOF;

// Rule TrickyG
ruleTrickyG:
	(
		{
			markLeaf(elementTypeProvider.getTrickyG_TGKeyword_0ElementType());
		}
		otherlv_0='TG'
		{
			doneLeaf(otherlv_0);
		}
		(
			(
				{
					markComposite(elementTypeProvider.getTrickyG_TreeTrickyG1ParserRuleCall_1_0ElementType());
				}
				lv_tree_1_0=ruleTrickyG1
				{
					doneComposite();
				}
			)
		)
	)
;

//Entry rule entryRuleTrickyG1
entryRuleTrickyG1:
	{ markComposite(elementTypeProvider.getTrickyG1ElementType()); }
	ruleTrickyG1
	EOF;

// Rule TrickyG1
ruleTrickyG1:
	(
		{
			markLeaf(elementTypeProvider.getTrickyG1_LeftSquareBracketKeyword_0ElementType());
		}
		otherlv_0='['
		{
			doneLeaf(otherlv_0);
		}
		(
			(
				(
					{
						markComposite(elementTypeProvider.getTrickyG1_ValsTrickyG2ParserRuleCall_1_0_0ElementType());
					}
					lv_vals_1_0=ruleTrickyG2
					{
						doneComposite();
					}
				)
			)
			(
				{
					markLeaf(elementTypeProvider.getTrickyG1_CommaKeyword_1_1_0ElementType());
				}
				otherlv_2=','
				{
					doneLeaf(otherlv_2);
				}
				(
					(
						{
							markComposite(elementTypeProvider.getTrickyG1_ValsTrickyG2ParserRuleCall_1_1_1_0ElementType());
						}
						lv_vals_3_0=ruleTrickyG2
						{
							doneComposite();
						}
					)
				)
			)*
		)?
		{
			markLeaf(elementTypeProvider.getTrickyG1_RightSquareBracketKeyword_2ElementType());
		}
		otherlv_4=']'
		{
			doneLeaf(otherlv_4);
		}
	)
;

//Entry rule entryRuleTrickyG2
entryRuleTrickyG2:
	{ markComposite(elementTypeProvider.getTrickyG2ElementType()); }
	ruleTrickyG2
	EOF;

// Rule TrickyG2
ruleTrickyG2:
	(
		{
			markComposite(elementTypeProvider.getTrickyG2_TrickyG1ParserRuleCall_0ElementType());
		}
		ruleTrickyG1
		{
			doneComposite();
		}
		    |
		(
			(
				{
					markLeaf(elementTypeProvider.getTrickyG2_ValINTTerminalRuleCall_1_0ElementType());
				}
				lv_val_1_0=RULE_INT
				{
					doneLeaf(lv_val_1_0);
				}
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
