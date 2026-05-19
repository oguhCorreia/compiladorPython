lexer grammar PythonLexer;

IF    : 'if' ;
ELIF  : 'elif' ;
ELSE  : 'else' ;
AND   : 'and' ;
OR    : 'or' ;
NOT   : 'not' ;
TRUE  : 'True' ;
FALSE : 'False' ;

ASSIGN : '=' ;
COLON  : ':' ;
PLUS   : '+' ;
MINUS  : '-' ;
MULT   : '*' ;
DIV    : '/' ;
EQ     : '==' ;
NEQ    : '!=' ;
LT     : '<' ;
GT     : '>' ;
LPAREN : '(' ;
RPAREN : ')' ;

NEWLINE : '\n' ;

ID : [a-zA-Z_][a-zA-Z_0-9]* ;
INT : [0-9]+ ;
WS : [ \t\r\f]+ -> skip ;