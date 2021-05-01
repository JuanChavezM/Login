package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class inicio extends AppCompatActivity {
 Button almuno;
 Button maestro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        almuno= (Button)findViewById(R.id.btn_alumno);
        maestro= (Button)findViewById(R.id.btn_maestro);

        almuno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent alumno= new Intent(inicio.this, login.class);
                startActivity(alumno);
            }
        });
        maestro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent maestro= new Intent(inicio.this, login_maesto.class);
                startActivity(maestro);
            }
        });
    }
}