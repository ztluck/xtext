lexer grammar InternalSimpleReconstrTestLanguage;
@header {
package org.eclipse.xtext.parsetree.reconstr.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T13 : '(' ;
T14 : ')' ;
T15 : '!' ;
T16 : '#' ;
T17 : '=' ;
T18 : 'type' ;
T19 : 'extends' ;
T20 : '#2' ;
T21 : 'mykeyword1' ;
T22 : 'mykeyword2' ;
T23 : '#3' ;
T24 : '.' ;
T25 : '#4' ;
T26 : 'myoption' ;
T27 : 'kw' ;
T28 : '#5' ;
T29 : '*' ;
T30 : ',' ;
T31 : '#6' ;
T32 : 'v1' ;
T33 : 'v2' ;
T34 : '#7' ;
T35 : 'kw0' ;
T36 : '#8' ;
T37 : 'kw1' ;
T38 : 'kw2' ;
T39 : 'kw30' ;
T40 : '#9' ;
T41 : 'kw3' ;
T42 : 'kw4' ;
T43 : 'kw5' ;
T44 : 'kw6' ;
T45 : '#10' ;
T46 : '#11' ;
T47 : 'kw7' ;
T48 : '#12' ;
T49 : 'interface' ;
T50 : 'class' ;
T51 : '#13' ;
T52 : 'static' ;
T53 : 'final' ;
T54 : 'transient' ;
T55 : '#14' ;
T56 : 'item' ;
T57 : '#15' ;
T58 : '#16' ;
T59 : 'refs' ;
T60 : '#17' ;
T61 : '#18' ;
T62 : 'ka' ;
T63 : 'kb' ;
T64 : '#19' ;
T65 : 'kx' ;
T66 : 'ky' ;
T67 : 'kz' ;
T68 : '#20' ;
T69 : '#21' ;
T70 : '#22' ;
T71 : 'lit1' ;
T72 : 'lit2' ;

// $ANTLR src "../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g" 3212
RULE_ID1 : 'i' 'd' ('0'..'9')*;

// $ANTLR src "../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g" 3214
RULE_ID2 : 'I' 'D' ('0'..'9')*;

// $ANTLR src "../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g" 3216
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g" 3218
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g" 3220
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g" 3222
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g" 3224
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g" 3226
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalSimpleReconstrTestLanguage.g" 3228
RULE_ANY_OTHER : .;


