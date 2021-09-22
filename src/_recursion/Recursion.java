package _recursion;

public class Recursion {

    private static int towerOfHanoiMovements=0;
    
    private Recursion(){}
    
    public static int factorial(int number){
        return number<0?-1:number==0?1:number* Recursion.factorial(number-1);
    }
    
    public static int fibonacci(int position){
        return position<=0?-1:position==1||position==2?1:fibonacci(position-1)+fibonacci(position-2);
    }
    
    public static void printSequenceFrom(int startingPoint){
        if(startingPoint<=0){
            System.out.println("");
            return;
        }
        System.out.print(startingPoint+" ");
        Recursion.printSequenceFrom(startingPoint-1);
    }
    
    public static int summationFrom(int number){
        return number<=0?-1:number==1?number:number+ Recursion.summationFrom(number-1);
    }

    //Máximo Divisor Comum entre dois números using recursion
    public static int mdc (int firstNumber, int secondNumber) {
        if ( firstNumber > secondNumber ) {
            if ( firstNumber - secondNumber >= 0) return Recursion.mdc( firstNumber - secondNumber, secondNumber );
        } else if ( firstNumber < secondNumber ){
            if ( secondNumber - firstNumber >= 0 ) return Recursion.mdc ( firstNumber , secondNumber - firstNumber );
        }
        return firstNumber;
    }

    //Here using recursion and ternary operator
    public static int mdcT (int firstNumber , int secondNumber) { return firstNumber > secondNumber && firstNumber - secondNumber >= 0 ? Recursion.mdc ( firstNumber - secondNumber, secondNumber) : firstNumber < secondNumber && secondNumber - firstNumber >= 0 ? Recursion.mdc ( firstNumber , secondNumber - firstNumber ) : firstNumber; }

    //Here using iterators
    public static int mdcI(int firstNumber, int secondNumber) {
        int rest;
        if ( firstNumber > secondNumber ) {
            while (secondNumber != 0) {
                rest = firstNumber % secondNumber;
                firstNumber = secondNumber;
                secondNumber = rest;
            }
            return firstNumber;
        } else if (secondNumber > firstNumber) {
            while (firstNumber != 0) {
                rest = secondNumber % firstNumber;
                secondNumber = firstNumber;
                firstNumber = rest;
            }
            return secondNumber;
        }
        return firstNumber; //As firstNumber is equal to secondNumber!
    }
}
