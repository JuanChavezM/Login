package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Terminar_Evaluacion extends AppCompatActivity {

    Button salir_Eva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.terminar__evaluacion);

        salir_Eva= (Button)findViewById(R.id.btn_s);
        salir_Eva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent salir_Eva= new Intent(Terminar_Evaluacion.this, MainActivity.class);
                startActivity(salir_Eva);
            }
        });


    }
}