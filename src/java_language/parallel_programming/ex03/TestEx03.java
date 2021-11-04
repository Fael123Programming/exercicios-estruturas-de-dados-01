package java_language.parallel_programming.ex03;

import java_language.parallel_programming.ex02.TestEx02.Program;
//Importing an inner class is similar to importing a traditional one.

public class TestEx03 {
    public static void main(String[] args) {
        Program p1 = new Program(100);
        (new Thread(p1)).start();
    }
}
