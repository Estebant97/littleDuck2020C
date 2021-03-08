grammar littleDuck2020C;
/* Lexical rules */
PROGRAM : 'program';
VAR : 'var';
MULT  : '*' ;
DIV   : '/' ;
PLUS  : '+' ;
MINUS : '-' ;
LPAREN : '(' ;
RPAREN : ')' ;
LBRACKET : '{';
RBRACKET : '}';
SEMI : ';' ;
COLON : ':';
COMMA : ','; 
PRINT: 'print';
IF   : 'if' ;
ELSE : 'else';
EQ : '=' ;
GT : '>' ;
LT : '<' ;
NE : '<>';
TYPE_INT : 'int';
TYPE_FLOAT : 'float';
// REGEX
COMMENT : '//' .+? ('\n'|EOF) -> skip ;
WS : [ \r\t\u000C\n]+ -> skip ;
IDENTIFIER : [a-zA-Z_][a-zA-Z_0-9]*;
INT : '-'?[0-9]+;
FLOAT : '-'?[0-9]+('.'[0-9]+);
STRING :'"'[a-zA-Z][a-zA-Z0-9]*'"';
/* Grammar rules */
programa:
    PROGRAM IDENTIFIER SEMI programa_vars bloque {print("Sintaxis valida!");};

programa_vars:
    r_vars
    | ;

r_vars:
    VAR r_vars_1;

r_vars_1:
    r_vars_2 COLON tipo SEMI r_vars_4;

r_vars_2:
    IDENTIFIER r_vars_3;

r_vars_3:
    COMMA r_vars_2
    | ;

r_vars_4:
    r_vars_1
    | ;

tipo:
    TYPE_INT
    | TYPE_FLOAT;

bloque:
    LBRACKET bloque_1 RBRACKET;

bloque_1:
    estatuto bloque_1
    | ;

estatuto:
    asignacion
    | condicion
    | escritura;

asignacion:
    IDENTIFIER EQ expresion SEMI;

expresion:
    exp expresion_1;

expresion_1:
    GT exp
    | LT exp
    | NE exp
    | ;

exp:
    termino exp_1;

exp_1:
    PLUS exp
    | MINUS exp
    | ;

termino:
    factor termino_1;

termino_1:
    MULT termino |
    DIV termino
    | ;

factor:
    factor_1;

factor_1:
    LPAREN expresion RPAREN
    | factor_2 var_cte;

factor_2:
    PLUS
    | MINUS
    | ;

var_cte:
    IDENTIFIER
    | INT
    | FLOAT;

condicion:
    IF LPAREN expresion RPAREN bloque condicion_1 SEMI;

condicion_1:
    ELSE bloque
    | ;

escritura:
    PRINT LPAREN escritura_1 RPAREN SEMI;

escritura_1:
    expresion escritura_2
    | STRING escritura_2;

escritura_2:
    COMMA escritura_1
    | ;
