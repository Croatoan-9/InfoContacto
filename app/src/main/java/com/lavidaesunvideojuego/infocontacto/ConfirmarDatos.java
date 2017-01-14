package com.lavidaesunvideojuego.infocontacto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ConfirmarDatos extends AppCompatActivity {

    private TextView textNombre;
    private TextView textFechanac;
    private TextView textTelefono;
    private TextView textEmail;
    private TextView textDescripcion;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_datos);

        textNombre = (TextView) findViewById(R.id.nombreCompleto);
        textFechanac = (TextView)findViewById(R.id.fechaNacimiento);
        textTelefono = (TextView) findViewById(R.id.telefono);
        textEmail = (TextView) findViewById(R.id.email);
        textDescripcion = (TextView) findViewById(R.id.descripcion);

        String nombre = getIntent().getStringExtra(getResources().getString(R.string.Pnombre));
        String fechaNac = getIntent().getStringExtra(getResources().getString(R.string.Pafnac));
        String telefono = getIntent().getStringExtra(getResources().getString(R.string.Pntel));
        String email = getIntent().getStringExtra(getResources().getString(R.string.Pnemail));
        String descripcion = getIntent().getStringExtra(getResources().getString(R.string.Pndescripcion));

        textNombre.setText(nombre);
        textFechanac.setText(fechaNac);
        textTelefono.setText(telefono);
        textEmail.setText(email);
        textDescripcion.setText(descripcion);

        Button editar = (Button) findViewById(R.id.button2);
        editar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();

            }
        });
            }



    }

