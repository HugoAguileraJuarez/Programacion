package Contenodores;

import java.util.ArrayList;

public class Pruebas {
    public static void main(String[] args){
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






    }



}
