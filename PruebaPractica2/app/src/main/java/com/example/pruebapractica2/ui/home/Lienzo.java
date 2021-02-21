package com.example.pruebapractica2.ui.home;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;

import com.example.pruebapractica2.objetos.animar;
import com.example.pruebapractica2.objetos.graficar;

import java.util.List;


public class Lienzo extends View {

    private int [][] coorAnim;
    private Canvas canvas;
    private List<graficar> graficos;
    private List<animar> animaciones;

    public Lienzo(Context context,List<graficar> graficos, List<animar> animaciones) {
        super(context);
        this.graficos = graficos;
        this.animaciones = animaciones;
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.canvas = canvas;

        canvas.drawColor(Color.WHITE);

        Paint pincel1 = new Paint();
        pincel1.setColor(Color.GREEN);
        pincel1.setStyle(Paint.Style.FILL);

        dibujar();

        //invalidate();

        //canvas.drawRect(20)
    }

    private void dibujar(){
        //Paint pincel = new Paint();
        //pincel = getPincel("morado");
        //this.canvas.drawCircle(100,100,50,pincel);
        for (graficar grafico : graficos){
            String tipo = grafico.getTipo();
            if (tipo.equalsIgnoreCase("circulo")){
                canvas.drawCircle(grafico.getPosx().floatValue(),grafico.getPosy().floatValue(),grafico.getIns3().floatValue(),getPincel(grafico.getColor()));
            }else if(tipo.equalsIgnoreCase("linea")){
                Paint pincel = new Paint();
                pincel = getPincel(grafico.getColor());
                pincel.setStrokeWidth(10);
                canvas.drawLine(grafico.getPosx().floatValue(),grafico.getPosy().floatValue(),
                        grafico.getIns3().floatValue(),grafico.getIns4().floatValue(),pincel);
            }else if(tipo.equalsIgnoreCase("cuadrado")){
                canvas.drawRect(grafico.getPosx().floatValue(),grafico.getPosy().floatValue(),
                        (grafico.getIns3().floatValue()+grafico.getPosx().floatValue()),
                        grafico.getIns3().floatValue()+grafico.getPosy().floatValue(),
                        getPincel(grafico.getColor()));
            }else if(tipo.equalsIgnoreCase("rectangulo")){
                canvas.drawRect(grafico.getPosx().floatValue(),grafico.getPosy().floatValue(),
                        (grafico.getIns4().floatValue()+grafico.getPosx().floatValue()),
                        grafico.getIns3().floatValue()+grafico.getPosy().floatValue(),
                        getPincel(grafico.getColor()));
            }
            else if(tipo.equalsIgnoreCase("poligono")){
                
            }
        }
    }


    private Paint getPincel(String colorUsado){
        Paint pincel = new Paint();
        pincel.setStyle(Paint.Style.FILL);
        if (colorUsado.equalsIgnoreCase("azul")){
            pincel.setColor(Color.BLUE);
        }else if(colorUsado.equalsIgnoreCase("rojo")){
            pincel.setColor(Color.RED);
        }else if(colorUsado.equalsIgnoreCase("verde")){
            pincel.setColor(Color.GREEN);
        }else if(colorUsado.equalsIgnoreCase("amarillo")){
            pincel.setColor(Color.YELLOW);
        }else if(colorUsado.equalsIgnoreCase("naranja")){
            pincel.setColor(Color.rgb(232,93,4));
        }else if(colorUsado.equalsIgnoreCase("morado")){
            pincel.setColor(Color.rgb(87,35,100));
        }else if(colorUsado.equalsIgnoreCase("cafe")){
            pincel.setColor(Color.rgb(128,64,0));
        }else if(colorUsado.equalsIgnoreCase("negro")){
            pincel.setColor(Color.rgb(0,0,0));
        }
        return pincel;
    }



    public Canvas getCanvas() {
        return canvas;
    }

    public int[][] getCoorAnim() {
        return coorAnim;
    }
}
