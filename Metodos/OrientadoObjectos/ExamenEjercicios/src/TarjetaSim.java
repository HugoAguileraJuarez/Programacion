public class TarjetaSim {
    private String nombre;
    private String operador;
    private Telefono telefono;

    public TarjetaSim(String nombre, String operador){
        this(nombre, operador, null);
    }

    public TarjetaSim(String nombre, String operador, Telefono telefono){
        this.nombre = nombre;
        this.operador = operador;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }



}
