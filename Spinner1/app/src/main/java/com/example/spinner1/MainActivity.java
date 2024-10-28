package com.example.spinner1;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Spinner spinner = (Spinner) findViewById(R.id.miSpinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.valores, android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);

        String value = spinner.getSelectedItem().toString();
        spinner.setOnItemClickListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adaptador, View view, int posicion, long id) {
                adaptador.getItemAtPosition(posicion);
            }

            public void onNothingSelected(AdapterView<?> adaptador) {

            }
        });
    }
}