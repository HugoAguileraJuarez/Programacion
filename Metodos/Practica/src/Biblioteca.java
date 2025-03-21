import java.util.ArrayList;
import java.util.HashMap;

public class Biblioteca {

    HashMap<String, Materiales> materiales = new HashMap<>();
    ArrayList<Libro> libros = new ArrayList<>();
    ArrayList<DVD> Dvd = new ArrayList<>();
    ArrayList<Revista> revistas = new ArrayList<>();

    public void addLibro(String nom, String aut, String desc, int numP) {
        Libro libro = new Libro(nom, desc, aut, numP);
        libros.add(libro);
        materiales.put(String.valueOf(libro.getId()), libro);
    }

    public void addRevistao(String nom, String desc, String edio) {
        Revista revista = new Revista(nom,desc,edio);
        revistas.add(revista);
        materiales.put(String.valueOf(revista.getId()), revista);
    }

    public void addDVD(String nom, String desc, String cont){
        DVD dvd = new DVD(nom,desc,cont);
        Dvd.add(dvd);
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



























