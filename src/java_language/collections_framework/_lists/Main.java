package java_language.collections_framework._lists;

import java.io.PrintStream;
//Collections framework dwells at java.util package
//Each collection works in the most general way possible. Their methods
//always use parameters of the class Object

import java.util.*;
/* List is an interface (you can create a reference memory of its type
 * but never an object of it) which says what a class has to do to behave as a list!
 * There are many implementations of this interface such as ArrayList and LinkedList!
 * When running through a list use either an iterator or an enhanced-for (for-each) to
 * do so.*/

/* A class that represents a concrete list implementation based on a real Java array and
 * in the interface List. It is faster than LinkedList when searching for elements (iterating over).
 * This type of list implementation has random access to its elements (instead of sequential access)
 * so using the get(int i) method is very fast because only the element in position i is checked.*/

/* A class that represents also a concrete list implementation based on linked elements. It
 * implements the interface list. It is good for inserting and removing elements from leading and
 * trailing places!*/

public class Main {
    public static void main(String[] args) {
        PrintStream cmd = System.out;
        //Let's dive into lists!
        List ofNames = new ArrayList<>(); //Using a list abstractly!
        ofNames.add("James Gosling");
        ofNames.add("Jorge Stuart");
        for (Object obj : ofNames){
            cmd.println(obj);
        }
        ofNames = new LinkedList(); //Using a list abstractly!
        ofNames.add("Queen Elizabeth");
        ofNames.add("King Pelé");
        for (Object obj : ofNames) {
            cmd.println(obj);
        }
        LinkedList <Integer> myList = new LinkedList<>(); //It is slow when accessing elements because does not support random access.
        //The use of a specific type for a list is called 'Generics'.
        //It makes that we do not have to worry about casts anymore when manipulating
        //our elements inside list. In this case, Integer is the generic type!
        //For primitive types, use their wrapping class!
        myList.addFirst(56);
        myList.addFirst(55);
        myList.addLast(57);
        for (int i : myList) {
            cmd.print(i + " ");
        }
        cmd.println();
        Vector <String> array = new Vector<>(); //Use of Generics: casts are not necessary anymore.
        //The generic type is String.
        array.add("Struggling the most");
        array.add(" to learn Java");
        array.add(1," is not needed");
        for (String str : array) {
            cmd.print(str); //That is permissible to make: an enhanced for
        }
        ArrayList <Double> numbers; //For primitive types, use their wrapping class!
        numbers = new ArrayList<>(); //<> is the diamond operator!
        numbers.add(1D);
    }
}
