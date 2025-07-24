package epicode.u5d8hw.exceptions;

public class NotFoundException extends RuntimeException {

    public NotFoundException(int id) {
        super(id + " non trovato!");
    }
}