package com.canete.casacondb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CasaDetalles extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_casa_detalles);


        EditText txtCalle = findViewById(R.id.txtCalle);


        lblDetNombre.setText(Store.lstCasas.get(Store.ArticuloSelected).getCalle());
        lblId.setText("" + Store.ArticuloSelected);




    }
}