import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void main(String []args){
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.addLibro("El Principito", "Antoine de Saint-Exupéry", "Un clásico de la literatura", 96);


        /*
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        salirBucle: //esto es una etiqueta para poder decidir donde salir con el break en un bucle
        while (!salir){
            System.out.println("Menu de la gran bibliteca eliga unas de las siguientes opciones:" +
                    "\n\t Si quieres meter un nueva material pulse 1 \n\t Si quieres eliminar un material pulse 2 \n\t Para la lista de los elementos pulse 3 " +
                    "\n\t Buscar informacion sobre un material detallado pulse 4 \n\t Para alquilar un libro pulse 5 \n\t Para devolver un libro pulse 6");
            int selecion = teclado.nextInt();
            switch (selecion){
                case 1:
                //aqui iria algun tipo de put o iria en bibliteca pero tocaria poner que intruduciera valores y tener algun tipo de control de errores

                case 2:
                    //aqui toccaria la eliminacion que eso ya no se como se haria pero me imagino algun tipo de metodo o algo parecido
                case 3:
                    //aqui tocaria ir al metodo en biblioteca para donde meteria todos los valores en una arraylist y que los mostara
                case 4:
                    //aqui seria un ir al metodoen biblioteca pero antes con un if y un equalinorecase para ver cual de los tres quiere buscar y asi pasarle al metodo el tipo que ya quiere de materiales
                    // de manera que le devolvorveria el material
                case 5:
                    //aqui se volveria a preguntar el material que quiere aluilar que solo hay dos en esta ocacion de materiales, iria al metodo donde dicho material con ese nombre donde se comprueba si esta disponible
                    //para que despues si es asi lo preste haciendo que el material pase a estar ocupado y sumando un valor a los prestados
                case 6:
                    //aqui tocaaria volver a pedir que material quiere devolver para que vaya al metodo para comprobar primero si esta ocupado para luego cambiar su disponibilidad a verdadero que seria al contrario que el
                    //caso anterior de manera que se descontaria un valor total al los prestados



            }



        }

        */



    }


}
