package Obejectos;

public class Tesla extends Coche implements Electrico{
    private  int vidaBateria;

    public Tesla(String marca, int capacidad, boolean aireAcondicionado){
        super(marca,capacidad,aireAcondicionado);
        this.vidaBateria = 100;
    }

    //Como hemos puesto implemente Electrico no se quejara ya que tenemos el metodo implementado
    public boolean revisarBateria(){
        //Esto comprueba la bbateria este OK
        return (vidaBateria > NivelCriticoBateria);
    }

}
