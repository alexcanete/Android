package com.canete.componentes;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton btnFloat = findViewById(R.id.btnFloat);

        btnFloat.setOnClickListener(v -> {
            Toast.makeText(this, "Añadir", Toast.LENGTH_LONG).show();
        });
    }
}