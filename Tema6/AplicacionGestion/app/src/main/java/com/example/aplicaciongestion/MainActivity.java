package com.example.aplicaciongestion;


import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

//Empresa de Servicios de Atención al Cliente.
//Puntuación de calificación basado en encuestas de clientes.

public class MainActivity extends AppCompatActivity {
    private ListView listaEmpleados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaEmpleados = findViewById(R.id.listaEmpleados);

        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado(R.drawable.hombre, "Juan Pérez", "Gerente", "123-456-789", "juan@example.com", 4.5f));
        empleados.add(new Empleado(R.drawable.mujer, "María García", "Analista", "987-654-321", "maria@example.com", 3.0f));
        empleados.add(new Empleado(R.drawable.hombre, "Carlos López", "Desarrollador", "456-789-123", "carlos@example.com", 4.0f));

        AdaptadorEmpleado adapter = new AdaptadorEmpleado(this, empleados);
        listaEmpleados.setAdapter(adapter);
    }
}