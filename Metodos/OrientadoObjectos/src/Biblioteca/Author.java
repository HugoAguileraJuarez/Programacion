package Biblioteca;

import Instituto.Modul;

public class Author {
    //atributos
    private String nombre;
    private Llibre[] listaLibros;
    private int numLibros;


    //constuctor
    public Author(String nombre, int maxLibros, int numLibros){
        this.nombre = nombre;
        this. listaLibros = new Llibre[maxLibros];
        this.numLibros = 0;
    }

    //metodos

    public String getNombre() {
        return nombre;
    }

    public Llibre[] getListaLibros(){
        return listaLibros;
    }
    //Metodo para añadir libros al author
    public boolean añadirLibro(Llibre llibre){
        if (llibre == null){
            return false;
        }
        if (numLibros == listaLibros.length){
        Llibre[] array = new Llibre[listaLibros.length +1];
            for (int i = 0; i<listaLibros.length; i++){
                array[i] = listaLibros[i];
            }
            listaLibros = array;
        }
        listaLibros[numLibros] = llibre;
        llibre.setPunteroAuthor(this);
        numLibros++;
        return true;
    }
    //metodo para listar los libros del author
    public Llibre librosAuthor(String libros){
        if (libros == null){
            return null;
        }
        for (int i = 0; i <numLibros; i++){
            if (libros.equals(listaLibros[i].getNombreLibro())){
                return listaLibros[i];
            }
        }
        return null;
    }


    @Override
    public String toString(){
        return "El author es " + nombre +" y su lista de libros = " + listaLibros;
    }




}
