package com.example.actprop6_1_2;


import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private ArrayList<String> paises;
    ListView listado;
    TextView texto;
    Button nuevo;
    Button eliminar;
    ArrayAdapter<String> adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        paises = new ArrayList<>(Arrays.asList("España",
                "Francia",
                "Alemania",
                "Italia",
                "Portugal",
                "Países Bajos",
                "Suecia",
                "Noruega",
                "Grecia",
                "Dinamarca"));

        nuevo = findViewById(R.id.buttonAdd);
        nuevo.setOnClickListener(this);
        eliminar = findViewById(R.id.buttonDelete);
        eliminar.setOnClickListener(this);

        texto = findViewById(R.id.mitextView);
        listado = findViewById(R.id.miLista);
        adaptador = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, paises);
        listado.setAdapter(adaptador);

        listado.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String seleccionado = paises.get(position);
                texto.setText("País seleccionado: " + seleccionado);
            }
        });
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.buttonAdd){
            paises.add("Nuevo elemento");
            adaptador.notifyDataSetChanged();

        } else if (v.getId() == R.id.buttonDelete){
            if (!paises.isEmpty()){
                paises.remove(paises.size() - 1);
                adaptador.notifyDataSetChanged();
            }
        }
    }
}