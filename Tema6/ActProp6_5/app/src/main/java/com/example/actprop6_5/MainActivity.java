package com.example.actprop6_5;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.texto);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.lunes){
            textView.setText("Pulsado " + item.getTitle());
        } else if (item.getItemId() == R.id.martes) {
            textView.setText("Pulsado " + item.getTitle());
        }else if (item.getItemId() == R.id.miercoles) {
            textView.setText("Pulsado " + item.getTitle());
        }else if (item.getItemId() == R.id.jueves) {
            textView.setText("Pulsado " + item.getTitle());
        }else if (item.getItemId() == R.id.viernes) {
            textView.setText("Pulsado " + item.getTitle());
        }else if (item.getItemId() == R.id.sabado) {
            textView.setText("Pulsado " + item.getTitle());
        }else if (item.getItemId() == R.id.domingo) {
            textView.setText("Pulsado " + item.getTitle());
        }
        return  true;
    }
}