package java_language.example_constructing_houses.exceptions;

public class DoorAlreadyOpenException extends RuntimeException { //To be a checked exception type!
    public DoorAlreadyOpenException(){super("Door is already open!");}
}
