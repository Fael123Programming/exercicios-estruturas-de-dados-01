package java_language.java_io.scanner_only;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("A good idea is to read more than ever");
        while (scanner.hasNext()) System.out.println(scanner.next());
        scanner = new Scanner("19 456 789 100 stop 900");
        while (scanner.hasNextInt()) System.out.print((scanner.nextInt() + 1) + " ");
        System.out.println("\n" + scanner.next());
        System.out.println(scanner);
        scanner = new Scanner("You is will is win is your is problems is if is you do not abandon the way").useDelimiter("\\s*is\\s*");
        //By default, an instance of this class has as delimiter the traditional whitespace.
        //In this example, we changed it to 'is'.
        //Delimiter is a special character used to define who are the tokens of this input source.
        while (scanner.hasNext()) System.out.print(scanner.next() + " ");
        System.out.println();
        System.out.println(scanner);
        scanner.reset();
        System.out.println(scanner);
    }
}
