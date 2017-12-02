package com.itla.mudat.dao;

import android.content.*;
import android.database.*;
import android.database.sqlite.*;
import android.util.Log;

import com.itla.mudat.entity.clsUsuario;
import com.itla.mudat.entity.enumTipoUsuario;

import java.util.*;


public class UsuarioDbo {
    private DbConnection con;

    public UsuarioDbo(Context context){
        con = new DbConnection(context);
    }

    public void guardar(clsUsuario user){
        SQLiteDatabase db = con.getWritableDatabase();

        ContentValues cv = new ContentValues();
        cv.put("nombre", user.getNombre());
        cv.put("tipo_usuario", String.valueOf(user.getTipoUsuario()));
        cv.put("identificacion", user.getIdentificacion());
        cv.put("email", user.getEmail());
        cv.put("telefono", user.getTelefono());
        cv.put("clave", user.getClave());
        //cv.put("estatus", user.isEstatus());

        if(user.getIdUsuario() == 0){
            Long id = db.insert("usuario",null,cv);
        }else{
            db.update("usuario", cv, "id = "+ user.getIdUsuario(),null);
        }

       long id = db.insert("usuario", null,cv);
       Log.i("RegistroUsuario " , "el id generado = " + id);
        db.close();
    }

    public List<clsUsuario> buscar(){
        List<clsUsuario> usuarios = new ArrayList<>();

        SQLiteDatabase db = con.getReadableDatabase();

        String columnas[] = new String[] {"id_usuario","nombre","tipo_usuario","identificacion","email","telefono","clave"};//,"estatus"};

        Cursor cursor = db.query("usuario", columnas, null, null,null, null,null);

        cursor.moveToFirst();

        while(!cursor.isAfterLast()){
            clsUsuario u = new clsUsuario();
            u.setIdUsuario(cursor.getInt(cursor.getColumnIndex("id_usuario")));
            u.setNombre(cursor.getString(cursor.getColumnIndex("nombre")));
            u.setTipoUsuario(enumTipoUsuario.valueOf(cursor.getString(cursor.getColumnIndex("tipo_usuario"))));
            u.setIdentificacion(cursor.getString(cursor.getColumnIndex("identificacion")));
            u.setEmail(cursor.getString(cursor.getColumnIndex("email")));
            u.setTelefono(cursor.getString(cursor.getColumnIndex("telefono")));
            u.setClave(cursor.getString(cursor.getColumnIndex("clave")));
           // u.setEstatus(cursor.getInt(cursor.getColumnIndex("estatus")));

            cursor.moveToNext();
            usuarios.add(u);
        }

        cursor.close();
        db.close();
        return usuarios;
    }
}
