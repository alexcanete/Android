package com.canete.gestionarticulos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class artDetalles extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_art_detalles);


        TextView lblDetNombre = findViewById(R.id.lblDetNombre);
        TextView lblId = findViewById(R.id.lblId);


        lblDetNombre.setText(Store.lstArticulo.get(Store.ArticuloSelected).getNombre());
        lblId.setText("" + Store.ArticuloSelected);




    }
}