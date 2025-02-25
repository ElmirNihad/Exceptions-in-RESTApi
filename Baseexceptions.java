package org.example.exceptionsrestapi.Exceptions;

public class Baseexceptions extends RuntimeException {

    public Baseexceptions(ErrorMessage errorMessage) {
        super(errorMessage.PrepareErrorMessage());
    }
}
