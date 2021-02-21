package com.example.pruebapractica2.ui.objetosU;

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
import com.example.pruebapractica2.objetos.graficar;

import java.util.ArrayList;
import java.util.List;

public class objetos extends Fragment {

    private ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ResultadosCom activity = (ResultadosCom) getActivity();
        String myDataFromActivity = activity.getStringHello();


        View root = inflater.inflate(R.layout.fragment_objetos, container, false);

        List<coloresU> graficos;
        graficos = new ArrayList<>();
        graficos = activity.getGraficosUSAR();

        /*coloresU op1 = new coloresU("Circulo","5");
        coloresU op2 = new coloresU("Linea","1");

        graficos.add(op1);
        graficos.add(op2);*/

        adaptadorColores adapter =  new adaptadorColores(activity,R.layout.layout_doscolm,graficos);
        listView = (ListView) root.findViewById(R.id.listView);
        listView.setAdapter(adapter);

        return root;
    }
}