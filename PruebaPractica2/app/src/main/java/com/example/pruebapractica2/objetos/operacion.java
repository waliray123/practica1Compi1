/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.pruebapractica2.objetos;

import java.io.Serializable;

/**
 *
 * @author user-ubunto
 */
public class operacion implements Serializable {
    String tipo;
    String oper;
    String linea;
    String columna;

    public operacion(String tipo, String oper, String linea, String columna) {
        this.tipo = tipo;
        this.oper = oper;
        this.linea = linea;
        this.columna = columna;
    }       
    
    public operacion(String tipo, String oper) {
        this.tipo = tipo;
        this.oper = oper;
        this.linea = linea;
        this.columna = columna;
    }  

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getColumna() {
        return columna;
    }

    public void setColumna(String columna) {
        this.columna = columna;
    }
    
    
}
