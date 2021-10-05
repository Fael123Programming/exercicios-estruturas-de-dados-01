package java_language.initialization_block;

public class ArrayType {
//When an object is created, the following steps occur:
//1 - Memory space fitted to the object is allocated by JVM;
//2 - All attributes of the object are created and initialized with either a default value or an explicit value;
//3 - The initialization block(s) is(are) executed!
//4 - The constructor function(s) is(are) executed!
//Static initialization blocks are executed before everything when a class is referred to.
//They (or those non-static) can be put wherever you want inside a class.
//If you are only referencing a class, its static elements (variables, methods or initialization blocks) are
//already available for use. See that as class can be referred to by two ways: an object creation or using its
//name for another purpose (e.g., calling a static method).

    private char[] chars;

    {//Initialization block (non-static)
     //As of a creation of an object, this block is executed!
        System.out.println("'chars' was assigned firstly with: " + chars);
        System.out.println("See that we are inside the initialization block.");
        chars = new char[100];
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) chars[i] = '0';
            else chars[i] = '1';
        }
    }

    public ArrayType(){
        System.out.println("Now we got in the constructor...");
        //Constructor.
    }

    static { //Regardless the quantity of objects that are being created, this block will be
            //executed once and only when JVM sees this class being referred to in any place.
        System.out.println("Which initialization block is going to be executed firstly? ");
    }

    public char[] getChars() {
        return this.chars;
    }

    static {//Another initialization block as the block above.
        System.out.println("Another initialization block inside the very class...");
    }
}
