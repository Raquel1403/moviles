package com.example.moviles_act7;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    private static final int RESULT_OK = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void boton(View v) {
        // Crear un Intent para devolver el resultado
        Intent returnIntent = new Intent();
        // Añadir el resultado como extra
        returnIntent.putExtra("resultKey", "Hola desde SecondActivity");
        // Configurar el resultado con el código RESULT_OK
        setResult(RESULT_OK, returnIntent);
        // Finalizar la actividad
        finish();
    }
}
