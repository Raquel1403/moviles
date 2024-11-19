package com.example.prop6_05;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MenuJava extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Crear Submenú Días de la Semana
        MenuItem diasSemana = menu.addSubMenu("Días de la Semana").getItem();
        diasSemana.getSubMenu().add(0, R.id.lunes, 0, "Lunes");
        diasSemana.getSubMenu().add(0, R.id.martes, 0, "Martes");
        diasSemana.getSubMenu().add(0, R.id.miercoles, 0, "Miércoles");

        // Crear Submenú Meses del Año
        MenuItem mesesAnno = menu.addSubMenu("Meses del Año").getItem();
        mesesAnno.getSubMenu().add(0, R.id.enero, 0, "Enero");
        mesesAnno.getSubMenu().add(0, R.id.febrero, 0, "Febrero");
        mesesAnno.getSubMenu().add(0, R.id.marzo, 0, "Marzo");

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String mensaje = "";

        // Reemplazo de switch por if
        if (item.getItemId() == R.id.lunes) {
            mensaje = "Pulsado LUNES";
        } else if (item.getItemId() == R.id.martes) {
            mensaje = "Pulsado MARTES";
        } else if (item.getItemId() == R.id.miercoles) {
            mensaje = "Pulsado MIÉRCOLES";
        } else if (item.getItemId() == R.id.enero) {
            mensaje = "Pulsado ENERO";
        } else if (item.getItemId() == R.id.febrero) {
            mensaje = "Pulsado FEBRERO";
        } else if (item.getItemId() == R.id.marzo) {
            mensaje = "Pulsado MARZO";
        } else {
            return super.onOptionsItemSelected(item);
        }

        // Mostrar mensaje en el TextView
        textView.setText(mensaje);
        return true;
    }
}
