public abstract class Materiales {
    private String nombre;
    private boolean disponible;
    private String descripcion;


    public Materiales(String nombre, boolean disponible, String descripcion){
        this.disponible = disponible;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }



    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


}
