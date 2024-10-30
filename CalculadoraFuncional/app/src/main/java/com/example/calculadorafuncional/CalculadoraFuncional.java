package com.example.calculadorafuncional;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class CalculadoraFuncional extends AppCompatActivity implements View.OnClickListener {
    EditText editText;
    double operando1 = 0;
    String operacion = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.nombre);

        // Array con los ID de los botones de operaciones
        int[] botonesOperaciones = {
                R.id.BotonSuma,
                R.id.BotonResta,
                R.id.BotonMultiplicar,
                R.id.BotonDividir,
                R.id.BotonPotencia,
                R.id.BotonIgual,
                R.id.BotonBorrar,
                R.id.BotonDecimal
        };

        for (int id : botonesOperaciones) {
            Button boton = findViewById(id);
            boton.setOnClickListener(this);
        }

        // Array con los ID de los botones numéricos
        int[] botonesNumeros = {
                R.id.Boton0, R.id.Boton1, R.id.Boton2, R.id.Boton3, R.id.Boton4,
                R.id.Boton5, R.id.Boton6, R.id.Boton7, R.id.Boton8, R.id.Boton9
        };

        // Bucle para asignar cada botón a su posición en el array
        for (int id : botonesNumeros) {
            Button boton = findViewById(id);
            boton.setOnClickListener(this);
        }

/*
        Typeface miFuente = Typeface.createFromAsset(getAssets(), "fonts/colour.ttf");
        editText.setTypeface(miFuente);*/
    }

    @Override
    public void onClick(View view) {
        String numero = editText.getText().toString();

        // Condiciones para los botones de números
        if (view.getId() == R.id.Boton0) {
            editText.append("0");
        } else if (view.getId() == R.id.Boton1) {
            editText.append("1");
        } else if (view.getId() == R.id.Boton2) {
            editText.append("2");
        } else if (view.getId() == R.id.Boton3) {
            editText.append("3");
        } else if (view.getId() == R.id.Boton4) {
            editText.append("4");
        } else if (view.getId() == R.id.Boton5) {
            editText.append("5");
        } else if (view.getId() == R.id.Boton6) {
            editText.append("6");
        } else if (view.getId() == R.id.Boton7) {
            editText.append("7");
        } else if (view.getId() == R.id.Boton8) {
            editText.append("8");
        } else if (view.getId() == R.id.Boton9) {
            editText.append("9");
        }
        // Condiciones para los botones de operaciones
        else if (view.getId() == R.id.BotonSuma) {
            operacion = "suma";
            operando1 = Double.parseDouble(numero); // Cambio a Double
            editText.setText("");
        } else if (view.getId() == R.id.BotonResta) {
            operacion = "resta";
            operando1 = Double.parseDouble(numero);
            editText.setText("");
        } else if (view.getId() == R.id.BotonMultiplicar) {
            operacion = "multiplicacion";
            operando1 = Double.parseDouble(numero);
            editText.setText("");
        } else if (view.getId() == R.id.BotonDividir) {
            operacion = "division";
            operando1 = Double.parseDouble(numero);
            editText.setText("");
        } else if (view.getId() == R.id.BotonPotencia) {
            operacion = "potencia";
            operando1 = Double.parseDouble(numero);
            editText.setText("");
        } else if (view.getId() == R.id.BotonBorrar) {
            operacion = "borrar";
            editText.setText("");
        } else if (view.getId() == R.id.BotonDecimal) {
            // Verificar si ya hay un punto decimal
            if (!numero.contains(".")) {
                editText.append(".");
            }
        } else if (view.getId() == R.id.BotonIgual) {
            double operando2 = Double.parseDouble(editText.getText().toString());
            calcularResultado(operando1, operando2, operacion);
        }
    }


    private void calcularResultado(double operando1, double operando2, String operacion) {
        double resultado = 0;

        if (operacion.equals("suma")) {
            resultado = operando1 + operando2;
        } else if (operacion.equals("resta")) {
            resultado = operando1 - operando2;
        } else if (operacion.equals("multiplicacion")) {
            resultado = operando1 * operando2;
        } else if (operacion.equals("division")) {
            if (operando2 != 0) {
                resultado = operando1 / operando2;
            } else {
                resultado = 0;  // Manejo básico de división por cero
            }
        } else if (operacion.equals("potencia")) {
            resultado = Math.pow(operando1, operando2);
        }

        editText.setText(String.valueOf(resultado));
    }
}
