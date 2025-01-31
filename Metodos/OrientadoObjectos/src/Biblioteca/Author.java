package Biblioteca;

public class Author {
    //atributos
    private String nombre;
    private Author[] listaLibros;

    //constuctor
    public Author(String nombre, int maxLibros){
        this.nombre = nombre;
        this. listaLibros = new Author[maxLibros];
    }

    //metodos
    public Author[] getListaLibros(){
        return listaLibros;
    }

    @Override
    public String toString(){
        return "El author es " + nombre +" y su lista de libros = " + listaLibros;
    }




}
