package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button salirA;
    Button prueba;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        salirA= (Button)findViewById(R.id.btn_salirA);
        salirA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent salirA= new Intent(MainActivity.this, inicio.class);
                startActivity(salirA);
            }
        });

        prueba= (Button)findViewById(R.id.btn_prueba1);
        prueba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent prueba= new Intent(MainActivity.this, Pregunta1.class);
                startActivity(prueba);
            }
        });

    }
}