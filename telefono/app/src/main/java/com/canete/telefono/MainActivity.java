package com.canete.telefono;

import static android.Manifest.permission.CALL_PHONE;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnALex).setOnClickListener(e -> {
            String value = "+34667323919";
            //String data = "smsto:" + value;
           // String data = "mailto:" + value;
           // String data = "https:" + value;
            String data = "tel:" + value;

            Intent intent = new Intent(Intent.ACTION_CALL);
            /*
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData( Uri.parse(data));
            intent.setPackage("com.whatsapp");
            intent.putExtra(Intent.EXTRA_TEXT, "probando");
            intent.setType("text/plain");

            Intent shareIntent = Intent.createChooser(intent, null);
            startActivity(intent);
            */
            if(ContextCompat.checkSelfPermission(getApplicationContext(), CALL_PHONE) == PackageManager.PERMISSION_GRANTED){
                startActivity(intent);
            }else{
                requestPermissions(new String[]{CALL_PHONE}, 1);
            }




        });
    }
}