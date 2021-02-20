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

        ErrorCom error1 = new ErrorCom("Lexico","No se encuentra en el lenguaje","1","20","$");
        ErrorCom error2 = new ErrorCom("Lexico","No se encuentra en el lenguaje2","2","22","@");
        ErrorCom error3 = new ErrorCom("Lexico","No se encuentra en el lenguaje3","3","23","#");
        ErrorCom error4 = new ErrorCom("Lexico","No se encuentra en el lenguaje4","4","24","$");
        ErrorCom error5 = new ErrorCom("Lexico","No se encuentra en el lenguaje5","5","25","%");

        erroresLista.add(error1);
        erroresLista.add(error2);
        erroresLista.add(error3);
        erroresLista.add(error4);
        erroresLista.add(error5);

        adaptador5Col adapter =  new adaptador5Col(this,R.layout.activity_reportes,erroresLista);
        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }
}