package com.example.actprop6_1_3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final int REQUEST_CODE_ADD_COUNTRY = 1;
    private ArrayList<String> paises;
    private ArrayAdapter<String> adaptador;
    ListView listado;
    TextView texto;
    Button nuevo;
    Button eliminar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializar la lista de países usando un ArrayList
        paises = new ArrayList<>(Arrays.asList("España", "Francia", "Alemania", "Italia", "Portugal",
                "Países Bajos", "Suecia", "Noruega", "Grecia", "Dinamarca"));

        // Configurar adaptador y vista de lista
        adaptador = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, paises);
        listado = findViewById(R.id.miLista);
        listado.setAdapter(adaptador);

        // Configurar TextView y botones
        texto = findViewById(R.id.mitextView);
        nuevo = findViewById(R.id.buttonAdd);
        nuevo.setOnClickListener(this);
        eliminar = findViewById(R.id.buttonDelete);
        eliminar.setOnClickListener(this);

        // Configurar el evento de clic en el ListView
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
        if (v.getId() == R.id.buttonAdd) {
            // Iniciar AddCountryActivity para añadir un nuevo país
            Intent intent = new Intent(MainActivity.this, PaisNuevo.class);
            startActivityForResult(intent, REQUEST_CODE_ADD_COUNTRY);
        } else if (v.getId() == R.id.buttonDelete) {
            // Eliminar el último elemento si la lista no está vacía y actualizar el adaptador
            if (!paises.isEmpty()) {
                paises.remove(paises.size() - 1);
                adaptador.notifyDataSetChanged();
            }
        }
    }

    // Recibir el resultado de AddCountryActivity
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE_ADD_COUNTRY && resultCode == RESULT_OK && data != null) {
            // Obtener el país introducido y añadirlo a la lista
            String nuevoPais = data.getStringExtra("nuevoPais");
            if (nuevoPais != null && !nuevoPais.isEmpty()) {
                paises.add(nuevoPais);
                adaptador.notifyDataSetChanged();
            }
        }
    }
}
