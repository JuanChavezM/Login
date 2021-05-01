package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Pregunta4 extends AppCompatActivity implements View.OnClickListener {

    Button verdadero,falso,sig;
    int calificacion = 0;
    Intent i, recibe;
    Bundle nomas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pregunta4);
        i=new Intent(Pregunta4.this,Pregunta5.class);
        verdadero = (Button) findViewById(R.id.btn1_verdadero4);
        falso = (Button) findViewById(R.id.btn_false4);
        sig = (Button) findViewById(R.id.btn_sig4);
        try {
            recibe = getIntent();
            nomas = recibe.getExtras();
            calificacion = nomas.getInt("calificacion");
        } catch (Exception e){
            Toast.makeText(this,"Error al recibir datos",Toast.LENGTH_SHORT).show();
        }

        verdadero.setOnClickListener(this);
        falso.setOnClickListener(this);
        sig.setOnClickListener(this);
        sig.setEnabled(false);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1_verdadero4:
                calificacion += 1;
                deshabilitar();
                break;

            case R.id.btn_false4:
                calificacion += 0;
                deshabilitar();
                break;

            case  R.id.btn_sig4:
                startActivity(i);
                break;

            default:
                break;
        }
        i.putExtra("calificacion",calificacion);
    }

    public void deshabilitar(){
        verdadero.setBackgroundColor(Color.GREEN);
        falso.setBackgroundColor(Color.RED);
        verdadero.setEnabled(false);
        falso.setEnabled(false);
        sig.setEnabled(true);
    }
}