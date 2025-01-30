import java.util.Scanner;

public class Ejercicio4 {
    public static boolean comprueba(int numero){
        if (numero %2 ==0){
            return true;
        }
        return false;
    }

    public static int Scanner(){
        System.out.println("Escribre un entero");
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        return numero;
    }


  public static void main(String[] args){
        int entero = Scanner();
        if (comprueba(entero)){
            System.out.println("Es par");
        }else {
            System.out.println("No es par");
        }


  }
}