package com.example.gridlayout;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Calculadora extends AppCompatActivity implements View.OnClickListener {
    EditText editText;
    String operador = ""; // Para almacenar el operador
    double primerNumero = 0; // Para almacenar el primer número

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

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
        Button botonIgual = (Button) findViewById(R.id.BotonIgual);
        botonIgual.setOnClickListener(this);
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

        // Verificar qué botón se ha pulsado
        if (view.getId() == R.id.BotonSuma) {
            primerNumero = Double.parseDouble(numero);
            operador = "+";
            editText.setText(""); // Limpia el campo para el siguiente número
        } else if (view.getId() == R.id.BotonResta) {
            primerNumero = Double.parseDouble(numero);
            operador = "-";
            editText.setText("");
        } else if (view.getId() == R.id.BotonMultiplicar) {
            primerNumero = Double.parseDouble(numero);
            operador = "*";
            editText.setText("");
        } else if (view.getId() == R.id.BotonDividir) {
            primerNumero = Double.parseDouble(numero);
            operador = "/";
            editText.setText("");
        } else if (view.getId() == R.id.BotonIgual) {
            double segundoNumero = Double.parseDouble(numero);
            double resultado = 0;

            switch (operador) {
                case "+":
                    resultado = sumar(primerNumero, segundoNumero);
                    break;
                case "-":
                    resultado = restar(primerNumero, segundoNumero);
                    break;
                case "*":
                    resultado = multiplicar(primerNumero, segundoNumero);
                    break;
                case "/":
                    if (segundoNumero != 0) {
                        resultado = dividir(primerNumero, segundoNumero);
                    } else {
                        editText.setText("Error"); // Manejo de división por cero
                        return;
                    }
                    break;
            }

            editText.setText(String.valueOf(resultado)); // Mostrar el resultado
        } else {
            // Agregar números al EditText
            editText.setText(numero + view.getTag().toString()); // Asume que los botones tienen su tag como el número
        }
    }

    public double sumar(double a, double b) {
        return a + b;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        return a / b;
    }
}
