package ex_random_numbers;

import _doubly_linked_list.DoublyLinkedList;
import ex_problema_de_josephus.Main;

public class RandomNumbers{
    public static void main(String[] args) {
        int quantityOfNumbers=1000;//It Defines the maximum quantity of numbers the program handles with.
        int numbers[]=new int[quantityOfNumbers],checkedPositions[]=new int[quantityOfNumbers];
        for(int counter=0;counter<quantityOfNumbers;counter++) numbers[counter]=Main.generateRandomNumber(-9999,9999);
        System.out.println("#### Generated numbers ####");
        for(int counter=0;counter<quantityOfNumbers;counter++) System.out.println(counter+" -> "+numbers[counter]);
        System.out.println("###############\n");
        DoublyLinkedList listOfNumbers=new DoublyLinkedList();//To contain the ordered sequence of numbers.
        int posSmallestNum=0,countingStartingPoint=0;
        /*posSmallestNum will have always the current vector numbers' smallest number.
          countingStartingPoint is just an auxiliary variable that helps us when getting to know which position
          in vector numbers, posSmallestNum has to point to.*/
        boolean auxiliary=true;//Used due countingStartingPoint. Its purpose is that it blocks countingStartingPoint to change its value during an iteration.
        while(listOfNumbers.size()<quantityOfNumbers){    
            for(int counter=0;counter<quantityOfNumbers;counter++){//It goes through the array numbers from position 0 to 999.
                if(!RandomNumbers.isThatNumberInVector(counter+1,checkedPositions)){//It means, we found a position that checkedPositions doesn't have yet.    
                    //counter+1 because if not, this method above will return true in a moment that checkedPositions is empty (counter==0, then an non-initialized integer vector has it).
                    if(auxiliary){//State machine variable.
                        countingStartingPoint=counter;//This way, countingStartingPoint will have solely one value during one complete iteration of this for statement.
                        auxiliary=false;
                    }
                    if(counter==countingStartingPoint) posSmallestNum=counter;
                    else if(numbers[counter]<numbers[posSmallestNum]) posSmallestNum=counter;
                }
            }
            auxiliary=true;
            listOfNumbers.addEnd(numbers[posSmallestNum]);
            checkedPositions[listOfNumbers.size()-1]=posSmallestNum+1;
            //If not posSmallestNum+1, the method isThatNumberInVector() will check for a different number into checkedPositions.
        }
        System.out.println("## numbers in order (increasing)##");
        System.out.println("[its position in vector 'numbers'] -> [its own value]");
        for(int counter=0;counter<quantityOfNumbers;counter++){
            System.out.println(checkedPositions[counter]-1+" -> "+listOfNumbers.getCell(counter).getData());
        }
        System.out.println("###############\n");
        System.out.println("## numbers in order (decreasing) ##");
        System.out.println("[its position in vector 'numbers'] -> [its own value]");
        for(int counter=quantityOfNumbers-1;counter>=0;counter--){
            System.out.println(checkedPositions[counter]-1+" -> "+listOfNumbers.getCell(counter).getData());
        }
        System.out.println("###############\n");
        System.out.println("Greatest number: "+listOfNumbers.getLast().getData());
        System.out.println("Smallest number: "+listOfNumbers.getFirst().getData());
    }
    
    private static boolean isThatNumberInVector(int number,int vector[]){
        for(int num:vector) if(num==number) return true;
        return false;
    }
}