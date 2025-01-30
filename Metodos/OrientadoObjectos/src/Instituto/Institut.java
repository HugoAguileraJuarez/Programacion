package Instituto;

public class Institut {
    public static void main(String[] args){
        Cicle daw = new Cicle("Desenvolapamiento de aplicaciones web", 50);
        //Maneras de hacer print
      //  System.out.println(daw);
        //System.out.println(daw.getNom());
        //System.out.println(daw.getNombreAlumnes());

        //Modificacion de valores
       // daw.setNombreAlumnes(daw.getNombreAlumnes() - 1);
       // System.out.println(daw.getNombreAlumnes()); //Para ver que ha cambaido

        //
        Modul programacion = new Modul("Programacino", 7, daw);
        Modul baseDatos = new Modul("Base de datos", 7, daw);
        Modul lenguaje = new Modul("lenguaje", 7, daw);
        System.out.println(programacion);
        daw.añadirModul(programacion);
        daw.añadirModul(baseDatos);
        daw.añadirModul(lenguaje);

        daw.añadirModul(new Modul("si",1,daw));
        //Imprimir la array para ver si se ha eliminado base de datos

    }
}
