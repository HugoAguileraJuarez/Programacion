import java.util.Scanner;

public class Calculadora {
    public int suma(int a, int b ){
        //sigantura -> nombre + tipo de parametros
        // suma(int, int)
    //    int s = a + b;
    //    return s;
        return a +b;
    }

    //Sobrecarga i asignatura de un metodo
    //Sobrecarga = metodos con los mismos nombre pero diferente signatura

    public float suma(float a, float b){
        //suma(float, float)
        return a + b;
    }

    //no hacer lo siguiente
    /*public int suma(int primero, int segundo){
        //suma (float, float)
        return 0;
    }

    public float suma (int a, int b){
        //suma (int, int)
        return 0.0f;
    }*/

    //dos formas hacer una array int y puntos suspensivos
    public int sumatorio(int ... nombres){
        int resultado = 0;

        for (int i = 0; i<nombres.length; i++){
            /*int nombre = nombres[i];
            resultado = resultado + nombre;*/
            resultado += nombres[i];
        }
        return resultado;
    }

    public int resta (int a, int b){
        return a - b;
    }
    public float resta (float a, float b){
        return a - b;
    }
    public double resta (double a, double b){
        return a - b;
    }

    /*public int factorial(int nombre){
        int resultado = 1;
        for (int i = nombre; i > 1; i--) {
            resultado *= i;
        }
        return resultado;
    }*/

    // factoria de forma recursiva
    // como minimo siempre hay un caso base y uno recursivo
    public int factorial (int nombre){
        if (nombre > 1) {
            //caso recursivo
            return nombre * factorial(nombre - 1);
        }else {
            //caso base
            return 1;
        }
    }




    public int division(int a, int b){
        return a/b;
    }




    public static void main(String[] args){
        Calculadora calculadora = new Calculadora();
        /* int fact = calculadora.factorial(10);
        System.out.println(fact); */
        Scanner teclado = new Scanner(System.in);
        int a, b;
        boolean salir = false;
        while (!salir){
            System.out.println("Elegie una opcion \n\t 0 es salir, \n\t 1 es suma, \n\t 2 es resta,  \n\t 3 sex, \n\t 4 division, \n\t 5 factorial \n\t 6 send nudes");
            int opcion = teclado.nextInt();
            switch (opcion){
                case 0:
                    salir = true;
                    teclado.close();
                    break;
                case 1:
                    System.out.printf("Introduce el primer numero");
                     a = teclado.nextInt();
                    System.out.printf("Introduce el segundo numero");
                     b = teclado.nextInt();
                    System.out.println("Resultado " + calculadora.suma(a,b));
                    break;
                case 2:
                    System.out.printf("Introduce el primer numero");
                     a = teclado.nextInt();
                    System.out.printf("Introduce el segundo numero");
                     b = teclado.nextInt();
                    System.out.println("Resultado" + calculadora.resta(a,b));
                    break;
                case 3:
                    System.out.println("jajaja puto");
                    salir = true;
                    teclado.close();
                    break;
                case 4:
                    System.out.println("Introduce numero el cual quieres dividir");
                    a = teclado.nextInt();
                    System.out.println("Introduce numero que va a ser el divisor");
                    b = teclado.nextInt();
                    System.out.println("Resultado" + calculadora.division(a,b));
                case 5:
                    System.out.println("Introduce numero el que quiere hacer su factorial");
                    a = teclado.nextInt();
                    System.out.println("Resultado" + calculadora.factorial(a));
                case 6:
                    System.out.println("Como te voy a enviar un nude peruano de los cojones ");
            }
        }



    }


























}
