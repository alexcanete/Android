package com.canete.personas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cargarData();
        mostrarData();
    }
    private void cargarData() {
        Gente.lstPersonas.add(new Persona("Pedro López; José", 1, 1, 4.5));
    }
    private void mostrarData() {

    }


}