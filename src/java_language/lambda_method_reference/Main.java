package java_language.lambda_method_reference;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> strSet = new HashSet<>();
        strSet.add("A string");
        strSet.add("Another string");
        strSet.add("For now, the last string!");
        strSet.forEach(System.out::println); //This is called as method reference. A lambda version would be: s -> System.out.println(s)
        System.out.println("-------------------------------------------------------");
        strSet.stream().filter(s -> s.length() < 9).forEach(System.out::println); //Printing on screen only the strings with size fewer than 9 characters.
        //stream is an api that provides us a simple way to handle our collections in a more functional manner.
        List<Integer> numbers = new ArrayList<>();
        numbers.add(34 * 456);
        numbers.add(90 - 45);
        numbers.add(235);
        numbers.add(890);
        System.out.println("-------------------------------------------------------");
        numbers.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " ")); //Even numbers.
        System.out.println();
        numbers.stream().filter(n -> n % 2 == 1).forEach(n -> System.out.print(n + " ")); //Odd numbers.
        System.out.println();
        numbers.sort((n1, n2) -> Integer.compare(n2, n1)); //Decreasing order with a lambda Comparator.
        numbers.forEach(n -> System.out.print(n + " "));
        numbers.sort(new Comparator<>() { //Anonymous class that implements Comparator.
            @Override
            public int compare(Integer n1, Integer n2) {
                return Integer.compare(n1, n2);
            }
        });
        System.out.println();
        numbers.forEach(n -> System.out.print(n + " "));

    }
}
