import java.util.Arrays;
import java.util.Scanner;

public class Prueba {
    public int busquedaLineal(int[] array, int valorBuscado) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valorBuscado) {
                return i; // Retorna la posición donde se encontró el valor
            }
        }
        return -1; // Retorna -1 si no se encontró el valor
    }

    // Método de búsqueda binaria (requiere array ordenado)
    public int busquedaBinaria(int[] array, int valorBuscado) {
        int izquierda = 0, derecha = array.length - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            if (array[medio] == valorBuscado) {
                return medio; // Retorna la posición donde se encontró el valor
            }
            if (array[medio] < valorBuscado) {
                izquierda = medio + 1; // Buscar en la mitad derecha
            } else {
                derecha = medio - 1; // Buscar en la mitad izquierda
            }
        }
        return -1;// Retorna -1 si no se encontró el valor
    }

    public int fibonachi(int n) {
        if (n == 0) return 0; // Caso base 1
        if (n == 1) return 1; // Caso base 2
        return fibonachi(n - 1) + fibonachi(n - 2); // Llamada recursiva
    }

    //  Métodos de ordenación
    public int[] ordenacion(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int valorMin = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[valorMin]) {
                    valorMin = j;
                }
            }
                int temp = array[i];
                array[i] = array[valorMin];
                array[valorMin] = temp;

        }
        return array;
    }

    public int[] ordenacionInsercion(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            int j = i;
            while (j > 0 && temp < array[j - 1]) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = temp;
        }
        return array;
    }

    public int[] ordenacionBurbuja(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
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

        while (!salir) {
            System.out.println("Elije una opción: \n\t1. Ordenación \n\t2. Búsqueda \n\t3. Fibonacci \n\t4. Salir");
            int opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Elige un método de ordenación: \n\t1. Normal \n\t2. Burbuja \n\t3. Inserción");
                    opcion = teclado.nextInt();
                    System.out.println("Introduce 5 números:");
                    for (int i = 0; i < array.length; i++) {
                        array[i] = teclado.nextInt();
                    }
                    switch (opcion) {
                        case 1:
                            System.out.println("Ordenado: " + Arrays.toString(menu.ordenacion(array)));
                            break;
                        case 2:
                            System.out.println("Ordenado: " + Arrays.toString(menu.ordenacionBurbuja(array)));
                            break;
                        case 3:
                            System.out.println("Ordenado: " + Arrays.toString(menu.ordenacionInsercion(array)));
                            break;
                    }
                    break;

                case 2:
                    System.out.println("Elige un método de búsqueda: \n\t1. Lineal \n\t2. Binaria");
                    opcion = teclado.nextInt();
                    System.out.println("Introduce 5 números (para la búsqueda binaria, introduce en orden creciente):");
                    for (int i = 0; i < array.length; i++) {
                        array[i] = teclado.nextInt();
                    }
                    System.out.println("Introduce el número a buscar:");
                    int valorBuscado = teclado.nextInt();

                    if (opcion == 1) {
                        int resultado = menu.busquedaLineal(array, valorBuscado);
                        if (resultado != -1) {
                            System.out.println("Número encontrado en la posición: " + resultado);
                        } else {
                            System.out.println("Número no encontrado.");
                        }
                    } else if (opcion == 2) {
                        // Asegurar que el array está ordenado antes de la búsqueda binaria
                        Arrays.sort(array);
                        int resultado = menu.busquedaBinaria(array, valorBuscado);
                        if (resultado != -1) {
                            System.out.println("Número encontrado en la posición: " + resultado);
                        } else {
                            System.out.println("Número no encontrado.");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Introduce un número para calcular Fibonacci:");
                    int valor = teclado.nextInt();
                    System.out.println("Fibonacci(" + valor + ") = " + menu.fibonachi(valor));
                    break;

                case 4:
                    salir = true;
                    teclado.close();
                    break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }
    }
}
