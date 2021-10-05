package java_language.collections_framework._sets;

import java.util.HashSet; //An implementation of the interface set based on hash tables.
import java.util.LinkedHashSet;
import java.util.Set; //Interface which provides what kind of things a class has to perform to be a set!
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set <String> setOfStrings = new HashSet <>(); //Faster than TreeSet!
        //Sets are very advisable (because they are very fast) to use for operations of addition, removal and searches for objects.
        //They do not hold their elements in an ordered sequence. As of a mathematical set, what matters is the relation of belonging.
        //When you have only to make searches for objects, use sets.
        setOfStrings.add("Phrase 1");
        setOfStrings.add("Phrase 2");
        setOfStrings.add("Phrase 3");
        System.out.println(setOfStrings); //toString() of class HashSet() was already overridden.
        System.out.println(setOfStrings.remove("Phrase 3")); //Very fast method!
        System.out.println(setOfStrings);
        System.out.println(setOfStrings.contains("Phrase 2")); //Very fast method!
        TreeSet <Integer> setOfNumbers = new TreeSet<>(); //The elements of this set are ordered based on their own natural ordering way.
        setOfNumbers.add(1000000);
        setOfNumbers.add(900);
        setOfNumbers.add(1000);
        System.out.println(setOfNumbers.first());
        System.out.println(setOfNumbers.last());
        LinkedHashSet <String> LHSet = new LinkedHashSet <>(); //This is a hash table and linked list implementation of the Set interface with predictable iteration order.
        LHSet.add("Phrase 1");
        LHSet.add("Phrase 2");
        LHSet.add("Phrase 3");
        System.out.println(LHSet);
    }
}
