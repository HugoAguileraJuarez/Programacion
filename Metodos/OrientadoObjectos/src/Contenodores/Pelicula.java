package Contenodores;

import java.util.ArrayList;

public class Pelicula extends Pruebas {
    private String id;
    private String titulo;
    private int año;
    private ArrayList<Generos> generos;

    public Pelicula(String id, String titutlo, int año, ArrayList<Generos> generos){
        this.id = id;
        this.titulo = titutlo;
        this.año = año;
        this.generos = generos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Generos> getGeneros(String genero) {
        return generos;
    }

    public void setGeneros(ArrayList<Generos> generos) {
        this.generos = generos;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    @Override
    public String toString() {
        return "Pelicula{" +
                "id='" + id + '\'' +
                ", titulo='" + titulo + '\'' +
                ", año=" + año +
                ", generos=" + generos +
                '}';
    }
}
