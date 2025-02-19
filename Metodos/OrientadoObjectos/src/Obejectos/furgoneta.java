package Obejectos;

public class furgoneta extends Vehiculo implements Diesel{

    public furgoneta(String marca, int capacidad){
        super(marca,capacidad);
    }

    @Override
    public String identificar() {
        return "Soy una furgoneta";
    }

    @Override
    public boolean revisarSistemasCirculacionCasos(){
        return false;
    }

    @Override
    public boolean revisarBombaInyencion(){
        return false;
    }

}
