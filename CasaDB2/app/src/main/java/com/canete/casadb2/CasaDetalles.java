package com.canete.casadb2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;


public class CasaDetalles extends AppCompatActivity {
    EditText txtCalle;
    EditText txtNCasa;
    EditText txtSuperficie;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_casa_detalles);


        txtCalle = findViewById(R.id.txtCalle);
        txtNCasa = findViewById(R.id.txtNCasa);
        txtSuperficie = findViewById(R.id.txtSuperficie);
        Button btnGuardar = findViewById(R.id.btnGuardar);
        Button btnBorrar = findViewById(R.id.btnBorrar);


        btnBorrar.setOnClickListener(l -> {
            removeThis();
        });

        btnGuardar.setOnClickListener(l ->{
            saveData();
        });


    }

    private void removeThis(){ //TODO - Hacerlo en la BD
        SQL_Lite db = new SQL_Lite(this);
        SQLiteDatabase conn = db.getWritableDatabase();

        String condition = "id_casa =" + Store.lstCasas.get(Store.CasaSelected).getId_casa() + "";
        int affectedRows = conn.delete("CASA", condition, null);
        if(affectedRows > 0){
            Toast.makeText(this, "Se ha borrado la casa", Toast.LENGTH_SHORT).show();
        }
        finish();
    }

    private void saveData(){
        txtCalle = findViewById(R.id.txtCalle);
        txtNCasa = findViewById(R.id.txtNCasa);
        txtSuperficie = findViewById(R.id.txtSuperficie);
        String calle = txtCalle.getText().toString();
        String ncasa = txtNCasa.getText().toString();
        String superficie = txtSuperficie.getText().toString();
        if(calle.equals("") || superficie.equals("") || ncasa.equals("")){
            Toast.makeText(this, "Faltan datos obligatorios", Toast.LENGTH_SHORT).show();
        }else{
            SQL_Lite db = new SQL_Lite(this);
            SQLiteDatabase conn = db.getWritableDatabase();
            ContentValues content = new ContentValues();
            content.put("calle", calle);
            content.put("ncasa", ncasa);
            content.put("superficie", superficie);
            conn.insert("CASA", null, content);
            finish();
        }
    }

    private void updateData(){
        txtCalle = findViewById(R.id.txtCalle);
        txtNCasa = findViewById(R.id.txtNCasa);
        txtSuperficie = findViewById(R.id.txtSuperficie);
        String calle = txtCalle.getText().toString();
        int numero = Integer.parseInt(txtNCasa.getText().toString());
        double superficie = Double.parseDouble(txtSuperficie.getText().toString());
        if(calle.equals("") || (superficie + "").equals("") || (numero + "").equals("")){
            Toast.makeText(this, "Faltan datos obligatorios", Toast.LENGTH_SHORT).show();
        }else {
            SQL_Lite db = new SQL_Lite(this);
            SQLiteDatabase conn = db.getWritableDatabase();

            ContentValues content = new ContentValues();
            content.put("calle", calle);
            content.put("numero", numero);
            content.put("superficie", superficie);
            String condition = "id_casa =" + Store.lstCasas.get(Store.CasaSelected).getId_casa() + "";
            int affectedRows = conn.update("CASA", content, condition, null);
            finish();
        }
    }

    private void limpiarCuadros() {
        txtCalle.setText("");
        txtNCasa.setText("");
        txtSuperficie.setText("");
    }

    private void mostrarMensaje(String mensaje){
        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show();
    }

}