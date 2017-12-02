package com.itla.mudat.dao;

import com.itla.mudat.entity.clsAnuncio;
import com.itla.mudat.entity.clsCategoria;
import com.itla.mudat.entity.clsUsuario;

import android.content.*;
import android.database.*;
import android.database.sqlite.*;

import java.util.*;

public class AnuncioDbo {
    private DbConnection con;

    public AnuncioDbo(Context context){
        con = new DbConnection(context);
    }

    public void crear(clsAnuncio anno){
        SQLiteDatabase db = con.getWritableDatabase();

        ContentValues cv = new ContentValues();
        cv.put("id_anuncio", anno.getIdAnuncio());
        cv.put("titulo", anno.getTitulo());
        cv.put("detalle", anno.getDetalle());
        cv.put("precio", anno.getPrecio());
        cv.put("condicion", anno.getCondicion());
        cv.put("fecha", String.valueOf(anno.getFecha()));
        cv.put("categoria", String.valueOf(anno.getCategoria()));
        cv.put("usuario", String.valueOf(anno.getUsuario()));
        cv.put("ubicacion", anno.getUbicacion());

        db.insert("anuncio", null, cv);
        db.close();
    }

    public List<clsAnuncio> buscar(){
        List<clsAnuncio> anuncios = new ArrayList<>();
        SQLiteDatabase db = con.getReadableDatabase();

        String columnas[] = new String[] {"id_anuncio","titulo","detalle","precio","condicion","fecha","categoria","usuario","ubicacion"};

        Cursor cursor = db.query("usuario", columnas, null, null,null, null,null);

        cursor.moveToFirst();

        while(!cursor.isAfterLast()){
            clsAnuncio a = new clsAnuncio();

            a.setIdAnuncio(cursor.getInt(cursor.getColumnIndex("id_anuncio")));
            a.setTitulo(cursor.getString(cursor.getColumnIndex("titulo")));
            a.setDetalle(cursor.getString(cursor.getColumnIndex("detalle")));
            a.setPrecio(cursor.getDouble(cursor.getColumnIndex("precio")));
            a.setCondicion(cursor.getString(cursor.getColumnIndex("condicion")));
           // a.setFecha(cursor.getString(cursor.getColumnIndex("fecha")));
            //a.setCategoria(cursor.getString(cursor.getColumnIndex("categoria")));
            //a.setUsuario(cursor.getString(cursor.getColumnIndex("usuario")));
            a.setUbicacion(cursor.getString(cursor.getColumnIndex("ubicacion")));

            cursor.moveToNext();
            anuncios.add(a);
        }

        cursor.close();
        db.close();

        return anuncios;
    }
}
