package com.canete.casadb2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;


public class CasaDetalles extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_casa_detalles);


        EditText txtCalle = findViewById(R.id.txtCalle);
        EditText txtNCasa = findViewById(R.id.txtNCasa);
        EditText txtSuperficie = findViewById(R.id.txtSuperficie);








    }
}