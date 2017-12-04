package com.itla.mudat.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.itla.mudat.entity.*;
import com.itla.mudat.R;
import com.itla.mudat.dao.UsuarioDbo;
import com.itla.mudat.view.ListAdapter.UsuarioListAdapter;

import java.util.List;

public class VisualizarUsuarios extends AppCompatActivity {

    //public TextView nombre1;
    public Button registro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualizar_usuarios);
        /*nombre1 = findViewById(R.id.txtNombre1);

        Bundle parametros = new Bundle();
        parametros = getIntent().getExtras();
        String ver = parametros.getString("nombre");

        nombre1.setText(ver);*/

        registro = findViewById(R.id.btnRegistroUsuario);
        registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent registrar = new Intent(VisualizarUsuarios.this, RegistroUsuario.class);
                startActivity(registrar);
            }
        });

        UsuarioDbo usuarioDbo = new UsuarioDbo(this);

        List<clsUsuario> usuarios = usuarioDbo.buscar();
        Log.i("ListaUsuario", "Cantidad de usuarios" + usuarios.size());

        ListView listView = findViewById(R.id.listUsuarios);

        listView.setAdapter(new UsuarioListAdapter(usuarios, this));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent rUsuario = new Intent(VisualizarUsuarios.this, RegistroUsuario.class);
                clsUsuario u = (clsUsuario) adapterView.getItemAtPosition(i);

                rUsuario.putExtra("usuario", u);
                startActivity(rUsuario);
            }
        });

    }
}
