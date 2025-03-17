package scu.wcc.myexception.test;

public class NameFormatException extends RuntimeException{
    public NameFormatException() {
    }

    public NameFormatException(String message) {
        super(message);
    }
}
