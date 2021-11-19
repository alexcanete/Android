package com.canete.casadb2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton btnAnadir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAnadir = findViewById(R.id.btnAnadir);

        cargarData();
        mostrarData();



    }

    private void cargarData() {
        Store.lstCasas.add(new Casa("calleFalsa",  25, 100.6));
        Store.lstCasas.add(new Casa("calleFalsa2",  251, 24.2));


    }
    private void mostrarData() {
        RecyclerView recyclerview = findViewById(R.id.rvArticulo);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));

        CasaAdapter adaptador = new CasaAdapter(this);
        recyclerview.setAdapter(adaptador);


        adaptador.setOnClickListener(l ->{
            Store.CasaSelected = recyclerview.getChildAdapterPosition(l);
            Intent i = new Intent(this, CasaDetalles.class);
            startActivity(i);
        });

    }
}