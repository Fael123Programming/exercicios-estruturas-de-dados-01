package _labeled_loops;

public class Main {
    public static void main(String args[]){
        int counter1 = 0;
        while (counter1 != 50) {
            //Creating a labeled loop. With it, you can break the execution of nested loops
            nestedScope: for (int counter2 = 50 ; counter2 <= 100 ; counter2++){
                            while ( counter1 <= 100) {
                                System.out.println("Inside nested while: " + counter1++);
                                if (counter1 == 50) break nestedScope;
                            }
                            System.out.println("Inside internal for: " + counter2);
                          }
            System.out.println("Inside first while!");
        }
    }
}
