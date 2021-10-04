package ex_2_2_8_data_structure_book;

import _dynamicstack.Stack;

public class Parking {
    private int capacity;
    private Stack cars;

    public Parking(){
        this.cars = new Stack();
        this.capacity = 10;
    }

    public Parking(int capacity){
        this.cars = new Stack();
        if(capacity <= 0) capacity = 10;
        this.capacity = capacity;
    }

    public int freeSpaces(){ return this.capacity - this.cars.size();}

    public int occupiedSpaces(){return this.cars.size();}

    public boolean canPark(){ return this.freeSpaces() != 0;}

    public boolean isOccupied(int position){ return position >= 0 && (position + 1) <= this.cars.size();}

    public boolean parkCar(Car newCar){
        if(newCar == null || !this.canPark()) return false;
        this.cars.push(newCar);
        return true;
    }

    public Car vacatePlace(){ //It removes the last entered car (the top of our stack of cars)
        if(this.cars.isEmpty()) return null;
        Car toRemove = (Car) this.cars.pop();
        return toRemove;
    }

    public Car vacatePlace(int position){
        if(this.isOccupied(position)){ //If the required position is being used, this if is executed
            Car toRemove;
            if(position == this.cars.size() - 1) toRemove = (Car) this.cars.pop(); //Last occupied position of our parking
            else{ //We'll have to get all the following cars out of the parking to vacate this position
                Stack temporary = new Stack(); //To keep our cars saved and after put them back to the parking
                for(int counter = this.cars.size() - 1; counter > position; counter --) {
                    ((Car) this.cars.top().getData()).incrementNumberOfMovements();
                    //Incrementing the number of movements each car had to do to permit another one to get out of the parking
                    temporary.push(this.cars.pop());
                }
                toRemove = (Car) this.cars.pop(); //Here we are taking the target car out of the parking
                while(!temporary.isEmpty()) this.cars.push(temporary.pop());
            }
            return toRemove;
        }
        return null;
    }

    public Car[] getCars(){
        if(this.cars.isEmpty()) return null;
        Car cars[] = new Car[this.cars.size()];
        for(int counter = 0; counter < this.cars.getElements().length; counter++){
            cars[counter] = (Car) this.cars.getElements()[counter].getData();
        }
        return cars;
    }
}
