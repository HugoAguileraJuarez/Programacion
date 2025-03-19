public class DVD extends Materiales implements Prestable{
    private String contenido;
    private static int prestados;
    private boolean prestado;

    public DVD(String nombre, String descripcion, String contenido, boolean estado) {
        super(nombre, descripcion);
        this.contenido = contenido;
        this.prestado = false;
    }

    public String getContenido(){
        return contenido;
    }

    public void setContenido(String contenido){
        this.contenido = contenido;
    }

    public int getPrestado(){
        return prestados;
    }

    @Override
    public boolean alquilar() {
        if (!prestado){
            prestado = true;
            prestados++;
            return true;
        }
        return false;
    }

    @Override
    public boolean devuelto() {
        if (prestado){
            prestado = false;
            prestados++;
            return true;
        }
        return false;
    }


}