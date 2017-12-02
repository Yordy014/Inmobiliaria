package com.itla.mudat.view.ListAdapter;

import com.itla.mudat.R;
import com.itla.mudat.entity.*;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;

public class UsuarioListAdapter extends BaseAdapter{

    private List<clsUsuario> usuarios;
    private Activity context;

    public UsuarioListAdapter(List<clsUsuario> usuarios, Activity context) {
        this.usuarios = usuarios;
        this.context = context;
    }

    @Override
    public int getCount() {
        return usuarios.size();
    }

    @Override
    public Object getItem(int i) {
        return usuarios.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if(view == null){
            LayoutInflater inflater = context.getLayoutInflater();
            view = inflater.inflate(R.layout.lista_usuario_row,null,true);
        }

        TextView luNombre = view.findViewById(R.id.luNombre);
        TextView luEmail = view.findViewById(R.id.luEmail);

        clsUsuario u = usuarios.get(i);

        luNombre.setText(u.getNombre());
        luEmail.setText(u.getEmail());

        return view;
    }
}
