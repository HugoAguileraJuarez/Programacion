import java.util.Scanner;

public class Menu {
    public static void main(String []args){
        Menu menu = new Menu();
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        salirBucle: //esto es una etiqueta para poder decidir donde salir con el break en un bucle
        while (!salir){
            System.out.println("Menu de la gran bibliteca eliga unas de las siguientes opciones:" +
                    "\n\t Si quieres meter un nueva material pulse 1 \n\t Si quieres eliminar un material pulse 2 \n\t Para la lista de los elementos pulse 3 " +
                    "\n\t Buscar por algun tipo pulse 4 \n\t Buscar informacion sobre un material detallado pulse 5 \n\t Para alquilar un libro pulse 6 \n\t Para devolver un libro pulse 7");
            int selecion = teclado.nextInt();
            switch (selecion){
                case 1:
                menu.busquedaNombre();

            }



        }




    }


}
