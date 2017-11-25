package com.itla.mudat.dao;

import android.content.*;
import android.database.sqlite.*;
import android.util.*;


public class DbConnection extends SQLiteOpenHelper{
    public static String DATABASE_NAME = "mudat.db";
    public static String LOG_T = "dbconnection";

    public DbConnection(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        Log.i(LOG_T, "Iniciando OnCreate...");
        sqLiteDatabase.execSQL(SqlHelperSchema.USUARIO_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
    }
}
