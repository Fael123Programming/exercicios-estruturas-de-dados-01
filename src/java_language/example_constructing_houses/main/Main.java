package java_language.example_constructing_houses.main;

import java_language.example_constructing_houses.structural.Door;
import java_language.example_constructing_houses.structural.House;

import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        PrintStream cmd = System.out;
        House mine = new House("Blue",3);
        mine.addDoor( new Door("Wood"));
        mine.paint("Yellow");
        mine.getDoor(0).openDoor();
        mine.addDoor(new Door("Metal"));
        mine.getDoor(1).openDoor();
        mine.addDoor(new Door("Cotton"));
        mine.getDoor(2).openDoor();
        mine.addDoor(new Door("Plastic"));
        mine.getDoor(3).openDoor();
        mine.getDoor(0).closeDoor();
        mine.paint("Purple");
        cmd.println(mine.info());
    }
}
