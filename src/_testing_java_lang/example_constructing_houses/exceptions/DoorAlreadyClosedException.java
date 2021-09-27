package _testing_java_lang.example_constructing_houses.exceptions;

public class DoorAlreadyClosedException extends RuntimeException { //To be a checked exception
    public DoorAlreadyClosedException(){super("Door is already closed!");}
}
