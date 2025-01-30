public class nuevoProblema {
    /*lo que falta hacer es comprobar si el movimiento es valido, crear el main donde pedir donde colocar la reina hacinedo un bucle y pedir la siguiente comprobando que la primera reina no se coma a la segundo
     y para comprobar otra reina hay que ver todas las reinas anteriores para ver si se la comen*/
    public char[][] tablero = new char[8][8];

    public boolean movimientoValido(int filaOrigen, int columnaOrigen, int filaFinal, int columnaFinal) {
        //moviemiento valido si
        //dentro de los limites del tablero
        //no en la misma fila
        //no en la misma columna
        //no en la misma diagonal y diagonal inversa


        return false;
    }

    public boolean limteTablero(int filaOrigen, int columnaOrigen, int filaFinal, int columnaFinal) {
        if (filaFinal > tablero.length || filaFinal < tablero[0].length) {
            return false;
        } else if (columnaFinal > tablero.length || columnaFinal< tablero[0].length){
            return false;
        }else {
            return true;
        }
    }

    public boolean mismaFila(int filaOrigen, int columnaOrigen, int filaFinal, int columnaFinal) {
        if (filaOrigen == filaFinal) {
            return true;
        } else {
            return false;
        }
    }

    public boolean mismaColumna(int filaOrigen, int columnaOrigen, int filaFinal, int columnaFinal) {
        if (filaOrigen == filaFinal) {
            return true;
        } else {
            return false;
        }
    }

    public boolean mismaDiagonal(int filaOrigen, int columnaOrigen, int filaFinal, int columnaFinal) {
        //Diagonal normal
        int diferenciaFila = filaFinal - filaOrigen;
        int diferenciaColumna = columnaFinal - columnaOrigen;

        if (diferenciaColumna == diferenciaFila) {
            //diagonal normal
            return true;
        } else if (diferenciaColumna + diferenciaFila == 0) {
            //diagonal inversa
            return true;
        } else {
            return false;
        }
    }
}