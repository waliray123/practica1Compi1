package com.example.pruebapractica2.ui.colores;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.pruebapractica2.R;
import com.example.pruebapractica2.ResultadosCom;
import com.example.pruebapractica2.adaptadores.adaptadorColores;
import com.example.pruebapractica2.objetos.coloresU;
import com.example.pruebapractica2.objetos.operacion;

import java.util.ArrayList;
import java.util.List;


public class colores extends Fragment {

    private ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ResultadosCom activity = (ResultadosCom) getActivity();
        String myDataFromActivity = activity.getStringHello();


        View root = inflater.inflate(R.layout.fragment_colores, container, false);

        List<coloresU> colores;
        colores = new ArrayList<>();
        coloresU op1 = new coloresU("Rojo","10");
        coloresU op2 = new coloresU("Verde","20");

        colores.add(op1);
        colores.add(op2);

        adaptadorColores adapter =  new adaptadorColores(activity,R.layout.layout_doscolm,colores);
        listView = (ListView) root.findViewById(R.id.listView);;
        listView.setAdapter(adapter);

        return root;
    }
}