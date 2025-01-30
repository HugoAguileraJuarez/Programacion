import java.util.Scanner;

public class Ejercicio5 {
    public static float media (float numero){
        float media =  numero/3;
        return media;
    }

    public static float scanner() {
        //se puede hacer con un float array
        float num = 0;
        for (int i = 0; i < 3; i++){
            System.out.println("Introduce numero");
            Scanner teclado = new Scanner(System.in);
            num = teclado.nextInt();
            num += num;
        }
        return  num;
    }
    public static void main(String[] args){
        float numero = scanner();
        System.out.println("La media es " + media(numero));
    }
}
