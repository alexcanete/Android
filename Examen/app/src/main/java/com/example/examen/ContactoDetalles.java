package com.example.examen;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class ContactoDetalles extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto_detalles);


        EditText txtNombre = findViewById(R.id.txtNombre);
        EditText txtApellido = findViewById(R.id.txtApellido);
        EditText txtNumero = findViewById(R.id.txtNumero);




    }
}
