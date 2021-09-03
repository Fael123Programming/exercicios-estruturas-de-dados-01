package ex_test_01;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        /*int number = Integer.parseInt(JOptionPane.showInputDialog("Gimme a number"));
        while(number != 1) {
            if( number % 2 == 0) number /= 2;
            else number = 3 * number + 1;
            System.out.print(number + " ");
        }*/
        int lines = Integer.parseInt(JOptionPane.showInputDialog("Lines"));
        for (int i = 1 ; i <= lines ; i++) {
            for (int j = 1 ; j <= i ; j++) System.out.print(i * j + "\t");
            System.out.println();
        }

    }
}
