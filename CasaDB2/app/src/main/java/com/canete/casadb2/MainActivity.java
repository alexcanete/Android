package com.canete.casadb2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Toast;


import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton btnAnadir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAnadir = findViewById(R.id.btnAnadir);

        allData();

        btnAnadir.setOnClickListener(l ->{
            Intent i = new Intent(this, CasaDetalles.class);
            startActivity(i);
        });
    }

    private void allData(){
        getDataFromDB();
        mostrarData();

    }

    @Override
    protected void onResume() {
        super.onResume();
        allData();
    }

    @SuppressLint("Range")
    private void getDataFromDB(){
        Store.lstCasas.clear();
        SQL_Lite db = new SQL_Lite(this);
        SQLiteDatabase conn = db.getReadableDatabase();

        String sqlTable = "CASA";
        String[] sqlFields = {"*"};
        String sqlCondition = "";
        String sqlOrderBy = "";
        String sqlGroupBy = "";
        String sqlHaving = "";

        Cursor cursor = conn.query(sqlTable, sqlFields, sqlCondition, null, sqlGroupBy, sqlHaving, sqlOrderBy);
        if(cursor.getColumnCount() == 0){
            Toast.makeText(this, "No hay casas registradas", Toast.LENGTH_SHORT).show();
        }else{
            if(cursor != null && cursor.moveToFirst()){
                do{
                    boolean exists = false;
                    int id_casa = cursor.getInt(cursor.getColumnIndex("id_casa"));
                    String calle = cursor.getString(cursor.getColumnIndex("calle"));
                    Integer NCasa = cursor.getInt(cursor.getColumnIndex("ncasa"));
                    double superficie = cursor.getDouble(cursor.getColumnIndex("superficie"));
                    Store.lstCasas.add(new Casa(calle, NCasa, superficie));
                }while(cursor.moveToNext());
            }

        }
        cursor.close();
    }
    private void mostrarData() {
        RecyclerView recyclerview = findViewById(R.id.rvArticulo);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));

        CasaAdapter adaptador = new CasaAdapter(this);
        recyclerview.setAdapter(adaptador);


        adaptador.setOnClickListener(l ->{
            Store.CasaSelected = recyclerview.getChildAdapterPosition(l);
            Intent i = new Intent(this, CasaDetalles.class);
            startActivity(i);
        });
    }


}