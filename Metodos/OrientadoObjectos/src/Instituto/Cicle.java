package Instituto;

/**
 * Clase donde se crearan y añadiran ciclos de cursos.
 * @author Hugo Aguilera Juarez
 * @see Institut hace referencia al main
 * @version ultima version
 */
public class Cicle {
    private String nom;  // Atributo no estático
    private int nombreAlumnes;
    private Modul[] moduls;
    private int numModuls;

    /**
     * Constructor de ciclo
     * @param nom
     * @param nombreAlumnes
     * @param maxModuls
     */
    public Cicle(String nom, int nombreAlumnes, int maxModuls) {
        this.nom = nom;
        this.nombreAlumnes = nombreAlumnes;
        this.moduls = new Modul[maxModuls];
        this.numModuls = 0;
    }

    /**
     * Segundo constructor de ciclo
     * @param nom
     * @param nombreAlumnes
     */
    public Cicle(String nom, int nombreAlumnes){
        this(nom, nombreAlumnes, 3);
    }

    /**
     * Getter de nombre ciclo
     * @return
     */
    // Getters y Setters
    public String getNom() {
        return nom;
    }

    /**
     * Setter de nombre de ciclo
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter del numero de alumnos
     * @return
     */
    public int getNombreAlumnes() {
        return nombreAlumnes;
    }

    /**
     * Setter del numero de alumnos
     * @param nombreAlumnes
     */
    public void setNombreAlumnes(int nombreAlumnes) {
        this.nombreAlumnes = nombreAlumnes;
    }

    /**
     * Retun para enviarlo al main
     * @see Institut
     * @return
     */
    @Override
    public String toString(){
        return "Cicle = Nombre " + nom +" y numero completo " + nombreAlumnes;
    }

    /**
     * Metodo para añadir modulos
     * @param modul
     * @return
     */
    public boolean añadirModul(Modul modul) {
        if (modul == null) {
            return false;
        }

        if (numModuls == moduls.length) {
            Modul[] array = new Modul[moduls.length + 1];
            for (int i = 0; i < moduls.length; i++) {
                array[i] = moduls[i];
            }
            moduls = array;
        }
            moduls[numModuls] = modul;
            modul.setPunteroCicle(this);
            numModuls++;
            return true;
    }


    /**
     * Metodo para devolver los modulos
     * @param nom
     * @return
     */
    public Modul devolverModul(String nom) {
        if (nom == null) {
            return null;
        }
        for (int i = 0; i < numModuls; i++) {
            if (nom.equals(moduls[i].getNombre())) {
                return moduls[i];
            }
        }
        return null;
    }

    /**
     * Metodo para eliminar modulos
     * @param nom
     * @return
     */
    public boolean eliminarModul(String nom) {
        if (nom == null) {
            return false;
        }
        for (int i = 0; i < numModuls; i++) {
            if (nom.equals(moduls[i].getNombre())) {
                moduls[i].setPunteroCicle(null);
                if (numModuls > 1){
                    //si queda un solo modul no va ejecutar esta linia
                    moduls[i] = moduls[numModuls - 1];
                }
                moduls[numModuls - 1] = null;
                numModuls--;
                return true;
            }
        }
        return false;
    }



}
