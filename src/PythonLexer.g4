lexer grammar PythonLexer; 

SOMA  : '+' ;
SUB   : '-' ;
PRINT : 'print' ;
ID    : [a-zA-Z_][a-zA-Z0-9_]* ;
INT   : [0-9]+ ;
WS    : [ \t\r\n]+ -> skip ;

ATRIB : '=' ;
APAR  : '(' ;
FPAR  : ')' ;
