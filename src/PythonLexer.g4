lexer grammar PythonLexer; 

IF       : 'if' ;
ELIF     : 'elif' ;
ELSE     : 'else' ;
FOR      : 'for' ;
WHILE    : 'while' ;
DEF      : 'def' ;
CLASS    : 'class' ;
TRY      : 'try' ;
EXCEPT   : 'except' ;
FINALLY  : 'finally' ;

INT_TYPE   : 'int' ;
FLOAT_TYPE : 'float' ;
STR_TYPE   : 'str' ;
BOOL_TYPE  : 'bool' ;
LIST_TYPE  : 'list' ;
NONE       : 'None' ;

PRINT    : 'print' ;
INPUT    : 'input' ;
LEN      : 'len' ;
RANGE    : 'range' ;


AND      : 'and' ;
OR       : 'or' ;
NOT      : 'not' ;
TRUE     : 'True' ;
FALSE    : 'False' ;

IMPORT   : 'import' ;
FROM     : 'from' ;
IN       : 'in' ;
AS       : 'as' ;
RETURN   : 'return' ;
BREAK    : 'break' ;
CONTINUE : 'continue' ;
PASS     : 'pass' ;

PLUS     : '+' ;
MINUS    : '-' ;
STAR     : '*' ;
DIV      : '/' ;
IDIV     : '//' ;
MOD      : '%' ;
POW      : '**' ;

EQ       : '==' ;
NE       : '!=' ;
GT       : '>' ;
LT       : '<' ;
GE       : '>=' ;
LE       : '<=' ;

ASSIGN   : '=' ;
ADD_ASSIGN : '+=' ;
SUB_ASSIGN : '-=' ;

LPAREN   : '(' ;
RPAREN   : ')' ;
LBRACK   : '[' ;
RBRACK   : ']' ;
LBRACE   : '{' ;
RBRACE   : '}' ;
COMMA    : ',' ;

COLON    : ':' ;
DOT      : '.' ;

ID       : [a-zA-Z_] [a-zA-Z0-9_]* ;
INT      : [0-9]+ ;
FLOAT    : [0-9]+ '.' [0-9]* | '.' [0-9]+ ;
STRING : '"' ( ~('\\'|'"') | '\\' . )* '"' 
       | '\'' ( ~('\\'|'\'') | '\\' . )* '\'' 
       ;
WS       : [ \t\r\n]+ -> skip ;
COMMENT  : '#' ~[\r\n]* -> skip ;