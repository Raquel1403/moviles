package com.example.aplicaciongestion;

public class Empleado {

    private int foto;
    private String nombre, puesto, telefono, correo;
    private float calificacion;

    public Empleado(int foto, String nombre, String puesto, String telefono, String correo, float calificacion) {
        this.foto = foto;
        this.nombre = nombre;
        this.puesto = puesto;
        this.telefono = telefono;
        this.correo = correo;
        this.calificacion = calificacion;
    }

    public int getFoto() {
        return foto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public float getCalificacion() {
        return calificacion;
    }
}
