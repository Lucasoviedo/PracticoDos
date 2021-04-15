grammar id;

@header {
    package PracticoUno;
}

LLAVEA : '{' ;
LLAVEC : '}' ;
PARENTESISA : '(' ;
PARENTESISC : ')' ;
CORCHETEA : '[' ;
CORCHETEC : ']' ; 

LINEA : ( () | [] | {} )*'\n';
 
OTRO : . -> skip ;

programa : { System.out.println("\n\n -- INICIO -- "); } instrucciones { System.out.println("\n\n -- FIN -- ") ; } ;

instrucciones : instruccion instrucciones
                | bloque instrucciones
                |
                ;

bloque : (LLAVEA instrucciones LLAVEC | PARENTESISA instrucciones PARENTESISC | CORCHETEA instrucciones CORCHETEC) ; 

instruccion : LINEA { System.out.println("-> |" + $LINEA.getText().stripTrailing + "|");} ;