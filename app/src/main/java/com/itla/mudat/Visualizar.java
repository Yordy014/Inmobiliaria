package com.itla.mudat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Visualizar extends AppCompatActivity {

    public TextView nombre1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualizar);
        nombre1 = findViewById(R.id.txtNombre1);

        Bundle parametros = new Bundle();
        parametros = getIntent().getExtras();
        String ver = parametros.getString("nombre");

        nombre1.setText(ver);
    }
}
