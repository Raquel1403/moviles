package com.example.aplicaciongestion;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;
public class AdaptadorEmpleado extends ArrayAdapter<Empleado> {
    public AdaptadorEmpleado(Context context, List<Empleado> empleados) {
        super(context, 0, empleados);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_empleado, parent, false);
        }

        Empleado empleado = getItem(position);

        ImageView imagenEmpleado = convertView.findViewById(R.id.imagenEmpleado);
        TextView nombreEmpleado = convertView.findViewById(R.id.nombreEmpleado);
        TextView puestoEmpleado = convertView.findViewById(R.id.puestoEmpleado);
        TextView telefonoEmpleado = convertView.findViewById(R.id.telefonoEmpleado);
        TextView correoEmpleado = convertView.findViewById(R.id.correoEmpleado);
        RatingBar ratingEmpleado = convertView.findViewById(R.id.ratingEmpleado);

        imagenEmpleado.setImageResource(empleado.getFoto());
        nombreEmpleado.setText(empleado.getNombre());
        puestoEmpleado.setText(empleado.getPuesto());
        telefonoEmpleado.setText(empleado.getTelefono());
        correoEmpleado.setText(empleado.getCorreo());
        ratingEmpleado.setRating(empleado.getCalificacion());

        // Aplicar animación
        convertView.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.animacion_combinada));

        return convertView;
    }
}