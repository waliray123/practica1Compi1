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
public class graficar implements Serializable {
    private String tipo;
    private Double posx;
    private Double posy;
    private String color;
    private Double ins3;
    private Double ins4;
    private Double ins5;

    public graficar(String tipo, Double posx, Double posy, String color, Double ins3) {
        this.tipo = tipo;
        this.posx = posx;
        this.posy = posy;
        this.color = color;
        this.ins3 = ins3;
    }

    public graficar(String tipo, Double posx, Double posy, String color, Double ins3, Double ins4) {
        this.tipo = tipo;
        this.posx = posx;
        this.posy = posy;
        this.color = color;
        this.ins3 = ins3;
        this.ins4 = ins4;
    }

    public graficar(String tipo, Double posx, Double posy, String color, Double ins3, Double ins4, Double ins5) {
        this.tipo = tipo;
        this.posx = posx;
        this.posy = posy;
        this.color = color;
        this.ins3 = ins3;
        this.ins4 = ins4;
        this.ins5 = ins5;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getPosx() {
        return posx;
    }

    public void setPosx(Double posx) {
        this.posx = posx;
    }

    public Double getPosy() {
        return posy;
    }

    public void setPosy(Double posy) {
        this.posy = posy;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getIns3() {
        return ins3;
    }

    public void setIns3(Double ins3) {
        this.ins3 = ins3;
    }

    public Double getIns4() {
        return ins4;
    }

    public void setIns4(Double ins4) {
        this.ins4 = ins4;
    }

    public Double getIns5() {
        return ins5;
    }

    public void setIns5(Double ins5) {
        this.ins5 = ins5;
    }

    


    
    
}
