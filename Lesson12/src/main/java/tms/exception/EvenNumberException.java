package tms.exception;

public class EvenNumberException extends Exception {
    public EvenNumberException() {
    }

    public EvenNumberException(String message) {
        super(message);
    }

    public EvenNumberException(String message, Throwable cause) {
        super(message, cause);
    }
}