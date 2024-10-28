package com.example.calculadorafuncional;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class CalculadoraFuncional extends AppCompatActivity implements View.OnClickListener {
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);

        Button botonSuma = (Button) findViewById(R.id.BotonSuma);
        botonSuma.setOnClickListener(this);
        Button botonResta = (Button) findViewById(R.id.BotonResta);
        botonResta.setOnClickListener(this);
        Button botonMultiplicar = (Button) findViewById(R.id.BotonMultiplicar);
        botonMultiplicar.setOnClickListener(this);
        Button botonDividir = (Button) findViewById(R.id.BotonDividir);
        botonDividir.setOnClickListener(this);
        Button botonPotencia = (Button) findViewById(R.id.BotonPotencia);
        botonPotencia.setOnClickListener(this);
        Button boton0 = (Button) findViewById(R.id.Boton0);
        boton0.setOnClickListener(this);
        Button boton1 = (Button) findViewById(R.id.Boton1);
        boton1.setOnClickListener(this);
        Button boton2 = (Button) findViewById(R.id.Boton2);
        boton2.setOnClickListener(this);
        Button boton3 = (Button) findViewById(R.id.Boton3);
        boton3.setOnClickListener(this);
        Button boton4 = (Button) findViewById(R.id.Boton4);
        boton4.setOnClickListener(this);
        Button boton5 = (Button) findViewById(R.id.Boton5);
        boton5.setOnClickListener(this);
        Button boton6 = (Button) findViewById(R.id.Boton6);
        boton6.setOnClickListener(this);
        Button boton7 = (Button) findViewById(R.id.Boton7);
        boton7.setOnClickListener(this);
        Button boton8 = (Button) findViewById(R.id.Boton8);
        boton8.setOnClickListener(this);
        Button boton9 = (Button) findViewById(R.id.Boton9);
        boton9.setOnClickListener(this);

        Typeface miFuente = Typeface.createFromAsset(getAssets(), "fonts/colour.ttf");
        editText.setTypeface(miFuente);
    }

    @Override
    public void onClick(View view) {

        String numero = editText.getText().toString();

        if (view.getId() == R.id.BotonSuma) {
            editText.setText(numero);
            int n = Integer.parseInt(String.valueOf(numero));
            sumar(n);
        } else if (view.getId() == R.id.Boton0) {
            editText.setText("0");
        } else if (view.getId() == R.id.Boton1) {
            editText.setText("1");
        } else if (view.getId() == R.id.Boton2) {
            editText.setText("2");
        } else if (view.getId() == R.id.Boton3) {
            editText.setText("3");
        } else if (view.getId() == R.id.Boton4) {
            editText.setText("4");
        } else if (view.getId() == R.id.Boton5) {
            editText.setText("5");
        } else if (view.getId() == R.id.Boton6) {
            editText.setText("6");
        } else if (view.getId() == R.id.Boton7) {
            editText.setText("7");
        } else if (view.getId() == R.id.Boton8) {
            editText.setText("8");
        } else if (view.getId() == R.id.Boton9) {
            editText.setText("9");
        } else if (view.getId() == R.id.BotonResta) {
            editText.setText(numero);

        } else if (view.getId() == R.id.BotonMultiplicar) {
            editText.setText(numero);

        } else if (view.getId() == R.id.BotonDividir) {
            editText.setText(numero);

        } else if (view.getId() == R.id.BotonPotencia) {
            editText.setText(numero);
        } else if (view.getId() == R.id.BotonIgual) {
            editText.setText(numero);
        }
    }

    public void sumar(int n){

    }
    public void restar(){

    }
    public void multiplicar(){

    }
    public void dividir(){

    }
    public void igualar(){

    }
}