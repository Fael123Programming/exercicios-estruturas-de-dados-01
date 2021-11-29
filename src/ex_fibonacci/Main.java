package ex_fibonacci;

//Fibonacci using only 2 variables to get the result.

public class Main {
    public static void main(String[] args) {
        System.out.println(Main.fib(10));
    }

    private static int fib(int pos) {
        if (pos < 0) return -1;
        int t1 = 0, t2 = 0;
        for (int i = 0; i <= pos; i++) {
            t1 += t2;
            t2 = t1 - t2; //This way t2 is receiving the value t1 had before being added with t2 at the last line.
            if (i == 1) t1 = 1;
        }
        return t1;
    }
}
