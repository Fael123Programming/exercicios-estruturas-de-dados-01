package _testing_java_lang.class_object;

import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
         PrintStream screen = System.out;
         screen.println(null instanceof Object);
         Throwable twb = new Throwable();
         screen.println(twb); //Throwable overrides the method toString() inherited from Object
         PrintStream out = System.out; //System.out refers to an object from class PrintStream.Then, to make it is totally legal
         out.println("Message");
         TestClassObject obj = new TestClassObject("On June 11, 2002, I was born");
         out.println(obj);
         TestClassObject obj2 = new TestClassObject("On June 11, 2002, I was born");
         out.println(obj2);
         out.println("Are those strings equal? " + obj.equals(obj2));
         System.exit(-1); // This public static method from class System shuts JVM down and finishes execution
    }
}
