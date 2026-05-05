parser grammar PythonParser; // Indica que é apenas sintático

options { tokenVocab=PythonLexer; } // O SEGREDO ESTÁ AQUI!

// Regras de Parser (Sempre em minúsculas)
program : estatuto+ EOF ;

estatuto : ID '=' expr
         | PRINT '(' expr ')'
         ;

expr : INT 
     | ID
     ;