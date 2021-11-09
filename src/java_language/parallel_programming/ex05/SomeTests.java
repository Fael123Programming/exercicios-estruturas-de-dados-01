package java_language.parallel_programming.ex05;

public class SomeTests {
    public static void main(String[] args) {
        Runnable runnable = (/*Here could go the parameters of the implemented method separated by commas*/)
                -> { //Lambda expression: we are implementing the method run() of the interface Runnable.
          int result = 0;
          for (int i = 1; i <= 1000; i++) result += i;
          System.out.println("The summation between 1 to 1000 is " + result);
        };
        Thread th1 = new Thread(runnable);
        th1.start();
        Runnable runnable2 = new Runnable(){ //Creating an anonymous class that implements Runnable run() method.
            public void run(){
                int result = 0;
                for (int i = 1; i <= 1000000; i++) result += i;
                System.out.println("The summation between 1 to 1000000 is " + result);
            }
        };
        Thread th2 = new Thread(runnable2);
        th2.start();
        new Thread(new Runnable(){
            public void run(){
                int oddNumbers = 0, evenNumbers = 0;
                for (int i = 1; i <= 1000; i++) {
                    if (i % 2 == 1) {
                        oddNumbers++;
                    } else {
                        evenNumbers++;
                    }
                }
                System.out.println("There are " + oddNumbers + " odd numbers between 1 and 1000");
                System.out.println("There are " + evenNumbers + " even numbers between 1 and 1000");
            }
        }).start();
        new Thread(() -> {
            int oddNumbers = 0, evenNumbers = 0;
            for (int i = 1; i <= 1000000; i++) {
                if (i % 2 == 1) {
                    oddNumbers++;
                } else {
                    evenNumbers++;
                }
            }
            System.out.println("There are " + oddNumbers + " odd numbers between 1 and 1000000");
            System.out.println("There are " + evenNumbers + " even numbers between 1 and 1000000");
        }).start();
    }
}
