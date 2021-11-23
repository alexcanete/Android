package com.example.examen;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class TareaDetalles extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
        EditText txtNombre;
        EditText txtFecha;
        EditText txtHora;
        private ArrayList<String> categorias = new ArrayList<String>();
        private Spinner spiCategoria;
        private String sCategoria= "NULL";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarea_detalles);


        txtNombre= findViewById(R.id.txtNombre);
        txtFecha = findViewById(R.id.txtFecha);
        txtHora = findViewById(R.id.txtHora);
        Button btnGuardar = findViewById(R.id.btnGuardar);
        spiCategoria = (Spinner) findViewById(R.id.spiCategoria);
        agregarCategorias();
        hacerClick();

        btnGuardar.setOnClickListener(l ->{
            if(MainActivity.booAniadir==true){
                saveData();
            }else{
                updateData();
            }

        });


    }

    private void agregarCategorias()
    {
        categorias.add("Mates");
        categorias.add("Lengua");
        categorias.add("Inglés");
        categorias.add("Francés");
    }


    private void saveData(){
        txtNombre = findViewById(R.id.txtNombre);
        txtFecha = findViewById(R.id.txtFecha);
        txtHora = findViewById(R.id.txtHora);
        String sNombre = txtNombre.getText().toString();
        String sFecha = txtFecha.getText().toString();
        String sHora = txtHora.getText().toString();
        if(sNombre.equals("") || sFecha.equals("") || sHora.equals("") || sCategoria.equals("")){
            Toast.makeText(this, "Faltan datos obligatorios", Toast.LENGTH_SHORT).show();
        }else{
            SQL_Lite db = new SQL_Lite(this);
            SQLiteDatabase conn = db.getWritableDatabase();
            ContentValues content = new ContentValues();
            content.put("nombre", sNombre);
            content.put("fecha", sFecha);
            content.put("hora", sHora);
            content.put("categoria", sCategoria);
            conn.insert("TAREAS", null, content);
            finish();
        }
    }

    private void updateData(){
        txtNombre = findViewById(R.id.txtNombre);
        txtFecha = findViewById(R.id.txtFecha);
        txtHora = findViewById(R.id.txtHora);
        String sNombre = txtNombre.getText().toString();
        String sFecha = txtFecha.getText().toString();
        String sHora = txtHora.getText().toString();
        if(sNombre.equals("") || sFecha.equals("") || sHora.equals("") || sCategoria.equals("")){
            Toast.makeText(this, "Faltan datos obligatorios", Toast.LENGTH_SHORT).show();
        }else{
            SQL_Lite db = new SQL_Lite(this);
            SQLiteDatabase conn = db.getWritableDatabase();

            ContentValues content = new ContentValues();
            content.put("nombre", sNombre);
            content.put("fecha", sFecha);
            content.put("hora", sHora);
            content.put("categoria", sCategoria);
            String condition = "idTarea =" + Store.lstTarea.get(Store.TareaSelected).getIdTarea() + "";
            int affectedRows = conn.update("TAREAS", content, condition, null);
            finish();
        }
    }

    private void limpiarCuadros() {
        txtNombre.setText("");
        txtFecha.setText("");
        txtHora.setText("");
    }

    private void mostrarMensaje(String mensaje){
        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        switch (adapterView.getId())
        {
            case R.id.spiCategoria:
                String sCategoria = (String) adapterView.getSelectedItem().toString() + "";

                break;

            default:
                break;
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    private void hacerClick()
    {
        spiCategoria.setOnItemSelectedListener(this);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, categorias);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiCategoria.setAdapter(adapter);
    }
}
