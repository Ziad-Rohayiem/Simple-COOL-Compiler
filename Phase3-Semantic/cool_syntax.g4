grammar cool_syntax;

import cool_grammar;

program : class+  # start;
class   : CLASS TYPE_IDENTIFIER (INHERITS TYPE_IDENTIFIER)? LBRACE (feature SEMI)* RBRACE SEMI #classdef;
feature : OBJECT_IDENTIFIER LPAREN (formal (COMMA formal)*)? RPAREN COLON TYPE_IDENTIFIER LBRACE expr RBRACE #function
        | OBJECT_IDENTIFIER COLON TYPE_IDENTIFIER (ASSIGN expr)? #variable;
formal  : OBJECT_IDENTIFIER COLON TYPE_IDENTIFIER #parameter;
expr    : OBJECT_IDENTIFIER ASSIGN expr #assign
        | expr (AT TYPE_IDENTIFIER)? DOT OBJECT_IDENTIFIER LPAREN (expr (COMMA expr)*)? RPAREN #objectcall
        | OBJECT_IDENTIFIER LPAREN (expr (COMMA expr)*)? RPAREN #staticcall
        | IF expr THEN expr ELSE expr FI #if
        | WHILE expr LOOP expr POOL #while
        | LBRACE (expr SEMI)+ RBRACE #block
        | LET OBJECT_IDENTIFIER COLON TYPE_IDENTIFIER (ASSIGN expr)? (COMMA OBJECT_IDENTIFIER COLON TYPE_IDENTIFIER (ASSIGN expr)? )* IN expr #let
        | CASE expr OF (OBJECT_IDENTIFIER COLON TYPE_IDENTIFIER RESULTS expr SEMI)+ ESAC #case
        | NEW TYPE_IDENTIFIER #newobject
        | ISVOID expr #void
        | expr PLUS expr #add
        | expr MINUS expr #sub
        | expr MULT expr # mul
        | expr DIV expr #div
        | TILDE expr #invert
        | expr LT expr #lt
        | expr LE expr #lq
        | expr EQUALS expr #eq
        | NOT expr #not
        | LPAREN expr RPAREN #parexpr
        | OBJECT_IDENTIFIER #id
        | INTEGERS #num
        | STRING #text
        | TRUE #true
        | FALSE #false;