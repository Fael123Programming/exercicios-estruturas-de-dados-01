package ex_super_calculator;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Calculator calculator = new Calculator();//Mode Calculator.INFIX is standard.
        Scanner input = new Scanner(System.in);
        byte option;
        String expression;
        while(true){
            System.out.println("---- SUPER CALCULATOR ----");
            System.out.println("(1) INFIX");
            System.out.println("(2) POSTFIX");
            System.out.println("(3) PREFIX");
            System.out.println("(4) EXIT");
            System.out.println("--------------------------");
            System.out.print("-> ");
            option = input.nextByte();
            calculator.setMode(option);
            switch(option){
                case 1:
                    System.out.println("---- INFIX ----");
                    System.out.print("Input expression: ");
                    expression = input.next();
                    System.out.printf("Result: %.2f%n",calculator.eval(expression));
                    System.out.println("POSTFIX: "+calculator.parseExp(1,2,expression));
                    System.out.println("PREFIX: "+calculator.parseExp(1,3,expression)+"\n");
                    break;
                case 2:
                    System.out.println("---- POSTFIX ----");
                    System.out.print("Input expression: ");
                    expression = input.next();
                    System.out.printf("Result: %.2f%n",calculator.eval(expression));
                    System.out.println("INFIX: "+calculator.parseExp(2,1,expression));
                    System.out.println("PREFIX: "+calculator.parseExp(2,3,expression)+"\n");
                    break;
                case 3:
                    System.out.println("---- PREFIX ----");
                    System.out.print("Input expression: ");
                    expression = input.next();
                    System.out.printf("Result: %.2f%n",calculator.eval(expression));
                    System.out.println("INFIX: "+calculator.parseExp(3,1,expression));
                    System.out.println("POSTFIX: "+calculator.parseExp(3,2,expression)+"\n");
                    break;
                case 4: System.exit(0);
                default: System.out.println("### invalid option ###\n");
            }
        }
    }
}
