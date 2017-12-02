package com.itla.mudat.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.itla.mudat.R;

public class MainActivity extends AppCompatActivity {

    //public EditText nombre;
    public Button usuarios;
    public Button anuncios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //nombre = findViewById(R.id.textNombre);
        usuarios = findViewById(R.id.btnUsuarios);
        anuncios = findViewById(R.id.btnAnuncios);

        usuarios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent users = new Intent(MainActivity.this, VisualizarUsuarios.class);
                startActivity(users);
            }
        });

        anuncios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent anno = new Intent(MainActivity.this, VisualizarAnuncios.class);
                startActivity(anno);
            }
        });

    }
}
