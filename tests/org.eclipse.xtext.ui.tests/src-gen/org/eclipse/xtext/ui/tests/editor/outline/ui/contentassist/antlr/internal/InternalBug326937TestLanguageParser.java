package org.eclipse.xtext.ui.tests.editor.outline.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.eclipse.xtext.ui.tests.editor.outline.services.Bug326937TestLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBug326937TestLanguageParser extends AbstractInternalContentAssistParser {
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
    public String getGrammarFileName() { return "../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g"; }


     
     	private Bug326937TestLanguageGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(Bug326937TestLanguageGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start entryRuleA
    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:61:1: entryRuleA : ruleA EOF ;
    public final void entryRuleA() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:62:1: ( ruleA EOF )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:63:1: ruleA EOF
            {
             before(grammarAccess.getARule()); 
            pushFollow(FollowSets000.FOLLOW_ruleA_in_entryRuleA61);
            ruleA();
            _fsp--;

             after(grammarAccess.getARule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleA68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleA


    // $ANTLR start ruleA
    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:70:1: ruleA : ( ( rule__A__Group__0 ) ) ;
    public final void ruleA() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:74:2: ( ( ( rule__A__Group__0 ) ) )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:75:1: ( ( rule__A__Group__0 ) )
            {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:75:1: ( ( rule__A__Group__0 ) )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:76:1: ( rule__A__Group__0 )
            {
             before(grammarAccess.getAAccess().getGroup()); 
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:77:1: ( rule__A__Group__0 )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:77:2: rule__A__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__A__Group__0_in_ruleA94);
            rule__A__Group__0();
            _fsp--;


            }

             after(grammarAccess.getAAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleA


    // $ANTLR start entryRuleAorB
    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:89:1: entryRuleAorB : ruleAorB EOF ;
    public final void entryRuleAorB() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:90:1: ( ruleAorB EOF )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:91:1: ruleAorB EOF
            {
             before(grammarAccess.getAorBRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAorB_in_entryRuleAorB121);
            ruleAorB();
            _fsp--;

             after(grammarAccess.getAorBRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAorB128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleAorB


    // $ANTLR start ruleAorB
    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:98:1: ruleAorB : ( ( rule__AorB__Alternatives ) ) ;
    public final void ruleAorB() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:102:2: ( ( ( rule__AorB__Alternatives ) ) )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:103:1: ( ( rule__AorB__Alternatives ) )
            {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:103:1: ( ( rule__AorB__Alternatives ) )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:104:1: ( rule__AorB__Alternatives )
            {
             before(grammarAccess.getAorBAccess().getAlternatives()); 
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:105:1: ( rule__AorB__Alternatives )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:105:2: rule__AorB__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__AorB__Alternatives_in_ruleAorB154);
            rule__AorB__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getAorBAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAorB


    // $ANTLR start entryRuleB
    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:117:1: entryRuleB : ruleB EOF ;
    public final void entryRuleB() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:118:1: ( ruleB EOF )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:119:1: ruleB EOF
            {
             before(grammarAccess.getBRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleB_in_entryRuleB181);
            ruleB();
            _fsp--;

             after(grammarAccess.getBRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleB188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleB


    // $ANTLR start ruleB
    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:126:1: ruleB : ( ( rule__B__Group__0 ) ) ;
    public final void ruleB() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:130:2: ( ( ( rule__B__Group__0 ) ) )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:131:1: ( ( rule__B__Group__0 ) )
            {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:131:1: ( ( rule__B__Group__0 ) )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:132:1: ( rule__B__Group__0 )
            {
             before(grammarAccess.getBAccess().getGroup()); 
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:133:1: ( rule__B__Group__0 )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:133:2: rule__B__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__B__Group__0_in_ruleB214);
            rule__B__Group__0();
            _fsp--;


            }

             after(grammarAccess.getBAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleB


    // $ANTLR start rule__AorB__Alternatives
    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:145:1: rule__AorB__Alternatives : ( ( ruleA ) | ( ruleB ) );
    public final void rule__AorB__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:149:1: ( ( ruleA ) | ( ruleB ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==14) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("145:1: rule__AorB__Alternatives : ( ( ruleA ) | ( ruleB ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:150:1: ( ruleA )
                    {
                    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:150:1: ( ruleA )
                    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:151:1: ruleA
                    {
                     before(grammarAccess.getAorBAccess().getAParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleA_in_rule__AorB__Alternatives250);
                    ruleA();
                    _fsp--;

                     after(grammarAccess.getAorBAccess().getAParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:156:6: ( ruleB )
                    {
                    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:156:6: ( ruleB )
                    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:157:1: ruleB
                    {
                     before(grammarAccess.getAorBAccess().getBParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleB_in_rule__AorB__Alternatives267);
                    ruleB();
                    _fsp--;

                     after(grammarAccess.getAorBAccess().getBParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AorB__Alternatives


    // $ANTLR start rule__A__Group__0
    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:169:1: rule__A__Group__0 : rule__A__Group__0__Impl rule__A__Group__1 ;
    public final void rule__A__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:173:1: ( rule__A__Group__0__Impl rule__A__Group__1 )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:174:2: rule__A__Group__0__Impl rule__A__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__A__Group__0__Impl_in_rule__A__Group__0297);
            rule__A__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__A__Group__1_in_rule__A__Group__0300);
            rule__A__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__A__Group__0


    // $ANTLR start rule__A__Group__0__Impl
    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:181:1: rule__A__Group__0__Impl : ( 'A' ) ;
    public final void rule__A__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:185:1: ( ( 'A' ) )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:186:1: ( 'A' )
            {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:186:1: ( 'A' )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:187:1: 'A'
            {
             before(grammarAccess.getAAccess().getAKeyword_0()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__A__Group__0__Impl328); 
             after(grammarAccess.getAAccess().getAKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__A__Group__0__Impl


    // $ANTLR start rule__A__Group__1
    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:200:1: rule__A__Group__1 : rule__A__Group__1__Impl rule__A__Group__2 ;
    public final void rule__A__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:204:1: ( rule__A__Group__1__Impl rule__A__Group__2 )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:205:2: rule__A__Group__1__Impl rule__A__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__A__Group__1__Impl_in_rule__A__Group__1359);
            rule__A__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__A__Group__2_in_rule__A__Group__1362);
            rule__A__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__A__Group__1


    // $ANTLR start rule__A__Group__1__Impl
    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:212:1: rule__A__Group__1__Impl : ( ( rule__A__NameAssignment_1 ) ) ;
    public final void rule__A__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:216:1: ( ( ( rule__A__NameAssignment_1 ) ) )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:217:1: ( ( rule__A__NameAssignment_1 ) )
            {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:217:1: ( ( rule__A__NameAssignment_1 ) )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:218:1: ( rule__A__NameAssignment_1 )
            {
             before(grammarAccess.getAAccess().getNameAssignment_1()); 
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:219:1: ( rule__A__NameAssignment_1 )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:219:2: rule__A__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__A__NameAssignment_1_in_rule__A__Group__1__Impl389);
            rule__A__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getAAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__A__Group__1__Impl


    // $ANTLR start rule__A__Group__2
    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:229:1: rule__A__Group__2 : rule__A__Group__2__Impl ;
    public final void rule__A__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:233:1: ( rule__A__Group__2__Impl )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:234:2: rule__A__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__A__Group__2__Impl_in_rule__A__Group__2419);
            rule__A__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__A__Group__2


    // $ANTLR start rule__A__Group__2__Impl
    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:240:1: rule__A__Group__2__Impl : ( ( rule__A__Group_2__0 )? ) ;
    public final void rule__A__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:244:1: ( ( ( rule__A__Group_2__0 )? ) )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:245:1: ( ( rule__A__Group_2__0 )? )
            {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:245:1: ( ( rule__A__Group_2__0 )? )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:246:1: ( rule__A__Group_2__0 )?
            {
             before(grammarAccess.getAAccess().getGroup_2()); 
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:247:1: ( rule__A__Group_2__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:247:2: rule__A__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__A__Group_2__0_in_rule__A__Group__2__Impl446);
                    rule__A__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__A__Group__2__Impl


    // $ANTLR start rule__A__Group_2__0
    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:263:1: rule__A__Group_2__0 : rule__A__Group_2__0__Impl rule__A__Group_2__1 ;
    public final void rule__A__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:267:1: ( rule__A__Group_2__0__Impl rule__A__Group_2__1 )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:268:2: rule__A__Group_2__0__Impl rule__A__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__A__Group_2__0__Impl_in_rule__A__Group_2__0483);
            rule__A__Group_2__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__A__Group_2__1_in_rule__A__Group_2__0486);
            rule__A__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__A__Group_2__0


    // $ANTLR start rule__A__Group_2__0__Impl
    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:275:1: rule__A__Group_2__0__Impl : ( '{' ) ;
    public final void rule__A__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:279:1: ( ( '{' ) )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:280:1: ( '{' )
            {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:280:1: ( '{' )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:281:1: '{'
            {
             before(grammarAccess.getAAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__A__Group_2__0__Impl514); 
             after(grammarAccess.getAAccess().getLeftCurlyBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__A__Group_2__0__Impl


    // $ANTLR start rule__A__Group_2__1
    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:294:1: rule__A__Group_2__1 : rule__A__Group_2__1__Impl rule__A__Group_2__2 ;
    public final void rule__A__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:298:1: ( rule__A__Group_2__1__Impl rule__A__Group_2__2 )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:299:2: rule__A__Group_2__1__Impl rule__A__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__A__Group_2__1__Impl_in_rule__A__Group_2__1545);
            rule__A__Group_2__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__A__Group_2__2_in_rule__A__Group_2__1548);
            rule__A__Group_2__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__A__Group_2__1


    // $ANTLR start rule__A__Group_2__1__Impl
    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:306:1: rule__A__Group_2__1__Impl : ( ( rule__A__ContentsAssignment_2_1 )* ) ;
    public final void rule__A__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:310:1: ( ( ( rule__A__ContentsAssignment_2_1 )* ) )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:311:1: ( ( rule__A__ContentsAssignment_2_1 )* )
            {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:311:1: ( ( rule__A__ContentsAssignment_2_1 )* )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:312:1: ( rule__A__ContentsAssignment_2_1 )*
            {
             before(grammarAccess.getAAccess().getContentsAssignment_2_1()); 
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:313:1: ( rule__A__ContentsAssignment_2_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11||LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:313:2: rule__A__ContentsAssignment_2_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__A__ContentsAssignment_2_1_in_rule__A__Group_2__1__Impl575);
            	    rule__A__ContentsAssignment_2_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getAAccess().getContentsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__A__Group_2__1__Impl


    // $ANTLR start rule__A__Group_2__2
    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:323:1: rule__A__Group_2__2 : rule__A__Group_2__2__Impl ;
    public final void rule__A__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:327:1: ( rule__A__Group_2__2__Impl )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:328:2: rule__A__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__A__Group_2__2__Impl_in_rule__A__Group_2__2606);
            rule__A__Group_2__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__A__Group_2__2


    // $ANTLR start rule__A__Group_2__2__Impl
    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:334:1: rule__A__Group_2__2__Impl : ( '}' ) ;
    public final void rule__A__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:338:1: ( ( '}' ) )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:339:1: ( '}' )
            {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:339:1: ( '}' )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:340:1: '}'
            {
             before(grammarAccess.getAAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__A__Group_2__2__Impl634); 
             after(grammarAccess.getAAccess().getRightCurlyBracketKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__A__Group_2__2__Impl


    // $ANTLR start rule__B__Group__0
    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:359:1: rule__B__Group__0 : rule__B__Group__0__Impl rule__B__Group__1 ;
    public final void rule__B__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:363:1: ( rule__B__Group__0__Impl rule__B__Group__1 )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:364:2: rule__B__Group__0__Impl rule__B__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__B__Group__0__Impl_in_rule__B__Group__0671);
            rule__B__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__B__Group__1_in_rule__B__Group__0674);
            rule__B__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__B__Group__0


    // $ANTLR start rule__B__Group__0__Impl
    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:371:1: rule__B__Group__0__Impl : ( 'B' ) ;
    public final void rule__B__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:375:1: ( ( 'B' ) )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:376:1: ( 'B' )
            {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:376:1: ( 'B' )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:377:1: 'B'
            {
             before(grammarAccess.getBAccess().getBKeyword_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__B__Group__0__Impl702); 
             after(grammarAccess.getBAccess().getBKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__B__Group__0__Impl


    // $ANTLR start rule__B__Group__1
    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:390:1: rule__B__Group__1 : rule__B__Group__1__Impl ;
    public final void rule__B__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:394:1: ( rule__B__Group__1__Impl )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:395:2: rule__B__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__B__Group__1__Impl_in_rule__B__Group__1733);
            rule__B__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__B__Group__1


    // $ANTLR start rule__B__Group__1__Impl
    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:401:1: rule__B__Group__1__Impl : ( ( rule__B__NameAssignment_1 ) ) ;
    public final void rule__B__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:405:1: ( ( ( rule__B__NameAssignment_1 ) ) )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:406:1: ( ( rule__B__NameAssignment_1 ) )
            {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:406:1: ( ( rule__B__NameAssignment_1 ) )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:407:1: ( rule__B__NameAssignment_1 )
            {
             before(grammarAccess.getBAccess().getNameAssignment_1()); 
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:408:1: ( rule__B__NameAssignment_1 )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:408:2: rule__B__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__B__NameAssignment_1_in_rule__B__Group__1__Impl760);
            rule__B__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getBAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__B__Group__1__Impl


    // $ANTLR start rule__A__NameAssignment_1
    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:423:1: rule__A__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__A__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:427:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:428:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:428:1: ( RULE_ID )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:429:1: RULE_ID
            {
             before(grammarAccess.getAAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__A__NameAssignment_1799); 
             after(grammarAccess.getAAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__A__NameAssignment_1


    // $ANTLR start rule__A__ContentsAssignment_2_1
    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:438:1: rule__A__ContentsAssignment_2_1 : ( ruleAorB ) ;
    public final void rule__A__ContentsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:442:1: ( ( ruleAorB ) )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:443:1: ( ruleAorB )
            {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:443:1: ( ruleAorB )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:444:1: ruleAorB
            {
             before(grammarAccess.getAAccess().getContentsAorBParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAorB_in_rule__A__ContentsAssignment_2_1830);
            ruleAorB();
            _fsp--;

             after(grammarAccess.getAAccess().getContentsAorBParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__A__ContentsAssignment_2_1


    // $ANTLR start rule__B__NameAssignment_1
    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:453:1: rule__B__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__B__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:457:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:458:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:458:1: ( RULE_ID )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/outline/ui/contentassist/antlr/internal/InternalBug326937TestLanguage.g:459:1: RULE_ID
            {
             before(grammarAccess.getBAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__B__NameAssignment_1861); 
             after(grammarAccess.getBAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__B__NameAssignment_1


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleA_in_entryRuleA61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleA68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__A__Group__0_in_ruleA94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAorB_in_entryRuleAorB121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAorB128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AorB__Alternatives_in_ruleAorB154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleB_in_entryRuleB181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleB188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__B__Group__0_in_ruleB214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleA_in_rule__AorB__Alternatives250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleB_in_rule__AorB__Alternatives267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__A__Group__0__Impl_in_rule__A__Group__0297 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__A__Group__1_in_rule__A__Group__0300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__A__Group__0__Impl328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__A__Group__1__Impl_in_rule__A__Group__1359 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_rule__A__Group__2_in_rule__A__Group__1362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__A__NameAssignment_1_in_rule__A__Group__1__Impl389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__A__Group__2__Impl_in_rule__A__Group__2419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__A__Group_2__0_in_rule__A__Group__2__Impl446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__A__Group_2__0__Impl_in_rule__A__Group_2__0483 = new BitSet(new long[]{0x0000000000006800L});
        public static final BitSet FOLLOW_rule__A__Group_2__1_in_rule__A__Group_2__0486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__A__Group_2__0__Impl514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__A__Group_2__1__Impl_in_rule__A__Group_2__1545 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__A__Group_2__2_in_rule__A__Group_2__1548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__A__ContentsAssignment_2_1_in_rule__A__Group_2__1__Impl575 = new BitSet(new long[]{0x0000000000004802L});
        public static final BitSet FOLLOW_rule__A__Group_2__2__Impl_in_rule__A__Group_2__2606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__A__Group_2__2__Impl634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__B__Group__0__Impl_in_rule__B__Group__0671 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__B__Group__1_in_rule__B__Group__0674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__B__Group__0__Impl702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__B__Group__1__Impl_in_rule__B__Group__1733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__B__NameAssignment_1_in_rule__B__Group__1__Impl760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__A__NameAssignment_1799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAorB_in_rule__A__ContentsAssignment_2_1830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__B__NameAssignment_1861 = new BitSet(new long[]{0x0000000000000002L});
    }


}