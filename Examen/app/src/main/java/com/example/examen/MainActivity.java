package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        cargarData();
        mostrarData();

    }

    private void cargarData() {
        Store.lstContacto.add(new Contacto("Alejandro",  "Cañete", 654764583));
        Store.lstContacto.add(new Contacto("Irene",  "Hajiphylakti", 667323919));


    }


    private void mostrarData() {
        RecyclerView recyclerview = findViewById(R.id.rvContacto);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));

        ContactoAdapter adaptador = new ContactoAdapter(this);
        recyclerview.setAdapter(adaptador);


        adaptador.setOnClickListener(view ->{
            Store.ContactoSelected = recyclerview.getChildAdapterPosition(view);
            Intent i = new Intent(this, ContactoDetalles.class);
            startActivity(i);
            Toast.makeText(this, "Item " + Store.ContactoSelected, Toast.LENGTH_SHORT).show();
        });

    }


}