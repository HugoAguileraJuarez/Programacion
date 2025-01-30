package Instituto;

    public class CicleArray {
        //atributos
        private static String nom;
        private  int nombreAlumnes;
        private Modul[] moduls;
        private int numModuls;


        //constructor
        public CicleArray(String nom, int nombreAlumnes){
            this(nom, nombreAlumnes, 10);
        }

        public CicleArray(String nom, int nombreAlumnes, int maximoModuls){
            this.nom = nom;
            this.nombreAlumnes = nombreAlumnes;
            this.moduls = new Modul[maximoModuls];
            this.numModuls = 0;
        }



        //Metodos
        public boolean añadirModul(Modul modul ){
            if (modul != null && numModuls < moduls.length){
                moduls[numModuls] = modul;
                numModuls++;
                return true;
            }else {
                return false;
            }
        }

        public Modul devolverModul(String nom) {
            if (nom==null){
                return null;
            }
            Modul modul;
            for (int i = 0; i < numModuls; i++){
                modul =  moduls[i];
                if (modul != null && nom.equals(modul.getNombre())){
                    return modul;
                }
            }
            return null;
        }

        public Modul eliminrModul(String nom){
            Modul modul;
            for (int i = 0; i < numModuls; i++){
                modul = moduls[i];
                if (nom.equals(modul.getNombre())){
                    moduls[i] = null;
                    numModuls--;
                }
            }
            return null;
        }


        public int getnumModuls(){
            return numModuls;
        }
        /*public void setModul(){
            this.modul = modul;
            if (modul != null){
                int countModuls = 0;
                for (int i = 0; i < modul.length; i++){
                    if (modul[i] != null){
                        countModuls++;
                    }else {
                        break;
                    }
                }
                this.numModuls = countModuls;
            }
        }*/ //Esto es un reset pero mejor no tenerlo

        public static String getNom(){
            return nom;
        }
        public void setNom(){
            this.nom = nom;
        }

        public int getNombreAlumnes(){
            return nombreAlumnes;
        }
        public void setNombreAlumnes(int i){
            this.nombreAlumnes = nombreAlumnes;
        }


        @Override
        public String toString(){
            return "Cicle = Nombre " + nom +" y numero completo " + nombreAlumnes;
        }


    }



