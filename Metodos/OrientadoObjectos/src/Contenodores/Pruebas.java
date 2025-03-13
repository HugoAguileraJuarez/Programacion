package Contenodores;

import java.util.ArrayList;
import java.util.HashMap;

public class Pruebas {
    public static void main(String[] args){
    /*
        ArrayList lista = new ArrayList();

        lista.add("0");
        lista.add("1");
        lista.add("3");

        for (int i = 0; i< lista.size(); i++){
            String elment = (String) lista.get(i); //Esto lo que hace es pasar de objecto que es la lista.get a string ya que estamos poniendo un objecto en un objecto string
        }

        ArrayList<String> listaString = new ArrayList<>();
        listaString.add("0");
        listaString.add("1");
        listaString.add("3");

        for (int i = 0; i < listaString.size(); i++){
            String elementos = listaString.get(i); //Y como hemos inizializado la arrayList en String no hay error
        }

        lista.add(new Nodos("200"));//Esto lo deja ya que el Nodo es tipo objecto

       // listaString.add(new Nodos("2"));//Pero encambio este no deja ya que no es String ya que es tipo Nodo

       // for (int i = 0; i< lista.size(); i++){
       //     String elementos = (String) lista.get(i);//Casting ecplicit
            //ClassCastingExecption ya que tenemos cosas que no son String
       // }
        //Nunca mezclar tipos de elmentos en una arraylist

        //Nueva forma de for el FOREACH

        for (String valor: listaString){
            System.out.println(valor);
        }
        //Estos dos for son lo mismo
        for (int i = 0; i < listaString.size(); i++){
            String elementos = listaString.get(i);
            System.out.println(elementos);
        }
        //

        */
        /*
        Nodos<String> n = new Nodos<>("a");
        Lista l = new Lista(n);
        l.añadirNodo(new Nodos<String>("5"));
        l.añadirNodo(new Nodos<String>("rr"));
        l.imprimirLista();

        l.añadirNodo(new Nodos<String>("af"));
        l.añadirNodo(new Nodos<String>("af43"));
        l.imprimirLista();
        System.out.println(l.getNodos(0));
        System.out.println(l.getNodos(2));
        System.out.println(l.getTamaño()-1);


        HashSet<String> conjuntoString = new HashSet<>();
        conjuntoString.add("djfkasdjfakòsdf4523526354");//Elemento fuera de orden alfabetico
        conjuntoString.add("a");
        conjuntoString.add("a");//Elemento repetido
        conjuntoString.add("b");//Elemento fuera de orden alfabetico

        for (String s: conjuntoString){
            System.out.println(s + s.hashCode());
        }


        HashMap<String, String> mapa = new HashMap<>();

        mapa.put("00000000T", "Nom alumno 1");
        mapa.put("00000001R", "Nom alumno 2");
        mapa.put("00000002W", "Nom alumno 3");

        String nombre = mapa.get("00000001R");
        System.out.println(nombre);

        for (String llave: mapa.keySet()){
            System.out.println(llave);
        }

        for (String valor: mapa.values()){
            System.out.println(valor);
        }

        for (Map.Entry<String, String> entrada: mapa.entrySet()){
            System.out.println(entrada.getKey());
            System.out.println(entrada.getValue());
        }

       */

        HashMap<String, Pelicula> peliculas = new HashMap<>();
        //crear pelicula de muestra
        Generos terror = new Generos("terror");
        Generos drama = new Generos("drama");
        Generos romance = new Generos("romance");
        Generos cienciaFicion = new Generos("Ciencia ficion");
        ArrayList<Generos> generosTitanic = new ArrayList<>();
        generosTitanic.add(drama);
        generosTitanic.add(romance);
        peliculas.put("1", new Pelicula("1","Titanic",1995, generosTitanic, 1));

        ArrayList<Generos> generosJurassicPark = new ArrayList<>();
        generosJurassicPark.add(terror);
        generosJurassicPark.add(cienciaFicion);
        peliculas.put("2", new Pelicula("2","Jurassic Park",1993,generosJurassicPark,5));

        ArrayList<Generos> generosExorcista = new ArrayList<>();
        generosExorcista.add(terror);
        peliculas.put("3", new Pelicula("3","Exorcista",1975,generosExorcista,3));

        //Dada una id mostrar los datos de esa pelicula
        System.out.println(mostrarPelicula("2", peliculas));

        //implementa metodo de cerca de pelicula por titulo
        System.out.println(buscarPelicula("Exorcista", peliculas));

        //implementa busqueda de peliculas por generos
        ArrayList<Pelicula> pelisculasTerror = busquedaGenero("terror",peliculas);
        ArrayList<Pelicula> pelisculasComedia = busquedaGenero("comedia",peliculas);
        ArrayList<Pelicula> pelisculasDramas = busquedaGenero("drama",peliculas);

        //implementar filtro de año, posar un año minimo y maximo y retornar lista de pelis
    }

    public static String mostrarPelicula(String id, HashMap<String, Pelicula> peliculas){
        //Tenemos que pasar la lista por parametros ya que esto no es una clase que contenga todos los datos en forma de atributo
        Pelicula pelicul = peliculas.get(id);
        return (pelicul != null) ? pelicul.toString(): "";
    }

    public static String buscarPelicula(String titol, HashMap<String, Pelicula> peliculas){
        for (Pelicula peli: peliculas.values()){
            if (peli.getTitulo().equals(titol)){
                return peli.toString();
            }
        }
        return "";
    }

    public static ArrayList<Pelicula> busquedaGenero(String genero, HashMap<String, Pelicula> peliculas){
        //crear un objecto de lista de resultados
        //rocore la lista de la pelicula, una vez con la pelicula recorrer lista de generos for por arraylist
        // si el genero coincide añadir a la lista de resultado
        if(genero == null || peliculas == null){
            return null;
        }

        ArrayList<Pelicula> resultado = new ArrayList<>();
        for (Pelicula entrada : peliculas.values()){
            for (Generos h: entrada.getGeneros()) {
                if (genero.equalsIgnoreCase(h.getNombre())){
                    resultado.add(entrada);
                    break;
                }
            }
        }
        return resultado;
    }

    public static ArrayList<Pelicula> filtroPorAño(int añoMin, int añoMax, HashMap<String, Pelicula> peliculas){

        ArrayList<Pelicula> resultado = new ArrayList<>();
        for (Pelicula entrada : peliculas.values()){
            if (entrada.getAño() >= añoMin && entrada.getAño() <= añoMax) {
                resultado.add(entrada);
            }
        }
        return resultado;
    }

    //Busca pelicula por titulo el titutlo puede ser no completo
    public static ArrayList<Pelicula> busqeudaLetra(String letra, HashMap<String, Pelicula> peliculas){
        ArrayList<Pelicula> resultado = new ArrayList<>();
        for (Pelicula entrada : peliculas.values()){
            if (entrada.getTitulo().contains(letra)){
                resultado.add(entrada);
            }
        }


        return resultado ;
    }


//añadir una nota a la pelicula de 0 a 5 estrellas, buscar por estrellas, cuidado con el seter
//nota minima por ejemplo solo de 3 estrellas para arriba
    public static ArrayList<Pelicula> busquedaEstrella(int estrella, HashMap<String, Pelicula> peliculas){
        ArrayList<Pelicula> resultado = new ArrayList<>();
        for (Pelicula entrada : peliculas.values()){
            if (entrada.getEstrellas() >= estrella){
                resultado.add(entrada);
            }
        }
        return resultado ;
    }

    //añadir director nombre, nacionalidad, fechaNacimiento y pelis, busqueda por directo , entidad es director

}
