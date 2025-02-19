package Obejectos;

public class Mustang extends Coche implements Gasolina{

    public Mustang(String marca, int capacidad, boolean aireAcondicionado) {
        super(marca, capacidad, aireAcondicionado);
    }


    @Override
    public boolean revisarSistemaInyencion(){
        return true;
    }
}
