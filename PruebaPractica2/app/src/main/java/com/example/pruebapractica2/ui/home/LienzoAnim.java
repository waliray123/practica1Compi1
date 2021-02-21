package com.example.pruebapractica2.ui.home;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class LienzoAnim extends View {
    private int [][] coorAnim;
    private Canvas canvas;

    public LienzoAnim(Context context) {
        super(context);
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

        //this.canvas.drawCircle(100,100,50,pincel1);

        invalidate();

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

    public Canvas getCanvas() {
        return canvas;
    }

    public int[][] getCoorAnim() {
        return coorAnim;
    }
}
