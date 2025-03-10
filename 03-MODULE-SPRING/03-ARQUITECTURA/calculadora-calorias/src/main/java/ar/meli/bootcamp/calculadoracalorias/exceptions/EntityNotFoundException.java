package ar.meli.bootcamp.calculadoracalorias.exceptions;

public class EntityNotFoundException extends RuntimeException {

    public EntityNotFoundException(String message) {
        super(message);
    }

    public EntityNotFoundException(Throwable exception) {
        super(exception);
    }

    public EntityNotFoundException(String message, Throwable exception) {
        super(message, exception);
    }
    
}
