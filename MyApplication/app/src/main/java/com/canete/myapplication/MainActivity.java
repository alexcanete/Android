package com.canete.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText txtContenido = findViewById(R.id.txtContenido);
        Button btnDoble = findViewById(R.id.btnDoble);
        Button btnTriple = findViewById(R.id.btnTriple);

        TextView lblResultado = findViewById(R.id.lblResultado);


        //eventos

        btnDoble.setOnClickListener(v -> {
            String texto =txtContenido.getText().toString();
            if(texto.length()== 0){
                Toast.makeText(this,"Introduce un numero",Toast.LENGTH_LONG).show();
            }else{
                Integer resutado = Integer.parseInt(texto);
                resutado = resutado*2;
                String sNumero = resutado + "";
                lblResultado.setText("" + resutado);
            }
        });
        btnTriple.setOnClickListener((View.OnClickListener) v -> {
            String texto =txtContenido.getText().toString();
            if(texto.length()== 0){
                Toast.makeText(this,"Introduce un numero",Toast.LENGTH_LONG).show();
            }else{
                Integer resutado = Integer.parseInt(texto);
                resutado = resutado*3;
                String sNumero = resutado + "";
                lblResultado.setText("" + resutado);
            }
        });
    }
}