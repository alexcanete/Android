package com.canete.casadb2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class SQL_Lite extends SQLiteOpenHelper {


    private static final String DATABASE_NAME = "casas.db";
    private static final int DATABASE_VERSION = 1;

    private static final String SQL_CREATE_ENTRIES = "CREATE TABLE CASA (id_casa INTEGER PRIMARY KEY AUTOINCREMENT, calle TEXT, ncasa INTEGER, superficie DOUBLE)";
    private static final String SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS CASA";

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