package com.itla.mudat.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.itla.mudat.R;
import com.itla.mudat.entity.clsUsuario;
import com.itla.mudat.entity.enumTipoUsuario;

public class RegistroUsuario extends AppCompatActivity {

    public EditText nombre;
    public EditText telefono;
    public EditText tipoUsuario;
    public EditText email;
    public EditText clave;
    public EditText estatus;
    public EditText identificacion;
    public Button guardar;

   /* public TextView nombre1;
    public TextView telefono1;
    public TextView tipoUsuario1;
    public TextView email1;
    public TextView clave1;
    public TextView estatus1;
    public TextView identificacion1; */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_usuario);

        nombre = findViewById(R.id.txtNombre);
        identificacion = findViewById(R.id.txtIdentificacion);
        tipoUsuario = findViewById(R.id.txtTipoUsuario);
        email = findViewById(R.id.txtEmail);
        clave = findViewById(R.id.txtClave);
        estatus = findViewById(R.id.txtEstatus);
        telefono = findViewById(R.id.txtTelefono);

       /* nombre1 = findViewById(R.id.textNombre);
        identificacion1 = findViewById(R.id.textIdentificacion);
        tipoUsuario1 = findViewById(R.id.textTipoUsuario);
        email1 = findViewById(R.id.textEmail);
        clave1 = findViewById(R.id.textClave);
        estatus1 = findViewById(R.id.textEstatus);
        telefono1 = findViewById(R.id.textTelefono);*/

        final clsUsuario usuario = new clsUsuario();

        guardar = findViewById(R.id.btnGuardar);

        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usuario.setNombre(nombre.getText().toString());
                usuario.setIdentificacion(identificacion.getText().toString());
                usuario.setTipoUsuario(enumTipoUsuario.CLIENTE);
                usuario.setEmail(email.getText().toString());
                usuario.setClave(clave.getText().toString());
                usuario.setEstatus(true);
                usuario.setTelefono(telefono.getText().toString());

                Log.i("Registro Usuario", usuario.toString());
            }
        });

    }
}
