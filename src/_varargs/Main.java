package _varargs;

//Varargs is a resource introduced in Java 5
//See official documentation here: https://docs.oracle.com/javase/8/docs/technotes/guides/language/varargs.html

import java.io.PrintStream;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Passing the parameters manually: " + Main.sum(10, 23, 50, 34));
        int[] myArray = new int[]{10, 23, 50, 34};
        System.out.println("Passing an array: " + Main.sum(myArray));
        System.out.println(Main.concat(Math.PI, "Never", "think", "you", "cannot"));
        String[] phrase = {"Never", "think", "you", "cannot", "win"};
        System.out.println(Main.concat(Double.MAX_VALUE, phrase));
        System.out.println(Main.doSomething("Rafael Fonseca", 19, 7, 77, 777, 7777, 77777));
        System.out.println("---------------------------------------------------");
        VarArgsProgram.main("Is", "Java", "the", "best", "programming", "language", "ever", "?");
        System.out.println("----------------------------------------------------");
        //Without varargs
        Object[] arguments = {7, new Date(), "a disturbance in the Force"};
        String formattedMsg = MessageFormat.format("At {1,time} on {1,date}, there was {2} on planet {0,number,integer}.", arguments);
        System.out.println(formattedMsg);
        //Using varargs
        formattedMsg = MessageFormat.format("At {1,time} on {1,date}, there was {2} on planet {0,number,integer}.", 7, new Date(), "a disturbance in the Force");
        System.out.println(formattedMsg);
        double[] grades = new double[]{8,9.5,7.8};
        System.out.println(Arrays.toString(grades));
        PrintStream out = System.out;
        out.println("Printing message from another way!");
    }

    private static int sum(int... numbers) {
        int sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum;
    }

    private static String concat(double justANumber, String... stringsToJoin) {
        System.out.println("You gave me " + justANumber);
        String result = "";
        for (String str : stringsToJoin) {
            result += str;
        }
        return "The result is [" + result + "]";
    }

    private static String doSomething(String name, int age, int... numbersToSum) {
        int result = 0;
        for (int num : numbersToSum) {
            result += num;
        }
        return String.format("%s is %d years old and his summation is %d", name, age, result);
    }
}
