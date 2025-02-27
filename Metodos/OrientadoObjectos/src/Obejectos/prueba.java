package Obejectos;

public class prueba {
    public static void main(String[] args){
        Coche c = new Coche("peugot", 5, true);

        System.out.println(c.hasAireAcondicionado());

        Vehiculo v = c; //c es coche y hacemos que v se comporta como un coche

        System.out.println(v); //toString se ha sobre escrito.
/*
       Vehiculo fur = new Vehiculo("peugot", 9);
        System.out.println(fur);
        System.out.println(((Coche)v).hasAireAcondicionado());
       System.out.println(((Coche)fur).hasAireAcondicionado());

        System.out.println(c.identificar());

        System.out.println(fur.identificar());

        System.out.println(c.getClass());
        System.out.println(v.getClass());
        System.out.println(fur.getClass());

        System.out.println(c instanceof Coche);
        System.out.println(c instanceof Vehiculo);
        System.out.println(fur instanceof Coche); //Da falso ya que furgoneta solo es veichulo y no coche
        System.out.println(fur instanceof Vehiculo);
*/

        Tesla teslaRojo = new Tesla("Tesla",5,true);
        Electrico teslaCanostra = teslaRojo;
        try{
            teslaRojo.setCapacidad(2);
            teslaRojo.setCapacidad(-2);
        }catch (Exception e){
            e.printStackTrace(); //imprimir la pila de llamado de exepcion
        }


    }
    public void compra()throws StockExecption{
        throw new StockExecption();
    }

    public void pruebasExepcion(){
        pruebasExepcion2();
    }

    public void pruebasExepcion2(){
        pruebasExepcion3();
    }


    public void pruebasExepcion3(){
        int numerador = 3;
        int denominador = 8;
        try {
            int resultado = numerador / denominador;

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Excuta finally");
        }
    }

}


