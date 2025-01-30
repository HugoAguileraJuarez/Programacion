package Instituto;

public class Modul {
    //añadir referecnia a cilco
    //atributos, constuctor getter  y settters
    //toString
    //Estos son los elementos que hay que aguardar


    //atributos
    private String nombre;
    private int horasSemanales;
    private Cicle punteroCicle;

    //constructor
    public Modul(String nom, int horasSemanales){
        this(nom, horasSemanales, null);

    }
    public Modul(String nom, int horasSemanales, Cicle punteroCicle){
        //Inicializamos instacia (objecto)
        this.nombre = nom;
        this.horasSemanales = horasSemanales;
        this.punteroCicle = punteroCicle;
    }

    //Metodos
    public Cicle getPunteroCicle() {
        return punteroCicle;
    }
    // poner this.punteroEtc cuando la variable que entra se llama igual

    public void setPunteroCicle(Cicle punteroCicle) {
        this.punteroCicle = punteroCicle;
    }

    public String getNombre() {
        return nombre;
    } //Leer el atrbituo privado, con el puntero
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }//Modificar el atributo privado, con el puntero
    public int getHorasSemanales() {
        return horasSemanales;
    }
    public void setHorasSemanales(int horasSemanales) {
        this.horasSemanales = horasSemanales;
    }

    //para hacer un println a un objecto hay que hacer un metodo el metodo tostring y nos daria el valor del objecto
    @Override
    public String toString() {
        //se puede hacer un if pero no es lo suyo
        //s.equals("") esto esta bien pero es mejorable
        //"".equals(s) esto es lo correcto

        //TERNARIAS
        //es una expresion if else
        //(condicion if) ? valor de caso verdadero : valor de caso falso
       // resultat = (punteroCicle != null) ? "nombre ciclo" : "ciclo null";

       // return (punteroCicle!= null) ? "nombre clase" : "ciclo null"; // esta es la mejor opcion
        return "Modul2{" + "nom " + nombre + ", horas semanales " + horasSemanales + ", ciclos " + ((punteroCicle!= null) ? punteroCicle.getNombreAlumnes() : "null")+ "}";
    }   // esta es la mejor opcion de todas metemos la ternaria dentro del return
}
