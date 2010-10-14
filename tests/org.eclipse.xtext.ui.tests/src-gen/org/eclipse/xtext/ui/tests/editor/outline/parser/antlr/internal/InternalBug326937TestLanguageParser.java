package org.eclipse.xtext.ui.tests.editor.outline.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.ui.tests.editor.outline.services.Bug326937TestLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBug326937TestLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'A'", "'{'", "'}'", "'B'"
    };
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int EOF=-1;
    public static final int RULE_INT=5;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;

        public InternalBug326937TestLanguageParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/parser/antlr/internal/InternalBug326937TestLanguage.g"; }



     	private Bug326937TestLanguageGrammarAccess grammarAccess;
     	
        public InternalBug326937TestLanguageParser(TokenStream input, IAstFactory factory, Bug326937TestLanguageGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/eclipse/xtext/ui/tests/editor/outline/parser/antlr/internal/InternalBug326937TestLanguage.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "A";	
       	}
       	
       	@Override
       	protected Bug326937TestLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleA
    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/parser/antlr/internal/InternalBug326937TestLanguage.g:77:1: entryRuleA returns [EObject current=null] : iv_ruleA= ruleA EOF ;
    public final EObject entryRuleA() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleA = null;


        try {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/parser/antlr/internal/InternalBug326937TestLanguage.g:78:2: (iv_ruleA= ruleA EOF )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/parser/antlr/internal/InternalBug326937TestLanguage.g:79:2: iv_ruleA= ruleA EOF
            {
             currentNode = createCompositeNode(grammarAccess.getARule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleA_in_entryRuleA75);
            iv_ruleA=ruleA();
            _fsp--;

             current =iv_ruleA; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleA85); 

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
    // $ANTLR end entryRuleA


    // $ANTLR start ruleA
    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/parser/antlr/internal/InternalBug326937TestLanguage.g:86:1: ruleA returns [EObject current=null] : ( 'A' ( (lv_name_1_0= RULE_ID ) ) ( '{' ( (lv_contents_3_0= ruleAorB ) )* '}' )? ) ;
    public final EObject ruleA() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_contents_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/parser/antlr/internal/InternalBug326937TestLanguage.g:91:6: ( ( 'A' ( (lv_name_1_0= RULE_ID ) ) ( '{' ( (lv_contents_3_0= ruleAorB ) )* '}' )? ) )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/parser/antlr/internal/InternalBug326937TestLanguage.g:92:1: ( 'A' ( (lv_name_1_0= RULE_ID ) ) ( '{' ( (lv_contents_3_0= ruleAorB ) )* '}' )? )
            {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/parser/antlr/internal/InternalBug326937TestLanguage.g:92:1: ( 'A' ( (lv_name_1_0= RULE_ID ) ) ( '{' ( (lv_contents_3_0= ruleAorB ) )* '}' )? )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/parser/antlr/internal/InternalBug326937TestLanguage.g:92:3: 'A' ( (lv_name_1_0= RULE_ID ) ) ( '{' ( (lv_contents_3_0= ruleAorB ) )* '}' )?
            {
            match(input,11,FollowSets000.FOLLOW_11_in_ruleA120); 

                    createLeafNode(grammarAccess.getAAccess().getAKeyword_0(), null); 
                
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/parser/antlr/internal/InternalBug326937TestLanguage.g:96:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/parser/antlr/internal/InternalBug326937TestLanguage.g:97:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/parser/antlr/internal/InternalBug326937TestLanguage.g:97:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/parser/antlr/internal/InternalBug326937TestLanguage.g:98:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleA137); 

            			createLeafNode(grammarAccess.getAAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getARule().getType().getClassifier());
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

            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/parser/antlr/internal/InternalBug326937TestLanguage.g:120:2: ( '{' ( (lv_contents_3_0= ruleAorB ) )* '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/parser/antlr/internal/InternalBug326937TestLanguage.g:120:4: '{' ( (lv_contents_3_0= ruleAorB ) )* '}'
                    {
                    match(input,12,FollowSets000.FOLLOW_12_in_ruleA153); 

                            createLeafNode(grammarAccess.getAAccess().getLeftCurlyBracketKeyword_2_0(), null); 
                        
                    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/parser/antlr/internal/InternalBug326937TestLanguage.g:124:1: ( (lv_contents_3_0= ruleAorB ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==11||LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/parser/antlr/internal/InternalBug326937TestLanguage.g:125:1: (lv_contents_3_0= ruleAorB )
                    	    {
                    	    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/parser/antlr/internal/InternalBug326937TestLanguage.g:125:1: (lv_contents_3_0= ruleAorB )
                    	    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/parser/antlr/internal/InternalBug326937TestLanguage.g:126:3: lv_contents_3_0= ruleAorB
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getAAccess().getContentsAorBParserRuleCall_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAorB_in_ruleA174);
                    	    lv_contents_3_0=ruleAorB();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getARule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"contents",
                    	    	        		lv_contents_3_0, 
                    	    	        		"AorB", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    match(input,13,FollowSets000.FOLLOW_13_in_ruleA185); 

                            createLeafNode(grammarAccess.getAAccess().getRightCurlyBracketKeyword_2_2(), null); 
                        

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
    // $ANTLR end ruleA


    // $ANTLR start entryRuleAorB
    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/parser/antlr/internal/InternalBug326937TestLanguage.g:160:1: entryRuleAorB returns [EObject current=null] : iv_ruleAorB= ruleAorB EOF ;
    public final EObject entryRuleAorB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAorB = null;


        try {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/parser/antlr/internal/InternalBug326937TestLanguage.g:161:2: (iv_ruleAorB= ruleAorB EOF )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/parser/antlr/internal/InternalBug326937TestLanguage.g:162:2: iv_ruleAorB= ruleAorB EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAorBRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleAorB_in_entryRuleAorB223);
            iv_ruleAorB=ruleAorB();
            _fsp--;

             current =iv_ruleAorB; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAorB233); 

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
    // $ANTLR end entryRuleAorB


    // $ANTLR start ruleAorB
    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/parser/antlr/internal/InternalBug326937TestLanguage.g:169:1: ruleAorB returns [EObject current=null] : (this_A_0= ruleA | this_B_1= ruleB ) ;
    public final EObject ruleAorB() throws RecognitionException {
        EObject current = null;

        EObject this_A_0 = null;

        EObject this_B_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/parser/antlr/internal/InternalBug326937TestLanguage.g:174:6: ( (this_A_0= ruleA | this_B_1= ruleB ) )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/parser/antlr/internal/InternalBug326937TestLanguage.g:175:1: (this_A_0= ruleA | this_B_1= ruleB )
            {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/parser/antlr/internal/InternalBug326937TestLanguage.g:175:1: (this_A_0= ruleA | this_B_1= ruleB )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("175:1: (this_A_0= ruleA | this_B_1= ruleB )", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/parser/antlr/internal/InternalBug326937TestLanguage.g:176:5: this_A_0= ruleA
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAorBAccess().getAParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleA_in_ruleAorB280);
                    this_A_0=ruleA();
                    _fsp--;

                     
                            current = this_A_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/parser/antlr/internal/InternalBug326937TestLanguage.g:186:5: this_B_1= ruleB
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAorBAccess().getBParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleB_in_ruleAorB307);
                    this_B_1=ruleB();
                    _fsp--;

                     
                            current = this_B_1; 
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
    // $ANTLR end ruleAorB


    // $ANTLR start entryRuleB
    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/parser/antlr/internal/InternalBug326937TestLanguage.g:202:1: entryRuleB returns [EObject current=null] : iv_ruleB= ruleB EOF ;
    public final EObject entryRuleB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleB = null;


        try {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/parser/antlr/internal/InternalBug326937TestLanguage.g:203:2: (iv_ruleB= ruleB EOF )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/parser/antlr/internal/InternalBug326937TestLanguage.g:204:2: iv_ruleB= ruleB EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleB_in_entryRuleB342);
            iv_ruleB=ruleB();
            _fsp--;

             current =iv_ruleB; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleB352); 

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
    // $ANTLR end entryRuleB


    // $ANTLR start ruleB
    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/parser/antlr/internal/InternalBug326937TestLanguage.g:211:1: ruleB returns [EObject current=null] : ( 'B' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleB() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/parser/antlr/internal/InternalBug326937TestLanguage.g:216:6: ( ( 'B' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/parser/antlr/internal/InternalBug326937TestLanguage.g:217:1: ( 'B' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/parser/antlr/internal/InternalBug326937TestLanguage.g:217:1: ( 'B' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/parser/antlr/internal/InternalBug326937TestLanguage.g:217:3: 'B' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,14,FollowSets000.FOLLOW_14_in_ruleB387); 

                    createLeafNode(grammarAccess.getBAccess().getBKeyword_0(), null); 
                
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/parser/antlr/internal/InternalBug326937TestLanguage.g:221:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/parser/antlr/internal/InternalBug326937TestLanguage.g:222:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/parser/antlr/internal/InternalBug326937TestLanguage.g:222:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/parser/antlr/internal/InternalBug326937TestLanguage.g:223:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleB404); 

            			createLeafNode(grammarAccess.getBAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBRule().getType().getClassifier());
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
    // $ANTLR end ruleB


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleA_in_entryRuleA75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleA85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleA120 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleA137 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_ruleA153 = new BitSet(new long[]{0x0000000000006800L});
        public static final BitSet FOLLOW_ruleAorB_in_ruleA174 = new BitSet(new long[]{0x0000000000006800L});
        public static final BitSet FOLLOW_13_in_ruleA185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAorB_in_entryRuleAorB223 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAorB233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleA_in_ruleAorB280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleB_in_ruleAorB307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleB_in_entryRuleB342 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleB352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleB387 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleB404 = new BitSet(new long[]{0x0000000000000002L});
    }


}