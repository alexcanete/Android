package com.canete.tresfiguras;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityEsfera extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esfera);


        EditText txtRadio = findViewById(R.id.txtRadioC);
        TextView txtResultado = findViewById(R.id.txtResultado);


        findViewById(R.id.btnCalcular).setOnClickListener(v-> {
            String sRadio = txtRadio.getText().toString();



            if(sRadio.length()== 0) {
                Toast.makeText(this,"Introduce un numero",Toast.LENGTH_LONG).show();
            }else{
                Integer inteRadio = Integer.parseInt(sRadio);
                Double dResultado = 4/3 * 3.14 *(inteRadio*inteRadio*inteRadio);
                txtResultado.setText("" + dResultado);
            }
        });


    }
}