package com.example.figura6_9;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String datos[] = new String[]{"OPCIÓN DE MENÚ A", "OPCIÓN DE MENÚ B", "OPCIÓN DE MENÚ C", "OPCIÓN DE MENÚ D", "OPCIÓN DE MENÚ E"};
        lista = findViewById(R.id.listado);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, datos);
        lista.setAdapter(adaptador);
        registerForContextMenu(lista);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);  // Esto debe ir antes de cualquier otra acción
        MenuInflater inflater = getMenuInflater();
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) menuInfo;
        String item = lista.getAdapter().getItem(info.position).toString();  // Obtener el texto del item

        menu.setHeaderTitle(item);  // Mostrar el texto del item en el encabezado del menú

        // Inflar el menú dependiendo de la posición del ítem en la lista
        if(info.position == 0){
            inflater.inflate(R.menu.menu_lista1, menu);  // Inflar menú para la opción A
        } else if (info.position == 1) {
            inflater.inflate(R.menu.menu_lista2, menu);  // Inflar menú para la opción B
        }else if (info.position == 2) {
            inflater.inflate(R.menu.menu_lista3, menu);  // Inflar menú para la opción C
        }else if (info.position == 3) {
            inflater.inflate(R.menu.menu_lista4, menu);  // Inflar menú para la opción D
        }else if (info.position == 4) {
            inflater.inflate(R.menu.menu_lista5, menu);  // Inflar menú para la opción E
        }

        /*
        switch (info.position) {
            case 0:
                inflater.inflate(R.menu.menu_lista1, menu);  // Inflar menú para la opción A
                return;
            case 1:
                inflater.inflate(R.menu.menu_lista2, menu);  // Inflar menú para la opción B
                return;
            case 2:
                inflater.inflate(R.menu.menu_lista3, menu);  // Inflar menú para la opción C
                return;
            case 3:
                inflater.inflate(R.menu.menu_lista4, menu);  // Inflar menú para la opción D
                return;
            case 4:
                inflater.inflate(R.menu.menu_lista5, menu);  // Inflar menú para la opción E
                return;
            default:
                break;*/
        }
    }
