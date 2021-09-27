package _testing_java_lang.example_constructing_houses.structural;

import _testing_java_lang.example_constructing_houses.exceptions.*;

public class Door {
    private boolean isOpen;
    private String material;

    public Door(String material) {
        this.material = material;
    }

    public void openDoor() throws DoorAlreadyOpenException {
        if (this.isOpen) throw new DoorAlreadyOpenException();
        this.isOpen = true;
    }

    public void closeDoor() throws DoorAlreadyClosedException {
        if (!this.isOpen) throw new DoorAlreadyClosedException();
        this.isOpen = false;
    }

    public boolean isOpen(){return this.isOpen;}
}
