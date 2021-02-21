package com.example.pruebapractica2.adaptadores;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.pruebapractica2.R;
import com.example.pruebapractica2.objetos.ErrorCom;

import java.util.List;

public class adaptador5Col extends ArrayAdapter<ErrorCom>{

    private LayoutInflater mInflater;
    private List<ErrorCom> errores;
    private int mViewResourceId;

    public adaptador5Col(Context context, int textViewResourceId, List<ErrorCom> errors) {
        super(context, textViewResourceId, errors);
        this.errores = errors;
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mViewResourceId = textViewResourceId;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = mInflater.inflate(mViewResourceId, null);

        ErrorCom error = errores.get(position);

        if (error != null) {
            TextView lexema = (TextView) convertView.findViewById(R.id.lexema);
            TextView linea = (TextView) convertView.findViewById(R.id.linea);
            TextView columna = (TextView) convertView.findViewById(R.id.columna);
            TextView tipo = (TextView) convertView.findViewById(R.id.tipo);
            TextView descripcion = (TextView) convertView.findViewById(R.id.descripcion);
            if (lexema != null) {
                lexema.setText(error.getLex());
            }
            if (linea != null) {
                linea.setText((error.getLin()));
            }
            if (columna != null) {
                columna.setText((error.getCol()));
            }
            if (tipo != null) {
                tipo.setText((error.getTipo()));
            }
            if (descripcion != null) {
                descripcion.setText((error.getDesc()));
            }
        }

        return convertView;
    }
}
