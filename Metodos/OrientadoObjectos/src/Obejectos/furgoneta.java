package Obejectos;

public class furgoneta extends Vehiculo{

    public furgoneta(String marca, int capacidad){
        super(marca,capacidad);
    }

    @Override
    public String identificar() {
        return "Soy una furgoneta";
    }


}
