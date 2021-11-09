package java_language.final_modifier;

import java.time.LocalDateTime;

public class Super {
    //A final attribute has to be initialized anyways.
    public static final int CONSTANT_VALUE; //Static initialization block.
    public final double num = 1.23D; //Immediate initialization.
    public final LocalDateTime dateTime; //Initialization in constructor.

    public Super(){
        dateTime = LocalDateTime.now();
    }

    static {
        CONSTANT_VALUE = 10;
    }

    /* public static class StringChild extends String {

    } */
//    You cannot inherit from String class because it is 'final': it cannot have children!
//    The same way to the class Math.
    /* public static class MathChild extends Math {

    } */

    public final void aMessage(){ //No polymorphism here!!!
        System.out.println("A random message");
    }
}
