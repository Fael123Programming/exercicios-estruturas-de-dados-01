package _testing_java_lang.class_random;

import java.util.*;
//Using the Random class: a class used to instantiate objects capable of generate and provide pseudorandom numbers.

public class Main {
    public static void main(String[] args) {
        Random rd = new Random();
        List <Integer> numbers = new ArrayList <>();
        for (int i = 0; i < 10; i++) {
            numbers.add(rd.nextInt(1001));
            //nextInt() returns an integer pseudorandom number generated in range 0 to 1.
        }
        System.out.println(numbers);
        for (int i = 0; i < 10; i++) {
            numbers.add((int) (Math.random() * 1001)); //b1 + ((int) (Math.random() * (b2 + 1 - b1)))
            //Math.random() returns a floating point number between 0 (inclusive) and 1 (exclusive).
        }
        System.out.println(numbers);
        numbers = new LinkedList <>(); //Using the same reference variable to point to different objects allocated on memory.
        System.out.println(numbers);
    }
}
