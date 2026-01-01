lexer grammar cool_grammar;

// Using fragments for case insensitivity
fragment A: [aA];
fragment B: [bB];
fragment C: [cC];
fragment D: [dD];
fragment E: [eE];
fragment F: [fF];
fragment G: [gG];
fragment H: [hH];
fragment I: [iI];
fragment J: [jJ];
fragment K: [kK];
fragment L: [lL];
fragment M: [mM];
fragment N: [nN];
fragment O: [oO];
fragment P: [pP];
fragment Q: [qQ];
fragment R: [rR];
fragment S: [sS];
fragment T: [tT];
fragment U: [uU];
fragment V: [vV];
fragment W: [wW];
fragment X: [xX];
fragment Y: [yY];
fragment Z: [zZ];

// Keywords
CLASS : C L A S S;
INHERITS : I N H E R I T S;
IF : I F;
THEN : T H E N;
ELSE : E L S E;
FI : F I;
WHILE : W H I L E;
LOOP : L O O P;
POOL : P O O L;
LET : L E T;
IN : I N;
CASE : C A S E;
OF : O F;
ESAC : E S A C;
NEW : N E W;
ISVOID : I S V O I D;
TRUE: [t] R U E;  //must start with small letter t
FALSE: [f] A L S E;  //must start with small letter f

// Identifiers
ID : (LETTER|'_') (LETTER | DIGIT | '_')*;
fragment LETTER: [a-zA-Z];
fragment DIGIT: [0-9];

// Literals
INT_CONST : DIGIT+;
STR_CONST : '"' ~["\r\n]* '"';

// Operators
PLUS : '+';
MINUS : '-';
MUL : '*';
DIV : '/';
LT : '<';
LE : '<=';
EQ : '=';
NOT : '~';
AT : '@';
DOT : '.';
COLON : ':';
SEMICOLON : ';';
COMMA : ',';
L_PAREN : '(';
R_PAREN : ')';
L_BRACE : '{';
R_BRACE : '}';
ASSIGN : '<-';
ARROW : '=>';

// Comments
COMMENT : '--' ~[\r\n]* -> skip;

// Whitespace
WS : [ \t\r\n]+ -> skip;