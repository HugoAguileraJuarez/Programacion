public class Revista extends Materiales {
    private String editorial;

    public Revista(String nombre, boolean disponible, String descripcion, String editorial) {
        super(nombre, disponible, descripcion);
        this.editorial = editorial;
    }

    public String getEditorial(){
        return editorial;
    }

    public void setEditorial(String editorial){
        this.editorial = editorial;
    }


}
