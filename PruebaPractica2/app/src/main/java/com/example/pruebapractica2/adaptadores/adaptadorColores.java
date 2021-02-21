package com.example.pruebapractica2.adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.pruebapractica2.R;
import com.example.pruebapractica2.objetos.coloresU;
import com.example.pruebapractica2.objetos.operacion;

import java.util.List;

public class adaptadorColores extends ArrayAdapter<coloresU> {

    private LayoutInflater mInflater;
    private List<coloresU> colores;
    private int mViewResourceId;

    public adaptadorColores(Context context, int textViewResourceId, List<coloresU> colores) {
        super(context, textViewResourceId, colores);
        this.colores = colores;
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mViewResourceId = textViewResourceId;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = mInflater.inflate(mViewResourceId, null);

        coloresU error = colores.get(position);

        if (error != null) {
            TextView color = (TextView) convertView.findViewById(R.id.col1);
            TextView cant = (TextView) convertView.findViewById(R.id.col2);
            if (color != null) {
                color.setText(error.getColor());
            }
            if (cant != null) {
                cant.setText((error.getCantUsos()));
            }
        }

        return convertView;
    }


}
