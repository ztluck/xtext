package org.eclipse.xtext.parsetree.reconstr.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.parsetree.reconstr.services.SimpleReconstrTestLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSimpleReconstrTestLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ID1", "RULE_ID2", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "'!'", "'#'", "'='", "'type'", "'extends'", "'#2'", "'mykeyword1'", "'mykeyword2'", "'#3'", "'.'", "'#4'", "'myoption'", "'kw'", "'#5'", "'*'", "','", "'#6'", "'v1'", "'v2'", "'#7'", "'kw0'", "'#8'", "'kw1'", "'kw2'", "'kw30'", "'#9'", "'kw3'", "'kw4'", "'kw5'", "'kw6'", "'#10'", "'#11'", "'kw7'", "'#12'", "'interface'", "'class'", "'#13'", "'static'", "'final'", "'transient'", "'#14'", "'item'", "'#15'", "'#16'", "'refs'", "'#17'", "'#18'", "'ka'", "'kb'", "'#19'", "'kx'", "'ky'", "'kz'", "'#20'", "'#21'", "'#22'", "'lit1'", "'lit2'"
    };
    public static final int RULE_ML_COMMENT=9;
    public static final int RULE_ID1=7;
    public static final int RULE_ID=4;
    public static final int RULE_WS=11;
    public static final int EOF=-1;
    public static final int RULE_INT=5;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_ID2=8;

        public InternalSimpleReconstrTestLanguageParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g"; }



     	private SimpleReconstrTestLanguageGrammarAccess grammarAccess;
     	
        public InternalSimpleReconstrTestLanguageParser(TokenStream input, IAstFactory factory, SimpleReconstrTestLanguageGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Op";	
       	}
       	
       	@Override
       	protected SimpleReconstrTestLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleOp
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:78:1: entryRuleOp returns [EObject current=null] : iv_ruleOp= ruleOp EOF ;
    public final EObject entryRuleOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOp = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:79:2: (iv_ruleOp= ruleOp EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:80:2: iv_ruleOp= ruleOp EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOpRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleOp_in_entryRuleOp75);
            iv_ruleOp=ruleOp();
            _fsp--;

             current =iv_ruleOp; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOp85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleOp


    // $ANTLR start ruleOp
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:87:1: ruleOp returns [EObject current=null] : (this_Term_0= ruleTerm ( () ( (lv_values_2_0= ruleTerm ) ) )* ) ;
    public final EObject ruleOp() throws RecognitionException {
        EObject current = null;

        EObject this_Term_0 = null;

        EObject lv_values_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:92:6: ( (this_Term_0= ruleTerm ( () ( (lv_values_2_0= ruleTerm ) ) )* ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:93:1: (this_Term_0= ruleTerm ( () ( (lv_values_2_0= ruleTerm ) ) )* )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:93:1: (this_Term_0= ruleTerm ( () ( (lv_values_2_0= ruleTerm ) ) )* )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:94:5: this_Term_0= ruleTerm ( () ( (lv_values_2_0= ruleTerm ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getOpAccess().getTermParserRuleCall_0(), currentNode); 
                
            pushFollow(FollowSets000.FOLLOW_ruleTerm_in_ruleOp132);
            this_Term_0=ruleTerm();
            _fsp--;

             
                    current = this_Term_0; 
                    currentNode = currentNode.getParent();
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:102:1: ( () ( (lv_values_2_0= ruleTerm ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_INT)||LA1_0==13||(LA1_0>=17 && LA1_0<=18)||LA1_0==20||LA1_0==23||LA1_0==25||LA1_0==28||LA1_0==31||(LA1_0>=34 && LA1_0<=38)||(LA1_0>=40 && LA1_0<=41)||LA1_0==46||LA1_0==48||LA1_0==51||LA1_0==55||(LA1_0>=57 && LA1_0<=58)||(LA1_0>=60 && LA1_0<=61)||LA1_0==64||(LA1_0>=68 && LA1_0<=70)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:102:2: () ( (lv_values_2_0= ruleTerm ) )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:102:2: ()
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:103:5: 
            	    {
            	     
            	            temp=factory.create(grammarAccess.getOpAccess().getOpValuesAction_1_0().getType().getClassifier());
            	            try {
            	            	factory.add(temp, "values", current, null /*ParserRule*/, currentNode);
            	            } catch(ValueConverterException vce) {
            	            	handleValueConverterException(vce);
            	            }
            	            current = temp; 
            	            temp = null;
            	            CompositeNode newNode = createCompositeNode(grammarAccess.getOpAccess().getOpValuesAction_1_0(), currentNode.getParent());
            	        newNode.getChildren().add(currentNode);
            	        moveLookaheadInfo(currentNode, newNode);
            	        currentNode = newNode; 
            	            associateNodeWithAstElement(currentNode, current); 
            	        

            	    }

            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:118:2: ( (lv_values_2_0= ruleTerm ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:119:1: (lv_values_2_0= ruleTerm )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:119:1: (lv_values_2_0= ruleTerm )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:120:3: lv_values_2_0= ruleTerm
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getOpAccess().getValuesTermParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTerm_in_ruleOp162);
            	    lv_values_2_0=ruleTerm();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getOpRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"values",
            	    	        		lv_values_2_0, 
            	    	        		"Term", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleOp


    // $ANTLR start entryRuleTerm
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:150:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:151:2: (iv_ruleTerm= ruleTerm EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:152:2: iv_ruleTerm= ruleTerm EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTermRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleTerm_in_entryRuleTerm200);
            iv_ruleTerm=ruleTerm();
            _fsp--;

             current =iv_ruleTerm; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTerm210); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTerm


    // $ANTLR start ruleTerm
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:159:1: ruleTerm returns [EObject current=null] : (this_Atom_0= ruleAtom | this_TwoNumbers_1= ruleTwoNumbers | this_ManyStrings_2= ruleManyStrings | this_Type_3= ruleType | this_Ref2_4= ruleRef2 | this_Spare_5= ruleSpare | this_Boolean_6= ruleBoolean | this_Transient1_7= ruleTransient1 | this_Consumed1_8= ruleConsumed1 | this_Consumed2_9= ruleConsumed2 | this_Loop1_10= ruleLoop1 | this_Loop2_11= ruleLoop2 | this_Loop3_12= ruleLoop3 | this_Loop4_13= ruleLoop4 | this_LoopBug285452_14= ruleLoopBug285452 | this_DuplicateBug284491_15= ruleDuplicateBug284491 | this_EmptyObjectBug284850_16= ruleEmptyObjectBug284850 | this_MultiInheritanceBug280439_17= ruleMultiInheritanceBug280439 | this_EObjectRef_18= ruleEObjectRef | this_TypeBug305577_1_19= ruleTypeBug305577_1 | this_TypeBug305577_2_20= ruleTypeBug305577_2 | this_Parens_21= ruleParens | this_Bug305171_22= ruleBug305171 | this_Bug310435Val_23= ruleBug310435Val | this_Bug310435Enum_24= ruleBug310435Enum | this_CrossRefNameTest_25= ruleCrossRefNameTest ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        EObject this_Atom_0 = null;

        EObject this_TwoNumbers_1 = null;

        EObject this_ManyStrings_2 = null;

        EObject this_Type_3 = null;

        EObject this_Ref2_4 = null;

        EObject this_Spare_5 = null;

        EObject this_Boolean_6 = null;

        EObject this_Transient1_7 = null;

        EObject this_Consumed1_8 = null;

        EObject this_Consumed2_9 = null;

        EObject this_Loop1_10 = null;

        EObject this_Loop2_11 = null;

        EObject this_Loop3_12 = null;

        EObject this_Loop4_13 = null;

        EObject this_LoopBug285452_14 = null;

        EObject this_DuplicateBug284491_15 = null;

        EObject this_EmptyObjectBug284850_16 = null;

        EObject this_MultiInheritanceBug280439_17 = null;

        EObject this_EObjectRef_18 = null;

        EObject this_TypeBug305577_1_19 = null;

        EObject this_TypeBug305577_2_20 = null;

        EObject this_Parens_21 = null;

        EObject this_Bug305171_22 = null;

        EObject this_Bug310435Val_23 = null;

        EObject this_Bug310435Enum_24 = null;

        EObject this_CrossRefNameTest_25 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:164:6: ( (this_Atom_0= ruleAtom | this_TwoNumbers_1= ruleTwoNumbers | this_ManyStrings_2= ruleManyStrings | this_Type_3= ruleType | this_Ref2_4= ruleRef2 | this_Spare_5= ruleSpare | this_Boolean_6= ruleBoolean | this_Transient1_7= ruleTransient1 | this_Consumed1_8= ruleConsumed1 | this_Consumed2_9= ruleConsumed2 | this_Loop1_10= ruleLoop1 | this_Loop2_11= ruleLoop2 | this_Loop3_12= ruleLoop3 | this_Loop4_13= ruleLoop4 | this_LoopBug285452_14= ruleLoopBug285452 | this_DuplicateBug284491_15= ruleDuplicateBug284491 | this_EmptyObjectBug284850_16= ruleEmptyObjectBug284850 | this_MultiInheritanceBug280439_17= ruleMultiInheritanceBug280439 | this_EObjectRef_18= ruleEObjectRef | this_TypeBug305577_1_19= ruleTypeBug305577_1 | this_TypeBug305577_2_20= ruleTypeBug305577_2 | this_Parens_21= ruleParens | this_Bug305171_22= ruleBug305171 | this_Bug310435Val_23= ruleBug310435Val | this_Bug310435Enum_24= ruleBug310435Enum | this_CrossRefNameTest_25= ruleCrossRefNameTest ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:165:1: (this_Atom_0= ruleAtom | this_TwoNumbers_1= ruleTwoNumbers | this_ManyStrings_2= ruleManyStrings | this_Type_3= ruleType | this_Ref2_4= ruleRef2 | this_Spare_5= ruleSpare | this_Boolean_6= ruleBoolean | this_Transient1_7= ruleTransient1 | this_Consumed1_8= ruleConsumed1 | this_Consumed2_9= ruleConsumed2 | this_Loop1_10= ruleLoop1 | this_Loop2_11= ruleLoop2 | this_Loop3_12= ruleLoop3 | this_Loop4_13= ruleLoop4 | this_LoopBug285452_14= ruleLoopBug285452 | this_DuplicateBug284491_15= ruleDuplicateBug284491 | this_EmptyObjectBug284850_16= ruleEmptyObjectBug284850 | this_MultiInheritanceBug280439_17= ruleMultiInheritanceBug280439 | this_EObjectRef_18= ruleEObjectRef | this_TypeBug305577_1_19= ruleTypeBug305577_1 | this_TypeBug305577_2_20= ruleTypeBug305577_2 | this_Parens_21= ruleParens | this_Bug305171_22= ruleBug305171 | this_Bug310435Val_23= ruleBug310435Val | this_Bug310435Enum_24= ruleBug310435Enum | this_CrossRefNameTest_25= ruleCrossRefNameTest )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:165:1: (this_Atom_0= ruleAtom | this_TwoNumbers_1= ruleTwoNumbers | this_ManyStrings_2= ruleManyStrings | this_Type_3= ruleType | this_Ref2_4= ruleRef2 | this_Spare_5= ruleSpare | this_Boolean_6= ruleBoolean | this_Transient1_7= ruleTransient1 | this_Consumed1_8= ruleConsumed1 | this_Consumed2_9= ruleConsumed2 | this_Loop1_10= ruleLoop1 | this_Loop2_11= ruleLoop2 | this_Loop3_12= ruleLoop3 | this_Loop4_13= ruleLoop4 | this_LoopBug285452_14= ruleLoopBug285452 | this_DuplicateBug284491_15= ruleDuplicateBug284491 | this_EmptyObjectBug284850_16= ruleEmptyObjectBug284850 | this_MultiInheritanceBug280439_17= ruleMultiInheritanceBug280439 | this_EObjectRef_18= ruleEObjectRef | this_TypeBug305577_1_19= ruleTypeBug305577_1 | this_TypeBug305577_2_20= ruleTypeBug305577_2 | this_Parens_21= ruleParens | this_Bug305171_22= ruleBug305171 | this_Bug310435Val_23= ruleBug310435Val | this_Bug310435Enum_24= ruleBug310435Enum | this_CrossRefNameTest_25= ruleCrossRefNameTest )
            int alt2=26;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt2=1;
                }
                break;
            case RULE_INT:
                {
                alt2=2;
                }
                break;
            case 17:
                {
                alt2=3;
                }
                break;
            case 18:
                {
                alt2=4;
                }
                break;
            case 20:
                {
                alt2=5;
                }
                break;
            case 23:
                {
                alt2=6;
                }
                break;
            case 25:
                {
                alt2=7;
                }
                break;
            case 28:
                {
                alt2=8;
                }
                break;
            case 31:
                {
                alt2=9;
                }
                break;
            case 34:
                {
                alt2=10;
                }
                break;
            case 35:
            case 36:
                {
                alt2=11;
                }
                break;
            case 40:
                {
                alt2=12;
                }
                break;
            case 37:
            case 38:
            case 41:
                {
                alt2=13;
                }
                break;
            case 46:
                {
                alt2=14;
                }
                break;
            case 48:
                {
                alt2=15;
                }
                break;
            case 51:
                {
                alt2=16;
                }
                break;
            case 55:
                {
                alt2=17;
                }
                break;
            case 57:
                {
                alt2=18;
                }
                break;
            case 58:
                {
                alt2=19;
                }
                break;
            case 60:
                {
                alt2=20;
                }
                break;
            case 61:
                {
                alt2=21;
                }
                break;
            case 13:
                {
                alt2=22;
                }
                break;
            case 64:
                {
                alt2=23;
                }
                break;
            case 69:
                {
                alt2=24;
                }
                break;
            case 68:
                {
                alt2=25;
                }
                break;
            case 70:
                {
                alt2=26;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("165:1: (this_Atom_0= ruleAtom | this_TwoNumbers_1= ruleTwoNumbers | this_ManyStrings_2= ruleManyStrings | this_Type_3= ruleType | this_Ref2_4= ruleRef2 | this_Spare_5= ruleSpare | this_Boolean_6= ruleBoolean | this_Transient1_7= ruleTransient1 | this_Consumed1_8= ruleConsumed1 | this_Consumed2_9= ruleConsumed2 | this_Loop1_10= ruleLoop1 | this_Loop2_11= ruleLoop2 | this_Loop3_12= ruleLoop3 | this_Loop4_13= ruleLoop4 | this_LoopBug285452_14= ruleLoopBug285452 | this_DuplicateBug284491_15= ruleDuplicateBug284491 | this_EmptyObjectBug284850_16= ruleEmptyObjectBug284850 | this_MultiInheritanceBug280439_17= ruleMultiInheritanceBug280439 | this_EObjectRef_18= ruleEObjectRef | this_TypeBug305577_1_19= ruleTypeBug305577_1 | this_TypeBug305577_2_20= ruleTypeBug305577_2 | this_Parens_21= ruleParens | this_Bug305171_22= ruleBug305171 | this_Bug310435Val_23= ruleBug310435Val | this_Bug310435Enum_24= ruleBug310435Enum | this_CrossRefNameTest_25= ruleCrossRefNameTest )", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:166:5: this_Atom_0= ruleAtom
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTermAccess().getAtomParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAtom_in_ruleTerm257);
                    this_Atom_0=ruleAtom();
                    _fsp--;

                     
                            current = this_Atom_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:176:5: this_TwoNumbers_1= ruleTwoNumbers
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTermAccess().getTwoNumbersParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTwoNumbers_in_ruleTerm284);
                    this_TwoNumbers_1=ruleTwoNumbers();
                    _fsp--;

                     
                            current = this_TwoNumbers_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:186:5: this_ManyStrings_2= ruleManyStrings
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTermAccess().getManyStringsParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleManyStrings_in_ruleTerm311);
                    this_ManyStrings_2=ruleManyStrings();
                    _fsp--;

                     
                            current = this_ManyStrings_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:196:5: this_Type_3= ruleType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTermAccess().getTypeParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleType_in_ruleTerm338);
                    this_Type_3=ruleType();
                    _fsp--;

                     
                            current = this_Type_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:206:5: this_Ref2_4= ruleRef2
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTermAccess().getRef2ParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRef2_in_ruleTerm365);
                    this_Ref2_4=ruleRef2();
                    _fsp--;

                     
                            current = this_Ref2_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 6 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:216:5: this_Spare_5= ruleSpare
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTermAccess().getSpareParserRuleCall_5(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSpare_in_ruleTerm392);
                    this_Spare_5=ruleSpare();
                    _fsp--;

                     
                            current = this_Spare_5; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 7 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:226:5: this_Boolean_6= ruleBoolean
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTermAccess().getBooleanParserRuleCall_6(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_ruleTerm419);
                    this_Boolean_6=ruleBoolean();
                    _fsp--;

                     
                            current = this_Boolean_6; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 8 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:236:5: this_Transient1_7= ruleTransient1
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTermAccess().getTransient1ParserRuleCall_7(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTransient1_in_ruleTerm446);
                    this_Transient1_7=ruleTransient1();
                    _fsp--;

                     
                            current = this_Transient1_7; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 9 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:246:5: this_Consumed1_8= ruleConsumed1
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTermAccess().getConsumed1ParserRuleCall_8(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleConsumed1_in_ruleTerm473);
                    this_Consumed1_8=ruleConsumed1();
                    _fsp--;

                     
                            current = this_Consumed1_8; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 10 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:256:5: this_Consumed2_9= ruleConsumed2
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTermAccess().getConsumed2ParserRuleCall_9(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleConsumed2_in_ruleTerm500);
                    this_Consumed2_9=ruleConsumed2();
                    _fsp--;

                     
                            current = this_Consumed2_9; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 11 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:266:5: this_Loop1_10= ruleLoop1
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTermAccess().getLoop1ParserRuleCall_10(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLoop1_in_ruleTerm527);
                    this_Loop1_10=ruleLoop1();
                    _fsp--;

                     
                            current = this_Loop1_10; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 12 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:276:5: this_Loop2_11= ruleLoop2
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTermAccess().getLoop2ParserRuleCall_11(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLoop2_in_ruleTerm554);
                    this_Loop2_11=ruleLoop2();
                    _fsp--;

                     
                            current = this_Loop2_11; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 13 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:286:5: this_Loop3_12= ruleLoop3
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTermAccess().getLoop3ParserRuleCall_12(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLoop3_in_ruleTerm581);
                    this_Loop3_12=ruleLoop3();
                    _fsp--;

                     
                            current = this_Loop3_12; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 14 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:296:5: this_Loop4_13= ruleLoop4
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTermAccess().getLoop4ParserRuleCall_13(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLoop4_in_ruleTerm608);
                    this_Loop4_13=ruleLoop4();
                    _fsp--;

                     
                            current = this_Loop4_13; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 15 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:306:5: this_LoopBug285452_14= ruleLoopBug285452
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTermAccess().getLoopBug285452ParserRuleCall_14(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLoopBug285452_in_ruleTerm635);
                    this_LoopBug285452_14=ruleLoopBug285452();
                    _fsp--;

                     
                            current = this_LoopBug285452_14; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 16 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:316:5: this_DuplicateBug284491_15= ruleDuplicateBug284491
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTermAccess().getDuplicateBug284491ParserRuleCall_15(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDuplicateBug284491_in_ruleTerm662);
                    this_DuplicateBug284491_15=ruleDuplicateBug284491();
                    _fsp--;

                     
                            current = this_DuplicateBug284491_15; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 17 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:326:5: this_EmptyObjectBug284850_16= ruleEmptyObjectBug284850
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTermAccess().getEmptyObjectBug284850ParserRuleCall_16(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEmptyObjectBug284850_in_ruleTerm689);
                    this_EmptyObjectBug284850_16=ruleEmptyObjectBug284850();
                    _fsp--;

                     
                            current = this_EmptyObjectBug284850_16; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 18 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:336:5: this_MultiInheritanceBug280439_17= ruleMultiInheritanceBug280439
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTermAccess().getMultiInheritanceBug280439ParserRuleCall_17(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMultiInheritanceBug280439_in_ruleTerm716);
                    this_MultiInheritanceBug280439_17=ruleMultiInheritanceBug280439();
                    _fsp--;

                     
                            current = this_MultiInheritanceBug280439_17; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 19 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:346:5: this_EObjectRef_18= ruleEObjectRef
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTermAccess().getEObjectRefParserRuleCall_18(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEObjectRef_in_ruleTerm743);
                    this_EObjectRef_18=ruleEObjectRef();
                    _fsp--;

                     
                            current = this_EObjectRef_18; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 20 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:356:5: this_TypeBug305577_1_19= ruleTypeBug305577_1
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTermAccess().getTypeBug305577_1ParserRuleCall_19(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTypeBug305577_1_in_ruleTerm770);
                    this_TypeBug305577_1_19=ruleTypeBug305577_1();
                    _fsp--;

                     
                            current = this_TypeBug305577_1_19; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 21 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:366:5: this_TypeBug305577_2_20= ruleTypeBug305577_2
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTermAccess().getTypeBug305577_2ParserRuleCall_20(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTypeBug305577_2_in_ruleTerm797);
                    this_TypeBug305577_2_20=ruleTypeBug305577_2();
                    _fsp--;

                     
                            current = this_TypeBug305577_2_20; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 22 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:376:5: this_Parens_21= ruleParens
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTermAccess().getParensParserRuleCall_21(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleParens_in_ruleTerm824);
                    this_Parens_21=ruleParens();
                    _fsp--;

                     
                            current = this_Parens_21; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 23 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:386:5: this_Bug305171_22= ruleBug305171
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTermAccess().getBug305171ParserRuleCall_22(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBug305171_in_ruleTerm851);
                    this_Bug305171_22=ruleBug305171();
                    _fsp--;

                     
                            current = this_Bug305171_22; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 24 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:396:5: this_Bug310435Val_23= ruleBug310435Val
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTermAccess().getBug310435ValParserRuleCall_23(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBug310435Val_in_ruleTerm878);
                    this_Bug310435Val_23=ruleBug310435Val();
                    _fsp--;

                     
                            current = this_Bug310435Val_23; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 25 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:406:5: this_Bug310435Enum_24= ruleBug310435Enum
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTermAccess().getBug310435EnumParserRuleCall_24(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBug310435Enum_in_ruleTerm905);
                    this_Bug310435Enum_24=ruleBug310435Enum();
                    _fsp--;

                     
                            current = this_Bug310435Enum_24; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 26 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:416:5: this_CrossRefNameTest_25= ruleCrossRefNameTest
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTermAccess().getCrossRefNameTestParserRuleCall_25(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCrossRefNameTest_in_ruleTerm932);
                    this_CrossRefNameTest_25=ruleCrossRefNameTest();
                    _fsp--;

                     
                            current = this_CrossRefNameTest_25; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTerm


    // $ANTLR start entryRuleAtom
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:432:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:433:2: (iv_ruleAtom= ruleAtom EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:434:2: iv_ruleAtom= ruleAtom EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAtomRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleAtom_in_entryRuleAtom967);
            iv_ruleAtom=ruleAtom();
            _fsp--;

             current =iv_ruleAtom; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtom977); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAtom


    // $ANTLR start ruleAtom
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:441:1: ruleAtom returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:446:6: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:447:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:447:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:448:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:448:1: (lv_name_0_0= RULE_ID )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:449:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAtom1018); 

            			createLeafNode(grammarAccess.getAtomAccess().getNameIDTerminalRuleCall_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAtomRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAtom


    // $ANTLR start entryRuleParens
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:479:1: entryRuleParens returns [EObject current=null] : iv_ruleParens= ruleParens EOF ;
    public final EObject entryRuleParens() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParens = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:480:2: (iv_ruleParens= ruleParens EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:481:2: iv_ruleParens= ruleParens EOF
            {
             currentNode = createCompositeNode(grammarAccess.getParensRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleParens_in_entryRuleParens1058);
            iv_ruleParens=ruleParens();
            _fsp--;

             current =iv_ruleParens; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParens1068); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleParens


    // $ANTLR start ruleParens
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:488:1: ruleParens returns [EObject current=null] : ( '(' this_Op_1= ruleOp ')' ( (lv_em_3_0= '!' ) )? ) ;
    public final EObject ruleParens() throws RecognitionException {
        EObject current = null;

        Token lv_em_3_0=null;
        EObject this_Op_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:493:6: ( ( '(' this_Op_1= ruleOp ')' ( (lv_em_3_0= '!' ) )? ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:494:1: ( '(' this_Op_1= ruleOp ')' ( (lv_em_3_0= '!' ) )? )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:494:1: ( '(' this_Op_1= ruleOp ')' ( (lv_em_3_0= '!' ) )? )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:494:3: '(' this_Op_1= ruleOp ')' ( (lv_em_3_0= '!' ) )?
            {
            match(input,13,FollowSets000.FOLLOW_13_in_ruleParens1103); 

                    createLeafNode(grammarAccess.getParensAccess().getLeftParenthesisKeyword_0(), null); 
                
             
                    currentNode=createCompositeNode(grammarAccess.getParensAccess().getOpParserRuleCall_1(), currentNode); 
                
            pushFollow(FollowSets000.FOLLOW_ruleOp_in_ruleParens1125);
            this_Op_1=ruleOp();
            _fsp--;

             
                    current = this_Op_1; 
                    currentNode = currentNode.getParent();
                
            match(input,14,FollowSets000.FOLLOW_14_in_ruleParens1134); 

                    createLeafNode(grammarAccess.getParensAccess().getRightParenthesisKeyword_2(), null); 
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:511:1: ( (lv_em_3_0= '!' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:512:1: (lv_em_3_0= '!' )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:512:1: (lv_em_3_0= '!' )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:513:3: lv_em_3_0= '!'
                    {
                    lv_em_3_0=(Token)input.LT(1);
                    match(input,15,FollowSets000.FOLLOW_15_in_ruleParens1152); 

                            createLeafNode(grammarAccess.getParensAccess().getEmExclamationMarkKeyword_3_0(), "em"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getParensRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "em", lv_em_3_0, "!", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleParens


    // $ANTLR start entryRuleTwoNumbers
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:540:1: entryRuleTwoNumbers returns [EObject current=null] : iv_ruleTwoNumbers= ruleTwoNumbers EOF ;
    public final EObject entryRuleTwoNumbers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTwoNumbers = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:541:2: (iv_ruleTwoNumbers= ruleTwoNumbers EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:542:2: iv_ruleTwoNumbers= ruleTwoNumbers EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTwoNumbersRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleTwoNumbers_in_entryRuleTwoNumbers1202);
            iv_ruleTwoNumbers=ruleTwoNumbers();
            _fsp--;

             current =iv_ruleTwoNumbers; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTwoNumbers1212); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTwoNumbers


    // $ANTLR start ruleTwoNumbers
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:549:1: ruleTwoNumbers returns [EObject current=null] : ( ( (lv_num1_0_0= RULE_INT ) ) ( (lv_num2_1_0= RULE_INT ) ) ( '#' ( (lv_num3_3_0= RULE_INT ) ) )* ) ;
    public final EObject ruleTwoNumbers() throws RecognitionException {
        EObject current = null;

        Token lv_num1_0_0=null;
        Token lv_num2_1_0=null;
        Token lv_num3_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:554:6: ( ( ( (lv_num1_0_0= RULE_INT ) ) ( (lv_num2_1_0= RULE_INT ) ) ( '#' ( (lv_num3_3_0= RULE_INT ) ) )* ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:555:1: ( ( (lv_num1_0_0= RULE_INT ) ) ( (lv_num2_1_0= RULE_INT ) ) ( '#' ( (lv_num3_3_0= RULE_INT ) ) )* )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:555:1: ( ( (lv_num1_0_0= RULE_INT ) ) ( (lv_num2_1_0= RULE_INT ) ) ( '#' ( (lv_num3_3_0= RULE_INT ) ) )* )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:555:2: ( (lv_num1_0_0= RULE_INT ) ) ( (lv_num2_1_0= RULE_INT ) ) ( '#' ( (lv_num3_3_0= RULE_INT ) ) )*
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:555:2: ( (lv_num1_0_0= RULE_INT ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:556:1: (lv_num1_0_0= RULE_INT )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:556:1: (lv_num1_0_0= RULE_INT )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:557:3: lv_num1_0_0= RULE_INT
            {
            lv_num1_0_0=(Token)input.LT(1);
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleTwoNumbers1254); 

            			createLeafNode(grammarAccess.getTwoNumbersAccess().getNum1INTTerminalRuleCall_0_0(), "num1"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTwoNumbersRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"num1",
            	        		lv_num1_0_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:579:2: ( (lv_num2_1_0= RULE_INT ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:580:1: (lv_num2_1_0= RULE_INT )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:580:1: (lv_num2_1_0= RULE_INT )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:581:3: lv_num2_1_0= RULE_INT
            {
            lv_num2_1_0=(Token)input.LT(1);
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleTwoNumbers1276); 

            			createLeafNode(grammarAccess.getTwoNumbersAccess().getNum2INTTerminalRuleCall_1_0(), "num2"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTwoNumbersRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"num2",
            	        		lv_num2_1_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:603:2: ( '#' ( (lv_num3_3_0= RULE_INT ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:603:4: '#' ( (lv_num3_3_0= RULE_INT ) )
            	    {
            	    match(input,16,FollowSets000.FOLLOW_16_in_ruleTwoNumbers1292); 

            	            createLeafNode(grammarAccess.getTwoNumbersAccess().getNumberSignKeyword_2_0(), null); 
            	        
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:607:1: ( (lv_num3_3_0= RULE_INT ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:608:1: (lv_num3_3_0= RULE_INT )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:608:1: (lv_num3_3_0= RULE_INT )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:609:3: lv_num3_3_0= RULE_INT
            	    {
            	    lv_num3_3_0=(Token)input.LT(1);
            	    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleTwoNumbers1309); 

            	    			createLeafNode(grammarAccess.getTwoNumbersAccess().getNum3INTTerminalRuleCall_2_1_0(), "num3"); 
            	    		

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTwoNumbersRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"num3",
            	    	        		lv_num3_3_0, 
            	    	        		"INT", 
            	    	        		lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTwoNumbers


    // $ANTLR start entryRuleManyStrings
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:639:1: entryRuleManyStrings returns [EObject current=null] : iv_ruleManyStrings= ruleManyStrings EOF ;
    public final EObject entryRuleManyStrings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManyStrings = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:640:2: (iv_ruleManyStrings= ruleManyStrings EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:641:2: iv_ruleManyStrings= ruleManyStrings EOF
            {
             currentNode = createCompositeNode(grammarAccess.getManyStringsRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleManyStrings_in_entryRuleManyStrings1352);
            iv_ruleManyStrings=ruleManyStrings();
            _fsp--;

             current =iv_ruleManyStrings; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleManyStrings1362); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleManyStrings


    // $ANTLR start ruleManyStrings
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:648:1: ruleManyStrings returns [EObject current=null] : ( '=' ( (lv_str1_1_0= RULE_STRING ) )* ( (lv_str2_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleManyStrings() throws RecognitionException {
        EObject current = null;

        Token lv_str1_1_0=null;
        Token lv_str2_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:653:6: ( ( '=' ( (lv_str1_1_0= RULE_STRING ) )* ( (lv_str2_2_0= RULE_STRING ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:654:1: ( '=' ( (lv_str1_1_0= RULE_STRING ) )* ( (lv_str2_2_0= RULE_STRING ) ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:654:1: ( '=' ( (lv_str1_1_0= RULE_STRING ) )* ( (lv_str2_2_0= RULE_STRING ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:654:3: '=' ( (lv_str1_1_0= RULE_STRING ) )* ( (lv_str2_2_0= RULE_STRING ) )
            {
            match(input,17,FollowSets000.FOLLOW_17_in_ruleManyStrings1397); 

                    createLeafNode(grammarAccess.getManyStringsAccess().getEqualsSignKeyword_0(), null); 
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:658:1: ( (lv_str1_1_0= RULE_STRING ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_STRING) ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1==RULE_STRING) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:659:1: (lv_str1_1_0= RULE_STRING )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:659:1: (lv_str1_1_0= RULE_STRING )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:660:3: lv_str1_1_0= RULE_STRING
            	    {
            	    lv_str1_1_0=(Token)input.LT(1);
            	    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleManyStrings1414); 

            	    			createLeafNode(grammarAccess.getManyStringsAccess().getStr1STRINGTerminalRuleCall_1_0(), "str1"); 
            	    		

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getManyStringsRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"str1",
            	    	        		lv_str1_1_0, 
            	    	        		"STRING", 
            	    	        		lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:682:3: ( (lv_str2_2_0= RULE_STRING ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:683:1: (lv_str2_2_0= RULE_STRING )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:683:1: (lv_str2_2_0= RULE_STRING )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:684:3: lv_str2_2_0= RULE_STRING
            {
            lv_str2_2_0=(Token)input.LT(1);
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleManyStrings1437); 

            			createLeafNode(grammarAccess.getManyStringsAccess().getStr2STRINGTerminalRuleCall_2_0(), "str2"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getManyStringsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"str2",
            	        		lv_str2_2_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleManyStrings


    // $ANTLR start entryRuleType
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:714:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:715:2: (iv_ruleType= ruleType EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:716:2: iv_ruleType= ruleType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleType_in_entryRuleType1478);
            iv_ruleType=ruleType();
            _fsp--;

             current =iv_ruleType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleType1488); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleType


    // $ANTLR start ruleType
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:723:1: ruleType returns [EObject current=null] : ( 'type' ( (lv_name_1_0= RULE_ID ) ) 'extends' ( ( RULE_ID ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:728:6: ( ( 'type' ( (lv_name_1_0= RULE_ID ) ) 'extends' ( ( RULE_ID ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:729:1: ( 'type' ( (lv_name_1_0= RULE_ID ) ) 'extends' ( ( RULE_ID ) ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:729:1: ( 'type' ( (lv_name_1_0= RULE_ID ) ) 'extends' ( ( RULE_ID ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:729:3: 'type' ( (lv_name_1_0= RULE_ID ) ) 'extends' ( ( RULE_ID ) )
            {
            match(input,18,FollowSets000.FOLLOW_18_in_ruleType1523); 

                    createLeafNode(grammarAccess.getTypeAccess().getTypeKeyword_0(), null); 
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:733:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:734:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:734:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:735:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleType1540); 

            			createLeafNode(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTypeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,19,FollowSets000.FOLLOW_19_in_ruleType1555); 

                    createLeafNode(grammarAccess.getTypeAccess().getExtendsKeyword_2(), null); 
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:761:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:762:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:762:1: ( RULE_ID )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:763:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getTypeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleType1573); 

            		createLeafNode(grammarAccess.getTypeAccess().getExtendsTypeCrossReference_3_0(), "extends"); 
            	

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleType


    // $ANTLR start entryRuleRef2
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:783:1: entryRuleRef2 returns [EObject current=null] : iv_ruleRef2= ruleRef2 EOF ;
    public final EObject entryRuleRef2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRef2 = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:784:2: (iv_ruleRef2= ruleRef2 EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:785:2: iv_ruleRef2= ruleRef2 EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRef2Rule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleRef2_in_entryRuleRef21609);
            iv_ruleRef2=ruleRef2();
            _fsp--;

             current =iv_ruleRef2; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRef21619); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRef2


    // $ANTLR start ruleRef2
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:792:1: ruleRef2 returns [EObject current=null] : ( '#2' ( ( (lv_ref2_1_1= 'mykeyword1' | lv_ref2_1_2= RULE_STRING | lv_ref2_1_3= 'mykeyword2' ) ) ) ) ;
    public final EObject ruleRef2() throws RecognitionException {
        EObject current = null;

        Token lv_ref2_1_1=null;
        Token lv_ref2_1_2=null;
        Token lv_ref2_1_3=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:797:6: ( ( '#2' ( ( (lv_ref2_1_1= 'mykeyword1' | lv_ref2_1_2= RULE_STRING | lv_ref2_1_3= 'mykeyword2' ) ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:798:1: ( '#2' ( ( (lv_ref2_1_1= 'mykeyword1' | lv_ref2_1_2= RULE_STRING | lv_ref2_1_3= 'mykeyword2' ) ) ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:798:1: ( '#2' ( ( (lv_ref2_1_1= 'mykeyword1' | lv_ref2_1_2= RULE_STRING | lv_ref2_1_3= 'mykeyword2' ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:798:3: '#2' ( ( (lv_ref2_1_1= 'mykeyword1' | lv_ref2_1_2= RULE_STRING | lv_ref2_1_3= 'mykeyword2' ) ) )
            {
            match(input,20,FollowSets000.FOLLOW_20_in_ruleRef21654); 

                    createLeafNode(grammarAccess.getRef2Access().getNumberSignDigitTwoKeyword_0(), null); 
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:802:1: ( ( (lv_ref2_1_1= 'mykeyword1' | lv_ref2_1_2= RULE_STRING | lv_ref2_1_3= 'mykeyword2' ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:803:1: ( (lv_ref2_1_1= 'mykeyword1' | lv_ref2_1_2= RULE_STRING | lv_ref2_1_3= 'mykeyword2' ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:803:1: ( (lv_ref2_1_1= 'mykeyword1' | lv_ref2_1_2= RULE_STRING | lv_ref2_1_3= 'mykeyword2' ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:804:1: (lv_ref2_1_1= 'mykeyword1' | lv_ref2_1_2= RULE_STRING | lv_ref2_1_3= 'mykeyword2' )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:804:1: (lv_ref2_1_1= 'mykeyword1' | lv_ref2_1_2= RULE_STRING | lv_ref2_1_3= 'mykeyword2' )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt6=1;
                }
                break;
            case RULE_STRING:
                {
                alt6=2;
                }
                break;
            case 22:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("804:1: (lv_ref2_1_1= 'mykeyword1' | lv_ref2_1_2= RULE_STRING | lv_ref2_1_3= 'mykeyword2' )", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:805:3: lv_ref2_1_1= 'mykeyword1'
                    {
                    lv_ref2_1_1=(Token)input.LT(1);
                    match(input,21,FollowSets000.FOLLOW_21_in_ruleRef21674); 

                            createLeafNode(grammarAccess.getRef2Access().getRef2Mykeyword1Keyword_1_0_0(), "ref2"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRef2Rule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "ref2", lv_ref2_1_1, null, lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:823:8: lv_ref2_1_2= RULE_STRING
                    {
                    lv_ref2_1_2=(Token)input.LT(1);
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleRef21702); 

                    			createLeafNode(grammarAccess.getRef2Access().getRef2STRINGTerminalRuleCall_1_0_1(), "ref2"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRef2Rule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"ref2",
                    	        		lv_ref2_1_2, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:844:8: lv_ref2_1_3= 'mykeyword2'
                    {
                    lv_ref2_1_3=(Token)input.LT(1);
                    match(input,22,FollowSets000.FOLLOW_22_in_ruleRef21723); 

                            createLeafNode(grammarAccess.getRef2Access().getRef2Mykeyword2Keyword_1_0_2(), "ref2"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRef2Rule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "ref2", lv_ref2_1_3, null, lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }


            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleRef2


    // $ANTLR start entryRuleSpare
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:873:1: entryRuleSpare returns [EObject current=null] : iv_ruleSpare= ruleSpare EOF ;
    public final EObject entryRuleSpare() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpare = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:874:2: (iv_ruleSpare= ruleSpare EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:875:2: iv_ruleSpare= ruleSpare EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSpareRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleSpare_in_entryRuleSpare1775);
            iv_ruleSpare=ruleSpare();
            _fsp--;

             current =iv_ruleSpare; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSpare1785); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSpare


    // $ANTLR start ruleSpare
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:882:1: ruleSpare returns [EObject current=null] : ( '#3' ( (lv_id_1_0= RULE_ID ) ) ( '.' ( (lv_id_3_0= RULE_ID ) ) )* ) ;
    public final EObject ruleSpare() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        Token lv_id_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:887:6: ( ( '#3' ( (lv_id_1_0= RULE_ID ) ) ( '.' ( (lv_id_3_0= RULE_ID ) ) )* ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:888:1: ( '#3' ( (lv_id_1_0= RULE_ID ) ) ( '.' ( (lv_id_3_0= RULE_ID ) ) )* )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:888:1: ( '#3' ( (lv_id_1_0= RULE_ID ) ) ( '.' ( (lv_id_3_0= RULE_ID ) ) )* )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:888:3: '#3' ( (lv_id_1_0= RULE_ID ) ) ( '.' ( (lv_id_3_0= RULE_ID ) ) )*
            {
            match(input,23,FollowSets000.FOLLOW_23_in_ruleSpare1820); 

                    createLeafNode(grammarAccess.getSpareAccess().getNumberSignDigitThreeKeyword_0(), null); 
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:892:1: ( (lv_id_1_0= RULE_ID ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:893:1: (lv_id_1_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:893:1: (lv_id_1_0= RULE_ID )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:894:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSpare1837); 

            			createLeafNode(grammarAccess.getSpareAccess().getIdIDTerminalRuleCall_1_0(), "id"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSpareRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"id",
            	        		lv_id_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:916:2: ( '.' ( (lv_id_3_0= RULE_ID ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==24) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:916:4: '.' ( (lv_id_3_0= RULE_ID ) )
            	    {
            	    match(input,24,FollowSets000.FOLLOW_24_in_ruleSpare1853); 

            	            createLeafNode(grammarAccess.getSpareAccess().getFullStopKeyword_2_0(), null); 
            	        
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:920:1: ( (lv_id_3_0= RULE_ID ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:921:1: (lv_id_3_0= RULE_ID )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:921:1: (lv_id_3_0= RULE_ID )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:922:3: lv_id_3_0= RULE_ID
            	    {
            	    lv_id_3_0=(Token)input.LT(1);
            	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSpare1870); 

            	    			createLeafNode(grammarAccess.getSpareAccess().getIdIDTerminalRuleCall_2_1_0(), "id"); 
            	    		

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSpareRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"id",
            	    	        		lv_id_3_0, 
            	    	        		"ID", 
            	    	        		lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSpare


    // $ANTLR start entryRuleBoolean
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:952:1: entryRuleBoolean returns [EObject current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final EObject entryRuleBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolean = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:953:2: (iv_ruleBoolean= ruleBoolean EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:954:2: iv_ruleBoolean= ruleBoolean EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBooleanRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_entryRuleBoolean1913);
            iv_ruleBoolean=ruleBoolean();
            _fsp--;

             current =iv_ruleBoolean; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoolean1923); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBoolean


    // $ANTLR start ruleBoolean
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:961:1: ruleBoolean returns [EObject current=null] : ( '#4' ( (lv_bool_1_0= 'myoption' ) )? 'kw' ( (lv_value_3_0= RULE_ID ) ) ) ;
    public final EObject ruleBoolean() throws RecognitionException {
        EObject current = null;

        Token lv_bool_1_0=null;
        Token lv_value_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:966:6: ( ( '#4' ( (lv_bool_1_0= 'myoption' ) )? 'kw' ( (lv_value_3_0= RULE_ID ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:967:1: ( '#4' ( (lv_bool_1_0= 'myoption' ) )? 'kw' ( (lv_value_3_0= RULE_ID ) ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:967:1: ( '#4' ( (lv_bool_1_0= 'myoption' ) )? 'kw' ( (lv_value_3_0= RULE_ID ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:967:3: '#4' ( (lv_bool_1_0= 'myoption' ) )? 'kw' ( (lv_value_3_0= RULE_ID ) )
            {
            match(input,25,FollowSets000.FOLLOW_25_in_ruleBoolean1958); 

                    createLeafNode(grammarAccess.getBooleanAccess().getNumberSignDigitFourKeyword_0(), null); 
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:971:1: ( (lv_bool_1_0= 'myoption' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:972:1: (lv_bool_1_0= 'myoption' )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:972:1: (lv_bool_1_0= 'myoption' )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:973:3: lv_bool_1_0= 'myoption'
                    {
                    lv_bool_1_0=(Token)input.LT(1);
                    match(input,26,FollowSets000.FOLLOW_26_in_ruleBoolean1976); 

                            createLeafNode(grammarAccess.getBooleanAccess().getBoolMyoptionKeyword_1_0(), "bool"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBooleanRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "bool", true, "myoption", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            match(input,27,FollowSets000.FOLLOW_27_in_ruleBoolean2000); 

                    createLeafNode(grammarAccess.getBooleanAccess().getKwKeyword_2(), null); 
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:996:1: ( (lv_value_3_0= RULE_ID ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:997:1: (lv_value_3_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:997:1: (lv_value_3_0= RULE_ID )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:998:3: lv_value_3_0= RULE_ID
            {
            lv_value_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleBoolean2017); 

            			createLeafNode(grammarAccess.getBooleanAccess().getValueIDTerminalRuleCall_3_0(), "value"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBooleanRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_3_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBoolean


    // $ANTLR start entryRuleTransient1
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1028:1: entryRuleTransient1 returns [EObject current=null] : iv_ruleTransient1= ruleTransient1 EOF ;
    public final EObject entryRuleTransient1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransient1 = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1029:2: (iv_ruleTransient1= ruleTransient1 EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1030:2: iv_ruleTransient1= ruleTransient1 EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTransient1Rule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleTransient1_in_entryRuleTransient12058);
            iv_ruleTransient1=ruleTransient1();
            _fsp--;

             current =iv_ruleTransient1; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransient12068); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTransient1


    // $ANTLR start ruleTransient1
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1037:1: ruleTransient1 returns [EObject current=null] : ( '#5' ( ( (lv_precStar_1_0= '*' ) ) | ( (lv_prec_2_0= RULE_INT ) ) ) ( ',' ( ( (lv_scaleStar_4_0= '*' ) ) | ( (lv_scale_5_0= RULE_INT ) ) ) )? ) ;
    public final EObject ruleTransient1() throws RecognitionException {
        EObject current = null;

        Token lv_precStar_1_0=null;
        Token lv_prec_2_0=null;
        Token lv_scaleStar_4_0=null;
        Token lv_scale_5_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1042:6: ( ( '#5' ( ( (lv_precStar_1_0= '*' ) ) | ( (lv_prec_2_0= RULE_INT ) ) ) ( ',' ( ( (lv_scaleStar_4_0= '*' ) ) | ( (lv_scale_5_0= RULE_INT ) ) ) )? ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1043:1: ( '#5' ( ( (lv_precStar_1_0= '*' ) ) | ( (lv_prec_2_0= RULE_INT ) ) ) ( ',' ( ( (lv_scaleStar_4_0= '*' ) ) | ( (lv_scale_5_0= RULE_INT ) ) ) )? )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1043:1: ( '#5' ( ( (lv_precStar_1_0= '*' ) ) | ( (lv_prec_2_0= RULE_INT ) ) ) ( ',' ( ( (lv_scaleStar_4_0= '*' ) ) | ( (lv_scale_5_0= RULE_INT ) ) ) )? )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1043:3: '#5' ( ( (lv_precStar_1_0= '*' ) ) | ( (lv_prec_2_0= RULE_INT ) ) ) ( ',' ( ( (lv_scaleStar_4_0= '*' ) ) | ( (lv_scale_5_0= RULE_INT ) ) ) )?
            {
            match(input,28,FollowSets000.FOLLOW_28_in_ruleTransient12103); 

                    createLeafNode(grammarAccess.getTransient1Access().getNumberSignDigitFiveKeyword_0(), null); 
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1047:1: ( ( (lv_precStar_1_0= '*' ) ) | ( (lv_prec_2_0= RULE_INT ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_INT) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1047:1: ( ( (lv_precStar_1_0= '*' ) ) | ( (lv_prec_2_0= RULE_INT ) ) )", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1047:2: ( (lv_precStar_1_0= '*' ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1047:2: ( (lv_precStar_1_0= '*' ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1048:1: (lv_precStar_1_0= '*' )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1048:1: (lv_precStar_1_0= '*' )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1049:3: lv_precStar_1_0= '*'
                    {
                    lv_precStar_1_0=(Token)input.LT(1);
                    match(input,29,FollowSets000.FOLLOW_29_in_ruleTransient12122); 

                            createLeafNode(grammarAccess.getTransient1Access().getPrecStarAsteriskKeyword_1_0_0(), "precStar"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTransient1Rule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "precStar", true, "*", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1069:6: ( (lv_prec_2_0= RULE_INT ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1069:6: ( (lv_prec_2_0= RULE_INT ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1070:1: (lv_prec_2_0= RULE_INT )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1070:1: (lv_prec_2_0= RULE_INT )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1071:3: lv_prec_2_0= RULE_INT
                    {
                    lv_prec_2_0=(Token)input.LT(1);
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleTransient12158); 

                    			createLeafNode(grammarAccess.getTransient1Access().getPrecINTTerminalRuleCall_1_1_0(), "prec"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTransient1Rule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"prec",
                    	        		lv_prec_2_0, 
                    	        		"INT", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1093:3: ( ',' ( ( (lv_scaleStar_4_0= '*' ) ) | ( (lv_scale_5_0= RULE_INT ) ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1093:5: ',' ( ( (lv_scaleStar_4_0= '*' ) ) | ( (lv_scale_5_0= RULE_INT ) ) )
                    {
                    match(input,30,FollowSets000.FOLLOW_30_in_ruleTransient12175); 

                            createLeafNode(grammarAccess.getTransient1Access().getCommaKeyword_2_0(), null); 
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1097:1: ( ( (lv_scaleStar_4_0= '*' ) ) | ( (lv_scale_5_0= RULE_INT ) ) )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==29) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==RULE_INT) ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1097:1: ( ( (lv_scaleStar_4_0= '*' ) ) | ( (lv_scale_5_0= RULE_INT ) ) )", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1097:2: ( (lv_scaleStar_4_0= '*' ) )
                            {
                            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1097:2: ( (lv_scaleStar_4_0= '*' ) )
                            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1098:1: (lv_scaleStar_4_0= '*' )
                            {
                            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1098:1: (lv_scaleStar_4_0= '*' )
                            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1099:3: lv_scaleStar_4_0= '*'
                            {
                            lv_scaleStar_4_0=(Token)input.LT(1);
                            match(input,29,FollowSets000.FOLLOW_29_in_ruleTransient12194); 

                                    createLeafNode(grammarAccess.getTransient1Access().getScaleStarAsteriskKeyword_2_1_0_0(), "scaleStar"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getTransient1Rule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "scaleStar", true, "*", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1119:6: ( (lv_scale_5_0= RULE_INT ) )
                            {
                            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1119:6: ( (lv_scale_5_0= RULE_INT ) )
                            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1120:1: (lv_scale_5_0= RULE_INT )
                            {
                            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1120:1: (lv_scale_5_0= RULE_INT )
                            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1121:3: lv_scale_5_0= RULE_INT
                            {
                            lv_scale_5_0=(Token)input.LT(1);
                            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleTransient12230); 

                            			createLeafNode(grammarAccess.getTransient1Access().getScaleINTTerminalRuleCall_2_1_1_0(), "scale"); 
                            		

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getTransient1Rule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        try {
                            	       		set(
                            	       			current, 
                            	       			"scale",
                            	        		lv_scale_5_0, 
                            	        		"INT", 
                            	        		lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTransient1


    // $ANTLR start entryRuleConsumed1
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1151:1: entryRuleConsumed1 returns [EObject current=null] : iv_ruleConsumed1= ruleConsumed1 EOF ;
    public final EObject entryRuleConsumed1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConsumed1 = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1152:2: (iv_ruleConsumed1= ruleConsumed1 EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1153:2: iv_ruleConsumed1= ruleConsumed1 EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConsumed1Rule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleConsumed1_in_entryRuleConsumed12274);
            iv_ruleConsumed1=ruleConsumed1();
            _fsp--;

             current =iv_ruleConsumed1; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConsumed12284); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleConsumed1


    // $ANTLR start ruleConsumed1
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1160:1: ruleConsumed1 returns [EObject current=null] : ( '#6' ( ( 'v1' ( (lv_v1_2_0= RULE_INT ) )* ( (lv_v2_3_0= RULE_ID ) ) ) | ( 'v2' ( (lv_v2_5_0= RULE_ID ) )* ( (lv_v1_6_0= RULE_INT ) ) ) ) ) ;
    public final EObject ruleConsumed1() throws RecognitionException {
        EObject current = null;

        Token lv_v1_2_0=null;
        Token lv_v2_3_0=null;
        Token lv_v2_5_0=null;
        Token lv_v1_6_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1165:6: ( ( '#6' ( ( 'v1' ( (lv_v1_2_0= RULE_INT ) )* ( (lv_v2_3_0= RULE_ID ) ) ) | ( 'v2' ( (lv_v2_5_0= RULE_ID ) )* ( (lv_v1_6_0= RULE_INT ) ) ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1166:1: ( '#6' ( ( 'v1' ( (lv_v1_2_0= RULE_INT ) )* ( (lv_v2_3_0= RULE_ID ) ) ) | ( 'v2' ( (lv_v2_5_0= RULE_ID ) )* ( (lv_v1_6_0= RULE_INT ) ) ) ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1166:1: ( '#6' ( ( 'v1' ( (lv_v1_2_0= RULE_INT ) )* ( (lv_v2_3_0= RULE_ID ) ) ) | ( 'v2' ( (lv_v2_5_0= RULE_ID ) )* ( (lv_v1_6_0= RULE_INT ) ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1166:3: '#6' ( ( 'v1' ( (lv_v1_2_0= RULE_INT ) )* ( (lv_v2_3_0= RULE_ID ) ) ) | ( 'v2' ( (lv_v2_5_0= RULE_ID ) )* ( (lv_v1_6_0= RULE_INT ) ) ) )
            {
            match(input,31,FollowSets000.FOLLOW_31_in_ruleConsumed12319); 

                    createLeafNode(grammarAccess.getConsumed1Access().getNumberSignDigitSixKeyword_0(), null); 
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1170:1: ( ( 'v1' ( (lv_v1_2_0= RULE_INT ) )* ( (lv_v2_3_0= RULE_ID ) ) ) | ( 'v2' ( (lv_v2_5_0= RULE_ID ) )* ( (lv_v1_6_0= RULE_INT ) ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            else if ( (LA14_0==33) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1170:1: ( ( 'v1' ( (lv_v1_2_0= RULE_INT ) )* ( (lv_v2_3_0= RULE_ID ) ) ) | ( 'v2' ( (lv_v2_5_0= RULE_ID ) )* ( (lv_v1_6_0= RULE_INT ) ) ) )", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1170:2: ( 'v1' ( (lv_v1_2_0= RULE_INT ) )* ( (lv_v2_3_0= RULE_ID ) ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1170:2: ( 'v1' ( (lv_v1_2_0= RULE_INT ) )* ( (lv_v2_3_0= RULE_ID ) ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1170:4: 'v1' ( (lv_v1_2_0= RULE_INT ) )* ( (lv_v2_3_0= RULE_ID ) )
                    {
                    match(input,32,FollowSets000.FOLLOW_32_in_ruleConsumed12331); 

                            createLeafNode(grammarAccess.getConsumed1Access().getV1Keyword_1_0_0(), null); 
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1174:1: ( (lv_v1_2_0= RULE_INT ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_INT) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1175:1: (lv_v1_2_0= RULE_INT )
                    	    {
                    	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1175:1: (lv_v1_2_0= RULE_INT )
                    	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1176:3: lv_v1_2_0= RULE_INT
                    	    {
                    	    lv_v1_2_0=(Token)input.LT(1);
                    	    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleConsumed12348); 

                    	    			createLeafNode(grammarAccess.getConsumed1Access().getV1INTTerminalRuleCall_1_0_1_0(), "v1"); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getConsumed1Rule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"v1",
                    	    	        		lv_v1_2_0, 
                    	    	        		"INT", 
                    	    	        		lastConsumedNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1198:3: ( (lv_v2_3_0= RULE_ID ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1199:1: (lv_v2_3_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1199:1: (lv_v2_3_0= RULE_ID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1200:3: lv_v2_3_0= RULE_ID
                    {
                    lv_v2_3_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleConsumed12371); 

                    			createLeafNode(grammarAccess.getConsumed1Access().getV2IDTerminalRuleCall_1_0_2_0(), "v2"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getConsumed1Rule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"v2",
                    	        		lv_v2_3_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1223:6: ( 'v2' ( (lv_v2_5_0= RULE_ID ) )* ( (lv_v1_6_0= RULE_INT ) ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1223:6: ( 'v2' ( (lv_v2_5_0= RULE_ID ) )* ( (lv_v1_6_0= RULE_INT ) ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1223:8: 'v2' ( (lv_v2_5_0= RULE_ID ) )* ( (lv_v1_6_0= RULE_INT ) )
                    {
                    match(input,33,FollowSets000.FOLLOW_33_in_ruleConsumed12394); 

                            createLeafNode(grammarAccess.getConsumed1Access().getV2Keyword_1_1_0(), null); 
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1227:1: ( (lv_v2_5_0= RULE_ID ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_ID) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1228:1: (lv_v2_5_0= RULE_ID )
                    	    {
                    	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1228:1: (lv_v2_5_0= RULE_ID )
                    	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1229:3: lv_v2_5_0= RULE_ID
                    	    {
                    	    lv_v2_5_0=(Token)input.LT(1);
                    	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleConsumed12411); 

                    	    			createLeafNode(grammarAccess.getConsumed1Access().getV2IDTerminalRuleCall_1_1_1_0(), "v2"); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getConsumed1Rule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"v2",
                    	    	        		lv_v2_5_0, 
                    	    	        		"ID", 
                    	    	        		lastConsumedNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1251:3: ( (lv_v1_6_0= RULE_INT ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1252:1: (lv_v1_6_0= RULE_INT )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1252:1: (lv_v1_6_0= RULE_INT )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1253:3: lv_v1_6_0= RULE_INT
                    {
                    lv_v1_6_0=(Token)input.LT(1);
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleConsumed12434); 

                    			createLeafNode(grammarAccess.getConsumed1Access().getV1INTTerminalRuleCall_1_1_2_0(), "v1"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getConsumed1Rule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"v1",
                    	        		lv_v1_6_0, 
                    	        		"INT", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleConsumed1


    // $ANTLR start entryRuleConsumed2
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1283:1: entryRuleConsumed2 returns [EObject current=null] : iv_ruleConsumed2= ruleConsumed2 EOF ;
    public final EObject entryRuleConsumed2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConsumed2 = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1284:2: (iv_ruleConsumed2= ruleConsumed2 EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1285:2: iv_ruleConsumed2= ruleConsumed2 EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConsumed2Rule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleConsumed2_in_entryRuleConsumed22477);
            iv_ruleConsumed2=ruleConsumed2();
            _fsp--;

             current =iv_ruleConsumed2; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConsumed22487); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleConsumed2


    // $ANTLR start ruleConsumed2
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1292:1: ruleConsumed2 returns [EObject current=null] : ( '#7' ( (lv_child_1_0= ruleConsumed1 ) ) ) ;
    public final EObject ruleConsumed2() throws RecognitionException {
        EObject current = null;

        EObject lv_child_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1297:6: ( ( '#7' ( (lv_child_1_0= ruleConsumed1 ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1298:1: ( '#7' ( (lv_child_1_0= ruleConsumed1 ) ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1298:1: ( '#7' ( (lv_child_1_0= ruleConsumed1 ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1298:3: '#7' ( (lv_child_1_0= ruleConsumed1 ) )
            {
            match(input,34,FollowSets000.FOLLOW_34_in_ruleConsumed22522); 

                    createLeafNode(grammarAccess.getConsumed2Access().getNumberSignDigitSevenKeyword_0(), null); 
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1302:1: ( (lv_child_1_0= ruleConsumed1 ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1303:1: (lv_child_1_0= ruleConsumed1 )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1303:1: (lv_child_1_0= ruleConsumed1 )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1304:3: lv_child_1_0= ruleConsumed1
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getConsumed2Access().getChildConsumed1ParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleConsumed1_in_ruleConsumed22543);
            lv_child_1_0=ruleConsumed1();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getConsumed2Rule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"child",
            	        		lv_child_1_0, 
            	        		"Consumed1", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleConsumed2


    // $ANTLR start entryRuleLoop1
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1334:1: entryRuleLoop1 returns [EObject current=null] : iv_ruleLoop1= ruleLoop1 EOF ;
    public final EObject entryRuleLoop1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop1 = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1335:2: (iv_ruleLoop1= ruleLoop1 EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1336:2: iv_ruleLoop1= ruleLoop1 EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLoop1Rule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleLoop1_in_entryRuleLoop12579);
            iv_ruleLoop1=ruleLoop1();
            _fsp--;

             current =iv_ruleLoop1; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLoop12589); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLoop1


    // $ANTLR start ruleLoop1
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1343:1: ruleLoop1 returns [EObject current=null] : ( ( 'kw0' )? '#8' ( (lv_id_2_0= RULE_ID ) ) ( 'kw1' )? ( (lv_id_4_0= RULE_ID ) ) ( ( 'kw2' )* 'kw30' )+ ) ;
    public final EObject ruleLoop1() throws RecognitionException {
        EObject current = null;

        Token lv_id_2_0=null;
        Token lv_id_4_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1348:6: ( ( ( 'kw0' )? '#8' ( (lv_id_2_0= RULE_ID ) ) ( 'kw1' )? ( (lv_id_4_0= RULE_ID ) ) ( ( 'kw2' )* 'kw30' )+ ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1349:1: ( ( 'kw0' )? '#8' ( (lv_id_2_0= RULE_ID ) ) ( 'kw1' )? ( (lv_id_4_0= RULE_ID ) ) ( ( 'kw2' )* 'kw30' )+ )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1349:1: ( ( 'kw0' )? '#8' ( (lv_id_2_0= RULE_ID ) ) ( 'kw1' )? ( (lv_id_4_0= RULE_ID ) ) ( ( 'kw2' )* 'kw30' )+ )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1349:2: ( 'kw0' )? '#8' ( (lv_id_2_0= RULE_ID ) ) ( 'kw1' )? ( (lv_id_4_0= RULE_ID ) ) ( ( 'kw2' )* 'kw30' )+
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1349:2: ( 'kw0' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==35) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1349:4: 'kw0'
                    {
                    match(input,35,FollowSets000.FOLLOW_35_in_ruleLoop12625); 

                            createLeafNode(grammarAccess.getLoop1Access().getKw0Keyword_0(), null); 
                        

                    }
                    break;

            }

            match(input,36,FollowSets000.FOLLOW_36_in_ruleLoop12637); 

                    createLeafNode(grammarAccess.getLoop1Access().getNumberSignDigitEightKeyword_1(), null); 
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1357:1: ( (lv_id_2_0= RULE_ID ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1358:1: (lv_id_2_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1358:1: (lv_id_2_0= RULE_ID )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1359:3: lv_id_2_0= RULE_ID
            {
            lv_id_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleLoop12654); 

            			createLeafNode(grammarAccess.getLoop1Access().getIdIDTerminalRuleCall_2_0(), "id"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLoop1Rule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"id",
            	        		lv_id_2_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1381:2: ( 'kw1' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==37) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1381:4: 'kw1'
                    {
                    match(input,37,FollowSets000.FOLLOW_37_in_ruleLoop12670); 

                            createLeafNode(grammarAccess.getLoop1Access().getKw1Keyword_3(), null); 
                        

                    }
                    break;

            }

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1385:3: ( (lv_id_4_0= RULE_ID ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1386:1: (lv_id_4_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1386:1: (lv_id_4_0= RULE_ID )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1387:3: lv_id_4_0= RULE_ID
            {
            lv_id_4_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleLoop12689); 

            			createLeafNode(grammarAccess.getLoop1Access().getIdIDTerminalRuleCall_4_0(), "id"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLoop1Rule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"id",
            	        		lv_id_4_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1409:2: ( ( 'kw2' )* 'kw30' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==38) ) {
                    int LA18_2 = input.LA(2);

                    if ( ((LA18_2>=38 && LA18_2<=39)) ) {
                        alt18=1;
                    }


                }
                else if ( (LA18_0==39) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1409:3: ( 'kw2' )* 'kw30'
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1409:3: ( 'kw2' )*
            	    loop17:
            	    do {
            	        int alt17=2;
            	        int LA17_0 = input.LA(1);

            	        if ( (LA17_0==38) ) {
            	            alt17=1;
            	        }


            	        switch (alt17) {
            	    	case 1 :
            	    	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1409:5: 'kw2'
            	    	    {
            	    	    match(input,38,FollowSets000.FOLLOW_38_in_ruleLoop12706); 

            	    	            createLeafNode(grammarAccess.getLoop1Access().getKw2Keyword_5_0(), null); 
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop17;
            	        }
            	    } while (true);

            	    match(input,39,FollowSets000.FOLLOW_39_in_ruleLoop12718); 

            	            createLeafNode(grammarAccess.getLoop1Access().getKw30Keyword_5_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLoop1


    // $ANTLR start entryRuleLoop2
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1425:1: entryRuleLoop2 returns [EObject current=null] : iv_ruleLoop2= ruleLoop2 EOF ;
    public final EObject entryRuleLoop2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop2 = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1426:2: (iv_ruleLoop2= ruleLoop2 EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1427:2: iv_ruleLoop2= ruleLoop2 EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLoop2Rule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleLoop2_in_entryRuleLoop22756);
            iv_ruleLoop2=ruleLoop2();
            _fsp--;

             current =iv_ruleLoop2; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLoop22766); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLoop2


    // $ANTLR start ruleLoop2
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1434:1: ruleLoop2 returns [EObject current=null] : ( '#9' ( (lv_id_1_0= RULE_ID ) ) ( 'kw1' | ( ( (lv_id_3_0= RULE_ID ) ) 'kw2' ) ) ( 'kw3' | ( ( (lv_id_6_0= RULE_ID ) ) 'kw4' ) )? ( 'kw5' | 'kw6' ) ) ;
    public final EObject ruleLoop2() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        Token lv_id_3_0=null;
        Token lv_id_6_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1439:6: ( ( '#9' ( (lv_id_1_0= RULE_ID ) ) ( 'kw1' | ( ( (lv_id_3_0= RULE_ID ) ) 'kw2' ) ) ( 'kw3' | ( ( (lv_id_6_0= RULE_ID ) ) 'kw4' ) )? ( 'kw5' | 'kw6' ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1440:1: ( '#9' ( (lv_id_1_0= RULE_ID ) ) ( 'kw1' | ( ( (lv_id_3_0= RULE_ID ) ) 'kw2' ) ) ( 'kw3' | ( ( (lv_id_6_0= RULE_ID ) ) 'kw4' ) )? ( 'kw5' | 'kw6' ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1440:1: ( '#9' ( (lv_id_1_0= RULE_ID ) ) ( 'kw1' | ( ( (lv_id_3_0= RULE_ID ) ) 'kw2' ) ) ( 'kw3' | ( ( (lv_id_6_0= RULE_ID ) ) 'kw4' ) )? ( 'kw5' | 'kw6' ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1440:3: '#9' ( (lv_id_1_0= RULE_ID ) ) ( 'kw1' | ( ( (lv_id_3_0= RULE_ID ) ) 'kw2' ) ) ( 'kw3' | ( ( (lv_id_6_0= RULE_ID ) ) 'kw4' ) )? ( 'kw5' | 'kw6' )
            {
            match(input,40,FollowSets000.FOLLOW_40_in_ruleLoop22801); 

                    createLeafNode(grammarAccess.getLoop2Access().getNumberSignDigitNineKeyword_0(), null); 
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1444:1: ( (lv_id_1_0= RULE_ID ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1445:1: (lv_id_1_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1445:1: (lv_id_1_0= RULE_ID )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1446:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleLoop22818); 

            			createLeafNode(grammarAccess.getLoop2Access().getIdIDTerminalRuleCall_1_0(), "id"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLoop2Rule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"id",
            	        		lv_id_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1468:2: ( 'kw1' | ( ( (lv_id_3_0= RULE_ID ) ) 'kw2' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==37) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_ID) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1468:2: ( 'kw1' | ( ( (lv_id_3_0= RULE_ID ) ) 'kw2' ) )", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1468:4: 'kw1'
                    {
                    match(input,37,FollowSets000.FOLLOW_37_in_ruleLoop22834); 

                            createLeafNode(grammarAccess.getLoop2Access().getKw1Keyword_2_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1473:6: ( ( (lv_id_3_0= RULE_ID ) ) 'kw2' )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1473:6: ( ( (lv_id_3_0= RULE_ID ) ) 'kw2' )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1473:7: ( (lv_id_3_0= RULE_ID ) ) 'kw2'
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1473:7: ( (lv_id_3_0= RULE_ID ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1474:1: (lv_id_3_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1474:1: (lv_id_3_0= RULE_ID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1475:3: lv_id_3_0= RULE_ID
                    {
                    lv_id_3_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleLoop22858); 

                    			createLeafNode(grammarAccess.getLoop2Access().getIdIDTerminalRuleCall_2_1_0_0(), "id"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getLoop2Rule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"id",
                    	        		lv_id_3_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,38,FollowSets000.FOLLOW_38_in_ruleLoop22873); 

                            createLeafNode(grammarAccess.getLoop2Access().getKw2Keyword_2_1_1(), null); 
                        

                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1501:3: ( 'kw3' | ( ( (lv_id_6_0= RULE_ID ) ) 'kw4' ) )?
            int alt20=3;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==41) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_ID) ) {
                alt20=2;
            }
            switch (alt20) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1501:5: 'kw3'
                    {
                    match(input,41,FollowSets000.FOLLOW_41_in_ruleLoop22886); 

                            createLeafNode(grammarAccess.getLoop2Access().getKw3Keyword_3_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1506:6: ( ( (lv_id_6_0= RULE_ID ) ) 'kw4' )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1506:6: ( ( (lv_id_6_0= RULE_ID ) ) 'kw4' )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1506:7: ( (lv_id_6_0= RULE_ID ) ) 'kw4'
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1506:7: ( (lv_id_6_0= RULE_ID ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1507:1: (lv_id_6_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1507:1: (lv_id_6_0= RULE_ID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1508:3: lv_id_6_0= RULE_ID
                    {
                    lv_id_6_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleLoop22910); 

                    			createLeafNode(grammarAccess.getLoop2Access().getIdIDTerminalRuleCall_3_1_0_0(), "id"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getLoop2Rule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"id",
                    	        		lv_id_6_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,42,FollowSets000.FOLLOW_42_in_ruleLoop22925); 

                            createLeafNode(grammarAccess.getLoop2Access().getKw4Keyword_3_1_1(), null); 
                        

                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1534:4: ( 'kw5' | 'kw6' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==43) ) {
                alt21=1;
            }
            else if ( (LA21_0==44) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1534:4: ( 'kw5' | 'kw6' )", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1534:6: 'kw5'
                    {
                    match(input,43,FollowSets000.FOLLOW_43_in_ruleLoop22939); 

                            createLeafNode(grammarAccess.getLoop2Access().getKw5Keyword_4_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1539:7: 'kw6'
                    {
                    match(input,44,FollowSets000.FOLLOW_44_in_ruleLoop22955); 

                            createLeafNode(grammarAccess.getLoop2Access().getKw6Keyword_4_1(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLoop2


    // $ANTLR start entryRuleLoop3
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1551:1: entryRuleLoop3 returns [EObject current=null] : iv_ruleLoop3= ruleLoop3 EOF ;
    public final EObject entryRuleLoop3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop3 = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1552:2: (iv_ruleLoop3= ruleLoop3 EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1553:2: iv_ruleLoop3= ruleLoop3 EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLoop3Rule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleLoop3_in_entryRuleLoop32992);
            iv_ruleLoop3=ruleLoop3();
            _fsp--;

             current =iv_ruleLoop3; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLoop33002); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLoop3


    // $ANTLR start ruleLoop3
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1560:1: ruleLoop3 returns [EObject current=null] : ( ( 'kw1' | 'kw2' | 'kw3' ) '#10' ( (lv_id_4_0= RULE_ID ) ) ( 'kw4' ( (lv_id_6_0= RULE_ID ) ) 'kw5' )* ) ;
    public final EObject ruleLoop3() throws RecognitionException {
        EObject current = null;

        Token lv_id_4_0=null;
        Token lv_id_6_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1565:6: ( ( ( 'kw1' | 'kw2' | 'kw3' ) '#10' ( (lv_id_4_0= RULE_ID ) ) ( 'kw4' ( (lv_id_6_0= RULE_ID ) ) 'kw5' )* ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1566:1: ( ( 'kw1' | 'kw2' | 'kw3' ) '#10' ( (lv_id_4_0= RULE_ID ) ) ( 'kw4' ( (lv_id_6_0= RULE_ID ) ) 'kw5' )* )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1566:1: ( ( 'kw1' | 'kw2' | 'kw3' ) '#10' ( (lv_id_4_0= RULE_ID ) ) ( 'kw4' ( (lv_id_6_0= RULE_ID ) ) 'kw5' )* )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1566:2: ( 'kw1' | 'kw2' | 'kw3' ) '#10' ( (lv_id_4_0= RULE_ID ) ) ( 'kw4' ( (lv_id_6_0= RULE_ID ) ) 'kw5' )*
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1566:2: ( 'kw1' | 'kw2' | 'kw3' )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt22=1;
                }
                break;
            case 38:
                {
                alt22=2;
                }
                break;
            case 41:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1566:2: ( 'kw1' | 'kw2' | 'kw3' )", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1566:4: 'kw1'
                    {
                    match(input,37,FollowSets000.FOLLOW_37_in_ruleLoop33038); 

                            createLeafNode(grammarAccess.getLoop3Access().getKw1Keyword_0_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1571:7: 'kw2'
                    {
                    match(input,38,FollowSets000.FOLLOW_38_in_ruleLoop33054); 

                            createLeafNode(grammarAccess.getLoop3Access().getKw2Keyword_0_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1576:7: 'kw3'
                    {
                    match(input,41,FollowSets000.FOLLOW_41_in_ruleLoop33070); 

                            createLeafNode(grammarAccess.getLoop3Access().getKw3Keyword_0_2(), null); 
                        

                    }
                    break;

            }

            match(input,45,FollowSets000.FOLLOW_45_in_ruleLoop33081); 

                    createLeafNode(grammarAccess.getLoop3Access().getNumberSignDigitOneDigitZeroKeyword_1(), null); 
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1584:1: ( (lv_id_4_0= RULE_ID ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1585:1: (lv_id_4_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1585:1: (lv_id_4_0= RULE_ID )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1586:3: lv_id_4_0= RULE_ID
            {
            lv_id_4_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleLoop33098); 

            			createLeafNode(grammarAccess.getLoop3Access().getIdIDTerminalRuleCall_2_0(), "id"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLoop3Rule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"id",
            	        		lv_id_4_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1608:2: ( 'kw4' ( (lv_id_6_0= RULE_ID ) ) 'kw5' )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==42) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1608:4: 'kw4' ( (lv_id_6_0= RULE_ID ) ) 'kw5'
            	    {
            	    match(input,42,FollowSets000.FOLLOW_42_in_ruleLoop33114); 

            	            createLeafNode(grammarAccess.getLoop3Access().getKw4Keyword_3_0(), null); 
            	        
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1612:1: ( (lv_id_6_0= RULE_ID ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1613:1: (lv_id_6_0= RULE_ID )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1613:1: (lv_id_6_0= RULE_ID )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1614:3: lv_id_6_0= RULE_ID
            	    {
            	    lv_id_6_0=(Token)input.LT(1);
            	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleLoop33131); 

            	    			createLeafNode(grammarAccess.getLoop3Access().getIdIDTerminalRuleCall_3_1_0(), "id"); 
            	    		

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getLoop3Rule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"id",
            	    	        		lv_id_6_0, 
            	    	        		"ID", 
            	    	        		lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }

            	    match(input,43,FollowSets000.FOLLOW_43_in_ruleLoop33146); 

            	            createLeafNode(grammarAccess.getLoop3Access().getKw5Keyword_3_2(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLoop3


    // $ANTLR start entryRuleLoop4
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1648:1: entryRuleLoop4 returns [EObject current=null] : iv_ruleLoop4= ruleLoop4 EOF ;
    public final EObject entryRuleLoop4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop4 = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1649:2: (iv_ruleLoop4= ruleLoop4 EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1650:2: iv_ruleLoop4= ruleLoop4 EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLoop4Rule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleLoop4_in_entryRuleLoop43184);
            iv_ruleLoop4=ruleLoop4();
            _fsp--;

             current =iv_ruleLoop4; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLoop43194); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLoop4


    // $ANTLR start ruleLoop4
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1657:1: ruleLoop4 returns [EObject current=null] : ( '#11' ( 'kw1' | 'kw2' | ( 'kw3' 'kw4' ) ) ( (lv_id_5_0= RULE_ID ) ) ( 'kw5' ( 'kw6' ( 'kw7' )? )? )+ ) ;
    public final EObject ruleLoop4() throws RecognitionException {
        EObject current = null;

        Token lv_id_5_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1662:6: ( ( '#11' ( 'kw1' | 'kw2' | ( 'kw3' 'kw4' ) ) ( (lv_id_5_0= RULE_ID ) ) ( 'kw5' ( 'kw6' ( 'kw7' )? )? )+ ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1663:1: ( '#11' ( 'kw1' | 'kw2' | ( 'kw3' 'kw4' ) ) ( (lv_id_5_0= RULE_ID ) ) ( 'kw5' ( 'kw6' ( 'kw7' )? )? )+ )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1663:1: ( '#11' ( 'kw1' | 'kw2' | ( 'kw3' 'kw4' ) ) ( (lv_id_5_0= RULE_ID ) ) ( 'kw5' ( 'kw6' ( 'kw7' )? )? )+ )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1663:3: '#11' ( 'kw1' | 'kw2' | ( 'kw3' 'kw4' ) ) ( (lv_id_5_0= RULE_ID ) ) ( 'kw5' ( 'kw6' ( 'kw7' )? )? )+
            {
            match(input,46,FollowSets000.FOLLOW_46_in_ruleLoop43229); 

                    createLeafNode(grammarAccess.getLoop4Access().getNumberSignDigitOneDigitOneKeyword_0(), null); 
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1667:1: ( 'kw1' | 'kw2' | ( 'kw3' 'kw4' ) )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt24=1;
                }
                break;
            case 38:
                {
                alt24=2;
                }
                break;
            case 41:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1667:1: ( 'kw1' | 'kw2' | ( 'kw3' 'kw4' ) )", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1667:3: 'kw1'
                    {
                    match(input,37,FollowSets000.FOLLOW_37_in_ruleLoop43240); 

                            createLeafNode(grammarAccess.getLoop4Access().getKw1Keyword_1_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1672:7: 'kw2'
                    {
                    match(input,38,FollowSets000.FOLLOW_38_in_ruleLoop43256); 

                            createLeafNode(grammarAccess.getLoop4Access().getKw2Keyword_1_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1677:6: ( 'kw3' 'kw4' )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1677:6: ( 'kw3' 'kw4' )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1677:8: 'kw3' 'kw4'
                    {
                    match(input,41,FollowSets000.FOLLOW_41_in_ruleLoop43273); 

                            createLeafNode(grammarAccess.getLoop4Access().getKw3Keyword_1_2_0(), null); 
                        
                    match(input,42,FollowSets000.FOLLOW_42_in_ruleLoop43283); 

                            createLeafNode(grammarAccess.getLoop4Access().getKw4Keyword_1_2_1(), null); 
                        

                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1685:3: ( (lv_id_5_0= RULE_ID ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1686:1: (lv_id_5_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1686:1: (lv_id_5_0= RULE_ID )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1687:3: lv_id_5_0= RULE_ID
            {
            lv_id_5_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleLoop43302); 

            			createLeafNode(grammarAccess.getLoop4Access().getIdIDTerminalRuleCall_2_0(), "id"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLoop4Rule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"id",
            	        		lv_id_5_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1709:2: ( 'kw5' ( 'kw6' ( 'kw7' )? )? )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==43) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1709:4: 'kw5' ( 'kw6' ( 'kw7' )? )?
            	    {
            	    match(input,43,FollowSets000.FOLLOW_43_in_ruleLoop43318); 

            	            createLeafNode(grammarAccess.getLoop4Access().getKw5Keyword_3_0(), null); 
            	        
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1713:1: ( 'kw6' ( 'kw7' )? )?
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==44) ) {
            	        alt26=1;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1713:3: 'kw6' ( 'kw7' )?
            	            {
            	            match(input,44,FollowSets000.FOLLOW_44_in_ruleLoop43329); 

            	                    createLeafNode(grammarAccess.getLoop4Access().getKw6Keyword_3_1_0(), null); 
            	                
            	            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1717:1: ( 'kw7' )?
            	            int alt25=2;
            	            int LA25_0 = input.LA(1);

            	            if ( (LA25_0==47) ) {
            	                alt25=1;
            	            }
            	            switch (alt25) {
            	                case 1 :
            	                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1717:3: 'kw7'
            	                    {
            	                    match(input,47,FollowSets000.FOLLOW_47_in_ruleLoop43340); 

            	                            createLeafNode(grammarAccess.getLoop4Access().getKw7Keyword_3_1_1(), null); 
            	                        

            	                    }
            	                    break;

            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLoop4


    // $ANTLR start entryRuleLoopBug285452
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1729:1: entryRuleLoopBug285452 returns [EObject current=null] : iv_ruleLoopBug285452= ruleLoopBug285452 EOF ;
    public final EObject entryRuleLoopBug285452() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoopBug285452 = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1730:2: (iv_ruleLoopBug285452= ruleLoopBug285452 EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1731:2: iv_ruleLoopBug285452= ruleLoopBug285452 EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLoopBug285452Rule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleLoopBug285452_in_entryRuleLoopBug2854523382);
            iv_ruleLoopBug285452=ruleLoopBug285452();
            _fsp--;

             current =iv_ruleLoopBug285452; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLoopBug2854523392); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLoopBug285452


    // $ANTLR start ruleLoopBug285452
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1738:1: ruleLoopBug285452 returns [EObject current=null] : ( '#12' ( ( (lv_interface_1_0= 'interface' ) ) | 'class' ) ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleLoopBug285452() throws RecognitionException {
        EObject current = null;

        Token lv_interface_1_0=null;
        Token lv_name_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1743:6: ( ( '#12' ( ( (lv_interface_1_0= 'interface' ) ) | 'class' ) ( (lv_name_3_0= RULE_ID ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1744:1: ( '#12' ( ( (lv_interface_1_0= 'interface' ) ) | 'class' ) ( (lv_name_3_0= RULE_ID ) ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1744:1: ( '#12' ( ( (lv_interface_1_0= 'interface' ) ) | 'class' ) ( (lv_name_3_0= RULE_ID ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1744:3: '#12' ( ( (lv_interface_1_0= 'interface' ) ) | 'class' ) ( (lv_name_3_0= RULE_ID ) )
            {
            match(input,48,FollowSets000.FOLLOW_48_in_ruleLoopBug2854523427); 

                    createLeafNode(grammarAccess.getLoopBug285452Access().getNumberSignDigitOneDigitTwoKeyword_0(), null); 
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1748:1: ( ( (lv_interface_1_0= 'interface' ) ) | 'class' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==49) ) {
                alt28=1;
            }
            else if ( (LA28_0==50) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1748:1: ( ( (lv_interface_1_0= 'interface' ) ) | 'class' )", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1748:2: ( (lv_interface_1_0= 'interface' ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1748:2: ( (lv_interface_1_0= 'interface' ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1749:1: (lv_interface_1_0= 'interface' )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1749:1: (lv_interface_1_0= 'interface' )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1750:3: lv_interface_1_0= 'interface'
                    {
                    lv_interface_1_0=(Token)input.LT(1);
                    match(input,49,FollowSets000.FOLLOW_49_in_ruleLoopBug2854523446); 

                            createLeafNode(grammarAccess.getLoopBug285452Access().getInterfaceInterfaceKeyword_1_0_0(), "interface"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getLoopBug285452Rule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "interface", true, "interface", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1770:7: 'class'
                    {
                    match(input,50,FollowSets000.FOLLOW_50_in_ruleLoopBug2854523475); 

                            createLeafNode(grammarAccess.getLoopBug285452Access().getClassKeyword_1_1(), null); 
                        

                    }
                    break;

            }

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1774:2: ( (lv_name_3_0= RULE_ID ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1775:1: (lv_name_3_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1775:1: (lv_name_3_0= RULE_ID )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1776:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleLoopBug2854523493); 

            			createLeafNode(grammarAccess.getLoopBug285452Access().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLoopBug285452Rule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_3_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLoopBug285452


    // $ANTLR start entryRuleDuplicateBug284491
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1806:1: entryRuleDuplicateBug284491 returns [EObject current=null] : iv_ruleDuplicateBug284491= ruleDuplicateBug284491 EOF ;
    public final EObject entryRuleDuplicateBug284491() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDuplicateBug284491 = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1807:2: (iv_ruleDuplicateBug284491= ruleDuplicateBug284491 EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1808:2: iv_ruleDuplicateBug284491= ruleDuplicateBug284491 EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDuplicateBug284491Rule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleDuplicateBug284491_in_entryRuleDuplicateBug2844913534);
            iv_ruleDuplicateBug284491=ruleDuplicateBug284491();
            _fsp--;

             current =iv_ruleDuplicateBug284491; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDuplicateBug2844913544); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDuplicateBug284491


    // $ANTLR start ruleDuplicateBug284491
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1815:1: ruleDuplicateBug284491 returns [EObject current=null] : ( '#13' ( ( (lv_static_1_0= 'static' ) ) | ( (lv_final_2_0= 'final' ) ) | ( (lv_transient_3_0= 'transient' ) ) )* ) ;
    public final EObject ruleDuplicateBug284491() throws RecognitionException {
        EObject current = null;

        Token lv_static_1_0=null;
        Token lv_final_2_0=null;
        Token lv_transient_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1820:6: ( ( '#13' ( ( (lv_static_1_0= 'static' ) ) | ( (lv_final_2_0= 'final' ) ) | ( (lv_transient_3_0= 'transient' ) ) )* ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1821:1: ( '#13' ( ( (lv_static_1_0= 'static' ) ) | ( (lv_final_2_0= 'final' ) ) | ( (lv_transient_3_0= 'transient' ) ) )* )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1821:1: ( '#13' ( ( (lv_static_1_0= 'static' ) ) | ( (lv_final_2_0= 'final' ) ) | ( (lv_transient_3_0= 'transient' ) ) )* )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1821:3: '#13' ( ( (lv_static_1_0= 'static' ) ) | ( (lv_final_2_0= 'final' ) ) | ( (lv_transient_3_0= 'transient' ) ) )*
            {
            match(input,51,FollowSets000.FOLLOW_51_in_ruleDuplicateBug2844913579); 

                    createLeafNode(grammarAccess.getDuplicateBug284491Access().getNumberSignDigitOneDigitThreeKeyword_0(), null); 
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1825:1: ( ( (lv_static_1_0= 'static' ) ) | ( (lv_final_2_0= 'final' ) ) | ( (lv_transient_3_0= 'transient' ) ) )*
            loop29:
            do {
                int alt29=4;
                switch ( input.LA(1) ) {
                case 52:
                    {
                    alt29=1;
                    }
                    break;
                case 53:
                    {
                    alt29=2;
                    }
                    break;
                case 54:
                    {
                    alt29=3;
                    }
                    break;

                }

                switch (alt29) {
            	case 1 :
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1825:2: ( (lv_static_1_0= 'static' ) )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1825:2: ( (lv_static_1_0= 'static' ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1826:1: (lv_static_1_0= 'static' )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1826:1: (lv_static_1_0= 'static' )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1827:3: lv_static_1_0= 'static'
            	    {
            	    lv_static_1_0=(Token)input.LT(1);
            	    match(input,52,FollowSets000.FOLLOW_52_in_ruleDuplicateBug2844913598); 

            	            createLeafNode(grammarAccess.getDuplicateBug284491Access().getStaticStaticKeyword_1_0_0(), "static"); 
            	        

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getDuplicateBug284491Rule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		set(current, "static", true, "static", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1847:6: ( (lv_final_2_0= 'final' ) )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1847:6: ( (lv_final_2_0= 'final' ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1848:1: (lv_final_2_0= 'final' )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1848:1: (lv_final_2_0= 'final' )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1849:3: lv_final_2_0= 'final'
            	    {
            	    lv_final_2_0=(Token)input.LT(1);
            	    match(input,53,FollowSets000.FOLLOW_53_in_ruleDuplicateBug2844913635); 

            	            createLeafNode(grammarAccess.getDuplicateBug284491Access().getFinalFinalKeyword_1_1_0(), "final"); 
            	        

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getDuplicateBug284491Rule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		set(current, "final", true, "final", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1869:6: ( (lv_transient_3_0= 'transient' ) )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1869:6: ( (lv_transient_3_0= 'transient' ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1870:1: (lv_transient_3_0= 'transient' )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1870:1: (lv_transient_3_0= 'transient' )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1871:3: lv_transient_3_0= 'transient'
            	    {
            	    lv_transient_3_0=(Token)input.LT(1);
            	    match(input,54,FollowSets000.FOLLOW_54_in_ruleDuplicateBug2844913672); 

            	            createLeafNode(grammarAccess.getDuplicateBug284491Access().getTransientTransientKeyword_1_2_0(), "transient"); 
            	        

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getDuplicateBug284491Rule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		set(current, "transient", true, "transient", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDuplicateBug284491


    // $ANTLR start entryRuleEmptyObjectBug284850
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1898:1: entryRuleEmptyObjectBug284850 returns [EObject current=null] : iv_ruleEmptyObjectBug284850= ruleEmptyObjectBug284850 EOF ;
    public final EObject entryRuleEmptyObjectBug284850() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyObjectBug284850 = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1899:2: (iv_ruleEmptyObjectBug284850= ruleEmptyObjectBug284850 EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1900:2: iv_ruleEmptyObjectBug284850= ruleEmptyObjectBug284850 EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEmptyObjectBug284850Rule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleEmptyObjectBug284850_in_entryRuleEmptyObjectBug2848503723);
            iv_ruleEmptyObjectBug284850=ruleEmptyObjectBug284850();
            _fsp--;

             current =iv_ruleEmptyObjectBug284850; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEmptyObjectBug2848503733); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEmptyObjectBug284850


    // $ANTLR start ruleEmptyObjectBug284850
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1907:1: ruleEmptyObjectBug284850 returns [EObject current=null] : ( '#14' ( (lv_items_1_0= ruleEmptyObjectItems ) ) ) ;
    public final EObject ruleEmptyObjectBug284850() throws RecognitionException {
        EObject current = null;

        EObject lv_items_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1912:6: ( ( '#14' ( (lv_items_1_0= ruleEmptyObjectItems ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1913:1: ( '#14' ( (lv_items_1_0= ruleEmptyObjectItems ) ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1913:1: ( '#14' ( (lv_items_1_0= ruleEmptyObjectItems ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1913:3: '#14' ( (lv_items_1_0= ruleEmptyObjectItems ) )
            {
            match(input,55,FollowSets000.FOLLOW_55_in_ruleEmptyObjectBug2848503768); 

                    createLeafNode(grammarAccess.getEmptyObjectBug284850Access().getNumberSignDigitOneDigitFourKeyword_0(), null); 
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1917:1: ( (lv_items_1_0= ruleEmptyObjectItems ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1918:1: (lv_items_1_0= ruleEmptyObjectItems )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1918:1: (lv_items_1_0= ruleEmptyObjectItems )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1919:3: lv_items_1_0= ruleEmptyObjectItems
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getEmptyObjectBug284850Access().getItemsEmptyObjectItemsParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEmptyObjectItems_in_ruleEmptyObjectBug2848503789);
            lv_items_1_0=ruleEmptyObjectItems();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEmptyObjectBug284850Rule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"items",
            	        		lv_items_1_0, 
            	        		"EmptyObjectItems", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEmptyObjectBug284850


    // $ANTLR start entryRuleEmptyObjectItems
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1949:1: entryRuleEmptyObjectItems returns [EObject current=null] : iv_ruleEmptyObjectItems= ruleEmptyObjectItems EOF ;
    public final EObject entryRuleEmptyObjectItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyObjectItems = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1950:2: (iv_ruleEmptyObjectItems= ruleEmptyObjectItems EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1951:2: iv_ruleEmptyObjectItems= ruleEmptyObjectItems EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEmptyObjectItemsRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleEmptyObjectItems_in_entryRuleEmptyObjectItems3825);
            iv_ruleEmptyObjectItems=ruleEmptyObjectItems();
            _fsp--;

             current =iv_ruleEmptyObjectItems; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEmptyObjectItems3835); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEmptyObjectItems


    // $ANTLR start ruleEmptyObjectItems
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1958:1: ruleEmptyObjectItems returns [EObject current=null] : ( (lv_list_0_0= ruleEmptyObjectItem ) )* ;
    public final EObject ruleEmptyObjectItems() throws RecognitionException {
        EObject current = null;

        EObject lv_list_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1963:6: ( ( (lv_list_0_0= ruleEmptyObjectItem ) )* )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1964:1: ( (lv_list_0_0= ruleEmptyObjectItem ) )*
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1964:1: ( (lv_list_0_0= ruleEmptyObjectItem ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==56) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1965:1: (lv_list_0_0= ruleEmptyObjectItem )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1965:1: (lv_list_0_0= ruleEmptyObjectItem )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1966:3: lv_list_0_0= ruleEmptyObjectItem
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEmptyObjectItemsAccess().getListEmptyObjectItemParserRuleCall_0(), currentNode); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEmptyObjectItem_in_ruleEmptyObjectItems3880);
            	    lv_list_0_0=ruleEmptyObjectItem();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getEmptyObjectItemsRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"list",
            	    	        		lv_list_0_0, 
            	    	        		"EmptyObjectItem", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEmptyObjectItems


    // $ANTLR start entryRuleEmptyObjectItem
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1996:1: entryRuleEmptyObjectItem returns [EObject current=null] : iv_ruleEmptyObjectItem= ruleEmptyObjectItem EOF ;
    public final EObject entryRuleEmptyObjectItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyObjectItem = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1997:2: (iv_ruleEmptyObjectItem= ruleEmptyObjectItem EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:1998:2: iv_ruleEmptyObjectItem= ruleEmptyObjectItem EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEmptyObjectItemRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleEmptyObjectItem_in_entryRuleEmptyObjectItem3916);
            iv_ruleEmptyObjectItem=ruleEmptyObjectItem();
            _fsp--;

             current =iv_ruleEmptyObjectItem; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEmptyObjectItem3926); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEmptyObjectItem


    // $ANTLR start ruleEmptyObjectItem
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2005:1: ruleEmptyObjectItem returns [EObject current=null] : ( 'item' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEmptyObjectItem() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2010:6: ( ( 'item' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2011:1: ( 'item' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2011:1: ( 'item' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2011:3: 'item' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,56,FollowSets000.FOLLOW_56_in_ruleEmptyObjectItem3961); 

                    createLeafNode(grammarAccess.getEmptyObjectItemAccess().getItemKeyword_0(), null); 
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2015:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2016:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2016:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2017:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEmptyObjectItem3978); 

            			createLeafNode(grammarAccess.getEmptyObjectItemAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEmptyObjectItemRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEmptyObjectItem


    // $ANTLR start entryRuleMultiInheritanceBug280439
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2047:1: entryRuleMultiInheritanceBug280439 returns [EObject current=null] : iv_ruleMultiInheritanceBug280439= ruleMultiInheritanceBug280439 EOF ;
    public final EObject entryRuleMultiInheritanceBug280439() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiInheritanceBug280439 = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2048:2: (iv_ruleMultiInheritanceBug280439= ruleMultiInheritanceBug280439 EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2049:2: iv_ruleMultiInheritanceBug280439= ruleMultiInheritanceBug280439 EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMultiInheritanceBug280439Rule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiInheritanceBug280439_in_entryRuleMultiInheritanceBug2804394019);
            iv_ruleMultiInheritanceBug280439=ruleMultiInheritanceBug280439();
            _fsp--;

             current =iv_ruleMultiInheritanceBug280439; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiInheritanceBug2804394029); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleMultiInheritanceBug280439


    // $ANTLR start ruleMultiInheritanceBug280439
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2056:1: ruleMultiInheritanceBug280439 returns [EObject current=null] : ( '#15' ( (lv_val_1_0= ruleConcreteMulti ) ) ) ;
    public final EObject ruleMultiInheritanceBug280439() throws RecognitionException {
        EObject current = null;

        EObject lv_val_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2061:6: ( ( '#15' ( (lv_val_1_0= ruleConcreteMulti ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2062:1: ( '#15' ( (lv_val_1_0= ruleConcreteMulti ) ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2062:1: ( '#15' ( (lv_val_1_0= ruleConcreteMulti ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2062:3: '#15' ( (lv_val_1_0= ruleConcreteMulti ) )
            {
            match(input,57,FollowSets000.FOLLOW_57_in_ruleMultiInheritanceBug2804394064); 

                    createLeafNode(grammarAccess.getMultiInheritanceBug280439Access().getNumberSignDigitOneDigitFiveKeyword_0(), null); 
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2066:1: ( (lv_val_1_0= ruleConcreteMulti ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2067:1: (lv_val_1_0= ruleConcreteMulti )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2067:1: (lv_val_1_0= ruleConcreteMulti )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2068:3: lv_val_1_0= ruleConcreteMulti
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMultiInheritanceBug280439Access().getValConcreteMultiParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleConcreteMulti_in_ruleMultiInheritanceBug2804394085);
            lv_val_1_0=ruleConcreteMulti();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMultiInheritanceBug280439Rule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"val",
            	        		lv_val_1_0, 
            	        		"ConcreteMulti", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleMultiInheritanceBug280439


    // $ANTLR start entryRuleConcreteMulti
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2102:1: entryRuleConcreteMulti returns [EObject current=null] : iv_ruleConcreteMulti= ruleConcreteMulti EOF ;
    public final EObject entryRuleConcreteMulti() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcreteMulti = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2103:2: (iv_ruleConcreteMulti= ruleConcreteMulti EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2104:2: iv_ruleConcreteMulti= ruleConcreteMulti EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConcreteMultiRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleConcreteMulti_in_entryRuleConcreteMulti4125);
            iv_ruleConcreteMulti=ruleConcreteMulti();
            _fsp--;

             current =iv_ruleConcreteMulti; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConcreteMulti4135); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleConcreteMulti


    // $ANTLR start ruleConcreteMulti
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2111:1: ruleConcreteMulti returns [EObject current=null] : ( ( (lv_m1_0_0= RULE_ID ) ) ( (lv_m2_1_0= RULE_ID ) ) ) ;
    public final EObject ruleConcreteMulti() throws RecognitionException {
        EObject current = null;

        Token lv_m1_0_0=null;
        Token lv_m2_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2116:6: ( ( ( (lv_m1_0_0= RULE_ID ) ) ( (lv_m2_1_0= RULE_ID ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2117:1: ( ( (lv_m1_0_0= RULE_ID ) ) ( (lv_m2_1_0= RULE_ID ) ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2117:1: ( ( (lv_m1_0_0= RULE_ID ) ) ( (lv_m2_1_0= RULE_ID ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2117:2: ( (lv_m1_0_0= RULE_ID ) ) ( (lv_m2_1_0= RULE_ID ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2117:2: ( (lv_m1_0_0= RULE_ID ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2118:1: (lv_m1_0_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2118:1: (lv_m1_0_0= RULE_ID )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2119:3: lv_m1_0_0= RULE_ID
            {
            lv_m1_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleConcreteMulti4177); 

            			createLeafNode(grammarAccess.getConcreteMultiAccess().getM1IDTerminalRuleCall_0_0(), "m1"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getConcreteMultiRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"m1",
            	        		lv_m1_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2141:2: ( (lv_m2_1_0= RULE_ID ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2142:1: (lv_m2_1_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2142:1: (lv_m2_1_0= RULE_ID )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2143:3: lv_m2_1_0= RULE_ID
            {
            lv_m2_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleConcreteMulti4199); 

            			createLeafNode(grammarAccess.getConcreteMultiAccess().getM2IDTerminalRuleCall_1_0(), "m2"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getConcreteMultiRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"m2",
            	        		lv_m2_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleConcreteMulti


    // $ANTLR start entryRuleEObjectRef
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2173:1: entryRuleEObjectRef returns [EObject current=null] : iv_ruleEObjectRef= ruleEObjectRef EOF ;
    public final EObject entryRuleEObjectRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEObjectRef = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2174:2: (iv_ruleEObjectRef= ruleEObjectRef EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2175:2: iv_ruleEObjectRef= ruleEObjectRef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEObjectRefRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleEObjectRef_in_entryRuleEObjectRef4240);
            iv_ruleEObjectRef=ruleEObjectRef();
            _fsp--;

             current =iv_ruleEObjectRef; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEObjectRef4250); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEObjectRef


    // $ANTLR start ruleEObjectRef
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2182:1: ruleEObjectRef returns [EObject current=null] : ( '#16' ( (lv_obj_1_0= ruleEObjectElement ) ) 'refs' ( ( RULE_ID ) ) ) ;
    public final EObject ruleEObjectRef() throws RecognitionException {
        EObject current = null;

        EObject lv_obj_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2187:6: ( ( '#16' ( (lv_obj_1_0= ruleEObjectElement ) ) 'refs' ( ( RULE_ID ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2188:1: ( '#16' ( (lv_obj_1_0= ruleEObjectElement ) ) 'refs' ( ( RULE_ID ) ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2188:1: ( '#16' ( (lv_obj_1_0= ruleEObjectElement ) ) 'refs' ( ( RULE_ID ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2188:3: '#16' ( (lv_obj_1_0= ruleEObjectElement ) ) 'refs' ( ( RULE_ID ) )
            {
            match(input,58,FollowSets000.FOLLOW_58_in_ruleEObjectRef4285); 

                    createLeafNode(grammarAccess.getEObjectRefAccess().getNumberSignDigitOneDigitSixKeyword_0(), null); 
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2192:1: ( (lv_obj_1_0= ruleEObjectElement ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2193:1: (lv_obj_1_0= ruleEObjectElement )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2193:1: (lv_obj_1_0= ruleEObjectElement )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2194:3: lv_obj_1_0= ruleEObjectElement
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getEObjectRefAccess().getObjEObjectElementParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEObjectElement_in_ruleEObjectRef4306);
            lv_obj_1_0=ruleEObjectElement();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEObjectRefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"obj",
            	        		lv_obj_1_0, 
            	        		"EObjectElement", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,59,FollowSets000.FOLLOW_59_in_ruleEObjectRef4316); 

                    createLeafNode(grammarAccess.getEObjectRefAccess().getRefsKeyword_2(), null); 
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2220:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2221:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2221:1: ( RULE_ID )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2222:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getEObjectRefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEObjectRef4334); 

            		createLeafNode(grammarAccess.getEObjectRefAccess().getRefEObjectCrossReference_3_0(), "ref"); 
            	

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEObjectRef


    // $ANTLR start entryRuleEObjectElement
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2242:1: entryRuleEObjectElement returns [EObject current=null] : iv_ruleEObjectElement= ruleEObjectElement EOF ;
    public final EObject entryRuleEObjectElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEObjectElement = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2243:2: (iv_ruleEObjectElement= ruleEObjectElement EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2244:2: iv_ruleEObjectElement= ruleEObjectElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEObjectElementRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleEObjectElement_in_entryRuleEObjectElement4370);
            iv_ruleEObjectElement=ruleEObjectElement();
            _fsp--;

             current =iv_ruleEObjectElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEObjectElement4380); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEObjectElement


    // $ANTLR start ruleEObjectElement
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2251:1: ruleEObjectElement returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEObjectElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2256:6: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2257:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2257:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2258:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2258:1: (lv_name_0_0= RULE_ID )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2259:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEObjectElement4421); 

            			createLeafNode(grammarAccess.getEObjectElementAccess().getNameIDTerminalRuleCall_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEObjectElementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEObjectElement


    // $ANTLR start entryRuleTypeBug305577_1
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2289:1: entryRuleTypeBug305577_1 returns [EObject current=null] : iv_ruleTypeBug305577_1= ruleTypeBug305577_1 EOF ;
    public final EObject entryRuleTypeBug305577_1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeBug305577_1 = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2290:2: (iv_ruleTypeBug305577_1= ruleTypeBug305577_1 EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2291:2: iv_ruleTypeBug305577_1= ruleTypeBug305577_1 EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeBug305577_1Rule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleTypeBug305577_1_in_entryRuleTypeBug305577_14461);
            iv_ruleTypeBug305577_1=ruleTypeBug305577_1();
            _fsp--;

             current =iv_ruleTypeBug305577_1; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeBug305577_14471); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTypeBug305577_1


    // $ANTLR start ruleTypeBug305577_1
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2298:1: ruleTypeBug305577_1 returns [EObject current=null] : ( '#17' (this_TypeBug1A_1= ruleTypeBug1A | this_TypeBug1B_2= ruleTypeBug1B ) ) ;
    public final EObject ruleTypeBug305577_1() throws RecognitionException {
        EObject current = null;

        EObject this_TypeBug1A_1 = null;

        EObject this_TypeBug1B_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2303:6: ( ( '#17' (this_TypeBug1A_1= ruleTypeBug1A | this_TypeBug1B_2= ruleTypeBug1B ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2304:1: ( '#17' (this_TypeBug1A_1= ruleTypeBug1A | this_TypeBug1B_2= ruleTypeBug1B ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2304:1: ( '#17' (this_TypeBug1A_1= ruleTypeBug1A | this_TypeBug1B_2= ruleTypeBug1B ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2304:3: '#17' (this_TypeBug1A_1= ruleTypeBug1A | this_TypeBug1B_2= ruleTypeBug1B )
            {
            match(input,60,FollowSets000.FOLLOW_60_in_ruleTypeBug305577_14506); 

                    createLeafNode(grammarAccess.getTypeBug305577_1Access().getNumberSignDigitOneDigitSevenKeyword_0(), null); 
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2308:1: (this_TypeBug1A_1= ruleTypeBug1A | this_TypeBug1B_2= ruleTypeBug1B )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==62) ) {
                alt31=1;
            }
            else if ( (LA31_0==63) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2308:1: (this_TypeBug1A_1= ruleTypeBug1A | this_TypeBug1B_2= ruleTypeBug1B )", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2309:5: this_TypeBug1A_1= ruleTypeBug1A
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeBug305577_1Access().getTypeBug1AParserRuleCall_1_0(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTypeBug1A_in_ruleTypeBug305577_14529);
                    this_TypeBug1A_1=ruleTypeBug1A();
                    _fsp--;

                     
                            current = this_TypeBug1A_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2319:5: this_TypeBug1B_2= ruleTypeBug1B
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeBug305577_1Access().getTypeBug1BParserRuleCall_1_1(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTypeBug1B_in_ruleTypeBug305577_14556);
                    this_TypeBug1B_2=ruleTypeBug1B();
                    _fsp--;

                     
                            current = this_TypeBug1B_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTypeBug305577_1


    // $ANTLR start entryRuleTypeBug305577_2
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2335:1: entryRuleTypeBug305577_2 returns [EObject current=null] : iv_ruleTypeBug305577_2= ruleTypeBug305577_2 EOF ;
    public final EObject entryRuleTypeBug305577_2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeBug305577_2 = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2336:2: (iv_ruleTypeBug305577_2= ruleTypeBug305577_2 EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2337:2: iv_ruleTypeBug305577_2= ruleTypeBug305577_2 EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeBug305577_2Rule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleTypeBug305577_2_in_entryRuleTypeBug305577_24592);
            iv_ruleTypeBug305577_2=ruleTypeBug305577_2();
            _fsp--;

             current =iv_ruleTypeBug305577_2; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeBug305577_24602); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTypeBug305577_2


    // $ANTLR start ruleTypeBug305577_2
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2344:1: ruleTypeBug305577_2 returns [EObject current=null] : ( '#18' (this_TypeBug2B_1= ruleTypeBug2B | this_TypeBug2A_2= ruleTypeBug2A ) ) ;
    public final EObject ruleTypeBug305577_2() throws RecognitionException {
        EObject current = null;

        EObject this_TypeBug2B_1 = null;

        EObject this_TypeBug2A_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2349:6: ( ( '#18' (this_TypeBug2B_1= ruleTypeBug2B | this_TypeBug2A_2= ruleTypeBug2A ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2350:1: ( '#18' (this_TypeBug2B_1= ruleTypeBug2B | this_TypeBug2A_2= ruleTypeBug2A ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2350:1: ( '#18' (this_TypeBug2B_1= ruleTypeBug2B | this_TypeBug2A_2= ruleTypeBug2A ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2350:3: '#18' (this_TypeBug2B_1= ruleTypeBug2B | this_TypeBug2A_2= ruleTypeBug2A )
            {
            match(input,61,FollowSets000.FOLLOW_61_in_ruleTypeBug305577_24637); 

                    createLeafNode(grammarAccess.getTypeBug305577_2Access().getNumberSignDigitOneDigitEightKeyword_0(), null); 
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2354:1: (this_TypeBug2B_1= ruleTypeBug2B | this_TypeBug2A_2= ruleTypeBug2A )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==63) ) {
                alt32=1;
            }
            else if ( (LA32_0==62) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2354:1: (this_TypeBug2B_1= ruleTypeBug2B | this_TypeBug2A_2= ruleTypeBug2A )", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2355:5: this_TypeBug2B_1= ruleTypeBug2B
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeBug305577_2Access().getTypeBug2BParserRuleCall_1_0(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTypeBug2B_in_ruleTypeBug305577_24660);
                    this_TypeBug2B_1=ruleTypeBug2B();
                    _fsp--;

                     
                            current = this_TypeBug2B_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2365:5: this_TypeBug2A_2= ruleTypeBug2A
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeBug305577_2Access().getTypeBug2AParserRuleCall_1_1(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTypeBug2A_in_ruleTypeBug305577_24687);
                    this_TypeBug2A_2=ruleTypeBug2A();
                    _fsp--;

                     
                            current = this_TypeBug2A_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTypeBug305577_2


    // $ANTLR start entryRuleTypeBug1A
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2383:1: entryRuleTypeBug1A returns [EObject current=null] : iv_ruleTypeBug1A= ruleTypeBug1A EOF ;
    public final EObject entryRuleTypeBug1A() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeBug1A = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2384:2: (iv_ruleTypeBug1A= ruleTypeBug1A EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2385:2: iv_ruleTypeBug1A= ruleTypeBug1A EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeBug1ARule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleTypeBug1A_in_entryRuleTypeBug1A4725);
            iv_ruleTypeBug1A=ruleTypeBug1A();
            _fsp--;

             current =iv_ruleTypeBug1A; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeBug1A4735); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTypeBug1A


    // $ANTLR start ruleTypeBug1A
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2392:1: ruleTypeBug1A returns [EObject current=null] : ( () 'ka' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleTypeBug1A() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2397:6: ( ( () 'ka' ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2398:1: ( () 'ka' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2398:1: ( () 'ka' ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2398:2: () 'ka' ( (lv_name_2_0= RULE_ID ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2398:2: ()
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2399:5: 
            {
             
                    temp=factory.create(grammarAccess.getTypeBug1AAccess().getTypeBug1AAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getTypeBug1AAccess().getTypeBug1AAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,62,FollowSets000.FOLLOW_62_in_ruleTypeBug1A4779); 

                    createLeafNode(grammarAccess.getTypeBug1AAccess().getKaKeyword_1(), null); 
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2413:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2414:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2414:1: (lv_name_2_0= RULE_ID )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2415:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTypeBug1A4796); 

            			createLeafNode(grammarAccess.getTypeBug1AAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTypeBug1ARule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_2_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTypeBug1A


    // $ANTLR start entryRuleTypeBug1B
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2445:1: entryRuleTypeBug1B returns [EObject current=null] : iv_ruleTypeBug1B= ruleTypeBug1B EOF ;
    public final EObject entryRuleTypeBug1B() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeBug1B = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2446:2: (iv_ruleTypeBug1B= ruleTypeBug1B EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2447:2: iv_ruleTypeBug1B= ruleTypeBug1B EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeBug1BRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleTypeBug1B_in_entryRuleTypeBug1B4837);
            iv_ruleTypeBug1B=ruleTypeBug1B();
            _fsp--;

             current =iv_ruleTypeBug1B; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeBug1B4847); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTypeBug1B


    // $ANTLR start ruleTypeBug1B
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2454:1: ruleTypeBug1B returns [EObject current=null] : ( () 'kb' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleTypeBug1B() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2459:6: ( ( () 'kb' ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2460:1: ( () 'kb' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2460:1: ( () 'kb' ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2460:2: () 'kb' ( (lv_name_2_0= RULE_ID ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2460:2: ()
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2461:5: 
            {
             
                    temp=factory.create(grammarAccess.getTypeBug1BAccess().getTypeBug1BAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getTypeBug1BAccess().getTypeBug1BAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,63,FollowSets000.FOLLOW_63_in_ruleTypeBug1B4891); 

                    createLeafNode(grammarAccess.getTypeBug1BAccess().getKbKeyword_1(), null); 
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2475:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2476:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2476:1: (lv_name_2_0= RULE_ID )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2477:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTypeBug1B4908); 

            			createLeafNode(grammarAccess.getTypeBug1BAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTypeBug1BRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_2_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTypeBug1B


    // $ANTLR start entryRuleTypeBug2A
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2509:1: entryRuleTypeBug2A returns [EObject current=null] : iv_ruleTypeBug2A= ruleTypeBug2A EOF ;
    public final EObject entryRuleTypeBug2A() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeBug2A = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2510:2: (iv_ruleTypeBug2A= ruleTypeBug2A EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2511:2: iv_ruleTypeBug2A= ruleTypeBug2A EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeBug2ARule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleTypeBug2A_in_entryRuleTypeBug2A4951);
            iv_ruleTypeBug2A=ruleTypeBug2A();
            _fsp--;

             current =iv_ruleTypeBug2A; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeBug2A4961); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTypeBug2A


    // $ANTLR start ruleTypeBug2A
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2518:1: ruleTypeBug2A returns [EObject current=null] : ( () 'ka' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleTypeBug2A() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2523:6: ( ( () 'ka' ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2524:1: ( () 'ka' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2524:1: ( () 'ka' ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2524:2: () 'ka' ( (lv_name_2_0= RULE_ID ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2524:2: ()
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2525:5: 
            {
             
                    temp=factory.create(grammarAccess.getTypeBug2AAccess().getTypeBug2AAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getTypeBug2AAccess().getTypeBug2AAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,62,FollowSets000.FOLLOW_62_in_ruleTypeBug2A5005); 

                    createLeafNode(grammarAccess.getTypeBug2AAccess().getKaKeyword_1(), null); 
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2539:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2540:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2540:1: (lv_name_2_0= RULE_ID )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2541:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTypeBug2A5022); 

            			createLeafNode(grammarAccess.getTypeBug2AAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTypeBug2ARule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_2_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTypeBug2A


    // $ANTLR start entryRuleTypeBug2B
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2571:1: entryRuleTypeBug2B returns [EObject current=null] : iv_ruleTypeBug2B= ruleTypeBug2B EOF ;
    public final EObject entryRuleTypeBug2B() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeBug2B = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2572:2: (iv_ruleTypeBug2B= ruleTypeBug2B EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2573:2: iv_ruleTypeBug2B= ruleTypeBug2B EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeBug2BRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleTypeBug2B_in_entryRuleTypeBug2B5063);
            iv_ruleTypeBug2B=ruleTypeBug2B();
            _fsp--;

             current =iv_ruleTypeBug2B; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeBug2B5073); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTypeBug2B


    // $ANTLR start ruleTypeBug2B
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2580:1: ruleTypeBug2B returns [EObject current=null] : ( () 'kb' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleTypeBug2B() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2585:6: ( ( () 'kb' ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2586:1: ( () 'kb' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2586:1: ( () 'kb' ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2586:2: () 'kb' ( (lv_name_2_0= RULE_ID ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2586:2: ()
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2587:5: 
            {
             
                    temp=factory.create(grammarAccess.getTypeBug2BAccess().getTypeBug2BAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getTypeBug2BAccess().getTypeBug2BAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,63,FollowSets000.FOLLOW_63_in_ruleTypeBug2B5117); 

                    createLeafNode(grammarAccess.getTypeBug2BAccess().getKbKeyword_1(), null); 
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2601:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2602:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2602:1: (lv_name_2_0= RULE_ID )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2603:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTypeBug2B5134); 

            			createLeafNode(grammarAccess.getTypeBug2BAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTypeBug2BRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_2_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTypeBug2B


    // $ANTLR start entryRuleBug305171
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2633:1: entryRuleBug305171 returns [EObject current=null] : iv_ruleBug305171= ruleBug305171 EOF ;
    public final EObject entryRuleBug305171() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBug305171 = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2634:2: (iv_ruleBug305171= ruleBug305171 EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2635:2: iv_ruleBug305171= ruleBug305171 EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBug305171Rule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleBug305171_in_entryRuleBug3051715175);
            iv_ruleBug305171=ruleBug305171();
            _fsp--;

             current =iv_ruleBug305171; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBug3051715185); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBug305171


    // $ANTLR start ruleBug305171
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2642:1: ruleBug305171 returns [EObject current=null] : ( '#19' ( ( 'kx' ( (lv_x_2_0= RULE_ID ) ) ( ',' ( (lv_x_4_0= RULE_ID ) ) )* )? ( ( 'ky' ( (lv_y_6_0= RULE_ID ) ) ( ',' ( (lv_y_8_0= RULE_ID ) ) )* )? ( 'kz' ( (lv_z_10_0= RULE_ID ) ) ( ',' ( (lv_z_12_0= RULE_ID ) ) )* )? ) ) ( (lv_name_13_0= RULE_ID ) ) ) ;
    public final EObject ruleBug305171() throws RecognitionException {
        EObject current = null;

        Token lv_x_2_0=null;
        Token lv_x_4_0=null;
        Token lv_y_6_0=null;
        Token lv_y_8_0=null;
        Token lv_z_10_0=null;
        Token lv_z_12_0=null;
        Token lv_name_13_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2647:6: ( ( '#19' ( ( 'kx' ( (lv_x_2_0= RULE_ID ) ) ( ',' ( (lv_x_4_0= RULE_ID ) ) )* )? ( ( 'ky' ( (lv_y_6_0= RULE_ID ) ) ( ',' ( (lv_y_8_0= RULE_ID ) ) )* )? ( 'kz' ( (lv_z_10_0= RULE_ID ) ) ( ',' ( (lv_z_12_0= RULE_ID ) ) )* )? ) ) ( (lv_name_13_0= RULE_ID ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2648:1: ( '#19' ( ( 'kx' ( (lv_x_2_0= RULE_ID ) ) ( ',' ( (lv_x_4_0= RULE_ID ) ) )* )? ( ( 'ky' ( (lv_y_6_0= RULE_ID ) ) ( ',' ( (lv_y_8_0= RULE_ID ) ) )* )? ( 'kz' ( (lv_z_10_0= RULE_ID ) ) ( ',' ( (lv_z_12_0= RULE_ID ) ) )* )? ) ) ( (lv_name_13_0= RULE_ID ) ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2648:1: ( '#19' ( ( 'kx' ( (lv_x_2_0= RULE_ID ) ) ( ',' ( (lv_x_4_0= RULE_ID ) ) )* )? ( ( 'ky' ( (lv_y_6_0= RULE_ID ) ) ( ',' ( (lv_y_8_0= RULE_ID ) ) )* )? ( 'kz' ( (lv_z_10_0= RULE_ID ) ) ( ',' ( (lv_z_12_0= RULE_ID ) ) )* )? ) ) ( (lv_name_13_0= RULE_ID ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2648:3: '#19' ( ( 'kx' ( (lv_x_2_0= RULE_ID ) ) ( ',' ( (lv_x_4_0= RULE_ID ) ) )* )? ( ( 'ky' ( (lv_y_6_0= RULE_ID ) ) ( ',' ( (lv_y_8_0= RULE_ID ) ) )* )? ( 'kz' ( (lv_z_10_0= RULE_ID ) ) ( ',' ( (lv_z_12_0= RULE_ID ) ) )* )? ) ) ( (lv_name_13_0= RULE_ID ) )
            {
            match(input,64,FollowSets000.FOLLOW_64_in_ruleBug3051715220); 

                    createLeafNode(grammarAccess.getBug305171Access().getNumberSignDigitOneDigitNineKeyword_0(), null); 
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2652:1: ( ( 'kx' ( (lv_x_2_0= RULE_ID ) ) ( ',' ( (lv_x_4_0= RULE_ID ) ) )* )? ( ( 'ky' ( (lv_y_6_0= RULE_ID ) ) ( ',' ( (lv_y_8_0= RULE_ID ) ) )* )? ( 'kz' ( (lv_z_10_0= RULE_ID ) ) ( ',' ( (lv_z_12_0= RULE_ID ) ) )* )? ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2652:2: ( 'kx' ( (lv_x_2_0= RULE_ID ) ) ( ',' ( (lv_x_4_0= RULE_ID ) ) )* )? ( ( 'ky' ( (lv_y_6_0= RULE_ID ) ) ( ',' ( (lv_y_8_0= RULE_ID ) ) )* )? ( 'kz' ( (lv_z_10_0= RULE_ID ) ) ( ',' ( (lv_z_12_0= RULE_ID ) ) )* )? )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2652:2: ( 'kx' ( (lv_x_2_0= RULE_ID ) ) ( ',' ( (lv_x_4_0= RULE_ID ) ) )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==65) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2652:4: 'kx' ( (lv_x_2_0= RULE_ID ) ) ( ',' ( (lv_x_4_0= RULE_ID ) ) )*
                    {
                    match(input,65,FollowSets000.FOLLOW_65_in_ruleBug3051715232); 

                            createLeafNode(grammarAccess.getBug305171Access().getKxKeyword_1_0_0(), null); 
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2656:1: ( (lv_x_2_0= RULE_ID ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2657:1: (lv_x_2_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2657:1: (lv_x_2_0= RULE_ID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2658:3: lv_x_2_0= RULE_ID
                    {
                    lv_x_2_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleBug3051715249); 

                    			createLeafNode(grammarAccess.getBug305171Access().getXIDTerminalRuleCall_1_0_1_0(), "x"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBug305171Rule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"x",
                    	        		lv_x_2_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2680:2: ( ',' ( (lv_x_4_0= RULE_ID ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==30) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2680:4: ',' ( (lv_x_4_0= RULE_ID ) )
                    	    {
                    	    match(input,30,FollowSets000.FOLLOW_30_in_ruleBug3051715265); 

                    	            createLeafNode(grammarAccess.getBug305171Access().getCommaKeyword_1_0_2_0(), null); 
                    	        
                    	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2684:1: ( (lv_x_4_0= RULE_ID ) )
                    	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2685:1: (lv_x_4_0= RULE_ID )
                    	    {
                    	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2685:1: (lv_x_4_0= RULE_ID )
                    	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2686:3: lv_x_4_0= RULE_ID
                    	    {
                    	    lv_x_4_0=(Token)input.LT(1);
                    	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleBug3051715282); 

                    	    			createLeafNode(grammarAccess.getBug305171Access().getXIDTerminalRuleCall_1_0_2_1_0(), "x"); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getBug305171Rule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"x",
                    	    	        		lv_x_4_0, 
                    	    	        		"ID", 
                    	    	        		lastConsumedNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2708:6: ( ( 'ky' ( (lv_y_6_0= RULE_ID ) ) ( ',' ( (lv_y_8_0= RULE_ID ) ) )* )? ( 'kz' ( (lv_z_10_0= RULE_ID ) ) ( ',' ( (lv_z_12_0= RULE_ID ) ) )* )? )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2708:7: ( 'ky' ( (lv_y_6_0= RULE_ID ) ) ( ',' ( (lv_y_8_0= RULE_ID ) ) )* )? ( 'kz' ( (lv_z_10_0= RULE_ID ) ) ( ',' ( (lv_z_12_0= RULE_ID ) ) )* )?
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2708:7: ( 'ky' ( (lv_y_6_0= RULE_ID ) ) ( ',' ( (lv_y_8_0= RULE_ID ) ) )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==66) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2708:9: 'ky' ( (lv_y_6_0= RULE_ID ) ) ( ',' ( (lv_y_8_0= RULE_ID ) ) )*
                    {
                    match(input,66,FollowSets000.FOLLOW_66_in_ruleBug3051715303); 

                            createLeafNode(grammarAccess.getBug305171Access().getKyKeyword_1_1_0_0(), null); 
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2712:1: ( (lv_y_6_0= RULE_ID ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2713:1: (lv_y_6_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2713:1: (lv_y_6_0= RULE_ID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2714:3: lv_y_6_0= RULE_ID
                    {
                    lv_y_6_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleBug3051715320); 

                    			createLeafNode(grammarAccess.getBug305171Access().getYIDTerminalRuleCall_1_1_0_1_0(), "y"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBug305171Rule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"y",
                    	        		lv_y_6_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2736:2: ( ',' ( (lv_y_8_0= RULE_ID ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==30) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2736:4: ',' ( (lv_y_8_0= RULE_ID ) )
                    	    {
                    	    match(input,30,FollowSets000.FOLLOW_30_in_ruleBug3051715336); 

                    	            createLeafNode(grammarAccess.getBug305171Access().getCommaKeyword_1_1_0_2_0(), null); 
                    	        
                    	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2740:1: ( (lv_y_8_0= RULE_ID ) )
                    	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2741:1: (lv_y_8_0= RULE_ID )
                    	    {
                    	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2741:1: (lv_y_8_0= RULE_ID )
                    	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2742:3: lv_y_8_0= RULE_ID
                    	    {
                    	    lv_y_8_0=(Token)input.LT(1);
                    	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleBug3051715353); 

                    	    			createLeafNode(grammarAccess.getBug305171Access().getYIDTerminalRuleCall_1_1_0_2_1_0(), "y"); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getBug305171Rule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"y",
                    	    	        		lv_y_8_0, 
                    	    	        		"ID", 
                    	    	        		lastConsumedNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2764:6: ( 'kz' ( (lv_z_10_0= RULE_ID ) ) ( ',' ( (lv_z_12_0= RULE_ID ) ) )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==67) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2764:8: 'kz' ( (lv_z_10_0= RULE_ID ) ) ( ',' ( (lv_z_12_0= RULE_ID ) ) )*
                    {
                    match(input,67,FollowSets000.FOLLOW_67_in_ruleBug3051715373); 

                            createLeafNode(grammarAccess.getBug305171Access().getKzKeyword_1_1_1_0(), null); 
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2768:1: ( (lv_z_10_0= RULE_ID ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2769:1: (lv_z_10_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2769:1: (lv_z_10_0= RULE_ID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2770:3: lv_z_10_0= RULE_ID
                    {
                    lv_z_10_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleBug3051715390); 

                    			createLeafNode(grammarAccess.getBug305171Access().getZIDTerminalRuleCall_1_1_1_1_0(), "z"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBug305171Rule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"z",
                    	        		lv_z_10_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2792:2: ( ',' ( (lv_z_12_0= RULE_ID ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==30) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2792:4: ',' ( (lv_z_12_0= RULE_ID ) )
                    	    {
                    	    match(input,30,FollowSets000.FOLLOW_30_in_ruleBug3051715406); 

                    	            createLeafNode(grammarAccess.getBug305171Access().getCommaKeyword_1_1_1_2_0(), null); 
                    	        
                    	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2796:1: ( (lv_z_12_0= RULE_ID ) )
                    	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2797:1: (lv_z_12_0= RULE_ID )
                    	    {
                    	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2797:1: (lv_z_12_0= RULE_ID )
                    	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2798:3: lv_z_12_0= RULE_ID
                    	    {
                    	    lv_z_12_0=(Token)input.LT(1);
                    	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleBug3051715423); 

                    	    			createLeafNode(grammarAccess.getBug305171Access().getZIDTerminalRuleCall_1_1_1_2_1_0(), "z"); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getBug305171Rule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"z",
                    	    	        		lv_z_12_0, 
                    	    	        		"ID", 
                    	    	        		lastConsumedNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2820:8: ( (lv_name_13_0= RULE_ID ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2821:1: (lv_name_13_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2821:1: (lv_name_13_0= RULE_ID )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2822:3: lv_name_13_0= RULE_ID
            {
            lv_name_13_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleBug3051715451); 

            			createLeafNode(grammarAccess.getBug305171Access().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBug305171Rule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_13_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBug305171


    // $ANTLR start entryRuleBug310435Enum
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2852:1: entryRuleBug310435Enum returns [EObject current=null] : iv_ruleBug310435Enum= ruleBug310435Enum EOF ;
    public final EObject entryRuleBug310435Enum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBug310435Enum = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2853:2: (iv_ruleBug310435Enum= ruleBug310435Enum EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2854:2: iv_ruleBug310435Enum= ruleBug310435Enum EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBug310435EnumRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleBug310435Enum_in_entryRuleBug310435Enum5492);
            iv_ruleBug310435Enum=ruleBug310435Enum();
            _fsp--;

             current =iv_ruleBug310435Enum; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBug310435Enum5502); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBug310435Enum


    // $ANTLR start ruleBug310435Enum
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2861:1: ruleBug310435Enum returns [EObject current=null] : ( '#20' ( ( 'kw1' ( (lv_lits_2_0= ruleEnumBug310435Lit1 ) ) ) | ( 'kw2' ( (lv_lits_4_0= ruleEnumBug310435Lit2 ) ) ) )* ) ;
    public final EObject ruleBug310435Enum() throws RecognitionException {
        EObject current = null;

        Enumerator lv_lits_2_0 = null;

        Enumerator lv_lits_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2866:6: ( ( '#20' ( ( 'kw1' ( (lv_lits_2_0= ruleEnumBug310435Lit1 ) ) ) | ( 'kw2' ( (lv_lits_4_0= ruleEnumBug310435Lit2 ) ) ) )* ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2867:1: ( '#20' ( ( 'kw1' ( (lv_lits_2_0= ruleEnumBug310435Lit1 ) ) ) | ( 'kw2' ( (lv_lits_4_0= ruleEnumBug310435Lit2 ) ) ) )* )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2867:1: ( '#20' ( ( 'kw1' ( (lv_lits_2_0= ruleEnumBug310435Lit1 ) ) ) | ( 'kw2' ( (lv_lits_4_0= ruleEnumBug310435Lit2 ) ) ) )* )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2867:3: '#20' ( ( 'kw1' ( (lv_lits_2_0= ruleEnumBug310435Lit1 ) ) ) | ( 'kw2' ( (lv_lits_4_0= ruleEnumBug310435Lit2 ) ) ) )*
            {
            match(input,68,FollowSets000.FOLLOW_68_in_ruleBug310435Enum5537); 

                    createLeafNode(grammarAccess.getBug310435EnumAccess().getNumberSignDigitTwoDigitZeroKeyword_0(), null); 
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2871:1: ( ( 'kw1' ( (lv_lits_2_0= ruleEnumBug310435Lit1 ) ) ) | ( 'kw2' ( (lv_lits_4_0= ruleEnumBug310435Lit2 ) ) ) )*
            loop39:
            do {
                int alt39=3;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==37) ) {
                    int LA39_2 = input.LA(2);

                    if ( (LA39_2==71) ) {
                        alt39=1;
                    }


                }
                else if ( (LA39_0==38) ) {
                    int LA39_3 = input.LA(2);

                    if ( (LA39_3==72) ) {
                        alt39=2;
                    }


                }


                switch (alt39) {
            	case 1 :
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2871:2: ( 'kw1' ( (lv_lits_2_0= ruleEnumBug310435Lit1 ) ) )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2871:2: ( 'kw1' ( (lv_lits_2_0= ruleEnumBug310435Lit1 ) ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2871:4: 'kw1' ( (lv_lits_2_0= ruleEnumBug310435Lit1 ) )
            	    {
            	    match(input,37,FollowSets000.FOLLOW_37_in_ruleBug310435Enum5549); 

            	            createLeafNode(grammarAccess.getBug310435EnumAccess().getKw1Keyword_1_0_0(), null); 
            	        
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2875:1: ( (lv_lits_2_0= ruleEnumBug310435Lit1 ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2876:1: (lv_lits_2_0= ruleEnumBug310435Lit1 )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2876:1: (lv_lits_2_0= ruleEnumBug310435Lit1 )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2877:3: lv_lits_2_0= ruleEnumBug310435Lit1
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBug310435EnumAccess().getLitsEnumBug310435Lit1EnumRuleCall_1_0_1_0(), currentNode); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEnumBug310435Lit1_in_ruleBug310435Enum5570);
            	    lv_lits_2_0=ruleEnumBug310435Lit1();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getBug310435EnumRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"lits",
            	    	        		lv_lits_2_0, 
            	    	        		"EnumBug310435Lit1", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2900:6: ( 'kw2' ( (lv_lits_4_0= ruleEnumBug310435Lit2 ) ) )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2900:6: ( 'kw2' ( (lv_lits_4_0= ruleEnumBug310435Lit2 ) ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2900:8: 'kw2' ( (lv_lits_4_0= ruleEnumBug310435Lit2 ) )
            	    {
            	    match(input,38,FollowSets000.FOLLOW_38_in_ruleBug310435Enum5588); 

            	            createLeafNode(grammarAccess.getBug310435EnumAccess().getKw2Keyword_1_1_0(), null); 
            	        
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2904:1: ( (lv_lits_4_0= ruleEnumBug310435Lit2 ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2905:1: (lv_lits_4_0= ruleEnumBug310435Lit2 )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2905:1: (lv_lits_4_0= ruleEnumBug310435Lit2 )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2906:3: lv_lits_4_0= ruleEnumBug310435Lit2
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBug310435EnumAccess().getLitsEnumBug310435Lit2EnumRuleCall_1_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEnumBug310435Lit2_in_ruleBug310435Enum5609);
            	    lv_lits_4_0=ruleEnumBug310435Lit2();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getBug310435EnumRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"lits",
            	    	        		lv_lits_4_0, 
            	    	        		"EnumBug310435Lit2", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBug310435Enum


    // $ANTLR start entryRuleBug310435Val
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2936:1: entryRuleBug310435Val returns [EObject current=null] : iv_ruleBug310435Val= ruleBug310435Val EOF ;
    public final EObject entryRuleBug310435Val() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBug310435Val = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2937:2: (iv_ruleBug310435Val= ruleBug310435Val EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2938:2: iv_ruleBug310435Val= ruleBug310435Val EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBug310435ValRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleBug310435Val_in_entryRuleBug310435Val5648);
            iv_ruleBug310435Val=ruleBug310435Val();
            _fsp--;

             current =iv_ruleBug310435Val; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBug310435Val5658); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBug310435Val


    // $ANTLR start ruleBug310435Val
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2945:1: ruleBug310435Val returns [EObject current=null] : ( '#21' ( ( 'kw1' ( (lv_lits_2_0= RULE_ID ) ) ) | ( 'kw2' ( (lv_lits_4_0= RULE_STRING ) ) ) )* ) ;
    public final EObject ruleBug310435Val() throws RecognitionException {
        EObject current = null;

        Token lv_lits_2_0=null;
        Token lv_lits_4_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2950:6: ( ( '#21' ( ( 'kw1' ( (lv_lits_2_0= RULE_ID ) ) ) | ( 'kw2' ( (lv_lits_4_0= RULE_STRING ) ) ) )* ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2951:1: ( '#21' ( ( 'kw1' ( (lv_lits_2_0= RULE_ID ) ) ) | ( 'kw2' ( (lv_lits_4_0= RULE_STRING ) ) ) )* )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2951:1: ( '#21' ( ( 'kw1' ( (lv_lits_2_0= RULE_ID ) ) ) | ( 'kw2' ( (lv_lits_4_0= RULE_STRING ) ) ) )* )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2951:3: '#21' ( ( 'kw1' ( (lv_lits_2_0= RULE_ID ) ) ) | ( 'kw2' ( (lv_lits_4_0= RULE_STRING ) ) ) )*
            {
            match(input,69,FollowSets000.FOLLOW_69_in_ruleBug310435Val5693); 

                    createLeafNode(grammarAccess.getBug310435ValAccess().getNumberSignDigitTwoDigitOneKeyword_0(), null); 
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2955:1: ( ( 'kw1' ( (lv_lits_2_0= RULE_ID ) ) ) | ( 'kw2' ( (lv_lits_4_0= RULE_STRING ) ) ) )*
            loop40:
            do {
                int alt40=3;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==37) ) {
                    int LA40_2 = input.LA(2);

                    if ( (LA40_2==RULE_ID) ) {
                        alt40=1;
                    }


                }
                else if ( (LA40_0==38) ) {
                    int LA40_3 = input.LA(2);

                    if ( (LA40_3==RULE_STRING) ) {
                        alt40=2;
                    }


                }


                switch (alt40) {
            	case 1 :
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2955:2: ( 'kw1' ( (lv_lits_2_0= RULE_ID ) ) )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2955:2: ( 'kw1' ( (lv_lits_2_0= RULE_ID ) ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2955:4: 'kw1' ( (lv_lits_2_0= RULE_ID ) )
            	    {
            	    match(input,37,FollowSets000.FOLLOW_37_in_ruleBug310435Val5705); 

            	            createLeafNode(grammarAccess.getBug310435ValAccess().getKw1Keyword_1_0_0(), null); 
            	        
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2959:1: ( (lv_lits_2_0= RULE_ID ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2960:1: (lv_lits_2_0= RULE_ID )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2960:1: (lv_lits_2_0= RULE_ID )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2961:3: lv_lits_2_0= RULE_ID
            	    {
            	    lv_lits_2_0=(Token)input.LT(1);
            	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleBug310435Val5722); 

            	    			createLeafNode(grammarAccess.getBug310435ValAccess().getLitsIDTerminalRuleCall_1_0_1_0(), "lits"); 
            	    		

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getBug310435ValRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"lits",
            	    	        		lv_lits_2_0, 
            	    	        		"ID", 
            	    	        		lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2984:6: ( 'kw2' ( (lv_lits_4_0= RULE_STRING ) ) )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2984:6: ( 'kw2' ( (lv_lits_4_0= RULE_STRING ) ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2984:8: 'kw2' ( (lv_lits_4_0= RULE_STRING ) )
            	    {
            	    match(input,38,FollowSets000.FOLLOW_38_in_ruleBug310435Val5745); 

            	            createLeafNode(grammarAccess.getBug310435ValAccess().getKw2Keyword_1_1_0(), null); 
            	        
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2988:1: ( (lv_lits_4_0= RULE_STRING ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2989:1: (lv_lits_4_0= RULE_STRING )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2989:1: (lv_lits_4_0= RULE_STRING )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:2990:3: lv_lits_4_0= RULE_STRING
            	    {
            	    lv_lits_4_0=(Token)input.LT(1);
            	    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleBug310435Val5762); 

            	    			createLeafNode(grammarAccess.getBug310435ValAccess().getLitsSTRINGTerminalRuleCall_1_1_1_0(), "lits"); 
            	    		

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getBug310435ValRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"lits",
            	    	        		lv_lits_4_0, 
            	    	        		"STRING", 
            	    	        		lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBug310435Val


    // $ANTLR start entryRuleCrossRefNameTest
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:3020:1: entryRuleCrossRefNameTest returns [EObject current=null] : iv_ruleCrossRefNameTest= ruleCrossRefNameTest EOF ;
    public final EObject entryRuleCrossRefNameTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCrossRefNameTest = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:3021:2: (iv_ruleCrossRefNameTest= ruleCrossRefNameTest EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:3022:2: iv_ruleCrossRefNameTest= ruleCrossRefNameTest EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCrossRefNameTestRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleCrossRefNameTest_in_entryRuleCrossRefNameTest5806);
            iv_ruleCrossRefNameTest=ruleCrossRefNameTest();
            _fsp--;

             current =iv_ruleCrossRefNameTest; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCrossRefNameTest5816); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCrossRefNameTest


    // $ANTLR start ruleCrossRefNameTest
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:3029:1: ruleCrossRefNameTest returns [EObject current=null] : ( '#22' ( (lv_named_1_0= ruleCrossRefNamed ) )* 'kw1' ( ( 'kw2' ( ( RULE_ID1 ) ) ) | ( 'kw3' ( ( RULE_ID2 ) ) ) )* ) ;
    public final EObject ruleCrossRefNameTest() throws RecognitionException {
        EObject current = null;

        EObject lv_named_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:3034:6: ( ( '#22' ( (lv_named_1_0= ruleCrossRefNamed ) )* 'kw1' ( ( 'kw2' ( ( RULE_ID1 ) ) ) | ( 'kw3' ( ( RULE_ID2 ) ) ) )* ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:3035:1: ( '#22' ( (lv_named_1_0= ruleCrossRefNamed ) )* 'kw1' ( ( 'kw2' ( ( RULE_ID1 ) ) ) | ( 'kw3' ( ( RULE_ID2 ) ) ) )* )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:3035:1: ( '#22' ( (lv_named_1_0= ruleCrossRefNamed ) )* 'kw1' ( ( 'kw2' ( ( RULE_ID1 ) ) ) | ( 'kw3' ( ( RULE_ID2 ) ) ) )* )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:3035:3: '#22' ( (lv_named_1_0= ruleCrossRefNamed ) )* 'kw1' ( ( 'kw2' ( ( RULE_ID1 ) ) ) | ( 'kw3' ( ( RULE_ID2 ) ) ) )*
            {
            match(input,70,FollowSets000.FOLLOW_70_in_ruleCrossRefNameTest5851); 

                    createLeafNode(grammarAccess.getCrossRefNameTestAccess().getNumberSignDigitTwoDigitTwoKeyword_0(), null); 
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:3039:1: ( (lv_named_1_0= ruleCrossRefNamed ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=RULE_ID1 && LA41_0<=RULE_ID2)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:3040:1: (lv_named_1_0= ruleCrossRefNamed )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:3040:1: (lv_named_1_0= ruleCrossRefNamed )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:3041:3: lv_named_1_0= ruleCrossRefNamed
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getCrossRefNameTestAccess().getNamedCrossRefNamedParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleCrossRefNamed_in_ruleCrossRefNameTest5872);
            	    lv_named_1_0=ruleCrossRefNamed();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getCrossRefNameTestRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"named",
            	    	        		lv_named_1_0, 
            	    	        		"CrossRefNamed", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            match(input,37,FollowSets000.FOLLOW_37_in_ruleCrossRefNameTest5883); 

                    createLeafNode(grammarAccess.getCrossRefNameTestAccess().getKw1Keyword_2(), null); 
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:3067:1: ( ( 'kw2' ( ( RULE_ID1 ) ) ) | ( 'kw3' ( ( RULE_ID2 ) ) ) )*
            loop42:
            do {
                int alt42=3;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==38) ) {
                    int LA42_2 = input.LA(2);

                    if ( (LA42_2==RULE_ID1) ) {
                        alt42=1;
                    }


                }
                else if ( (LA42_0==41) ) {
                    int LA42_3 = input.LA(2);

                    if ( (LA42_3==RULE_ID2) ) {
                        alt42=2;
                    }


                }


                switch (alt42) {
            	case 1 :
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:3067:2: ( 'kw2' ( ( RULE_ID1 ) ) )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:3067:2: ( 'kw2' ( ( RULE_ID1 ) ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:3067:4: 'kw2' ( ( RULE_ID1 ) )
            	    {
            	    match(input,38,FollowSets000.FOLLOW_38_in_ruleCrossRefNameTest5895); 

            	            createLeafNode(grammarAccess.getCrossRefNameTestAccess().getKw2Keyword_3_0_0(), null); 
            	        
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:3071:1: ( ( RULE_ID1 ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:3072:1: ( RULE_ID1 )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:3072:1: ( RULE_ID1 )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:3073:3: RULE_ID1
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getCrossRefNameTestRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ID1,FollowSets000.FOLLOW_RULE_ID1_in_ruleCrossRefNameTest5913); 

            	    		createLeafNode(grammarAccess.getCrossRefNameTestAccess().getRefCrossRefNamedCrossReference_3_0_1_0(), "ref"); 
            	    	

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:3086:6: ( 'kw3' ( ( RULE_ID2 ) ) )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:3086:6: ( 'kw3' ( ( RULE_ID2 ) ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:3086:8: 'kw3' ( ( RULE_ID2 ) )
            	    {
            	    match(input,41,FollowSets000.FOLLOW_41_in_ruleCrossRefNameTest5931); 

            	            createLeafNode(grammarAccess.getCrossRefNameTestAccess().getKw3Keyword_3_1_0(), null); 
            	        
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:3090:1: ( ( RULE_ID2 ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:3091:1: ( RULE_ID2 )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:3091:1: ( RULE_ID2 )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:3092:3: RULE_ID2
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getCrossRefNameTestRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ID2,FollowSets000.FOLLOW_RULE_ID2_in_ruleCrossRefNameTest5949); 

            	    		createLeafNode(grammarAccess.getCrossRefNameTestAccess().getRefCrossRefNamedCrossReference_3_1_1_0(), "ref"); 
            	    	

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCrossRefNameTest


    // $ANTLR start entryRuleCrossRefNamed
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:3112:1: entryRuleCrossRefNamed returns [EObject current=null] : iv_ruleCrossRefNamed= ruleCrossRefNamed EOF ;
    public final EObject entryRuleCrossRefNamed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCrossRefNamed = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:3113:2: (iv_ruleCrossRefNamed= ruleCrossRefNamed EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:3114:2: iv_ruleCrossRefNamed= ruleCrossRefNamed EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCrossRefNamedRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleCrossRefNamed_in_entryRuleCrossRefNamed5988);
            iv_ruleCrossRefNamed=ruleCrossRefNamed();
            _fsp--;

             current =iv_ruleCrossRefNamed; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCrossRefNamed5998); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCrossRefNamed


    // $ANTLR start ruleCrossRefNamed
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:3121:1: ruleCrossRefNamed returns [EObject current=null] : ( ( (lv_name_0_1= RULE_ID1 | lv_name_0_2= RULE_ID2 ) ) ) ;
    public final EObject ruleCrossRefNamed() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:3126:6: ( ( ( (lv_name_0_1= RULE_ID1 | lv_name_0_2= RULE_ID2 ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:3127:1: ( ( (lv_name_0_1= RULE_ID1 | lv_name_0_2= RULE_ID2 ) ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:3127:1: ( ( (lv_name_0_1= RULE_ID1 | lv_name_0_2= RULE_ID2 ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:3128:1: ( (lv_name_0_1= RULE_ID1 | lv_name_0_2= RULE_ID2 ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:3128:1: ( (lv_name_0_1= RULE_ID1 | lv_name_0_2= RULE_ID2 ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:3129:1: (lv_name_0_1= RULE_ID1 | lv_name_0_2= RULE_ID2 )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:3129:1: (lv_name_0_1= RULE_ID1 | lv_name_0_2= RULE_ID2 )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID1) ) {
                alt43=1;
            }
            else if ( (LA43_0==RULE_ID2) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("3129:1: (lv_name_0_1= RULE_ID1 | lv_name_0_2= RULE_ID2 )", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:3130:3: lv_name_0_1= RULE_ID1
                    {
                    lv_name_0_1=(Token)input.LT(1);
                    match(input,RULE_ID1,FollowSets000.FOLLOW_RULE_ID1_in_ruleCrossRefNamed6041); 

                    			createLeafNode(grammarAccess.getCrossRefNamedAccess().getNameID1TerminalRuleCall_0_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCrossRefNamedRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_0_1, 
                    	        		"ID1", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:3151:8: lv_name_0_2= RULE_ID2
                    {
                    lv_name_0_2=(Token)input.LT(1);
                    match(input,RULE_ID2,FollowSets000.FOLLOW_RULE_ID2_in_ruleCrossRefNamed6061); 

                    			createLeafNode(grammarAccess.getCrossRefNamedAccess().getNameID2TerminalRuleCall_0_1(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCrossRefNamedRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_0_2, 
                    	        		"ID2", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCrossRefNamed


    // $ANTLR start ruleEnumBug310435Lit1
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:3183:1: ruleEnumBug310435Lit1 returns [Enumerator current=null] : ( 'lit1' ) ;
    public final Enumerator ruleEnumBug310435Lit1() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:3187:6: ( ( 'lit1' ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:3188:1: ( 'lit1' )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:3188:1: ( 'lit1' )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:3188:3: 'lit1'
            {
            match(input,71,FollowSets000.FOLLOW_71_in_ruleEnumBug310435Lit16115); 

                    current = grammarAccess.getEnumBug310435Lit1Access().getLit1EnumLiteralDeclaration().getEnumLiteral().getInstance();
                    createLeafNode(grammarAccess.getEnumBug310435Lit1Access().getLit1EnumLiteralDeclaration(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEnumBug310435Lit1


    // $ANTLR start ruleEnumBug310435Lit2
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:3198:1: ruleEnumBug310435Lit2 returns [Enumerator current=null] : ( 'lit2' ) ;
    public final Enumerator ruleEnumBug310435Lit2() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:3202:6: ( ( 'lit2' ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:3203:1: ( 'lit2' )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:3203:1: ( 'lit2' )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g:3203:3: 'lit2'
            {
            match(input,72,FollowSets000.FOLLOW_72_in_ruleEnumBug310435Lit26156); 

                    current = grammarAccess.getEnumBug310435Lit2Access().getLit2EnumLiteralDeclaration().getEnumLiteral().getInstance();
                    createLeafNode(grammarAccess.getEnumBug310435Lit2Access().getLit2EnumLiteralDeclaration(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEnumBug310435Lit2


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleOp_in_entryRuleOp75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOp85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerm_in_ruleOp132 = new BitSet(new long[]{0x3689437C92962032L,0x0000000000000071L});
        public static final BitSet FOLLOW_ruleTerm_in_ruleOp162 = new BitSet(new long[]{0x3689437C92962032L,0x0000000000000071L});
        public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm200 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTerm210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtom_in_ruleTerm257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTwoNumbers_in_ruleTerm284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleManyStrings_in_ruleTerm311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleType_in_ruleTerm338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRef2_in_ruleTerm365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSpare_in_ruleTerm392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolean_in_ruleTerm419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransient1_in_ruleTerm446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConsumed1_in_ruleTerm473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConsumed2_in_ruleTerm500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLoop1_in_ruleTerm527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLoop2_in_ruleTerm554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLoop3_in_ruleTerm581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLoop4_in_ruleTerm608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLoopBug285452_in_ruleTerm635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDuplicateBug284491_in_ruleTerm662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmptyObjectBug284850_in_ruleTerm689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiInheritanceBug280439_in_ruleTerm716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEObjectRef_in_ruleTerm743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeBug305577_1_in_ruleTerm770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeBug305577_2_in_ruleTerm797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParens_in_ruleTerm824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBug305171_in_ruleTerm851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBug310435Val_in_ruleTerm878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBug310435Enum_in_ruleTerm905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCrossRefNameTest_in_ruleTerm932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtom_in_entryRuleAtom967 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtom977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAtom1018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParens_in_entryRuleParens1058 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParens1068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_ruleParens1103 = new BitSet(new long[]{0x3689437C92962030L,0x0000000000000071L});
        public static final BitSet FOLLOW_ruleOp_in_ruleParens1125 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleParens1134 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_15_in_ruleParens1152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTwoNumbers_in_entryRuleTwoNumbers1202 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTwoNumbers1212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleTwoNumbers1254 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleTwoNumbers1276 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_16_in_ruleTwoNumbers1292 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleTwoNumbers1309 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_ruleManyStrings_in_entryRuleManyStrings1352 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleManyStrings1362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleManyStrings1397 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleManyStrings1414 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleManyStrings1437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleType_in_entryRuleType1478 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleType1488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleType1523 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleType1540 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleType1555 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleType1573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRef2_in_entryRuleRef21609 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRef21619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleRef21654 = new BitSet(new long[]{0x0000000000600040L});
        public static final BitSet FOLLOW_21_in_ruleRef21674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleRef21702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleRef21723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSpare_in_entryRuleSpare1775 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSpare1785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleSpare1820 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSpare1837 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_24_in_ruleSpare1853 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSpare1870 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean1913 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoolean1923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleBoolean1958 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_26_in_ruleBoolean1976 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleBoolean2000 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleBoolean2017 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransient1_in_entryRuleTransient12058 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransient12068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleTransient12103 = new BitSet(new long[]{0x0000000020000020L});
        public static final BitSet FOLLOW_29_in_ruleTransient12122 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleTransient12158 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_30_in_ruleTransient12175 = new BitSet(new long[]{0x0000000020000020L});
        public static final BitSet FOLLOW_29_in_ruleTransient12194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleTransient12230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConsumed1_in_entryRuleConsumed12274 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConsumed12284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleConsumed12319 = new BitSet(new long[]{0x0000000300000000L});
        public static final BitSet FOLLOW_32_in_ruleConsumed12331 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleConsumed12348 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleConsumed12371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleConsumed12394 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleConsumed12411 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleConsumed12434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConsumed2_in_entryRuleConsumed22477 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConsumed22487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleConsumed22522 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_ruleConsumed1_in_ruleConsumed22543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLoop1_in_entryRuleLoop12579 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLoop12589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleLoop12625 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleLoop12637 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleLoop12654 = new BitSet(new long[]{0x0000002000000010L});
        public static final BitSet FOLLOW_37_in_ruleLoop12670 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleLoop12689 = new BitSet(new long[]{0x000000C000000000L});
        public static final BitSet FOLLOW_38_in_ruleLoop12706 = new BitSet(new long[]{0x000000C000000000L});
        public static final BitSet FOLLOW_39_in_ruleLoop12718 = new BitSet(new long[]{0x000000C000000002L});
        public static final BitSet FOLLOW_ruleLoop2_in_entryRuleLoop22756 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLoop22766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleLoop22801 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleLoop22818 = new BitSet(new long[]{0x0000002000000010L});
        public static final BitSet FOLLOW_37_in_ruleLoop22834 = new BitSet(new long[]{0x00001A0000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleLoop22858 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleLoop22873 = new BitSet(new long[]{0x00001A0000000010L});
        public static final BitSet FOLLOW_41_in_ruleLoop22886 = new BitSet(new long[]{0x0000180000000000L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleLoop22910 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleLoop22925 = new BitSet(new long[]{0x0000180000000000L});
        public static final BitSet FOLLOW_43_in_ruleLoop22939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleLoop22955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLoop3_in_entryRuleLoop32992 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLoop33002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleLoop33038 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_38_in_ruleLoop33054 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_41_in_ruleLoop33070 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_45_in_ruleLoop33081 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleLoop33098 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_42_in_ruleLoop33114 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleLoop33131 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleLoop33146 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_ruleLoop4_in_entryRuleLoop43184 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLoop43194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleLoop43229 = new BitSet(new long[]{0x0000026000000000L});
        public static final BitSet FOLLOW_37_in_ruleLoop43240 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_38_in_ruleLoop43256 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_41_in_ruleLoop43273 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleLoop43283 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleLoop43302 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleLoop43318 = new BitSet(new long[]{0x0000180000000002L});
        public static final BitSet FOLLOW_44_in_ruleLoop43329 = new BitSet(new long[]{0x0000880000000002L});
        public static final BitSet FOLLOW_47_in_ruleLoop43340 = new BitSet(new long[]{0x0000080000000002L});
        public static final BitSet FOLLOW_ruleLoopBug285452_in_entryRuleLoopBug2854523382 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLoopBug2854523392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleLoopBug2854523427 = new BitSet(new long[]{0x0006000000000000L});
        public static final BitSet FOLLOW_49_in_ruleLoopBug2854523446 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_50_in_ruleLoopBug2854523475 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleLoopBug2854523493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDuplicateBug284491_in_entryRuleDuplicateBug2844913534 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDuplicateBug2844913544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleDuplicateBug2844913579 = new BitSet(new long[]{0x0070000000000002L});
        public static final BitSet FOLLOW_52_in_ruleDuplicateBug2844913598 = new BitSet(new long[]{0x0070000000000002L});
        public static final BitSet FOLLOW_53_in_ruleDuplicateBug2844913635 = new BitSet(new long[]{0x0070000000000002L});
        public static final BitSet FOLLOW_54_in_ruleDuplicateBug2844913672 = new BitSet(new long[]{0x0070000000000002L});
        public static final BitSet FOLLOW_ruleEmptyObjectBug284850_in_entryRuleEmptyObjectBug2848503723 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEmptyObjectBug2848503733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleEmptyObjectBug2848503768 = new BitSet(new long[]{0x0100000000000002L});
        public static final BitSet FOLLOW_ruleEmptyObjectItems_in_ruleEmptyObjectBug2848503789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmptyObjectItems_in_entryRuleEmptyObjectItems3825 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEmptyObjectItems3835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmptyObjectItem_in_ruleEmptyObjectItems3880 = new BitSet(new long[]{0x0100000000000002L});
        public static final BitSet FOLLOW_ruleEmptyObjectItem_in_entryRuleEmptyObjectItem3916 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEmptyObjectItem3926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleEmptyObjectItem3961 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEmptyObjectItem3978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiInheritanceBug280439_in_entryRuleMultiInheritanceBug2804394019 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiInheritanceBug2804394029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleMultiInheritanceBug2804394064 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleConcreteMulti_in_ruleMultiInheritanceBug2804394085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConcreteMulti_in_entryRuleConcreteMulti4125 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConcreteMulti4135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleConcreteMulti4177 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleConcreteMulti4199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEObjectRef_in_entryRuleEObjectRef4240 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEObjectRef4250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleEObjectRef4285 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEObjectElement_in_ruleEObjectRef4306 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_59_in_ruleEObjectRef4316 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEObjectRef4334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEObjectElement_in_entryRuleEObjectElement4370 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEObjectElement4380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEObjectElement4421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeBug305577_1_in_entryRuleTypeBug305577_14461 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeBug305577_14471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleTypeBug305577_14506 = new BitSet(new long[]{0xC000000000000000L});
        public static final BitSet FOLLOW_ruleTypeBug1A_in_ruleTypeBug305577_14529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeBug1B_in_ruleTypeBug305577_14556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeBug305577_2_in_entryRuleTypeBug305577_24592 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeBug305577_24602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleTypeBug305577_24637 = new BitSet(new long[]{0xC000000000000000L});
        public static final BitSet FOLLOW_ruleTypeBug2B_in_ruleTypeBug305577_24660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeBug2A_in_ruleTypeBug305577_24687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeBug1A_in_entryRuleTypeBug1A4725 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeBug1A4735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleTypeBug1A4779 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTypeBug1A4796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeBug1B_in_entryRuleTypeBug1B4837 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeBug1B4847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleTypeBug1B4891 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTypeBug1B4908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeBug2A_in_entryRuleTypeBug2A4951 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeBug2A4961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleTypeBug2A5005 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTypeBug2A5022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeBug2B_in_entryRuleTypeBug2B5063 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeBug2B5073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleTypeBug2B5117 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTypeBug2B5134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBug305171_in_entryRuleBug3051715175 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBug3051715185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleBug3051715220 = new BitSet(new long[]{0x0000000000000010L,0x000000000000000EL});
        public static final BitSet FOLLOW_65_in_ruleBug3051715232 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleBug3051715249 = new BitSet(new long[]{0x0000000040000010L,0x000000000000000CL});
        public static final BitSet FOLLOW_30_in_ruleBug3051715265 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleBug3051715282 = new BitSet(new long[]{0x0000000040000010L,0x000000000000000CL});
        public static final BitSet FOLLOW_66_in_ruleBug3051715303 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleBug3051715320 = new BitSet(new long[]{0x0000000040000010L,0x0000000000000008L});
        public static final BitSet FOLLOW_30_in_ruleBug3051715336 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleBug3051715353 = new BitSet(new long[]{0x0000000040000010L,0x0000000000000008L});
        public static final BitSet FOLLOW_67_in_ruleBug3051715373 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleBug3051715390 = new BitSet(new long[]{0x0000000040000010L});
        public static final BitSet FOLLOW_30_in_ruleBug3051715406 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleBug3051715423 = new BitSet(new long[]{0x0000000040000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleBug3051715451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBug310435Enum_in_entryRuleBug310435Enum5492 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBug310435Enum5502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_ruleBug310435Enum5537 = new BitSet(new long[]{0x0000006000000002L});
        public static final BitSet FOLLOW_37_in_ruleBug310435Enum5549 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
        public static final BitSet FOLLOW_ruleEnumBug310435Lit1_in_ruleBug310435Enum5570 = new BitSet(new long[]{0x0000006000000002L});
        public static final BitSet FOLLOW_38_in_ruleBug310435Enum5588 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
        public static final BitSet FOLLOW_ruleEnumBug310435Lit2_in_ruleBug310435Enum5609 = new BitSet(new long[]{0x0000006000000002L});
        public static final BitSet FOLLOW_ruleBug310435Val_in_entryRuleBug310435Val5648 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBug310435Val5658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_ruleBug310435Val5693 = new BitSet(new long[]{0x0000006000000002L});
        public static final BitSet FOLLOW_37_in_ruleBug310435Val5705 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleBug310435Val5722 = new BitSet(new long[]{0x0000006000000002L});
        public static final BitSet FOLLOW_38_in_ruleBug310435Val5745 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleBug310435Val5762 = new BitSet(new long[]{0x0000006000000002L});
        public static final BitSet FOLLOW_ruleCrossRefNameTest_in_entryRuleCrossRefNameTest5806 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCrossRefNameTest5816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_ruleCrossRefNameTest5851 = new BitSet(new long[]{0x0000002000000180L});
        public static final BitSet FOLLOW_ruleCrossRefNamed_in_ruleCrossRefNameTest5872 = new BitSet(new long[]{0x0000002000000180L});
        public static final BitSet FOLLOW_37_in_ruleCrossRefNameTest5883 = new BitSet(new long[]{0x0000024000000002L});
        public static final BitSet FOLLOW_38_in_ruleCrossRefNameTest5895 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_RULE_ID1_in_ruleCrossRefNameTest5913 = new BitSet(new long[]{0x0000024000000002L});
        public static final BitSet FOLLOW_41_in_ruleCrossRefNameTest5931 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_RULE_ID2_in_ruleCrossRefNameTest5949 = new BitSet(new long[]{0x0000024000000002L});
        public static final BitSet FOLLOW_ruleCrossRefNamed_in_entryRuleCrossRefNamed5988 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCrossRefNamed5998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID1_in_ruleCrossRefNamed6041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID2_in_ruleCrossRefNamed6061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_71_in_ruleEnumBug310435Lit16115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_72_in_ruleEnumBug310435Lit26156 = new BitSet(new long[]{0x0000000000000002L});
    }


}