package java_language.anonymous_class.ex1;

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
        //This way we are creating an anonymous class that implements the interface Comparator.
        strings.sort(Comparator.comparingInt(String::length));
        Comparator<String> comp = Comparator.comparingInt(String::length);
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
        strings.forEach(System.out::println); //Functional interface called Consumer.
        System.out.println("----------------------------------------------");
        strings.forEach(System.out::println); //Enhanced way to print the elements of 'strings'.
        System.out.println("----------------------------------------------");
        strings.removeIf(str -> str.length() <= 25); //Functional interface called Predicate.
        strings.removeIf(str -> str.contains("bear"));
        System.out.println(strings);
        new Thread(()-> System.out.println("New thread running...")).start();
        //Lambda expression over interface Runnable.
        Runnable runnable = () -> {
            System.out.println("This is an anonymous class being created and implementing the interface Runnable...");
            System.out.println("This anonymous class has only one instance at all...");
        };
        Thread t = new Thread(runnable);
        t.start();
    }
}
