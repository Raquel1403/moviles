package com.example.actinvestiga123;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.List;

public class MiAdaptador extends ArrayAdapter<DatosElemento> {
    public MiAdaptador(Context context, List<DatosElemento> datos) {
        super(context, 0, datos);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Reusar la vista si ya existe
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Obtener el objeto de datos para esta posición
        DatosElemento elemento = getItem(position);

        // Referencias a los elementos de la vista
        TextView nombreTextView = convertView.findViewById(R.id.nombreTextView);
        ImageView imagenImageView = convertView.findViewById(R.id.imagenImageView);
        TextView urlTextView = convertView.findViewById(R.id.urlTextView);
        CheckBox checkBox = convertView.findViewById(R.id.checkBox);
        RadioButton radioButton = convertView.findViewById(R.id.radioButton);

        // Configurar los valores de la vista con los datos
        nombreTextView.setText(elemento.getNombre());
        imagenImageView.setImageResource(elemento.getImagenResId());
        urlTextView.setText(elemento.getUrl());

        // Devolver la vista personalizada
        return convertView;
    }
}
