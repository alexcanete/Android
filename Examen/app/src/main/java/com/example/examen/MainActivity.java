package com.example.examen;

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
    public static boolean booAniadir;
    FloatingActionButton btnAnadir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAnadir = findViewById(R.id.btnAnadir);
        booAniadir= false;

        allData();


        btnAnadir.setOnClickListener(l ->{
            booAniadir= true;
            Intent i = new Intent(this, TareaDetalles.class);
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
        Store.lstTarea.clear();
        SQL_Lite db = new SQL_Lite(this);
        SQLiteDatabase conn = db.getReadableDatabase();

        String sqlTable = "TAREAS";
        String[] sqlFields = {"*"};
        String sqlCondition = "";
        String sqlOrderBy = "";
        String sqlGroupBy = "";
        String sqlHaving = "";

        Cursor cursor = conn.query(sqlTable, sqlFields, sqlCondition, null, sqlGroupBy, sqlHaving, sqlOrderBy);
        if(cursor.getColumnCount() == 0){
            Toast.makeText(this, "No hay tareas registradas", Toast.LENGTH_SHORT).show();
        }else{
            if(cursor != null && cursor.moveToFirst()){
                do{
                    boolean exists = false;
                    int idTarea = cursor.getInt(cursor.getColumnIndex("idTarea"));
                    String sNombre = cursor.getString(cursor.getColumnIndex("nombre"));
                    String sFecha = cursor.getString(cursor.getColumnIndex("fecha"));
                    String sHora = cursor.getString(cursor.getColumnIndex("hora"));
                    String sCategoria = cursor.getString(cursor.getColumnIndex("categoria"));

                    Store.lstTarea.add(new Tarea(idTarea, sNombre, sFecha, sHora, sCategoria));
                }while(cursor.moveToNext());
            }

        }
        cursor.close();
    }
    private void mostrarData() {
        RecyclerView recyclerview = findViewById(R.id.rvTarea);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));

        TareaAdapter adaptador = new TareaAdapter(this);
        recyclerview.setAdapter(adaptador);


        adaptador.setOnClickListener(l ->{
            Store.TareaSelected = recyclerview.getChildAdapterPosition(l);
            Intent i = new Intent(this, TareaDetalles.class);
            startActivity(i);
        });
    }


}