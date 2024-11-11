package com.example.actfigura6_5;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
Datos[] datos = new Datos[]{
        new Datos("Línea Superior 1", "Línea Inferior 1"),
        new Datos("Línea Superior 2", "Línea Inferior 2"),
        new Datos("Línea Superior 3", "Línea Inferior 3"),
        new Datos("Línea Superior 4", "Línea Inferior 4")};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View miCabecera = getLayoutInflater().inflate(R.layout.cabecera, null);
        ListView listado = (ListView) findViewById(R.id.miLista);
        listado.addHeaderView(miCabecera);
        Adaptador miAdaptador = new Adaptador(this, datos);
        listado.setAdapter(miAdaptador);

        listado.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String seleccionado = ((Datos) adapterView.getItemAtPosition(position)).getTexto1();
            }
        });
    }
}