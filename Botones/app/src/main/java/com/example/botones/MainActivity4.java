package com.example.botones;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity implements View.OnClickListener {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        textView = findViewById(R.id.textView);
        Button boton4 = (Button) findViewById(R.id.button4);
        boton4.setOnClickListener(this);
        Button boton5 = (Button) findViewById(R.id.button5);
        boton5.setOnClickListener(this);

       /* boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("BOTÓN 1 PULSADO");
                textView.setTextColor(Color.RED);
            }
        });

        Button boton5 = (Button) findViewById(R.id.button5);
        boton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("BOTÓN 2 PULSADO");
                textView.setTextColor(Color.GREEN);s
            }
        });*/
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button4) {
            textView.setText(R.string.bot_n_1_pulsado);
            textView.setTextColor(Color.RED);
        } else if (view.getId() == R.id.button5) {
            textView.setText(R.string.bot_n_2_pulsado);
            textView.setTextColor(Color.GREEN);
        }
    }
}
