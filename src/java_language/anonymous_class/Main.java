package java_language.anonymous_class;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        strings.addFirst("How many characters here broski?");
        strings.add(0,"Java Programming Language");
        strings.addFirst("Another bear was found in the northern");
        strings.addFirst("Closely related to algorithms");
        System.out.println(strings);
        System.out.println("----------------------------------------------");
        strings.sort(new Comparator<String>() { //This way we are creating an anonymous class that implements the interface Comparator.
            @Override
            public int compare(String str1, String str2) {
                return Integer.compare(str1.length(), str2.length());
            }
        });
        Comparator<String> comp = new Comparator<>(){
            @Override
            public int compare(String str1,String str2) {
                return Integer.compare(str1.length(),str2.length());
            }
        };
        Comparator<String> comp2 = (str1,str2) -> Integer.compare(str2.length(),str1.length());
        System.out.println("----------------------------------------------");
        System.out.println(strings);
        strings.sort((str1,str2) -> Integer.compare(str2.length(),str1.length())); //Lambda expression.
//        They are available since Java 8.
        strings.sort(comp2);
        System.out.println("----------------------------------------------");
        System.out.println(strings);
        System.out.println("----------------------------------------------");
        System.out.println("Using a lambda expression called foreach");
        strings.forEach(s -> System.out.println(s)); //Functional interface called Consumer.
        System.out.println("----------------------------------------------");
        strings.forEach(System.out::println); //Enhanced way to print the elements of 'strings'.
        System.out.println("----------------------------------------------");
        strings.removeIf(str -> str.length() <= 25); //Functional interface called Predicate.
        strings.removeIf(str -> str.contains("bear"));
        System.out.println(strings);
        new Thread(()-> System.out.println("New thread running...")).start();
        //Lambda expression over interface Runnable.

    }
}
