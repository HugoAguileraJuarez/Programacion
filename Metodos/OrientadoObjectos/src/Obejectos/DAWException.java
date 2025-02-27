package Obejectos;

public class DAWException extends RuntimeException {
    public DAWException(String message) {
        super("DAW: " + message);


    }
}
