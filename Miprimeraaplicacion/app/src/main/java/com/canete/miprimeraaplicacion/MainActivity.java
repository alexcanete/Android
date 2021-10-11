package com.canete.miprimeraaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // System.out.println("Hola");
        Log.i("canete2.0", "Esto es onCreate");
    }
    protected void onStart(){
        super.onStart();
        Log.i("canete2.0","Esto  es onStart");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("canete2.0","Esto  es onRestart");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("canete2.0","Esto  es onDestroy");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("canete2.0","Esto  es onResume");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("canete2.0","Esto  es onStop");

    }

    protected void onPause(){
        super.onPause();
        Log.i("canete2.0","Esto  es onPause");

    }
}