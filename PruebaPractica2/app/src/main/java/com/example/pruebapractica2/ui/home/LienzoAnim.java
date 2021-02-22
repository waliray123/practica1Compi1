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
    private float [][] coorAnim;
    private float [][] coorAnimLin;
    private Canvas canvas;

    private List<graficar> graficos;
    private List<animar> animaciones;
    private int cont;
    private int numAnim;

    private float coorXF;
    private float coorYF;
    private float coorXI;
    private float coorYI;
    float sumX ;
    float sumY ;
    float acumX;
    float acumY;

    private int contVeces;

    public LienzoAnim(Context context, List<graficar> graficos, List<animar> animaciones) {
        super(context);
        coorAnim = new float[animaciones.size()][2];
        coorAnimLin = new float[animaciones.size()][2];
        this.graficos = graficos;
        this.animaciones = animaciones;
        this.cont = 0;
        this.numAnim = 0;
        llenarInitCoor();
        llenarInitCoorLin();
        this.contVeces = 0;
    }

    private void llenarInitCoor(){
        int cont1 = 0;
        for (animar anim : animaciones){
            this.coorAnim[cont1][0] = anim.getGraficoAnim().getPosx().floatValue();
            this.coorAnim[cont1][1] = anim.getGraficoAnim().getPosy().floatValue();
            cont1++;
        }
    }

    private void llenarInitCoorLin(){
        int cont1 = 0;
        for (animar anim : animaciones){
            if (anim.getGraficoAnim().getTipo().equalsIgnoreCase("linea")){
                this.coorAnimLin[cont1][0] = anim.getGraficoAnim().getIns3().floatValue();
                this.coorAnimLin[cont1][1] = anim.getGraficoAnim().getIns4().floatValue();
            }
            cont1++;
        }
    }


    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.canvas = canvas;


        canvas.drawColor(Color.WHITE);

        dibujar();
        dibujarAnim();




        animar animU = animaciones.get(numAnim);
        this.coorXF = animU.getDestinox().floatValue();
        this.coorYF = animU.getDestinoy().floatValue();
        this.coorXI = animU.getGraficoAnim().getPosx().floatValue();
        this.coorYI = animU.getGraficoAnim().getPosy().floatValue();
        float distX = coorXF-coorXI;
        float distY = coorYF-coorYI;
        String tipo = animU.getTipo();
        if (tipo.equals("linea")){
            this.sumX = distX/200;
            this.sumY = distY/200;
        }else{
            this.sumX = distX/200;
            this.sumY = distY/200;
            if (Math.abs(sumX) >= Math.abs(sumY)){
                if (contVeces <= 50){
                    this.sumX = distX/200;
                    this.sumY = distY/200-1;
                }else if(contVeces > 50 && contVeces <= 100){
                    this.sumX = distX/200;
                    this.sumY = distY/200+1;
                }else if(contVeces > 100 && contVeces <= 150){
                    this.sumX = distX/200;
                    this.sumY = distY/200+1;
                }else if(contVeces > 150 && contVeces <= 200){
                    this.sumX = distX/200;
                    this.sumY = distY/200-1;
                }
            }else{
                if (contVeces <= 50){
                    this.sumX = distX/200+1;
                    this.sumY = distY/200;
                }else if(contVeces > 50 && contVeces <= 100){
                    this.sumX = distX/200-1;
                    this.sumY = distY/200;
                }else if(contVeces > 100 && contVeces <= 150){
                    this.sumX = distX/200-1;
                    this.sumY = distY/200;
                }else if(contVeces > 150 && contVeces <= 200){
                    this.sumX = distX/200+1;
                    this.sumY = distY/200;
                }
            }

        }


        //coorAnim [i][0] es coordenada en x
        coorAnim[numAnim][0] += sumX;
        coorAnimLin[numAnim][0] += sumX;
        //coorAnim [i][1] es coordenada en y
        coorAnim[numAnim][1] += sumY;
        coorAnimLin[numAnim][1] += sumY;

        if (coorAnim[numAnim][0] == coorXF && coorAnim[numAnim][1] == coorYF ||contVeces>201){
            numAnim++;
            cont++;
            contVeces = 0;
        }
        contVeces++;

        if (cont<animaciones.size()){
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
        int cont2 = 0;
        for (animar anim : animaciones){

            graficar grafico = anim.getGraficoAnim();
            String tipo = grafico.getTipo();
            if (tipo.equalsIgnoreCase("circulo")){
                canvas.drawCircle(coorAnim[cont2][0],coorAnim[cont2][1],grafico.getIns3().floatValue(),getPincel(grafico.getColor()));
            }else if(tipo.equalsIgnoreCase("linea")){
                Paint pincel = new Paint();
                pincel = getPincel(grafico.getColor());
                pincel.setStrokeWidth(10);

                canvas.drawLine(coorAnim[cont2][0],coorAnim[cont2][1],
                        coorAnimLin[cont2][0],coorAnimLin[cont2][1],pincel);
            }else if(tipo.equalsIgnoreCase("cuadrado")){
                canvas.drawRect(coorAnim[cont2][0],coorAnim[cont2][1],
                        (grafico.getIns3().floatValue()+coorAnim[cont2][0]),
                        grafico.getIns3().floatValue()+coorAnim[cont2][1],
                        getPincel(grafico.getColor()));
            }else if(tipo.equalsIgnoreCase("rectangulo")){
                canvas.drawRect(coorAnim[cont2][0],coorAnim[cont2][1],
                        (grafico.getIns4().floatValue()+coorAnim[cont2][0]),
                        grafico.getIns3().floatValue()+coorAnim[cont2][1],
                        getPincel(grafico.getColor()));
            }
            else if(tipo.equalsIgnoreCase("poligono")){
                Paint pincel = getPincel(grafico.getColor());
                ColorFilter filter = getColorPaint(grafico.getColor());
                pincel.setColorFilter(filter);
                Bitmap bitmap = getPathPol(grafico.getIns5().intValue());
                Bitmap polR = Bitmap.createScaledBitmap(bitmap,grafico.getIns4().intValue(),grafico.getIns3().intValue(),true);

                canvas.drawBitmap(polR,coorAnim[cont2][0],coorAnim[cont2][1],pincel);
            }
            cont2++;
        }
    }


    private void dibujar(){
        //Paint pincel = new Paint();
        //pincel = getPincel("morado");
        //this.canvas.drawCircle(100,100,50,pincel);
        for (graficar grafico : graficos){
            boolean isAnim = false;
            for (animar anim : animaciones){
                int codigoAnim = anim.getCodigoGrafico();
                if (codigoAnim == grafico.getCodigo()){
                    isAnim = true;
                    break;
                }
            }
            if (isAnim == false){
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
