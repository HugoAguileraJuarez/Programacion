public class Libro extends Materiales implements Prestable{
    private String autor;
    private int numPaginas;
    private static int prestados;

    public Libro(String nombre, boolean disponible, String descripcion, String autor, int numPaginas) {
        super(nombre, disponible, descripcion);
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public int getNumPaginas(){
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas){
        this.numPaginas = numPaginas;
    }

    public int getPrestados(){
        return prestados;
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
        return false;
    }




}
