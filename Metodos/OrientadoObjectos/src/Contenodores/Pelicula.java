package Contenodores;

import java.util.ArrayList;

public class Pelicula extends Pruebas {
    private String id;
    private String titulo;
    private int año;
    private ArrayList<Generos> generos;
    private int estrellas;

    public Pelicula(String id, String titutlo, int año, ArrayList<Generos> generos, int estrellas) {
        this.id = id;
        this.titulo = titutlo;
        this.año = año;
        this.generos = generos;
        this.estrellas = estrellas;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Generos> getGeneros() {
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

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "id='" + id + '\'' +
                ", titulo='" + titulo + '\'' +
                ", año=" + año +
                ", generos=" + generos +
                ", estrellas=" + estrellas +
                '}';
    }
}
