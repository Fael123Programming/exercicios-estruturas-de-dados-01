package _algorithm_remove_elements_of_an_array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a[]={1,2,3},quant=a.length;
        while(true){
            for(byte counter=0;counter<3;counter++) System.out.print(a[counter]+" ");
            System.out.println();
            byte op=input.nextByte();
            if(op<0 || op>quant-1){
                System.out.println("Invalid Position");
                break;
            }else for(byte counter=op;counter<quant-1;counter++) a[counter]=a[counter+1];
            a[quant-1]=0;
            quant--;
            if(quant==0) break;
        }
    }
}
