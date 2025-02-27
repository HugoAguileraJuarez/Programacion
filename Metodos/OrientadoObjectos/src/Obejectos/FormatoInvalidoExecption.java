package Obejectos;

public class FormatoInvalidoExecption extends RuntimeException {
    public FormatoInvalidoExecption(String message) {
        super("Formato invalido " + message);

    }
}
