package ex_2_2_8_data_structure_book;

public class Main {
    public static void main(String[] args) {
        Parking basheminParking = new Parking();
        Car cr1 = new Car("ERT 4567"), cr2 = new Car("ABZ 3412"), cr3 = new Car("IOP 9090");
        Car cr4 = new Car("WWQ 8891"), cr5 = new Car("OPW 1110");
        //Inserting new cars into our parking
        basheminParking.parkCar(cr1);
        basheminParking.parkCar(cr2);
        basheminParking.parkCar(cr3);
        basheminParking.parkCar(cr4);
        basheminParking.parkCar(cr5);
        //-----------------------------------
        basheminParking.vacatePlace(0); //Taking cr1 out of the parking
        basheminParking.vacatePlace(1); //Taking cr3 out of the parking
        basheminParking.vacatePlace(); //Taking cr5 out of the parking
        //basheminParking.vacatePlace(0); //Taking cr3 of the parking
        Main.showCars(basheminParking.getCars());
        System.out.println("Can park any car? " + basheminParking.canPark());
        System.out.println("Free places: " + basheminParking.freeSpaces());
        System.out.println("Occupied places: " + basheminParking.occupiedSpaces());
    }

    private static void showCars(Car []cars){
        if(cars == null) return;
        Car car;
        System.out.println("--- Entry/exit of the parking ---");
        for(byte counter = 0; counter < cars.length; counter++) {
            car = cars[counter];
            System.out.println("-> License plate: " + car.getLicensePlate()+"\t Number of movements: " + car.getNumberOfMovements()+"\t Position in parking: " + counter);
        }
    }
}
