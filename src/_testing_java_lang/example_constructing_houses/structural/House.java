package _testing_java_lang.example_constructing_houses.structural;

public class House {
    private String color;
    private int totalOfDoorsAdded;
    private Door doors[];

    public House(String color, int totalOfDoors) {
        this.color = color;
        this.totalOfDoorsAdded = 0;
        this.doors = new Door[totalOfDoors]; //Creating an array to keep references for objects on memory
    }

    public void paint(String newColor) {
        this.color = newColor;
    }

    public int openDoors() {
        if(this.totalOfDoorsAdded == 0) return 0;
        int result = 0;
        for (Door dr : this.doors) if (dr.isOpen()) result++;
        return result;
    }

    public void addDoor(Door newDoor) throws IllegalArgumentException {
        if (newDoor == null) throw new IllegalArgumentException("Invalid argument!");
        if (this.totalOfDoorsAdded == this.doors.length) {
            Door[] newArray = new Door[this.totalOfDoorsAdded + 1]; //Expanding the size of our array creating another one
            for (int i = 0; i < this.totalOfDoorsAdded; i++) newArray[i] = this.doors[i];
            newArray[this.totalOfDoorsAdded++] = newDoor;
            this.doors = newArray;
        } else this.doors[this.totalOfDoorsAdded++] = newDoor;
    }

    public int totalOfDoors() {
        return this.totalOfDoorsAdded;
    }

    public Door getDoor(int index) {
        if (this.totalOfDoorsAdded == 0 || index < 0 || index > this.totalOfDoorsAdded - 1) return null;
        return this.doors[index];
    }

    public String info(){
        return "Doors: " + this.totalOfDoorsAdded + "\n" + "Open doors: " + this.openDoors() + "\n" + "Color: " + this.color;
    }
}
