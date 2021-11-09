package com.canete.tresfiguras;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityCilindro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cilindro);

        EditText txtAltura = findViewById(R.id.txtAltura);
        EditText txtRadio = findViewById(R.id.txtRadio);
        TextView txtResultado = findViewById(R.id.txtResultado);


        findViewById(R.id.btnCalcular).setOnClickListener(v-> {
            String sAltura = txtAltura.getText().toString();
            String sRadio = txtRadio.getText().toString();


            if(sAltura.length()== 0 ||sRadio.length()== 0) {
                Toast.makeText(this,"Introduce un numero",Toast.LENGTH_LONG).show();
            }else{
                Integer inteAltura = Integer.parseInt(sAltura);
                Integer inteRadio = Integer.parseInt(sRadio);

                Double dResultado = 3.14 * (inteRadio *inteRadio) * inteAltura;
                txtResultado.setText("" + dResultado);
            }
        });
    }
}