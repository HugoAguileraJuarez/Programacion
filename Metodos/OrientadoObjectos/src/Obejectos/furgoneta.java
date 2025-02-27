package Obejectos;

public class furgoneta extends Vehiculo implements Diesel{

    public furgoneta(String marca, int capacidad){
        super(marca,capacidad);
    }

    @Override
    public void setCapacidad(int capacidad) throws Exception {
        if(capacidad <= 0 || capacidad >7){
            throw new Exception("Error bro");
        }
        this.capacidad = capacidad;
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
