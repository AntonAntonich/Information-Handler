package by.anton.ih.exception;

public class UnsupportedOperationException extends Exception{
    public UnsupportedOperationException() {
    }

    public UnsupportedOperationException(String message) {
        super(message);
    }

    public UnsupportedOperationException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnsupportedOperationException(Throwable cause) {
        super(cause);
    }
}
