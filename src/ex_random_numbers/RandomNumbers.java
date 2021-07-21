package ex_random_numbers;
import _doubly_linked_list.DoublyLinkedList;
import ex_problema_de_josephus.Main;
import ex_the_simpsons.TheSimpsons;
public class RandomNumbers {
    public static void main(String[] args) {
        int numbers[]=new int[1000],alreadyVerifiedPositions[]=new int[1000];
        for(int counter=0;counter<numbers.length;counter++){
            numbers[counter]=Main.generateRandomNumber(-9999,9999);
        }
        System.out.println("#### Generated numbers ####");
        for(int num=0;num<numbers.length;num++) System.out.println((num+1)+" -> "+numbers[num]);
        System.out.println("###############\n");
        DoublyLinkedList listOfNumbers=new DoublyLinkedList();
        int smallestNum=0,countingStartingPoint=0;
        while(listOfNumbers.size()<1000){    
            for(int counter=0;counter<numbers.length;counter++){
                if(!RandomNumbers.isThatNumberInVector(counter,alreadyVerifiedPositions)){    
                    if(counter==0) smallestNum=numbers[counter];
                    else if(numbers[counter]<smallestNum) smallestNum=numbers[counter];
                }
            }
            listOfNumbers.addEnd(smallestNum);
        }
        TheSimpsons.showList(listOfNumbers.getCells());
    }
    
    private static boolean isThatNumberInVector(int number,int vector[]){
        for(int num:vector) if(num==number) return true;
        return false;
    }
    
}
