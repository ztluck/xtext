/*
 * generated by Xtext
 */
grammar PsiInternalHiddenTokensMergerTestLanguage;

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
import org.eclipse.xtext.parsetree.reconstr.idea.lang.HiddenTokensMergerTestLanguageElementTypeProvider;
import org.eclipse.xtext.idea.parser.TokenTypeProvider;
import org.eclipse.xtext.parsetree.reconstr.services.HiddenTokensMergerTestLanguageGrammarAccess;

import com.intellij.lang.PsiBuilder;
}

@parser::members {

	protected HiddenTokensMergerTestLanguageGrammarAccess grammarAccess;

	protected HiddenTokensMergerTestLanguageElementTypeProvider elementTypeProvider;

	public PsiInternalHiddenTokensMergerTestLanguageParser(PsiBuilder builder, TokenStream input, HiddenTokensMergerTestLanguageElementTypeProvider elementTypeProvider, HiddenTokensMergerTestLanguageGrammarAccess grammarAccess) {
		this(input);
		setPsiBuilder(builder);
    	this.grammarAccess = grammarAccess;
		this.elementTypeProvider = elementTypeProvider;
	}

	@Override
	protected String getFirstRuleName() {
		return "Model";
	}

}

//Entry rule entryRuleModel
entryRuleModel:
	{ markComposite(elementTypeProvider.getModelElementType()); }
	ruleModel
	{ doneComposite(); }
	EOF;
finally {
}

// Rule Model
ruleModel:
	(
		{
			markComposite(elementTypeProvider.getModel_DatatypeBug286557ParserRuleCall_0ElementType());
		}
		ruleDatatypeBug286557
		{
			doneComposite();
		}
		    |
		{
			markComposite(elementTypeProvider.getModel_EnumBugParserRuleCall_1ElementType());
		}
		ruleEnumBug
		{
			doneComposite();
		}
		    |
		{
			markComposite(elementTypeProvider.getModel_CommentableParserRuleCall_2ElementType());
		}
		ruleCommentable
		{
			doneComposite();
		}
		    |
		{
			markComposite(elementTypeProvider.getModel_ValueListParserRuleCall_3ElementType());
		}
		ruleValueList
		{
			doneComposite();
		}
		    |
		{
			markComposite(elementTypeProvider.getModel_RefListParserRuleCall_4ElementType());
		}
		ruleRefList
		{
			doneComposite();
		}
		    |
		{
			markComposite(elementTypeProvider.getModel_SingleRefParserRuleCall_5ElementType());
		}
		ruleSingleRef
		{
			doneComposite();
		}
		    |
		{
			markComposite(elementTypeProvider.getModel_AppendToFileEndParserRuleCall_6ElementType());
		}
		ruleAppendToFileEnd
		{
			doneComposite();
		}
		    |
		{
			markComposite(elementTypeProvider.getModel_Action1ParserRuleCall_7ElementType());
		}
		ruleAction1
		{
			doneComposite();
		}
	)
;

//Entry rule entryRuleDatatypeBug286557
entryRuleDatatypeBug286557:
	{ markComposite(elementTypeProvider.getDatatypeBug286557ElementType()); }
	ruleDatatypeBug286557
	{ doneComposite(); }
	EOF;
finally {
}

// Rule DatatypeBug286557
ruleDatatypeBug286557:
	(
		{
			markLeaf();
		}
		otherlv_0='#1'
		{
			doneLeaf(otherlv_0, elementTypeProvider.getDatatypeBug286557_NumberSignDigitOneKeyword_0ElementType());
		}
		(
			(
				{
					markComposite(elementTypeProvider.getDatatypeBug286557_NameFQNParserRuleCall_1_0ElementType());
				}
				lv_name_1_0=ruleFQN
				{
					doneComposite();
				}
			)
		)
		(
			{
				markLeaf();
			}
			otherlv_2='ref'
			{
				doneLeaf(otherlv_2, elementTypeProvider.getDatatypeBug286557_RefKeyword_2_0ElementType());
			}
			(
				(
					{
						markComposite(elementTypeProvider.getDatatypeBug286557_RefDatatypeBug286557CrossReference_2_1_0ElementType());
					}
					ruleFQN
					{
						doneComposite();
					}
				)
			)
		)?
		{
			markLeaf();
		}
		otherlv_4=';'
		{
			doneLeaf(otherlv_4, elementTypeProvider.getDatatypeBug286557_SemicolonKeyword_3ElementType());
		}
	)
;

//Entry rule entryRuleFQN
entryRuleFQN:
	{ markComposite(elementTypeProvider.getFQNElementType()); }
	ruleFQN
	{ doneComposite(); }
	EOF;
finally {
}

// Rule FQN
ruleFQN:
	(
		{
			markLeaf();
		}
		this_ID_0=RULE_ID
		{
			doneLeaf(this_ID_0, elementTypeProvider.getFQN_IDTerminalRuleCall_0ElementType());
		}
		(
			{
				markLeaf();
			}
			kw='.'
			{
				doneLeaf(kw, elementTypeProvider.getFQN_FullStopKeyword_1_0ElementType());
			}
			{
				markLeaf();
			}
			this_ID_2=RULE_ID
			{
				doneLeaf(this_ID_2, elementTypeProvider.getFQN_IDTerminalRuleCall_1_1ElementType());
			}
		)*
	)
;

//Entry rule entryRuleEnumBug
entryRuleEnumBug:
	{ markComposite(elementTypeProvider.getEnumBugElementType()); }
	ruleEnumBug
	{ doneComposite(); }
	EOF;
finally {
}

// Rule EnumBug
ruleEnumBug:
	(
		{
			markLeaf();
		}
		otherlv_0='#2'
		{
			doneLeaf(otherlv_0, elementTypeProvider.getEnumBug_NumberSignDigitTwoKeyword_0ElementType());
		}
		{
			markLeaf();
		}
		otherlv_1='kw1'
		{
			doneLeaf(otherlv_1, elementTypeProvider.getEnumBug_Kw1Keyword_1ElementType());
		}
		(
			(
				{
					markComposite(elementTypeProvider.getEnumBug_ReturnEnumBugEnumEnumRuleCall_2_0ElementType());
				}
				lv_return_2_0=ruleEnumBugEnum
				{
					doneComposite();
				}
			)
		)
		(
			(
				{
					markLeaf();
				}
				lv_name_3_0=RULE_ID
				{
					doneLeaf(lv_name_3_0, elementTypeProvider.getEnumBug_NameIDTerminalRuleCall_3_0ElementType());
				}
			)
		)
	)
;

//Entry rule entryRuleCommentable
entryRuleCommentable:
	{ markComposite(elementTypeProvider.getCommentableElementType()); }
	ruleCommentable
	{ doneComposite(); }
	EOF;
finally {
}

// Rule Commentable
ruleCommentable:
	(
		{
			markLeaf();
		}
		otherlv_0='#3'
		{
			doneLeaf(otherlv_0, elementTypeProvider.getCommentable_NumberSignDigitThreeKeyword_0ElementType());
		}
		(
			(
				{
					markComposite(elementTypeProvider.getCommentable_ItemCommentableItemParserRuleCall_1_0ElementType());
				}
				lv_item_1_0=ruleCommentableItem
				{
					doneComposite();
				}
			)
		)*
	)
;

//Entry rule entryRuleCommentableItem
entryRuleCommentableItem:
	{ markComposite(elementTypeProvider.getCommentableItemElementType()); }
	ruleCommentableItem
	{ doneComposite(); }
	EOF;
finally {
}

// Rule CommentableItem
ruleCommentableItem:
	(
		{
			markLeaf();
		}
		otherlv_0='item'
		{
			doneLeaf(otherlv_0, elementTypeProvider.getCommentableItem_ItemKeyword_0ElementType());
		}
		(
			(
				{
					markLeaf();
				}
				lv_id_1_0=RULE_ID
				{
					doneLeaf(lv_id_1_0, elementTypeProvider.getCommentableItem_IdIDTerminalRuleCall_1_0ElementType());
				}
			)
		)
	)
;

//Entry rule entryRuleValueList
entryRuleValueList:
	{ markComposite(elementTypeProvider.getValueListElementType()); }
	ruleValueList
	{ doneComposite(); }
	EOF;
finally {
}

// Rule ValueList
ruleValueList:
	(
		{
			markLeaf();
		}
		otherlv_0='#4'
		{
			doneLeaf(otherlv_0, elementTypeProvider.getValueList_NumberSignDigitFourKeyword_0ElementType());
		}
		(
			(
				{
					markComposite(elementTypeProvider.getValueList_IdsFQNParserRuleCall_1_0ElementType());
				}
				lv_ids_1_0=ruleFQN
				{
					doneComposite();
				}
			)
		)*
	)
;

//Entry rule entryRuleRefList
entryRuleRefList:
	{ markComposite(elementTypeProvider.getRefListElementType()); }
	ruleRefList
	{ doneComposite(); }
	EOF;
finally {
}

// Rule RefList
ruleRefList:
	(
		{
			markLeaf();
		}
		otherlv_0='#5'
		{
			doneLeaf(otherlv_0, elementTypeProvider.getRefList_NumberSignDigitFiveKeyword_0ElementType());
		}
		(
			(
				{
					markComposite(elementTypeProvider.getRefList_ObjsRefObjParserRuleCall_1_0ElementType());
				}
				lv_objs_1_0=ruleRefObj
				{
					doneComposite();
				}
			)
		)*
		{
			markLeaf();
		}
		otherlv_2='refs'
		{
			doneLeaf(otherlv_2, elementTypeProvider.getRefList_RefsKeyword_2ElementType());
		}
		(
			(
				{
					markComposite(elementTypeProvider.getRefList_RefsRefObjCrossReference_3_0ElementType());
				}
				ruleFQN
				{
					doneComposite();
				}
			)
		)*
	)
;

//Entry rule entryRuleRefObj
entryRuleRefObj:
	{ markComposite(elementTypeProvider.getRefObjElementType()); }
	ruleRefObj
	{ doneComposite(); }
	EOF;
finally {
}

// Rule RefObj
ruleRefObj:
	(
		(
			{
				markComposite(elementTypeProvider.getRefObj_NameFQNParserRuleCall_0ElementType());
			}
			lv_name_0_0=ruleFQN
			{
				doneComposite();
			}
		)
	)
;

//Entry rule entryRuleSingleRef
entryRuleSingleRef:
	{ markComposite(elementTypeProvider.getSingleRefElementType()); }
	ruleSingleRef
	{ doneComposite(); }
	EOF;
finally {
}

// Rule SingleRef
ruleSingleRef:
	(
		{
			markLeaf();
		}
		otherlv_0='#6'
		{
			doneLeaf(otherlv_0, elementTypeProvider.getSingleRef_NumberSignDigitSixKeyword_0ElementType());
		}
		(
			(
				{
					markComposite(elementTypeProvider.getSingleRef_ObjRefObjParserRuleCall_1_0ElementType());
				}
				lv_obj_1_0=ruleRefObj
				{
					doneComposite();
				}
			)
		)
		{
			markLeaf();
		}
		otherlv_2='ref'
		{
			doneLeaf(otherlv_2, elementTypeProvider.getSingleRef_RefKeyword_2ElementType());
		}
		(
			(
				{
					markComposite(elementTypeProvider.getSingleRef_RefRefObjCrossReference_3_0ElementType());
				}
				ruleFQN
				{
					doneComposite();
				}
			)
		)
	)
;

//Entry rule entryRuleAppendToFileEnd
entryRuleAppendToFileEnd:
	{ markComposite(elementTypeProvider.getAppendToFileEndElementType()); }
	ruleAppendToFileEnd
	{ doneComposite(); }
	EOF;
finally {
}

// Rule AppendToFileEnd
ruleAppendToFileEnd:
	(
		{
			markLeaf();
		}
		otherlv_0='#7'
		{
			doneLeaf(otherlv_0, elementTypeProvider.getAppendToFileEnd_NumberSignDigitSevenKeyword_0ElementType());
		}
		(
			(
				{
					markComposite(elementTypeProvider.getAppendToFileEnd_ItemsAppendToFileEndItemParserRuleCall_1_0ElementType());
				}
				lv_items_1_0=ruleAppendToFileEndItem
				{
					doneComposite();
				}
			)
		)*
	)
;

//Entry rule entryRuleAppendToFileEndItem
entryRuleAppendToFileEndItem:
	{ markComposite(elementTypeProvider.getAppendToFileEndItemElementType()); }
	ruleAppendToFileEndItem
	{ doneComposite(); }
	EOF;
finally {
}

// Rule AppendToFileEndItem
ruleAppendToFileEndItem:
	(
		{
			markLeaf();
		}
		otherlv_0='class'
		{
			doneLeaf(otherlv_0, elementTypeProvider.getAppendToFileEndItem_ClassKeyword_0ElementType());
		}
		(
			(
				{
					markLeaf();
				}
				lv_name_1_0=RULE_ID
				{
					doneLeaf(lv_name_1_0, elementTypeProvider.getAppendToFileEndItem_NameIDTerminalRuleCall_1_0ElementType());
				}
			)
		)
		{
			markLeaf();
		}
		otherlv_2='endclass'
		{
			doneLeaf(otherlv_2, elementTypeProvider.getAppendToFileEndItem_EndclassKeyword_2ElementType());
		}
	)
;

//Entry rule entryRuleAction1
entryRuleAction1:
	{ markComposite(elementTypeProvider.getAction1ElementType()); }
	ruleAction1
	{ doneComposite(); }
	EOF;
finally {
}

// Rule Action1
ruleAction1:
	(
		{
			markLeaf();
		}
		otherlv_0='#8'
		{
			doneLeaf(otherlv_0, elementTypeProvider.getAction1_NumberSignDigitEightKeyword_0ElementType());
		}
		(
			{
				precedeComposite(elementTypeProvider.getAction1_Action1Action_1ElementType());
				doneComposite();
			}
		)
		(
			(
				{
					markLeaf();
				}
				lv_name_2_0=RULE_ID
				{
					doneLeaf(lv_name_2_0, elementTypeProvider.getAction1_NameIDTerminalRuleCall_2_0ElementType());
				}
			)
		)
		(
			(
				{
					markComposite(elementTypeProvider.getAction1_Actions2Action1Sub1ParserRuleCall_3_0ElementType());
				}
				lv_actions2_3_0=ruleAction1Sub1
				{
					doneComposite();
				}
			)
		)
		(
			(
				{
					markComposite(elementTypeProvider.getAction1_Actions2Action1Sub2ParserRuleCall_4_0ElementType());
				}
				lv_actions2_4_0=ruleAction1Sub2
				{
					doneComposite();
				}
			)
		)
	)
;

//Entry rule entryRuleAction1Sub1
entryRuleAction1Sub1:
	{ markComposite(elementTypeProvider.getAction1Sub1ElementType()); }
	ruleAction1Sub1
	{ doneComposite(); }
	EOF;
finally {
}

// Rule Action1Sub1
ruleAction1Sub1:
	(
		(
			{
				precedeComposite(elementTypeProvider.getAction1Sub1_Action1SubAction_0ElementType());
				doneComposite();
			}
		)
		{
			markLeaf();
		}
		otherlv_1='sub1'
		{
			doneLeaf(otherlv_1, elementTypeProvider.getAction1Sub1_Sub1Keyword_1ElementType());
		}
	)
;

//Entry rule entryRuleAction1Sub2
entryRuleAction1Sub2:
	{ markComposite(elementTypeProvider.getAction1Sub2ElementType()); }
	ruleAction1Sub2
	{ doneComposite(); }
	EOF;
finally {
}

// Rule Action1Sub2
ruleAction1Sub2:
	(
		(
			{
				precedeComposite(elementTypeProvider.getAction1Sub2_Action1SubClassAction_0ElementType());
				doneComposite();
			}
		)
		{
			markLeaf();
		}
		otherlv_1='sub2'
		{
			doneLeaf(otherlv_1, elementTypeProvider.getAction1Sub2_Sub2Keyword_1ElementType());
		}
	)
;

// Rule EnumBugEnum
ruleEnumBugEnum:
	(
		(
			{
				markLeaf();
			}
			enumLiteral_0='array'
			{
				doneLeaf(enumLiteral_0, elementTypeProvider.getEnumBugEnum_ArrayEnumLiteralDeclaration_0ElementType());
			}
		)
		    |
		(
			{
				markLeaf();
			}
			enumLiteral_1='object'
			{
				doneLeaf(enumLiteral_1, elementTypeProvider.getEnumBugEnum_ObjectEnumLiteralDeclaration_1ElementType());
			}
		)
		    |
		(
			{
				markLeaf();
			}
			enumLiteral_2='resultSet'
			{
				doneLeaf(enumLiteral_2, elementTypeProvider.getEnumBugEnum_ResultSetEnumLiteralDeclaration_2ElementType());
			}
		)
		    |
		(
			{
				markLeaf();
			}
			enumLiteral_3='iterator'
			{
				doneLeaf(enumLiteral_3, elementTypeProvider.getEnumBugEnum_IteratorEnumLiteralDeclaration_3ElementType());
			}
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