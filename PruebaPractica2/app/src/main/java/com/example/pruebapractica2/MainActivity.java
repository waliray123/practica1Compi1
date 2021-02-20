package com.example.pruebapractica2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.pruebapractica2.analizadores.Lexer;
import com.example.pruebapractica2.analizadores.Parser;
import com.example.pruebapractica2.objetos.ErrorCom;
import com.example.pruebapractica2.ui.Resultado;

import java.io.Serializable;
import java.io.StringReader;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MainActivity extends AppCompatActivity {

    private EditText editEntrada;
    private Button ingresarButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editEntrada = findViewById(R.id.editTextEntrada);
        ingresarButton = findViewById(R.id.compilarButton);




        ingresarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Intent intent = new Intent (v.getContext(), listaErrores.class);
               // startActivityForResult(intent, 0);
                //Intent intent = new Intent (v.getContext(), Reportes.class);
                //Intent intent = new Intent (v.getContext(), listaErrores.class);
                //startActivityForResult(intent, 0);


                try {
                    /*codigo de compilacion*/
                    String entrada = editEntrada.getText().toString();
                    StringReader reader = new StringReader(entrada);

                    Lexer lexico = new Lexer(reader);
                    Parser parser = new Parser(lexico);
                    //traer una lista de datos y luego mandarlos a la siguiente ventana
                    parser.parse();

                    List<ErrorCom> errores = new ArrayList<>();
                    errores = parser.getErroresCom();


                    //desplegarResultado(parser.getClavesList());

                    if (errores.size() != 0){
                        desplegarErrores(errores);
                    }else{
                        desplegarResultado();
                    }


                } catch (NoSuchAlgorithmException e) { //error en onclick
                    e.printStackTrace();
                } catch (Exception ex) { //error en parser
                    System.out.println("Error irrecuperable");
                    Logger.getLogger(MainActivity.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });

    }

    public void desplegarErrores(List<ErrorCom> listaDeErrores){

        Intent intent = new Intent (this, Reportes.class);

        intent.putExtra("LISTA",(Serializable) listaDeErrores);

        //Intent intent = new Intent (v.getContext(), listaErrores.class);
        startActivityForResult(intent, 0);

    }

    public void desplegarResultado(){
        Intent intent = new Intent (this, ResultadosCom.class);
        startActivityForResult(intent, 0);
    }

}