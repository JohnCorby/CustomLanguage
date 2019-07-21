grammar Grammar;

program: statement* EOF;

statement: funcDeclare
         | varDeclare
         | varAssign
         ;

funcDeclare: retType=IDENT name=IDENT '(' (funcArg (',' funcArg)*)? ')' block;
funcArg: argType=IDENT name=IDENT;

varDeclare: varType=IDENT name=IDENT ';';
varAssign: name=IDENT '=' val=EXPR ';';

block: '{' statement* '}';
EXPR: INT_LITERAL;

INT_LITERAL: '-'? DIGIT+;

IDENT: (LETTER | '_') (DIGIT | LETTER | '_')*;

WHITESPACE: ([ \t] | NEWLINE)+ -> skip;
COMMENT: '//' .*? NEWLINE -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;

fragment NEWLINE: [\r\n];
fragment DIGIT: [0-9];
fragment LETTER: [a-zA-Z];
