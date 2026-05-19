parser grammar PythonParser;

options { tokenVocab = PythonLexer; }

code : (stat* | condicional) EOF ;

stat : (expr | query) NEWLINE ;

expr : ID
     | INT
     | expr (PLUS | MINUS | MULT | DIV) expr
     | LPAREN expr RPAREN
     ;

query : TRUE | FALSE
      | NOT query
      | query (AND | OR) query
      | LPAREN query RPAREN
      | expr (EQ | NEQ | LT | GT) expr
      ;

condicional : IF query COLON NEWLINE stat+
            | IF query COLON NEWLINE stat+ ELSE COLON NEWLINE stat+
            | IF query COLON NEWLINE stat+ ELIF query COLON NEWLINE stat+ ELSE COLON NEWLINE stat+
            | IF query COLON NEWLINE stat+ (ELIF query COLON NEWLINE stat+)+ ELSE COLON NEWLINE stat+
           ;