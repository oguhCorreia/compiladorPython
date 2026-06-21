parser grammar PythonParser;

options { tokenVocab = PythonLexer; }

// Regra principal: O ficheiro pode ter quebras de linha, instruções, funções ou classes
code : (NEWLINE | stat | func | class_def)* EOF ;

// Todas as instruções possíveis que ocupam apenas 1 linha
stat : assignment 
     | print_stmt 
     | input_stmt 
     | return_stmt 
     | break_stmt
     | continue_stmt
     | import_stmt
     | pass_stmt
     | try_except
     | expr 
     | condicional 
     | loop_while 
     | loop_for ;

// A estrutura de blocos de código por indentação
block : NEWLINE (INDENT stat NEWLINE?)+ ;

// REGRAS OPERADORES
op_assignment : ASSIGN | PLUS_ASSIGN | MINUS_ASSIGN | MULT_ASSIGN | DIV_ASSIGN | MOD_ASSIGN;
op_mult : MULT | DIV | MOD | FLOOR_DIV;
op_add : PLUS | MINUS;
op_comp : EQ | NEQ | LT | GT | LTE | GTE;

// INSTRUÇÕES SIMPLES
assignment    : ID op_assignment expr;
print_stmt    : PRINT LPAREN (expr (COMMA expr)*)? RPAREN ;
input_stmt    : ID ASSIGN INPUT LPAREN STRING? RPAREN ;
return_stmt   : RETURN expr? ;
break_stmt    : BREAK ;
continue_stmt : CONTINUE ;
pass_stmt     : PASS ;
import_stmt   : IMPORT ID (AS ID)? | FROM ID IMPORT ID (AS ID)? ;

// ESTRUTURAS COMPLEXAS (Com blocos)
func        : DEF ID LPAREN (ID (COMMA ID)*)? RPAREN COLON block ;
class_def   : CLASS ID COLON block ;
try_except  : TRY COLON block (EXCEPT ID? COLON block)* (FINALLY COLON block)? ;
condicional : IF expr COLON block (ELIF expr COLON block)* (ELSE COLON block)? ;
loop_while  : WHILE expr COLON block ;
loop_for    : FOR ID IN expr COLON block ;

// CHAMADA DE FUNÇÃO
func_call : ID LPAREN (expr (COMMA expr)*)? RPAREN ;

// EXPRESSÕES E CONDIÇÕES UNIFICADAS (Com ordem de precedência correta)
expr : LPAREN expr RPAREN
     | func_call
     | lista
     | tupla
     | dicionario
     | conjunto
     | ID
     | INT
     | FLOAT
     | STRING
     | TRUE
     | FALSE
     | expr POW expr
     | expr op_mult expr
     | expr op_add expr
     | expr op_comp expr
     | NOT expr
     | expr AND expr
     | expr OR expr
     ;

// COLEÇÕES
lista     : LBRACK (expr (COMMA expr)*)? RBRACK ;
tupla     : LPAREN (expr (COMMA expr)*)? RPAREN ;
dicionario: LBRACE (expr COLON expr (COMMA expr COLON expr)*)? RBRACE ;
conjunto  : LBRACE (expr (COMMA expr)*)? RBRACE ;