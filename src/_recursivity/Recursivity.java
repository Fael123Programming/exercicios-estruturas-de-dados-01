package _recursivity;
public class Recursivity {
    private static int towerOfHanoiMovements=0;
    
    private Recursivity(){}
    
    public static int factorial(int number){
        return number<0?-1:number==0?1:number*Recursivity.factorial(number-1);
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
        Recursivity.printSequenceFrom(startingPoint-1);
    }
    
    public static int summationFrom(int number){
        return number<=0?-1:number==1?number:number+Recursivity.summationFrom(number-1);
    }

    //Máximo Divisor Comum entre dois números
    public static int mdc (int firstNumber, int secondNumber) {
        if ( firstNumber > secondNumber ) {
            if ( firstNumber - secondNumber >= 0) return Recursivity.mdc( firstNumber - secondNumber, secondNumber );
        } else if ( firstNumber < secondNumber ){
            if ( secondNumber - firstNumber >= 0 ) return Recursivity.mdc ( firstNumber , secondNumber - firstNumber );
        }
        return firstNumber;
    }

    public static int mdcL (int firstNumber , int secondNumber) { return firstNumber > secondNumber && firstNumber - secondNumber >= 0 ? Recursivity.mdc ( firstNumber - secondNumber, secondNumber) : firstNumber < secondNumber && secondNumber - firstNumber >= 0 ? Recursivity.mdc ( firstNumber , secondNumber - firstNumber ) : firstNumber; }
}
