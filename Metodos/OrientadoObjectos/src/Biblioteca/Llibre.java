package Biblioteca;

public class Llibre {
    //atributos
    private String nombreLibro;
    private int numPaginas;
    private Author punteroAuthor;

    //constructor
    public Llibre(String nombreLibro, int numPaginas, Author punteroAuthor){
        this.nombreLibro = nombreLibro;
        this.numPaginas = numPaginas;
        this.punteroAuthor = punteroAuthor;
    }

    //metodos
    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setPunteroAuthor(Author punteroAuthor) {
        this.punteroAuthor = punteroAuthor;
    }

    public Author getPunteroAuthor() {
        return punteroAuthor;
    }


    //metodo de agregar un author
    public Author agregacionAuthor(Author author){
        if (author == null){
            return null;
        }

        return author;
    }

    @Override
    public String toString(){
        return "El nombre del libro es " + nombreLibro +" y su numero de paginas son " + numPaginas + " y el author es "+ punteroAuthor.getNombre();
    }





}
