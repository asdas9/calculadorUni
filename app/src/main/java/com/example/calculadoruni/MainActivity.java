package com.example.calculadoruni;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Se instancian los objetos de la vista

    public Button btnSuma;
    public Button btnResta;
    public Button btnMutiplica;
    public Button btnDivide;
    private TextView respuesta;
    private EditText numeroUno;
    private EditText numeroDos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Se instancian los botones de la vista
        btnSuma = findViewById(R.id.button_suma);
        btnResta = findViewById(R.id.button_resta);
        btnMutiplica = findViewById(R.id.button_multiplica);
        btnDivide = findViewById(R.id.button_division);


        // Se instancia la respuesta de la vista
        respuesta = findViewById(R.id.respuesta);

//      // Se instancia los inputs de la vista
        numeroUno = findViewById(R.id.numero1);
        numeroDos = findViewById(R.id.numero2);



        //Se asigna los eventos a los botones


        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                respuesta.setText(suma(Integer.parseInt(numeroUno.getText().toString()),
                        Integer.parseInt(numeroDos.getText().toString()))+"");
            }
        });

        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                respuesta.setText(resta(Integer.parseInt(numeroUno.getText().toString()),
                        Integer.parseInt(numeroDos.getText().toString()))+"");
            }
        });

        btnMutiplica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                respuesta.setText(multiplicacion(Integer.parseInt(numeroUno.getText().toString()),
                        Integer.parseInt(numeroDos.getText().toString()))+"");
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                respuesta.setText(division(Integer.parseInt(numeroUno.getText().toString()),
                        Integer.parseInt(numeroDos.getText().toString()))+"");
            }
        });
    }

    public Integer suma (int a, int b){
        return a+b;
    }

    public Integer resta (int a, int b){
        return a-b;
    }

    public Integer multiplicacion (int a, int b){
        return a*b;
    }

    public double division (int a, int b){
        int respuesta = 0;

        if (b!=0){
            respuesta=a/b;
        }

        return respuesta;
    }

}