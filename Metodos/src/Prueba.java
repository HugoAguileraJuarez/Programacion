import java.util.Arrays;
import java.util.Scanner;

public class Prueba {
    // Ejercicio de menu donde saldra 3 opciones ordenacion (normal, bimbolla y insercion), busqueda (normal, binario, fibi)

    // fibonachi: base fib (0 valor entrada) =0, fib(1 valor entrada ) = 1
    //fibonachi : recursivo fib (n valor entrada) = fib(n-1) + fib(n-2)

    // examen uno de ordenacion uno de busqueda y un algorismo recursivo

    // ordeancion normal es escanear todos de la raiz y buscar el numero mas pequeño para que luego crear otra raiz e ir colocando los numeros

    public int fibonachi(int nombre){
        if (nombre > 1){
            return (nombre - 1) + (nombre -2);
        } else if (nombre == 1) {
            return 1;
        }else {
            return 0;
        }
    }

    public int[] ordenacion(int[] array) {
        int valorMin;

        for (int i = 0; i < array.length; i++) {
            valorMin = i; //Colocamos el valor mas pequeño actualmente en dicha posicion porque no sabemos los otros

            // Buscamos el valor mas pequeño
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[valorMin]) {
                    valorMin = j;
                }
            }
            // Intercambio de valor
            int temp = array[i]; //Guardamos el valor de la array original
            array[i] = array[valorMin]; //Colocamos el valor mas pequeño en la array actual
            array[valorMin] = temp;
        }
        return array;
    }

    public int[] ordenacionInsercion(int[] array){
        for (int i = 0; i < array.length; i++){
            int temp = array[i];
            int j = i;

            while (j > 0 && temp < array[j-1]){
                array[j] = array[j-1];
                j = j-1; //baja un escalon osea si estamos en 1 pasa a 0
            }
            array[j] = temp; //y una vez bajado la posicion que ahora estamos a 0 colocamos el valor menor en dicha posicion
        }
        return array;
    }

    public int[] ordenacionBurbuja(int[] array){
        for (int i = 0; i< array.length; i++){
            int contador = i;
            for (int j = 1; j<array.length; j++){
                if (array[j -1] > array[j]){
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j]=temp;
                }
            }
        }
        return array;
    }





    public static void main(String[] args) {
        Prueba menu = new Prueba();
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        int[] array = new int[5];
        int valor;

        while (!salir) {
            System.out.println("Elije una opcion de las siguientes. \n\t 1 Metodo de ordenacion. \n\t 2 Metodo de busqueda. \n\t 3 Recursivo fibonachi. \n\t 4 Salir");
            int opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Elije una de las tres opciones de ordenacion \n\t 1 Metodo normal. \n\t 2 Metodo burbuja. \n\t 3 Metodo Insercion");
                    opcion = teclado.nextInt();
                    switch (opcion) {
                        case 1:
                            System.out.println("Añade los valores que quieres ordenar de manera normal");
                            for (int i = 0; i < array.length; i++) {  // Condición corregida: i < array.length
                                array[i] = teclado.nextInt();
                            }
                            System.out.println("El orden es " + Arrays.toString(menu.ordenacion(array)));
                            break;
                        case 2:
                            System.out.println("Añade los valores que quieres ordenar de manera normal");
                            for (int i = 0; i < array.length; i++) {  // Condición corregida: i < array.length
                                array[i] = teclado.nextInt();
                            }
                            System.out.println("El orden es " + Arrays.toString(menu.ordenacionBurbuja(array)));                            break;
                        case 3:
                            System.out.println("Añade los valores que quieres ordenar de manera normal");
                            for (int i = 0; i < array.length; i++) {  // Condición corregida: i < array.length
                                array[i] = teclado.nextInt();
                            }
                            System.out.println("El orden es " + Arrays.toString(menu.ordenacionInsercion(array)));
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Elije una de las dos opciones de busqueda \n\t 1 Metodo normal. \n\t 2 Metodo binario.");
                    opcion = teclado.nextInt();
                    switch (opcion) {
                        case 1:
                            // Implementa el método de búsqueda normal
                            break;
                        case 2:
                            // Implementa el método de búsqueda binaria
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Inserte el valor para hacer el Fibonacci");
                    valor = teclado.nextInt();
                    System.out.println("Fibonacci = " + menu.fibonachi(valor));
                    break;
                case 4:
                    salir = true;
                    teclado.close();
                    break;
            }
        }
    }
}