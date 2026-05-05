parser grammar PythonParser;

options { tokenVocab = PythonLexer; }

// Regra inicial
program : stat+ ;

// Regras de comandos (podes expandir depois)
stat : expr                      # printExpr
     | ID ASSIGN expr            # assignment
     | PRINT LPAREN expr RPAREN  # printFunc
     ;

// Regras de expressões
expr : expr (STAR|DIV) expr      # MulDiv
     | expr (PLUS|MINUS) expr    # AddSub
     | INT                       # int
     | ID                        # id
     | STRING                    # string
     | LPAREN expr RPAREN        # parens
     ;