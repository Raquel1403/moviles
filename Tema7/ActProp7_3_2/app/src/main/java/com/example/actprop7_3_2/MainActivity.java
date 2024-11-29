package com.example.actprop7_3_2;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.SeekBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SeekBar seekBar = findViewById(R.id.seekBar);

        //Obtener la altura de la pantalla
        final int tamanoPantalla = getResources().getDisplayMetrics().heightPixels;


        // Inicializar el SeekBar con un cambio de posición vertical en el Toast
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                //Calcular la posición vertical basada en el progreso del seekbar.
                int yOffset = (int) ((tamanoPantalla*progress)/100.0);
                // Crear el Toast
                Toast toast = Toast.makeText(MainActivity.this, "EJEMPLO POSICIÓN", Toast.LENGTH_SHORT);
                // Ajustar la posición vertical según el valor del SeekBar
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.TOP, 0, yOffset);
                //Mostrar el toast.
                toast.show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // Opcional: Acción al empezar a mover el SeekBar
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // Opcional: Acción al detener el movimiento del SeekBar
            }
        });
    }
}
