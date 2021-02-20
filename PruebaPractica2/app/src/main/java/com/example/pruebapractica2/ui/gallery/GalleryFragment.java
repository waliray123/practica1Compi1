package com.example.pruebapractica2.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.pruebapractica2.R;
import com.example.pruebapractica2.ResultadosCom;
import com.example.pruebapractica2.adaptadores.adaptador5Col;
import com.example.pruebapractica2.adaptadores.adaptadorOcurrencias;
import com.example.pruebapractica2.objetos.ErrorCom;
import com.example.pruebapractica2.objetos.operacion;
import com.example.pruebapractica2.ui.home.HomeViewModel;

import java.util.ArrayList;
import java.util.List;

public class GalleryFragment extends Fragment {

    private GalleryViewModel galleryViewModel;
    private ListView listView;
    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ResultadosCom activity = (ResultadosCom) getActivity();
        String myDataFromActivity = activity.getStringHello();


        galleryViewModel = new ViewModelProvider(this).get(GalleryViewModel.class);

        View root = inflater.inflate(R.layout.fragment_gallery, container, false);

        List<operacion> operaciones;
        operaciones = new ArrayList<>();
        operacion op1 = new operacion("MULT","2*5","1","20");
        operacion op2 = new operacion("MULT","54*7","2","22");

        operaciones.add(op1);
        operaciones.add(op2);

        adaptadorOcurrencias adapter =  new adaptadorOcurrencias(activity,R.layout.layout_operaciones,operaciones);
        listView = (ListView) root.findViewById(R.id.listView);;
        listView.setAdapter(adapter);

        return root;
    }
}