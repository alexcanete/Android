package com.canete.botonesinvisibles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.concurrent.atomic.AtomicReference;
import android.app.Activity;


public class MainActivity extends AppCompatActivity {

    byte bContador=0;




    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.btn5);
        Button btn6 = findViewById(R.id.btn6);
        FloatingActionButton btn7 = findViewById(R.id.btn7);



        //events




        btn1.setOnClickListener(v -> {
            btn1.setVisibility(v.VISIBLE);
            btn1.setVisibility(v.INVISIBLE);
            bContador++;
            if (bContador==6){
                btn7.setVisibility(v.VISIBLE);


            }

        });
        btn2.setOnClickListener(v -> {
            btn2.setVisibility(v.VISIBLE);
            btn2.setVisibility(v.INVISIBLE);
            bContador++;
            if (bContador==6){
                btn7.setVisibility(v.VISIBLE);

            }
        });
        btn3.setOnClickListener(v -> {
            btn3.setVisibility(v.VISIBLE);
            btn3.setVisibility(v.INVISIBLE);
            bContador++;
            if (bContador==6){
                btn7.setVisibility(v.VISIBLE);


            }
        });
        btn4.setOnClickListener(v -> {
            btn4.setVisibility(v.VISIBLE);
            btn4.setVisibility(v.INVISIBLE);
            bContador++;
            if (bContador==6){
                btn7.setVisibility(v.VISIBLE);


            }

        });
        btn5.setOnClickListener(v -> {
            btn5.setVisibility(v.VISIBLE);
            btn5.setVisibility(v.INVISIBLE);
            bContador++;
            if (bContador==6){
                btn7.setVisibility(v.VISIBLE);


            }
        });
        btn6.setOnClickListener(v -> {
            btn6.setVisibility(v.VISIBLE);
            btn6.setVisibility(v.INVISIBLE);
            bContador++;
            if (bContador==6){
                btn7.setVisibility(v.VISIBLE);


            }
        });

        btn7.setOnClickListener(v -> {
            btn1.setVisibility(v.VISIBLE);
            btn2.setVisibility(v.VISIBLE);
            btn3.setVisibility(v.VISIBLE);
            btn4.setVisibility(v.VISIBLE);
            btn5.setVisibility(v.VISIBLE);
            btn6.setVisibility(v.VISIBLE);
            btn7.setVisibility(v.INVISIBLE);
            bContador=0;
        });

    }
}