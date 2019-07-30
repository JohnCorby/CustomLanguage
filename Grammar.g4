grammar Grammar;

program: statement* EOF;

statement: externFuncDeclare
         | funcDeclare
         | funcCall ';'
         | varDeclare
         | varAssign
         | asm
         ;

externFuncDeclare: retType=IDENT name=IDENT '(' (funcArg (',' funcArg)*)? ')' ';';

funcDeclare: retType=IDENT name=IDENT '(' (funcArg (',' funcArg)*)? ')' block;
funcArg: argType=IDENT name=IDENT;
block: '{' statement* '}';

funcCall: name=IDENT '(' args=funcCallArgs ')';
funcCallArgs: (expr (',' expr)*)?;

varDeclare: varType=IDENT name=IDENT ';';
varAssign: name=IDENT '=' val=expr ';';

asm: 'asm' code=STR_LITERAL ';';

expr: literal=INT_LITERAL
    | func=funcCall
    | '(' paren=expr ')'
    | left=expr op=('*'|'/') right=expr
    | left=expr op=('+'|'-') right=expr
    ;

INT_LITERAL: '-'? DIGIT+;
STR_LITERAL: '"' .*? '"';

IDENT: (LETTER | '_') (DIGIT | LETTER | '_')*;

WHITESPACE: ([ \t] | NEWLINE)+ -> skip;
COMMENT: '//' .*? NEWLINE -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;

fragment DIGIT: [0-9];
fragment LETTER: [a-zA-Z];
fragment NEWLINE: [\r\n];
