package Obejectos;

public class Coche  extends Vehiculo{
    private boolean aireAcondicionado;
    private static int contador = 0;

 public Coche(String marca, int capacidad, boolean aireAcondicionado){
     super(marca, capacidad);
     this.aireAcondicionado = aireAcondicionado;
     contador++;
 }

    public static void borrarCoche(){
     contador--;
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
    public void setCapacidad(int capacidad) throws Exception {
        if (capacidad <=7 && capacidad >0){
            this.capacidad = capacidad;
        }else {
            throw new Exception("Capacidad no valida");
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
