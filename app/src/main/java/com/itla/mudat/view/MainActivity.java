package com.itla.mudat.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.itla.mudat.R;

public class MainActivity extends AppCompatActivity {

    public EditText nombre;
    public Button guardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = findViewById(R.id.textNombre);
        guardar = findViewById(R.id.btnGuardar);

        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Toast mensaje = Toast.makeText(MainActivity.this, "Hecho " + MainActivity.this.nombre.getText(), Toast.LENGTH_LONG);
               // mensaje.show();

                Intent visualizar = new Intent(MainActivity.this, Visualizar.class);

                visualizar.putExtra("nombre", nombre.getText().toString());
                startActivity(visualizar);

            }
        });
    }
}
