package _testing_java_lang.collections_framework.exercises.arraylist_x_linkedlist;

import _recursion.Time;
import java.util.*;

//LinkedLists are fast when inserting elements in the first position.

public class Main {
    public static void main(String[] args) {
        final int limit = 1000000;
        List<Integer> num1 = new ArrayList<>();
        Time.startCounting();
        for(int i = 0; i < limit; i++) {
            num1.add(0,i);
        }
        Time.finishCounting();
        System.out.println("Adding in an arraylist: " + Time.getTime());
        List<Integer> num2 = new LinkedList<>();
        Time.startCounting();
        for(int i = 0; i < limit; i++) {
            num2.add(0,i);
        }
        Time.finishCounting();
        System.out.println("Adding in a linked list: " + Time.getTime());
        System.out.println("-----------------------------------");
        Time.startCounting();
        for(int i = 0; i < limit; i++) {
            num1.get(i);
        }
        Time.finishCounting();
        System.out.println("Traversing an arraylist: " + Time.getTime());
        Time.startCounting();
        for(int i = 0; i < limit; i++) {
            num2.get(i); //Very slow! Unusable...
        }
        Time.finishCounting();
        System.out.println("Traversing a linked list: " + Time.getTime());
    }
}
