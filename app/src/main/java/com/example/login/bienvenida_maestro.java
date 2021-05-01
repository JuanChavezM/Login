package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class bienvenida_maestro extends AppCompatActivity {
    Button salirM;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenida_maestro);

        salirM= (Button)findViewById(R.id.btn_salirM);
        salirM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent salirM= new Intent(bienvenida_maestro.this, inicio.class);
                startActivity(salirM);
            }
        });
    }
}