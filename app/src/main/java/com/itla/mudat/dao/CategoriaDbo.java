package com.itla.mudat.dao;

import android.content.*;
import android.database.*;
import android.database.sqlite.*;

import java.util.*;

import com.itla.mudat.entity.clsCategoria;

public class CategoriaDbo {

    private DbConnection con;

    public CategoriaDbo(Context context){
        con = new DbConnection(context);
    }

    public void crear (clsCategoria category){
        SQLiteDatabase db = con.getWritableDatabase();

        ContentValues cv = new ContentValues();
        cv.put("id_categoria", category.getIdCategoria());
        cv.put("nombre", category.getNombre());

        db.insert("catgoria",null,cv);
        db.close();
    }

    public List<clsCategoria> buscar(){
        List<clsCategoria> categorias = new ArrayList<>();
        SQLiteDatabase db = con.getReadableDatabase();

        String columnas[] = new String[] {"id_categoria","nombre"};

        Cursor cursor = db.query("usuario", columnas, null, null,null, null,null);

        cursor.moveToFirst();

        while(!cursor.isAfterLast()){
            clsCategoria c = new clsCategoria();

            c.setIdCategoria(cursor.getInt(cursor.getColumnIndex("id_categoria")));
            c.setNombre(cursor.getString(cursor.getColumnIndex("nombre")));

            cursor.moveToNext();
            categorias.add(c);
        }

        cursor.close();
        db.close();

        return categorias;
    }
}
