package java_language.collections_framework.exercises.arraylist_x_hashset;

import _recursion.Time;

import java.util.*;

//By conclusion, lists are terrible on searches but good when adding new elements.
//Sets are excellent when adding new elements and searching for their existence.

public class Main {
    public static void main(String[] args) {
        final int quant = 1000000;
        Collection <Integer> numbers = new ArrayList<>();
        Time.startCounting();
        for(int i = 0; i < quant; i++) {
            numbers.add(i); //Fast operation!
        }
        Time.finishCounting();
        System.out.println("ARRAYLIST");
        System.out.println("To insert " + quant + " numbers was spent " + Time.getTime() + " time.");
        System.out.println("ArrayList's size: " + numbers.size());
        Time.startCounting();
        for(int i = 0; i < quant; i++) {
            numbers.contains(i); //Slow operation!
        }
        Time.finishCounting();
        System.out.println("To check all inserted numbers spends: " + Time.getTime() + " time.");
        Time.startCounting();
        System.out.println("------------------------------------------------------");
        numbers = new HashSet<>();
        Time.startCounting();
        for(int i = 0; i < quant; i++) {
            numbers.add(i); //Fast operation (although arraylist is faster!).
        }
        Time.finishCounting();
        System.out.println("HASHSET");
        System.out.println("To insert " + quant + " numbers was spent " + Time.getTime() + " time.");
        System.out.println("Set's size: " + numbers.size());
        Time.startCounting();
        for(int i = 0; i < quant; i++) {
            numbers.contains(i); //Super faster checking!
        }
        Time.finishCounting();
        System.out.println("To check all inserted numbers spends: " + Time.getTime() + " time.");
        System.out.println("------------------------------------------------------");
    }
}
