package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Pregunta3 extends AppCompatActivity implements View.OnClickListener {
    Button verdadero,falso,sig;
    int calificacion = 0;
    Intent i, recibe;
    Bundle nomas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pregunta3);
        i=new Intent(Pregunta3.this,Pregunta4.class);
        verdadero = (Button) findViewById(R.id.btn1_verdadero3);
        falso = (Button) findViewById(R.id.btn_false3);
        sig = (Button) findViewById(R.id.btn_sig3);
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
            case R.id.btn1_verdadero3:
                calificacion += 0;
                deshabilitar();
                break;

            case R.id.btn_false3:
                calificacion += 1;
                deshabilitar();
                break;

            case  R.id.btn_sig3:
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