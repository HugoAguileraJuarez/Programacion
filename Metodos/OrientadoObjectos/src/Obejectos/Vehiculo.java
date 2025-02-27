package Obejectos;

public abstract class Vehiculo {
    protected String marca;
    protected int capacidad;

    public Vehiculo(String marca, int capacidad){
        this.marca = marca;
        this.capacidad = capacidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public abstract void setCapacidad(int capacidad) throws Exception;
//

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", capacidad=" + capacidad +
                '}';
    }

    public abstract String identificar(); // como el metodo es abstracto hay que eliminar {} y poner ;


}
