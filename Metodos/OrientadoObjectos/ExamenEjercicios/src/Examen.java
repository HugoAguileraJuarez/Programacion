
public class Examen {
    public int ex1(int base, int exponenete){
        if (exponenete == 0){
            return 1;
        }else {
            return base * ex1(base, exponenete -1);
        }
    }




    public static void main(String[] args){
        Examen r = new Examen();
        System.out.println(r.ex1(3,3));

    }

}