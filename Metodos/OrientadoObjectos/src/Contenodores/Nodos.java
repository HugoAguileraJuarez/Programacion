package Contenodores;

public class Nodos<T> {
    private T contenido;
    private Nodos siguiente;


    public Nodos(T valor){
        this.contenido = valor;
        this.siguiente = null;
    }

    public T getContenido(){
        return contenido;
    }

    public void setContenido(T contenido) {
        this.contenido = contenido;
    }

    public Nodos getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodos siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "Nodos{ " +
                "contenido ='" + contenido + '\'' +
                ", siguiente=" + ((siguiente != null) ? siguiente.getContenido() : "null") +
                '}';
    }
}
