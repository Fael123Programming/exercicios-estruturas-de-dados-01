package java_language.java_io.scanner_printstream;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        //Using java.util.Scanner to read data from an input stream or file.
        Scanner input = new Scanner(System.in);
        //This is an example of reading bytes from standard input and writing it on a file!
        try (PrintStream filePrinter = new PrintStream("src/java_language/java_io/texts/goodmorning.txt")) {
            //Example of try-with-resources!
            //'finally' statement is already included!
            while (input.hasNextLine()) {
                filePrinter.println(input.nextLine());

            }
        }catch (IOException e) {
            System.out.println("An error occurred!");
        }
        //To hit the EOF (End-Of-File) command, press: ctrl + d.
    }
}
