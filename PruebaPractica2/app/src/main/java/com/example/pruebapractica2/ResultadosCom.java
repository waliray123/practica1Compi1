package com.example.pruebapractica2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;

import com.example.pruebapractica2.objetos.ErrorCom;
import com.example.pruebapractica2.objetos.animar;
import com.example.pruebapractica2.objetos.coloresU;
import com.example.pruebapractica2.objetos.graficar;
import com.example.pruebapractica2.objetos.operacion;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class ResultadosCom extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private String myString = "hello";

    private List<graficar> graficos;
    private List<animar> animaciones;
    private List<operacion> operaciones;

    private List<coloresU> graficosUSAR;
    private List<coloresU> animacionesUSAR;
    private List<coloresU> coloresUSAR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados_com);

        graficos = new ArrayList<>();
        animaciones = new ArrayList<>();
        operaciones = new ArrayList<>();

        Intent i = getIntent();
        graficos = (List<graficar>) i.getSerializableExtra("LISTAG");
        animaciones = (List<animar>) i.getSerializableExtra("LISTAA");
        operaciones = (List<operacion>) i.getSerializableExtra("LISTAO");

        crearReportes();

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        /*
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
         */
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow,R.id.nav_colores,R.id.nav_objetos,R.id.nav_animaciones)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.resultados_com, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    public String getStringHello(){
        return myString;
    }

    private void crearReportes(){
        creadorListas creadorL = new creadorListas(this.graficos,this.animaciones);
        this.graficosUSAR = creadorL.getGraficosUSAR();
        this.animacionesUSAR = creadorL.getAnimacionesUSAR();
        this.coloresUSAR = creadorL.getColoresUSAR();
    }

    public List<coloresU> getGraficosUSAR() {
        return graficosUSAR;
    }

    public List<coloresU> getAnimacionesUSAR() {
        return animacionesUSAR;
    }

    public List<coloresU> getColoresUSAR() {
        return coloresUSAR;
    }

    public List<operacion> getOperaciones() {
        return operaciones;
    }

    public List<graficar> getGraficos() {
        return graficos;
    }

    public List<animar> getAnimaciones() {
        return animaciones;
    }
}