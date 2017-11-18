package com.itla.mudat.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.itla.mudat.R;

public class Visualizar extends AppCompatActivity {

    public TextView nombre1;
    public Button registro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualizar);
        nombre1 = findViewById(R.id.txtNombre1);

        Bundle parametros = new Bundle();
        parametros = getIntent().getExtras();
        String ver = parametros.getString("nombre");

        nombre1.setText(ver);

        registro = findViewById(R.id.registroUsuario);

        registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent registrar = new Intent(Visualizar.this, RegistroUsuario.class);
                startActivity(registrar);
            }
        });

    }
}
