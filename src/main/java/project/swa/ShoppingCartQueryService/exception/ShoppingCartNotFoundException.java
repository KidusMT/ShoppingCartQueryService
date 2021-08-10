package project.swa.ShoppingCartQueryService.exception;

public class ShoppingCartNotFoundException extends RuntimeException {

    public ShoppingCartNotFoundException(String message) {
        super(message);
    }

    public ShoppingCartNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
