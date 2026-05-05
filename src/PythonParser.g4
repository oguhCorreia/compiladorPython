parser grammar PythonParser;

options { tokenVocab = PythonLexer; }

program : stat+ ;

code: stat* EOF;

stat : expr
     | expr NEWLINE   
     | LPAREN expr | query RPAREN NEWLINE
     | ID ASSIGN expr
     | PRINT LPAREN expr RPAREN
     ;

// Regras de expressões
expr : ID
     | INT
     | FLOAT
     | STRING
     | func
     | expr (MULT|DIV) expr
     | expr (PLUS|MINUS) expr
     | expr (EQ|NE|GT|LT|GE|LE) expr
     | expr (AND|OR) expr
     | NOT expr
     | LPAREN expr RPAREN
     ;

func: ID LPAREN (expr (COMMA expr)*)? RPAREN ;

query: TRUE
     | FALSE
     | LPAREN query RPAREN
     | query (MULT|DIV) query
     | query (PLUS|MINUS) query
     | query (AND|OR) query
     | query (EQ|NE|GT|LT|GE|LE) query
     ;