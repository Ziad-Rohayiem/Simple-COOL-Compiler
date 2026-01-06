grammar cool_syntax;

import cool_grammar;

program : class+  # start;
class   : CLASS TYPE_IDENTIFIER (INHERITS TYPE_IDENTIFIER)? LBRACE (feature SEMI)* RBRACE SEMI #classdef;
feature : OBJECT_IDENTIFIER LPAREN (formal (COMMA formal)*)? RPAREN COLON TYPE_IDENTIFIER LBRACE expr RBRACE #function
        | OBJECT_IDENTIFIER COLON TYPE_IDENTIFIER (ASSIGN expr)? #variable;
formal  : OBJECT_IDENTIFIER COLON TYPE_IDENTIFIER #parameter;

let_binding : OBJECT_IDENTIFIER COLON TYPE_IDENTIFIER (ASSIGN expr)? ;

expr    
        // Low Precedence (Root of Tree, binds loosely)
        : LET let_binding (COMMA let_binding)* IN expr #let
        | OBJECT_IDENTIFIER ASSIGN expr #assign
        | NOT expr #not
        | expr LE expr #lq
        | expr LT expr #lt
        | expr EQUALS expr #eq
        | expr PLUS expr #add
        | expr MINUS expr #sub
        | expr MULT expr #mul
        | expr DIV expr #div
        | ISVOID expr #void
        | TILDE expr #invert
        | expr (AT TYPE_IDENTIFIER)? DOT OBJECT_IDENTIFIER LPAREN (expr (COMMA expr)*)? RPAREN #objectcall
        | OBJECT_IDENTIFIER LPAREN (expr (COMMA expr)*)? RPAREN #staticcall
        
        // High Precedence (Leaves of Tree, binds tightly)
        | IF expr THEN expr ELSE expr FI #if
        | WHILE expr LOOP expr POOL #while
        | LBRACE (expr SEMI)+ RBRACE #block
        | CASE expr OF (OBJECT_IDENTIFIER COLON TYPE_IDENTIFIER RESULTS expr SEMI)+ ESAC #case
        | NEW TYPE_IDENTIFIER #newobject
        | LPAREN expr RPAREN #parexpr
        | OBJECT_IDENTIFIER #id
        | INTEGERS #num
        | STRING #text
        | TRUE #true
        | FALSE #false
        ;