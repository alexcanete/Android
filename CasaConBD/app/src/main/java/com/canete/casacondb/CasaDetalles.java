package com.canete.casacondb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class CasaDetalles extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_casa_detalles);


        TextView lblDetNombre = findViewById(R.id.lblDetNombre);
        TextView lblId = findViewById(R.id.lblId);


        lblDetNombre.setText(Ciudad.lstArticulo.get(Ciudad.ArticuloSelected).getNombre());
        lblId.setText("" + Ciudad.ArticuloSelected);




    }
}