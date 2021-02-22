package com.example.pruebapractica2.ui.home;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.pruebapractica2.R;
import com.example.pruebapractica2.ResultadosCom;
import com.example.pruebapractica2.adaptadores.adaptadorOcurrencias;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public HomeFragment() {
       // ResultadosCom activity = (ResultadosCom) getActivity();
        //activity.setContentView(R.layout.fragment_home);
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ResultadosCom activity = (ResultadosCom) getActivity();

        View root = inflater.inflate(R.layout.fragment_home, container, false);

        Lienzo adapter =  new Lienzo(activity,activity.getGraficos(),activity.getAnimaciones());
        ConstraintLayout layout1 = (ConstraintLayout) root.findViewById(R.id.capadisenio);
        layout1.addView(adapter);

        Button boton = root.findViewById(R.id.buttonPlay);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (activity.getAnimaciones().size() == 0){
                    Snackbar.make(view, "No hay animaciones", Snackbar.LENGTH_LONG).setAction("Action", null).show();
                }else{
                    Snackbar.make(view, "Se esta animando", Snackbar.LENGTH_LONG).setAction("Action", null).show();
                    LienzoAnim adapter2 =  new LienzoAnim(activity,activity.getGraficos(),activity.getAnimaciones());
                    layout1.addView(adapter2);
                }
            }
        });

        return root;
    }





}