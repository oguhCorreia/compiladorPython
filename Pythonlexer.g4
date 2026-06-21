lexer grammar PythonLexer;

// PALAVRAS-CHAVE
IF      : 'if' ;
ELIF    : 'elif' ;
ELSE    : 'else' ;
AND     : 'and' ;
OR      : 'or' ;
NOT     : 'not' ;
TRUE    : 'True' ;
FALSE   : 'False' ;
DEF     : 'def' ;
CLASS   : 'class' ;
TRY     : 'try' ;
EXCEPT  : 'except' ;
FINALLY : 'finally' ;
IN      : 'in' ;
WHILE   : 'while' ;
FOR     : 'for' ;
PRINT   : 'print' ;
INPUT   : 'input' ;
RETURN  : 'return' ;
BREAK   : 'break' ;
CONTINUE: 'continue' ;
IMPORT  : 'import' ;
FROM    : 'from' ;
AS      : 'as' ;
WITH    : 'with' ;
PASS    : 'pass' ;

// ATRIBUIÇÃO
ASSIGN       : '=' ;
PLUS_ASSIGN  : '+=' ;
MINUS_ASSIGN : '-=' ;
MULT_ASSIGN  : '*=' ;
DIV_ASSIGN   : '/=' ;
MOD_ASSIGN   : '%=' ;

// ARITMÉTICOS
PLUS      : '+' ;
MINUS     : '-' ;
MULT      : '*' ;
DIV       : '/' ;
MOD       : '%' ;
POW       : '**' ;
FLOOR_DIV : '//' ;

// COMPARAÇÃO
EQ     : '==' ;
NEQ    : '!=' ;
LTE    : '<=' ;
GTE    : '>=' ;
LT     : '<' ;
GT     : '>' ;

// DELIMITADORES
COLON  : ':' ;
COMMA  : ',' ;
LPAREN : '(' ;
RPAREN : ')' ;
LBRACK : '[' ;
RBRACK : ']' ;
LBRACE : '{' ;
RBRACE : '}' ;

// LITERAIS
ID     : [a-zA-Z_][a-zA-Z_0-9]* ;
FLOAT  : [0-9]+ '.' [0-9]+ ; 
INT    : [0-9]+ ;
STRING : '"' (~["\r\n])* '"' | '\'' (~['\r\n])* '\'' ;

// REGRAS DE ESPAÇAMENTO E FORMATAÇÃO
NEWLINE : '\r'? '\n' ;
INDENT  : '\t' ;
SPACES  : [ ]+ -> skip ;
COMMENT : '#' ~[\r\n]* -> skip ;