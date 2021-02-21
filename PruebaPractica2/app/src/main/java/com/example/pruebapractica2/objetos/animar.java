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
public class animar implements Serializable {
    private Double destinox;
    private Double destinoy;
    private String tipo;
    private graficar graficoAnim;

    public animar(Double destinox, Double destinoy, String tipo,graficar graficoAnim) {
        this.destinox = destinox;
        this.destinoy = destinoy;
        this.tipo = tipo;
        this.graficoAnim = graficoAnim;
    }

    public graficar getGraficoAnim() {
        return graficoAnim;
    }

    public void setGraficoAnim(graficar graficoAnim) {
        this.graficoAnim = graficoAnim;
    }    
    
    public Double getDestinox() {
        return destinox;
    }

    public void setDestinox(Double destinox) {
        this.destinox = destinox;
    }

    public Double getDestinoy() {
        return destinoy;
    }

    public void setDestinoy(Double destinoy) {
        this.destinoy = destinoy;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    
    
}
