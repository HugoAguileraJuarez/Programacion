package Contenodores;

public class Lista<T> {

    private Nodos<T> primero;
    private int tamaño;
    private Nodos<T> ultimo;

    public Lista(Nodos<T> primero){
        this.primero = primero;
        this.tamaño = ( primero != null) ? 1 : 0;
        this.ultimo = primero;
    }

    public int getTamaño(){
        return tamaño;
    }

    public Nodos<T> getNodos(int indice){
        if (indice < 0 || indice >= this.tamaño){
            return null;
        }
        Nodos<T> nodo = this.primero;
        int contador = 0;
        do {
            if (contador == indice){
                return nodo;
            }else {
                contador++;
                nodo = nodo.getSiguiente();
            }
        }while (nodo != null);

        return null;
    }

    public void añadirNodo(Nodos<T> nodos){
        //si no pasa el indice se añade al final
        Nodos<T> n = this.primero;
        this.ultimo.setSiguiente(nodos);
        this.ultimo = nodos;
        this.tamaño++;
    }


    public void imprimirLista(){
        Nodos<T> nodo = this.primero;
        while ((nodo != null)){
            System.out.println(nodo);
            nodo = nodo.getSiguiente();
        }
    }








}
