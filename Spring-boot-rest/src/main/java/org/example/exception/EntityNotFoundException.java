package org.example.exception;

public class EntityNotFoundException extends Exception {

    public EntityNotFoundException(String id) {
        super("entity not found" + id);
    }

}
