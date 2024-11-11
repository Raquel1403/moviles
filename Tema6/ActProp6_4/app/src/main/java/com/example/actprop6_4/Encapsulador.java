package com.example.actprop6_4;

public class Encapsulador {
    private int imagen;
    private String titulo, texto;
    private boolean dato1;

    public Encapsulador(int idImagen, String textoTitulo, String textoContenido, boolean favorito){
        this.imagen = idImagen;
        this.titulo = textoTitulo;
        this.texto = textoContenido;
        this.dato1 = favorito;
    }

    public int get_idImagen() {return imagen;}

    public String get_textoTitulo() {return titulo;}

    public String get_textoContenido() {return texto;}

    public boolean get_checkBox1() {return dato1;}
}
