package com.lavidaesunvideojuego.infocontacto;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FormularioContacto extends FragmentActivity {

    private EditText campoNombre;
    private EditText campoFechanac;
    private EditText campoTelefono;
    private EditText campoEmail;
    private EditText campoDescripcion;

    Button siguiente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_contacto);

        campoNombre = (EditText) findViewById(R.id.EtNombre);
        campoFechanac = (EditText) findViewById(R.id.EtFechaNac);
        campoTelefono = (EditText) findViewById(R.id.EtTelefono);
        campoEmail = (EditText) findViewById(R.id.EtEmail);
        campoDescripcion = (EditText) findViewById(R.id.MaCTVDescripcion);

        siguiente = (Button) findViewById(R.id.button);

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent siguiente = new Intent(FormularioContacto.this,ConfirmarDatos.class );
                siguiente.putExtra(getResources().getString(R.string.Pnombre),campoNombre.getText()+"" );
                siguiente.putExtra(getResources().getString(R.string.Pafnac),campoFechanac.getText()+"");
                siguiente.putExtra(getResources().getString(R.string.Pntel),campoTelefono.getText()+"");
                siguiente.putExtra(getResources().getString(R.string.Pnemail),campoEmail.getText()+"");
                siguiente.putExtra(getResources().getString(R.string.Pndescripcion),campoDescripcion.getText()+"");
                startActivity(siguiente);
            }
        });
    }


        public void onStart (){
        super.onStart();
        EditText textoFecha = (EditText) findViewById(R.id.EtFechaNac);
        textoFecha.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if (hasFocus) {
                    DateDialog dialog = new DateDialog(view);
                    FragmentTransaction ft = getFragmentManager().beginTransaction();
                    dialog.show(ft, "Fecha");

                }
            }

        });
    }
}
