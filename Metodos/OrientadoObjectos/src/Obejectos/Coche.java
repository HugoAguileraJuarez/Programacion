package Obejectos;

public class Coche  extends Vehiculo{
    private boolean aireAcondicionado;

 public Coche(String marca, int capacidad, boolean aireAcondicionado){
     super(marca, capacidad);
     this.aireAcondicionado = aireAcondicionado;
 }

    public boolean hasAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public void setcapacidad (int capacidad){
     if (capacidad <= 7){
         this.capacidad = capacidad;
     }
    }

    @Override
    public String toString() {
        return "Coche{" +
                "aireAcondicionado=" + aireAcondicionado +
                ", marca='" + marca + '\'' +
                ", capacidad=" + capacidad +
                '}';
    }

    @Override
    public String identificar(){
     return "Soy un coche";
    }

}
