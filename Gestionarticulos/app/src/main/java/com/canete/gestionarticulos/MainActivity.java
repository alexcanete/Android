package com.canete.gestionarticulos;

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
        Store.lstArticulo.add(new Articulo("Tornillo",  25.0, 100));
        Store.lstArticulo.add(new Articulo("Tornillo2",  26.0, 110));
        Store.lstArticulo.add(new Articulo("Tornillo3",  27.0, 120));
        Store.lstArticulo.add(new Articulo("Tornillo4",  28.0, 130));
        Store.lstArticulo.add(new Articulo("Tornillo5",  29.0, 140));
        Store.lstArticulo.add(new Articulo("Tornillo",  25.0, 100));
        Store.lstArticulo.add(new Articulo("Tornillo2",  26.0, 110));
        Store.lstArticulo.add(new Articulo("Tornillo3",  27.0, 120));
        Store.lstArticulo.add(new Articulo("Tornillo4",  28.0, 130));
        Store.lstArticulo.add(new Articulo("Tornillo5",  29.0, 140));
        Store.lstArticulo.add(new Articulo("Tornillo",  25.0, 100));
        Store.lstArticulo.add(new Articulo("Tornillo2",  26.0, 110));
        Store.lstArticulo.add(new Articulo("Tornillo3",  27.0, 120));
        Store.lstArticulo.add(new Articulo("Tornillo4",  28.0, 130));
        Store.lstArticulo.add(new Articulo("Tornillo5",  29.0, 140));
        Store.lstArticulo.add(new Articulo("Tornillo",  25.0, 100));
        Store.lstArticulo.add(new Articulo("Tornillo2",  26.0, 110));
        Store.lstArticulo.add(new Articulo("Tornillo3",  27.0, 120));
        Store.lstArticulo.add(new Articulo("Tornillo4",  28.0, 130));
        Store.lstArticulo.add(new Articulo("Tornillo5",  29.0, 140));
        Store.lstArticulo.add(new Articulo("Tornillo",  25.0, 100));
        Store.lstArticulo.add(new Articulo("Tornillo2",  26.0, 110));
        Store.lstArticulo.add(new Articulo("Tornillo3",  27.0, 120));
        Store.lstArticulo.add(new Articulo("Tornillo4",  28.0, 130));
        Store.lstArticulo.add(new Articulo("Tornillo5",  29.0, 140));
        Store.lstArticulo.add(new Articulo("Tornillo",  25.0, 100));
        Store.lstArticulo.add(new Articulo("Tornillo2",  26.0, 110));
        Store.lstArticulo.add(new Articulo("Tornillo3",  27.0, 120));
        Store.lstArticulo.add(new Articulo("Tornillo4",  28.0, 130));
        Store.lstArticulo.add(new Articulo("Tornillo5",  29.0, 140));
        Store.lstArticulo.add(new Articulo("Tornillo",  25.0, 100));
        Store.lstArticulo.add(new Articulo("Tornillo2",  26.0, 110));
        Store.lstArticulo.add(new Articulo("Tornillo3",  27.0, 120));
        Store.lstArticulo.add(new Articulo("Tornillo4",  28.0, 130));
        Store.lstArticulo.add(new Articulo("Tornillo5",  29.0, 140));
        Store.lstArticulo.add(new Articulo("Tornillo",  25.0, 100));
        Store.lstArticulo.add(new Articulo("Tornillo2",  26.0, 110));
        Store.lstArticulo.add(new Articulo("Tornillo3",  27.0, 120));
        Store.lstArticulo.add(new Articulo("Tornillo4",  28.0, 130));
        Store.lstArticulo.add(new Articulo("Tornillo5",  29.0, 140));
        Store.lstArticulo.add(new Articulo("Tornillo",  25.0, 100));
        Store.lstArticulo.add(new Articulo("Tornillo2",  26.0, 110));
        Store.lstArticulo.add(new Articulo("Tornillo3",  27.0, 120));
        Store.lstArticulo.add(new Articulo("Tornillo4",  28.0, 130));
        Store.lstArticulo.add(new Articulo("Tornillo5",  29.0, 140));
        Store.lstArticulo.add(new Articulo("Tornillo",  25.0, 100));
        Store.lstArticulo.add(new Articulo("Tornillo2",  26.0, 110));
        Store.lstArticulo.add(new Articulo("Tornillo3",  27.0, 120));
        Store.lstArticulo.add(new Articulo("Tornillo4",  28.0, 130));
        Store.lstArticulo.add(new Articulo("Tornillo5",  29.0, 140));

    }
    private void mostrarData() {
        RecyclerView recyclerview = findViewById(R.id.rvArticulo);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));

        ArticuloAdapter adaptador = new ArticuloAdapter(this);
        recyclerview.setAdapter(adaptador);


        adaptador.setOnClickListener(view ->{
            Store.ArticuloSelected = recyclerview.getChildAdapterPosition(view);
            Intent i = new Intent(this, artDetalles.class);
            startActivity(i);
            Toast.makeText(this, "Item " + Store.ArticuloSelected, Toast.LENGTH_SHORT).show();
        });
    }


}