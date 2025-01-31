package Biblioteca;

public class Llibre {
    //atributos
    private String nombreLibro;
    private int numPaginas;
    private String author;

    //constructor
    public Llibre(String nombreLibro, int numPaginas){
        this.nombreLibro = nombreLibro;
        this.numPaginas = numPaginas;
    }

    //metodos
    public String getNombreLibro(){
        return nombreLibro;
    }
    public void setNombreLibro(){
        this.nombreLibro = nombreLibro;
    }

    public int getNumPaginas(){
        return numPaginas;
    }
    public void setNumPaginas(){
        this.numPaginas = numPaginas;
    }

    public String getAuthor(){
        return author;
    }
}
