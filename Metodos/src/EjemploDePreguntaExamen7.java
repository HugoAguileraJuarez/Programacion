public class EjemploDePreguntaExamen7 {
    public String subcadena(String cadena, int indiceInicio, int indiceFinal) {
        if (cadena == null || indiceInicio < 0 || indiceFinal < 0 || indiceFinal < indiceInicio) {
            // Argumentos falsos
            return null;
        }

        char[] arrayCaracter = cadena.toCharArray();
        char[] arrayResultado = new char[indiceFinal - indiceInicio + 1];

        // Corregir el bucle para copiar los caracteres correctamente
        for (int i = 0; i < arrayResultado.length; i++) {
            arrayResultado[i] = arrayCaracter[indiceInicio + i]; // Uso correcto de índice
        }

        return String.valueOf(arrayResultado);
    }

    public boolean esNum(String cadena) {
        if (cadena == null) {
            return false;
        }
        char[] arrayComprobar = cadena.toCharArray();
        for (int i = 0; i < arrayComprobar.length; i++) {
            char caracter = arrayComprobar[i];
            switch (caracter) {
                case '0','1','2','3','4','5','6','7','8','9':
                    continue;
                default:
                    return false;
            }
        }
        return true;
    }

    public boolean esValido(String dni) {
        String digitos = subcadena(dni, 0, 7);
        if (esNum(digitos)) {
            String caracter = subcadena(dni, 8, 8);
            String letras = "TRWAGMYFPDXBNJZSQVHLCKE";

            int numerosDNI = Integer.parseInt(digitos);
            int indexLetras = numerosDNI % 23;
            String letraCorrecta = subcadena(letras, indexLetras, indexLetras);
            return caracter.equalsIgnoreCase(letraCorrecta);

        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        EjemploDePreguntaExamen7 instanciaDNI = new EjemploDePreguntaExamen7();
        String valorDNI = "00000002W";
        if (instanciaDNI.esValido(valorDNI)) {
            System.out.println("DNI valido");
        } else {
            System.out.println("DNI no valido");
        }
    }
}
