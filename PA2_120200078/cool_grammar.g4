lexer grammar cool_grammar;

// fragments used to simplify keyword and make code clean
// note that fragments are similar to #define in c++
fragment A : [aA];
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment H : [hH];
fragment I : [iI];
fragment L : [lL];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];

//Keywords are case insensitive
CLASS : C L A S S;
ELSE: E L S E;
FI: F I;
IF: I F;
IN: I N;
INHERITS: I N H E R I T S;
ISVOID: I S V O I D;
LET: L E T;
LOOP: L O O P;
POOL: P O O L;
THEN: T H E N;
WHILE: W H I L E;
CASE: C A S E;
ESAC: E S A C;
NEW: N E W;
OF: O F;
NOT: N O T;
//except true and false must start with lower case
TRUE: [t] R U E;
FALSE: [f] A L S E;

//Integers, Identifiers, and Special Notation

INTEGERS: [0-9]+;

SELF: 'self' {setType(OBJECT_IDENTIFIER);};
SELF_TYPE: 'SELF_TYPE' {setType(TYPE_IDENTIFIER);};

TYPE_IDENTIFIER: SELF_TYPE | [A-Z][a-zA-Z0-9_]*; //classtype
OBJECT_IDENTIFIER: SELF | [a-z][a-zA-Z0-9_]*; //ID

LBRACE : '{';
RBRACE : '}';
SEMI : ';';
COLON : ':';
AT : '@';
COMMA : ',';
ASSIGN : '<-';
LPAREN : '(';
RPAREN : ')';
PLUS : '+';
MINUS : '-';
MULT : '*';
DIV : '/';
EQUALS : '=';
LT : '<';
LE : '<=';
TILDE : '~';
DOT : '.';
RESULTS : '=>';

STRING: '"' (('\\'|'\t'|'\r\n'|'\r'|'\n') | ~('\\'|'\t'|'\r'|'\n'|'"'))* '"';

//Comments and white spaces
SINGLECOMMENT: '--' ~[\r\n]* -> skip;

WS: [ \n\t\r]+ -> skip;