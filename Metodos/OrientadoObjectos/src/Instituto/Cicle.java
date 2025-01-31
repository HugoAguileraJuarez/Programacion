package Instituto;

public class Cicle {
    private String nom;  // Atributo no estático
    private int nombreAlumnes;
    private Modul[] moduls;
    private int numModuls;

    public Cicle(String nom, int nombreAlumnes, int maxModuls) {
        this.nom = nom;
        this.nombreAlumnes = nombreAlumnes;
        this.moduls = new Modul[maxModuls];
        this.numModuls = 0;
    }
    public Cicle(String nom, int nombreAlumnes){
        this(nom, nombreAlumnes, 3);
    }

    // Getters y Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNombreAlumnes() {
        return nombreAlumnes;
    }

    public void setNombreAlumnes(int nombreAlumnes) {
        this.nombreAlumnes = nombreAlumnes;
    }

    @Override
    public String toString(){
        return "Cicle = Nombre " + nom +" y numero completo " + nombreAlumnes;
    }

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
