package com.example.pruebapractica2.adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.pruebapractica2.R;
import com.example.pruebapractica2.objetos.ErrorCom;
import com.example.pruebapractica2.objetos.operacion;

import java.util.List;

public class adaptadorOcurrencias extends ArrayAdapter<operacion> {

    private LayoutInflater mInflater;
    private List<operacion> operaciones;
    private int mViewResourceId;

    public adaptadorOcurrencias(Context context, int textViewResourceId, List<operacion> operaciones) {
        super(context, textViewResourceId, operaciones);
        this.operaciones = operaciones;
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mViewResourceId = textViewResourceId;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = mInflater.inflate(mViewResourceId, null);

        operacion error = operaciones.get(position);

        if (error != null) {
            TextView operador = (TextView) convertView.findViewById(R.id.operador);
            TextView linea = (TextView) convertView.findViewById(R.id.linea);
            TextView columna = (TextView) convertView.findViewById(R.id.columna);
            TextView ocurrencia = (TextView) convertView.findViewById(R.id.ocurrencia);
            if (operador != null) {
                operador.setText(error.getOper());
            }
            if (linea != null) {
                linea.setText((error.getLinea()));
            }
            if (columna != null) {
                columna.setText((error.getColumna()));
            }
            if (ocurrencia != null) {
                ocurrencia.setText((error.getTipo()));
            }
        }

        return convertView;
    }
}
