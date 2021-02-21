package com.example.pruebapractica2;

import com.example.pruebapractica2.objetos.animar;
import com.example.pruebapractica2.objetos.coloresU;
import com.example.pruebapractica2.objetos.graficar;

import java.util.ArrayList;
import java.util.List;

public class creadorListas {
    private List<graficar> graficos;
    private List<animar> animaciones;

    private ArrayList<coloresU> coloresUSAR;
    private ArrayList<coloresU> graficosUSAR;
    private ArrayList<coloresU> animacionesUSAR;

    public creadorListas(List<graficar> graficos, List<animar> animaciones) {
        this.graficos = graficos;
        this.animaciones = animaciones;
        coloresUSAR = new ArrayList<>();
        graficosUSAR = new ArrayList<>();
        animacionesUSAR = new ArrayList<>();
        crearColores();
        crearGraficos();
        if (animaciones.size() != 0){
            crearAnimaciones();
        }
    }

    private void crearColores(){
        int contAz = 0, contRo= 0, contVe= 0,contAm= 0,contNa= 0,contMo= 0,contCa= 0,contNe = 0;
        for (graficar grafico : graficos)
        {
            String colorUsado = grafico.getColor();
            if (colorUsado.equalsIgnoreCase("azul")){
                contAz++;
            }else if(colorUsado.equalsIgnoreCase("rojo")){
                contRo++;
            }else if(colorUsado.equalsIgnoreCase("verde")){
                contVe++;
            }else if(colorUsado.equalsIgnoreCase("amarillo")){
                contAm++;
            }else if(colorUsado.equalsIgnoreCase("naranja")){
                contNa++;
            }else if(colorUsado.equalsIgnoreCase("morado")){
                contMo++;
            }else if(colorUsado.equalsIgnoreCase("cafe")){
                contCa++;
            }else if(colorUsado.equalsIgnoreCase("negro")){
                contNe++;
            }
        }
        if (contAz > 0){
            coloresUSAR.add(new coloresU("Azul",String.valueOf(contAz)));
        }
        if (contRo > 0){
            coloresUSAR.add(new coloresU("Rojo",String.valueOf(contRo)));
        }
        if (contVe > 0){
            coloresUSAR.add(new coloresU("Verde",String.valueOf(contVe)));
        }
        if (contAm > 0){
            coloresUSAR.add(new coloresU("Amarillo",String.valueOf(contAm)));
        }
        if (contNa > 0){
            coloresUSAR.add(new coloresU("Naranja",String.valueOf(contNa)));
        }
        if (contMo > 0){
            coloresUSAR.add(new coloresU("Morado",String.valueOf(contMo)));
        }
        if (contCa > 0){
            coloresUSAR.add(new coloresU("Cafe",String.valueOf(contCa)));
        }
        if (contNe > 0){
            coloresUSAR.add(new coloresU("Negro",String.valueOf(contNe)));
        }
    }

    private void crearGraficos(){
        int contCir = 0, contCuad= 0, contRec= 0,contLin= 0,contPol= 0;
        for (graficar grafico : graficos)
        {
            String tipo = grafico.getTipo();
            if (tipo.equalsIgnoreCase("circulo")){
                contCir++;
            }else if(tipo.equalsIgnoreCase("cuadrado")){
                contCuad++;
            }else if(tipo.equalsIgnoreCase("rectangulo")){
                contRec++;
            }else if(tipo.equalsIgnoreCase("linea")){
                contLin++;
            }else if(tipo.equalsIgnoreCase("poligono")){
                contPol++;
            }
        }
        if (contCir> 0){
            graficosUSAR.add(new coloresU("Circulo",String.valueOf(contCir)));
        }
        if (contCuad> 0){
            graficosUSAR.add(new coloresU("Cuadrado",String.valueOf(contCuad)));
        }
        if (contRec> 0){
            graficosUSAR.add(new coloresU("Rectangulo",String.valueOf(contRec)));
        }
        if (contLin> 0){
            graficosUSAR.add(new coloresU("Linea",String.valueOf(contLin)));
        }
        if (contPol> 0){
            graficosUSAR.add(new coloresU("Poligono",String.valueOf(contPol)));
        }
    }

    private void crearAnimaciones(){
        int contLin = 0, contCurv= 0;
        for (animar anim : animaciones)
        {
            String tipo = anim.getTipo();
            if (tipo.equalsIgnoreCase("linea")){
                contLin++;
            }else if(tipo.equalsIgnoreCase("curva")){
                contCurv++;
            }
        }
        if (contLin> 0){
            animacionesUSAR.add(new coloresU("Linea",String.valueOf(contLin)));
        }
        if (contCurv> 0){
            animacionesUSAR.add(new coloresU("Curva",String.valueOf(contCurv)));
        }
    }

    public ArrayList<coloresU> getColoresUSAR() {
        return coloresUSAR;
    }

    public ArrayList<coloresU> getGraficosUSAR() {
        return graficosUSAR;
    }

    public ArrayList<coloresU> getAnimacionesUSAR() {
        return animacionesUSAR;
    }
}
