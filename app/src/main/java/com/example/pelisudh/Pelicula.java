package com.example.pelisudh;

public class Pelicula {
    private String titulo;
    private String anio;
    private String descripcion;

    public Pelicula(String titulo, String anio, String descripcion) {
        this.titulo = titulo;
        this.anio = anio;
        this.descripcion = descripcion;
    }
    public String getTitulo() {
        return titulo;
    }

    public String getAnio() {
        return anio;
    }

    public String getDescripcion() {
        return descripcion;
    }




}
