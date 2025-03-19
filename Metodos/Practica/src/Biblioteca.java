import java.util.ArrayList;
import java.util.HashMap;

public class Biblioteca {
    HashMap<String, Materiales> materiales = new HashMap<>();


    public ArrayList<Libro> addLibro(String nom, String aut, String desc, int numP) {
        Libro libro = new Libro(nom, false, desc, aut, numP);
        libro.setNombre(nom);
        libro.setDescripcion(desc);
        libro.setAutor(aut);
        libro.setNumPaginas(numP);

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

}



























//Coleciones

//atomicinter meter esto en materialas el id, añadir id a todas

  /*
      replantear el uso de hashmap con una arraylist, osea tener una arraylist que seria mateirales y usar el hashmap para recorrerla
      bueno empezar conel hasmap y ir tirando

      CONECTARSE CON EL GITHUB DE CASA

      vale cosas que tengo que preguntar primero enseñar el cambio en materiales, despues enseñar biblioteca y explicar bien el tema
      porque a lo mejor solo con el hashmap teniendo id podemos hacerlo bien, que me explique bien como entrelazar las cosas ya que estoy perdido
      en tema de biblioteca se enlaza con el hashmap de materiales pero como afecta ese hashmap de manera que pueda ver tanto libro,dvd y revista
      porque estoy perdido
  */