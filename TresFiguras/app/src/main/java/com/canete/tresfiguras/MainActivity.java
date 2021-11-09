package com.canete.tresfiguras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnCubo).setOnClickListener(v-> {
            Intent ventana = new Intent(MainActivity.this, ActivityCubo.class);
            startActivity(ventana);
        });


        findViewById(R.id.btnEsfera).setOnClickListener(v-> {
            Intent ventana = new Intent(MainActivity.this, ActivityEsfera.class);
            startActivity(ventana);
        });

        findViewById(R.id.btnCilindro).setOnClickListener(v-> {
            Intent ventana = new Intent(MainActivity.this, ActivityCilindro.class);
            startActivity(ventana);
        });
    }
}