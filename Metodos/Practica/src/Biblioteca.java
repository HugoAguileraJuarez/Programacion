import java.util.ArrayList;
import java.util.HashMap;

public class Biblioteca {

    HashMap<String, Materiales> materiales = new HashMap<>();
    ArrayList<Libro> libros = new ArrayList<>();
    ArrayList<DVD> dvd = new ArrayList<>();
    ArrayList<Revista> revistas = new ArrayList<>();

    public void addLibro(String nom, String aut, String desc, int numP) {
        Libro libro = new Libro(nom, desc, aut, numP);
        libros.add(libro);
        materiales.put(String.valueOf(libro.getId()), libro);
    }

    public ArrayList<Libro> nomLibro(String letra, HashMap<String, Libro> libros){
        ArrayList<Libro> resultado = new ArrayList<>();
        for (Libro entrada : libros.values()){
            if (entrada.getNombre().contains(letra)){
                resultado.add(entrada);
            }
        }
        return resultado ;
    }

    public ArrayList<Materiales> mostarBiblio(){
        ArrayList<Materiales> todo = new ArrayList<>();
        for (Materiales entrada : materiales.values()){
            todo.add(entrada);
        }
        return todo;
    }





}



























