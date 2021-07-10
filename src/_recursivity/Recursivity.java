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
    
}
