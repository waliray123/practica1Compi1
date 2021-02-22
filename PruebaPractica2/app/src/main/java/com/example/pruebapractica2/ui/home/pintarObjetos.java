package com.example.pruebapractica2.ui.home;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.SurfaceView;

import com.example.pruebapractica2.objetos.animar;
import com.example.pruebapractica2.objetos.graficar;

import java.util.List;

public class pintarObjetos extends SurfaceView implements Runnable {

    private List<animar> animaciones;
    private List<graficar> graficos;

    public int [][] coorAnim;
    private Canvas canvas;

    public pintarObjetos(Context context, List<animar> animaciones, List<graficar> graficos) {
        super(context);
        this.animaciones = animaciones;
        this.graficos = graficos;
        coorAnim = new int[1][2];
        coorAnim[0][0] = 50;
        coorAnim[0][1] = 50;
    }



    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.canvas = canvas;

        canvas.drawColor(Color.WHITE);

        Paint pincel1 = new Paint();
        pincel1.setColor(Color.GREEN);
        pincel1.setStyle(Paint.Style.FILL);


        coorAnim[0][0] += 1;
        coorAnim[0][1] += 1;
        this.canvas.drawCircle(coorAnim[0][0],coorAnim[0][1],50,pincel1);

    }



    @Override
    public void run() {

    }
}
