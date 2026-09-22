package p06_regex.domain.exception;

public class InvalidProductException extends Exception {
    public InvalidProductException(String input) {
        super("Invalid Product: "+input);
    }
}
