package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pregunta1 extends AppCompatActivity implements View.OnClickListener {

    Button verdadero,falso,sig;
    int calificacion = 0;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pregunta1);
        i=new Intent(Pregunta1.this,Pregunta2.class);
        verdadero = (Button) findViewById(R.id.btn_verdadero);
        falso = (Button) findViewById(R.id.btn_false);
        sig = (Button) findViewById(R.id.btn_sig1);
        verdadero.setOnClickListener(this);
        falso.setOnClickListener(this);
        sig.setOnClickListener(this);
        sig.setEnabled(false);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_verdadero:
                calificacion = 0;
                deshabilitar();
                break;

            case R.id.btn_false:
                calificacion = 1;
                deshabilitar();
                break;

            case  R.id.btn_sig1:
                startActivity(i);
                break;

            default:
                break;
        }
        i.putExtra("calificacion",calificacion);
    }

    public void deshabilitar(){
        verdadero.setBackgroundColor(Color.RED);
        falso.setBackgroundColor(Color.GREEN);
        verdadero.setEnabled(false);
        falso.setEnabled(false);
        sig.setEnabled(true);
    }


}