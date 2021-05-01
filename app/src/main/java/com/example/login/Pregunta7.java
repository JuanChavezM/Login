package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Pregunta7 extends AppCompatActivity implements View.OnClickListener {

    Button verdadero,falso,sig;
    int calificacion = 0;
    Intent i, recibe;
    Bundle nomas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pregunta7);
        i=new Intent(Pregunta7.this,Pregunta8.class);
        verdadero = (Button) findViewById(R.id.btn1_verdadero7);
        falso = (Button) findViewById(R.id.btn_false7);
        sig = (Button) findViewById(R.id.btn_sig7);
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
            case R.id.btn1_verdadero7:
                calificacion += 1;
                deshabilitar();
                break;

            case R.id.btn_false7:
                calificacion += 0;
                deshabilitar();
                break;

            case  R.id.btn_sig7:
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