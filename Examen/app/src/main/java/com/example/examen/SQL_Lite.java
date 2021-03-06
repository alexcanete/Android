package com.example.examen;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class SQL_Lite extends SQLiteOpenHelper {


    private static final String DATABASE_NAME = "tarea.db";
    private static final int DATABASE_VERSION = 1;

    private static final String SQL_CREATE_ENTRIES = "CREATE TABLE TAREAS (idTarea INTEGER PRIMARY KEY AUTOINCREMENT, nombre TEXT, fecha TEXT, hora TEXT, categoria TEXT)";
    private static final String SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS TAREAS";

    public SQL_Lite(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_CREATE_ENTRIES);
        db.execSQL(SQL_DELETE_ENTRIES);
    }
}