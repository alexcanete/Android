package com.canete.casacondb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnAnadir = findViewById(R.id.btnAnadir);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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


        adaptador.setOnClickListener(view ->{
            Store.ArticuloSelected = recyclerview.getChildAdapterPosition(view);
            Intent i = new Intent(this, CasaDetalles.class);
            startActivity(i);
            Toast.makeText(this, "Item " + Store.ArticuloSelected, Toast.LENGTH_SHORT).show();
        });

    }

    private void anadir(){

    }


}