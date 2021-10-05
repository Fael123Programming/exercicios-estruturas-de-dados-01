package java_language.collections_framework.searchingObjects;

//Using the method binarySearch of class Collections!
import java.util.*;

import java_language.collections_framework.ordenation.Car;

public class Main {
    public static void main(String[] args) {
        List <Car> cars = new ArrayList<>();
        cars.add(new Car("brand1","model1",2015));
        cars.add(new Car("brand2","model2",2016));
        cars.add(new Car("brand3","model3",2017));
        cars.add(new Car("brand4","model4",2018));
        cars.add(new Car("brand5","model5",2019));
        cars.add(new Car("brand6","model6",2020));
        cars.add(new Car("brand7","model7",2021));
        System.out.println(cars);
        Collections.sort(cars); //But it is already sorted based on compareTo() method!
        //Never forget that always before using a binarySearch you have to sort your list!
        System.out.println(cars);
        System.out.println(Collections.binarySearch(cars,new Car("brand4","model4",2020)));
        //binarySearch() will use the method compareTo() specified in interface Comparable!
        //That is why even though using wrong arguments results in an integer which represents a position of
        //the list: it is been analysed only the year of the cars (as implemented in method compareTo in class Car).
        System.out.println(Collections.binarySearch(cars,new Car("brand5","model5",2090)));
        //A negative integer number will be returned because 2090 was not used by any car inside cars!
        //This negative integer is result of calculating (-(insertionPosition)-1) where insertionPosition is a
        //possible position to insert the object key passed as argument to this method, in such a case that cars
        //would stay yet ordered. In this case, it is worth 7. Then (-(7)-1) = -8.
        Vector<Integer> numbers = new Vector <>();
        numbers.add(34);
        numbers.add(12);
        numbers.add(45);
        numbers.add(66);
        numbers.add(55);
        numbers.add(13);
        numbers.add(56);
        numbers.add(55);
        numbers.add(12);
        numbers.add(12);
        System.out.println("Unordered: " + numbers);
        Collections.sort(numbers); //It will be used compareTo() implemented in class Integer!
        System.out.println("Ordered: " + numbers);
        Scanner input = new Scanner(System.in);
        System.out.print("Give me a number: ");
        int number = input.nextInt(), pos = Collections.binarySearch(numbers,number);
        if (pos < 0) {
            System.out.println(number + " was not found!");
        } else {
            System.out.println(number + " can be found in position " + pos);
        }
        //Now, let us use the methods max() and min() from Collections!
        System.out.println("The greatest value is " + Collections.max(numbers));
        System.out.println("The smallest value is " + Collections.min(numbers));
    }
}
