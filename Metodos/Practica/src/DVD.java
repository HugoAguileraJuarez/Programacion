public class DVD extends Materiales implements Prestable{
    private String contenido;
    private static int prestado;

    public DVD(String nombre, boolean disponible, String descripcion, String contenido) {
        super(nombre, disponible, descripcion);
        this.contenido = contenido;
    }

    public String getContenido(){
        return contenido;
    }

    public void setContenido(String contenido){
        this.contenido = contenido;
    }

    public int getPrestado(){
        return prestado;
    }

    @Override
    public boolean alquilar() {
        if (isDisponible()){
            return true;
        }
        return false;
    }

    @Override
    public boolean devuelto() {
        if (isDisponible()){
            return true;
        }
        return false;
    }



}
