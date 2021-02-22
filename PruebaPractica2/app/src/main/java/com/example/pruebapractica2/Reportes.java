package com.example.pruebapractica2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import com.example.pruebapractica2.adaptadores.adaptador5Col;
import com.example.pruebapractica2.objetos.ErrorCom;

import java.util.ArrayList;
import java.util.List;

public class Reportes extends AppCompatActivity {

    List<ErrorCom> erroresLista;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.viewcontents_layout);

        setContentView(R.layout.activity_lista_errores);

        erroresLista = new ArrayList<>();

        Intent i = getIntent();
        erroresLista = (List<ErrorCom>) i.getSerializableExtra("LISTA");

        adaptador5Col adapter =  new adaptador5Col(this,R.layout.activity_reportes,erroresLista);
        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }
}