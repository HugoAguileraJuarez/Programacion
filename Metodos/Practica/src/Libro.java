public class Libro extends Materiales implements Prestable{
    private String autor;
    private int numPaginas;
    private static int prestados;
    private boolean prestado;

    public Libro(String nombre, boolean prestado, String descripcion, String autor, int numPaginas) {
        super(nombre, descripcion);
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
