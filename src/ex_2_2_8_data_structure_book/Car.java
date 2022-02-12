package ex_2_2_8_data_structure_book;

public class Car {
    private final String licensePlate;
    private int numberOfMovements; //Movements this car did when another one was getting out of the parking

    public Car(String licensePlate) {
        this.licensePlate = licensePlate;
        this.numberOfMovements = 0;
    }

    public String getLicensePlate() {
        return this.licensePlate;
    }

    public int getNumberOfMovements() {
        return this.numberOfMovements;
    }

    public void incrementNumberOfMovements() {
        this.numberOfMovements++;
    }
}
