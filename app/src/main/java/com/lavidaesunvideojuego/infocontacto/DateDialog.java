package com.lavidaesunvideojuego.infocontacto;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

/**
 * Created by sebse on 13/01/2017.
 */

public class DateDialog extends DialogFragment implements DatePickerDialog.OnDateSetListener{

    EditText fechaNac;

    public DateDialog(View view){

        fechaNac = (EditText)view;
    }
    public Dialog onCreateDialog(Bundle savedInstanceState){

        final Calendar calendario = Calendar.getInstance();
        int Ano = calendario.get(Calendar.YEAR);
        int Mes =   calendario.get(Calendar.MONTH);
        int Dia = calendario.get(Calendar.DAY_OF_MONTH);

        return new DatePickerDialog(getActivity(), this, Dia,Mes,Ano);



    }
    public void onDateSet(DatePicker view, int Dia, int Mes, int Ano){

        String fecha = Dia + " / " + Mes + " / " + Ano;

        fechaNac.setText(fecha);
    }

}

