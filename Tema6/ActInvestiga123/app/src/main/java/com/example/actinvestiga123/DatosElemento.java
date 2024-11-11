package com.example.actinvestiga123;

public class DatosElemento {
    private String nombre;
    private String url;
    private int imagenResId;

    public DatosElemento(String nombre, String url, int imagenResId) {
        this.nombre = nombre;
        this.url = url;
        this.imagenResId = imagenResId;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUrl() {
        return url;
    }

    public int getImagenResId() {
        return imagenResId;
    }
}
