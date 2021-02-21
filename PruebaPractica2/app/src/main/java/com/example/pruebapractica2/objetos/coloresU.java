package com.example.pruebapractica2.objetos;

import java.io.Serializable;

public class coloresU implements Serializable {
    private String color;
    private String cantUsos;

    public coloresU(String color, String cantUsos) {
        this.color = color;
        this.cantUsos = cantUsos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCantUsos() {
        return cantUsos;
    }

    public void setCantUsos(String cantUsos) {
        this.cantUsos = cantUsos;
    }

}
