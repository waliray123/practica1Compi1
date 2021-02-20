//Codigo Usuario
package analizadores;
import java_cup.runtime.*; 
import analizadores.sym.*;
import java.util.List;
import java.util.ArrayList;
import objetos.ErrorCom;

%%

//Configuracion JFLEX
%public
%class Lexer
%standalone
%line
%column
%cup

//Expresiones Regulares
numero = [0-9]+
graficar = "graficar"
color = ("azul"|"rojo" |"verde"|"amarillo"|"naranja"|"morado"|"cafe"|"negro")
linea = "linea"
curva = "curva"
anim = "animar"
obj = "objeto"
ant = "anterior"
blancos = [ \r\t\b\f\n]+
palabra = [a-zA-Z0-9]+


//Codigo Incrustado
%{
    private List<String> errorsList;
    private List<ErrorCom> erroresCom;

    private void error(String lexeme) {
        //System.out.printf("Error Lexico en el Texto: %s  linea %d,  columna %d. \n", lexeme, yyline + 1, yycolumn + 1);
        //errorsList.add(String.format("Error Lexico en el Texto: %s  linea %d, columna %d. Corrige e intenta de nuevo.", lexeme, yyline + 1, yycolumn + 1));
        erroresCom.add(new ErrorCom("Lexico","Simbolo no existe en el lenguaje",String.valueOf(yyline),String.valueOf(yycolumn),lexeme));
    }    

    private void errorPalabra(String lexeme) {
        erroresCom.add(new ErrorCom("Lexico","Palabra no existe en el lenguaje",String.valueOf(yyline),String.valueOf(yycolumn),lexeme));
    }

    public List<String> getErrorsList() {
        return errorsList;
    }

    public List<ErrorCom> getErroresCom() {
        return erroresCom;
    }

%}

%init{
    errorsList = new ArrayList<>();
    erroresCom = new ArrayList<>();
%init}

%%


//Reglas Lexicas
<YYINITIAL> {
    "+" {return new Symbol(sym.SMAS,yyline,yycolumn, yytext());}
    "-" {return new Symbol(sym.SMENOS,yyline,yycolumn, yytext());}
    "*" {return new Symbol(sym.SMULT,yyline,yycolumn, yytext());}
    "/" {return new Symbol(sym.SDIVI,yyline,yycolumn, yytext());}
    "(" {return new Symbol(sym.PARI,yyline,yycolumn, yytext());}
    ")" {return new Symbol(sym.PARD,yyline,yycolumn, yytext());}
    {numero} {return new Symbol(sym.NUMERO,yyline,yycolumn, yytext());}
    {graficar} {return new Symbol(sym.GRAFICAR,yyline,yycolumn, yytext());}
    "," {return new Symbol(sym.COMA,yyline,yycolumn, yytext());}
    {color} {return new Symbol(sym.COLOR,yyline,yycolumn, yytext());}
    {curva} {return new Symbol(sym.CURVA,yyline,yycolumn, yytext());}
    "circulo" {return new Symbol(sym.CIRC,yyline,yycolumn, yytext());}
    "cuadrado" {return new Symbol(sym.CUAD,yyline,yycolumn, yytext());}
    "rectangulo" {return new Symbol(sym.RECT,yyline,yycolumn, yytext());}
    {linea} {return new Symbol(sym.LINEA,yyline,yycolumn, yytext());}
    "poligono" {return new Symbol(sym.POLIG,yyline,yycolumn, yytext());}    
    {anim} {return new Symbol(sym.ANIM,yyline,yycolumn, yytext());}
    {obj} {return new Symbol(sym.OBJ,yyline,yycolumn, yytext());}
    {ant} {return new Symbol(sym.ANT,yyline,yycolumn, yytext());}    
    {blancos} {/*Vacio*/}   
    {palabra} { errorPalabra(yytext()); new Symbol(sym.error,yyline,yycolumn, yytext());}

}

/* Error por cualquier otro simbolo*/
[^]
		{ error(yytext()); new Symbol(sym.error,yyline,yycolumn, yytext());}


