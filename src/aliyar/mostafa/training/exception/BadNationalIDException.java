package aliyar.mostafa.training.exception;

public class BadNationalIDException extends RuntimeException {
    public BadNationalIDException() {

    }
    BadNationalIDException(String message) {
        super(message);
    }

}
