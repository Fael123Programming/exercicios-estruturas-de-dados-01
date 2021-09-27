package _testing_java_lang.collections_framework.reversing_and_swapping;

import java.util.*;
//Using the method reverse() and swap() of class Collections!

public class Main {
    public static void main(String[] args) {
        LinkedList <String> strs = new LinkedList <>();
        strs.addLast("The lazy dog jumps over the sleepy fox!");
        strs.addLast("Java 17 is released on September 2021");
        strs.addLast("PSG is a great french soccer team!");
        System.out.println(strs);
        Collections.reverse(strs);
        System.out.println(strs);
        Collections.swap(strs,1,0);
        //This method gets the element at position i in list and puts it at position j.
        //Consequently, the element at position j goes to position i.
        System.out.println(strs);
    }
}
