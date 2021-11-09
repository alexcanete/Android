package com.canete.tresfiguras;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityCubo extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cubo);

        EditText txtLado = findViewById(R.id.txtRadioC);
        TextView txtResultado = findViewById(R.id.txtResultado);


        findViewById(R.id.btnCalcular).setOnClickListener(v-> {
            String sLado = txtLado.getText().toString();



            if(sLado.length()== 0) {
                Toast.makeText(this,"Introduce un numero",Toast.LENGTH_LONG).show();
            }else{
                Integer inteLado = Integer.parseInt(sLado);
                int iResultado = inteLado * inteLado * inteLado;
                txtResultado.setText("" + iResultado);
            }
        });


    }


}