package com.example.pruebapractica2.ui.home;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;

import com.example.pruebapractica2.R;
import com.example.pruebapractica2.objetos.animar;
import com.example.pruebapractica2.objetos.graficar;

import java.util.List;

public class LienzoAnim extends View {
    private int [][] coorAnim;
    private Canvas canvas;

    private List<graficar> graficos;
    private List<animar> animaciones;
    private int cont;

    public LienzoAnim(Context context, List<graficar> graficos, List<animar> animaciones) {
        super(context);
        coorAnim = new int[animaciones.size()][2];
        this.graficos = graficos;
        this.animaciones = animaciones;
        this.cont = 0;
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.canvas = canvas;

        canvas.drawColor(Color.WHITE);

        dibujar();
        //dibujarAnim();

        /*
        coorAnim[0][0] += 1;
        coorAnim[0][1] += 1;
        this.canvas.drawCircle(coorAnim[0][0],coorAnim[0][1],50,pincel1);

        //this.canvas.drawCircle(100,100,50,pincel1);

        coorAnim[1][0] += 1;
        coorAnim[1][1] += 1;

        Bitmap pol = BitmapFactory.decodeResource(getResources(), R.drawable.ic_pol6);
        ColorFilter filter = new PorterDuffColorFilter(Color.BLUE, PorterDuff.Mode.SRC_IN);
        pincel1.setColorFilter(filter);
        Bitmap polR = Bitmap.createScaledBitmap(pol,100,200,true);

        canvas.drawBitmap(polR,200,100,pincel1);

         */

        cont++;

        if (cont<2){
            invalidate();
        }

        //canvas.drawRect(20);


    }

    public void animate(Canvas canvas){

        this.canvas.drawColor(Color.WHITE);

        Paint pincel1 = new Paint();
        pincel1.setColor(Color.GREEN);
        pincel1.setStyle(Paint.Style.FILL);


        coorAnim[0][0] += 1;
        coorAnim[0][1] += 1;
        this.canvas.drawCircle(coorAnim[0][0],coorAnim[0][1],50,pincel1);
        invalidate();
    }

    private void dibujarAnim(){
        //Paint pincel = new Paint();
        //pincel = getPincel("morado");
        //this.canvas.drawCircle(100,100,50,pincel);
        for (animar anim : animaciones){
            graficar grafico = anim.getGraficoAnim();
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
                Paint pincel = getPincel(grafico.getColor());
                ColorFilter filter = getColorPaint(grafico.getColor());
                pincel.setColorFilter(filter);
                Bitmap bitmap = getPathPol(grafico.getIns5().intValue());
                Bitmap polR = Bitmap.createScaledBitmap(bitmap,grafico.getIns4().intValue(),grafico.getIns3().intValue(),true);

                canvas.drawBitmap(polR,grafico.getPosx().floatValue(),grafico.getPosy().floatValue(),pincel);
            }
        }
    }


    private void dibujar(){
        //Paint pincel = new Paint();
        //pincel = getPincel("morado");
        //this.canvas.drawCircle(100,100,50,pincel);
        for (graficar grafico : graficos){
            if (animaciones.contains(grafico) == false){
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
                    Paint pincel = getPincel(grafico.getColor());
                    ColorFilter filter = getColorPaint(grafico.getColor());
                    pincel.setColorFilter(filter);
                    Bitmap bitmap = getPathPol(grafico.getIns5().intValue());
                    Bitmap polR = Bitmap.createScaledBitmap(bitmap,grafico.getIns4().intValue(),grafico.getIns3().intValue(),true);

                    canvas.drawBitmap(polR,grafico.getPosx().floatValue(),grafico.getPosy().floatValue(),pincel);
                }
            }
        }
    }

    private Bitmap getPathPol(int cantLados){
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.ic_pol6);
        if (cantLados == 5){
            bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.ic_pol5);
        }else if(cantLados == 6){
            bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.ic_pol6);
        }else if(cantLados == 7){
            bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.ic_pol7);
        }else if(cantLados == 8){
            bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.ic_pol8);
        }else if(cantLados == 9){
            bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.ic_pol9);
        }else if(cantLados == 10){
            bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.ic_pol10);
        }

        return bitmap;
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

    private ColorFilter getColorPaint(String colorUsado){
        ColorFilter filter = new ColorFilter();
        if (colorUsado.equalsIgnoreCase("azul")){
            filter = new PorterDuffColorFilter(Color.BLUE, PorterDuff.Mode.SRC_IN);
        }else if(colorUsado.equalsIgnoreCase("rojo")){
            filter = new PorterDuffColorFilter(Color.RED, PorterDuff.Mode.SRC_IN);
        }else if(colorUsado.equalsIgnoreCase("verde")){
            filter = new PorterDuffColorFilter(Color.GREEN, PorterDuff.Mode.SRC_IN);
        }else if(colorUsado.equalsIgnoreCase("amarillo")){
            filter = new PorterDuffColorFilter(Color.YELLOW, PorterDuff.Mode.SRC_IN);
        }else if(colorUsado.equalsIgnoreCase("naranja")){
            filter = new PorterDuffColorFilter(Color.rgb(232,93,4), PorterDuff.Mode.SRC_IN);
        }else if(colorUsado.equalsIgnoreCase("morado")){
            filter = new PorterDuffColorFilter(Color.rgb(87,35,100), PorterDuff.Mode.SRC_IN);
        }else if(colorUsado.equalsIgnoreCase("cafe")){
            filter = new PorterDuffColorFilter(Color.rgb(128,64,0), PorterDuff.Mode.SRC_IN);
        }else if(colorUsado.equalsIgnoreCase("negro")){
            filter = new PorterDuffColorFilter(Color.rgb(0,0,0), PorterDuff.Mode.SRC_IN);
        }
        return filter;
    }
}
