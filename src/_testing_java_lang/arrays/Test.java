package _testing_java_lang.arrays;

public class Test {

    public Test(){}
    //The constructor function does not have anything that specifies a return type.
    //Even void is not permissible.

    public void print(String msg) {
        System.out.println(msg);
    }

    protected String print(String msg,int num) {
        //Method overloading: you can change the access modifier and the return value. You must change the parameters!
        //Method name cannot be changed.
        String printable = msg + num;
        System.out.println(printable);
        return printable;
    }
}
