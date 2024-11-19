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
        lista = (ListView) findViewById(R.id.listado);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, datos);
        lista.setAdapter(adaptador);
        registerForContextMenu(lista);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) menuInfo;
        menu.setHeaderTitle(lista.getAdapter().getItem(info.position).toString());
        switch (info.position){
            case 0:
                inflater.inflate(R.menu.menu_lista1, menu);
                return;
            case 1:
                inflater.inflate(R.menu.menu_lista2, menu);
                return;
            case 2:
                inflater.inflate(R.menu.menu_lista3, menu);
                return;
        }
    }
}