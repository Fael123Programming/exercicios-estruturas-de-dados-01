package _testing_java_lang.collections_framework.ordenation;

import java.util.*;
import java.io.PrintStream;

//The class Collections has many methods to use with lists, be it to change them or just to find a specific item.
//Examples: Collections.sort()
//          Collections.reverse()
//          Collections.swap()
//          Collections.binarySearch()
//          Collections.max() and Collections.min()

public class Main {
    public static void main(String[] args) {
        PrintStream cmd = System.out;
        List <String> countries = new ArrayList<>();
        countries.add("New Zealand");
        countries.add("Russia");
        countries.add("China");
        countries.add("U.S.A");
        countries.add("Argentina");
        countries.add("France");
        countries.add("Germany");
        countries.add("Spain");
        countries.add("Brazil");
        cmd.println("In insertion order: " + countries); //toString() method was overridden in class ArrayList
        Collections.sort(countries); //The method compareTo() for strings was already implemented in class String!
        /*This method receives a list and puts it ordered depending on its elements!
          In case of strings, it orders the list in alphabetic order.*/
        cmd.println("In alphabetic order would be: " + countries);
        Vector <Integer> numbers = new Vector<>();
        numbers.add(34);
        numbers.add(90);
        numbers.add(99);
        cmd.println("In insertion order: " + numbers);
        Collections.sort(numbers); //The method compareTo() for integers was already implemented in class Integer!
        cmd.println("In value order: " + numbers);
        //Using the method compareTo() implemented in class Car, implicitly!
        List <Car> cars = new ArrayList <>();
        cars.add(new Car("Ford","Mustang 2010",2010));
        cars.add(new Car("Chevrolet","Camaro SS 2021",2021));
        cars.add(new Car("Ferrari","458 Italy",2018));
        cmd.println("Cars before ordination: " + cars);
        Collections.sort(cars); //The method compareTo() of the interface java.lang.Comparable is used implicitly here!
        cmd.println("Cars after ordination by year: " + cars);
        /*When using Collections.sort() to sort a list that contain objects of a class you created, you have to implement
        the interface Comparable and its method compareTo() which says how those objects can be compared one with another.*/
        Car camaroSs = new Car("Chevrolet","Camaro SS 2021",2021);
        if (camaroSs.equals(cars.get(2))) {
            cmd.println("Equal cars!");
        } else {
            cmd.println("Not equal!");
        }
    }
}
