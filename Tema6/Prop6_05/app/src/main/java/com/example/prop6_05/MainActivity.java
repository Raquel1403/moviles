package com.example.prop6_05;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.opciones, menu); // Inflamos el menú
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String mensaje = "";

        int itemId = item.getItemId();
        // Submenú de días de la semana
        if (itemId == R.id.lunes) {
            mensaje = "Pulsado LUNES";
        } else if (itemId == R.id.martes) {
            mensaje = "Pulsado MARTES";
        } else if (itemId == R.id.miercoles) {
            mensaje = "Pulsado MIÉRCOLES";
        } else if (itemId == R.id.jueves) {
            mensaje = "Pulsado JUEVES";
        } else if (itemId == R.id.viernes) {
            mensaje = "Pulsado VIERNES";
        } else if (itemId == R.id.sabado) {
            mensaje = "Pulsado SÁBADO";
        } else if (itemId == R.id.domingo) {
            mensaje = "Pulsado DOMINGO";
        }
        // Submenú de meses del año
        else if (itemId == R.id.enero) {
            mensaje = "Pulsado ENERO";
        } else if (itemId == R.id.febrero) {
            mensaje = "Pulsado FEBRERO";
        } else if (itemId == R.id.marzo) {
            mensaje = "Pulsado MARZO";
        } else if (itemId == R.id.abril) {
            mensaje = "Pulsado ABRIL";
        } else if (itemId == R.id.mayo) {
            mensaje = "Pulsado MAYO";
        } else if (itemId == R.id.junio) {
            mensaje = "Pulsado JUNIO";
        } else if (itemId == R.id.julio) {
            mensaje = "Pulsado JULIO";
        } else if (itemId == R.id.agosto) {
            mensaje = "Pulsado AGOSTO";
        } else if (itemId == R.id.septiembre) {
            mensaje = "Pulsado SEPTIEMBRE";
        } else if (itemId == R.id.octubre) {
            mensaje = "Pulsado OCTUBRE";
        } else if (itemId == R.id.noviembre) {
            mensaje = "Pulsado NOVIEMBRE";
        } else if (itemId == R.id.diciembre) {
            mensaje = "Pulsado DICIEMBRE";
        } else {
            return super.onOptionsItemSelected(item);
        }

        // Establecer el texto en el TextView
        textView.setText(mensaje);
        return true;
    }
}
