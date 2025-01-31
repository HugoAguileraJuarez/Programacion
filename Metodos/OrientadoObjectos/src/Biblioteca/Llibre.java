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
    public int getNumPaginas(){
        return numPaginas;
    }
    public void setNumPaginas(){
        this.numPaginas = numPaginas;
    }

    public String getAuthor(){
        return author;
    }

    @Override
    public String toString(){
        return "El nombre del libro es " + nombreLibro +" y su numero de paginas son " + numPaginas;
    }


}
