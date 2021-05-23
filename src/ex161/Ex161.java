package ex161;

import javax.swing.JOptionPane;
public class Ex161 {
    /*Algoritmo que pega 5 números inteiros do usuário e os mostra
    elevados ao quadrado*/
    public static void main(String[] args){
        int number;
        for(int counter=0;counter<5;counter++){
            number=Integer.parseInt(JOptionPane.showInputDialog(String.format(""
                    + "Número %d",counter+1)));
            JOptionPane.showMessageDialog(null,number+" elevado ao quadrado: "+Math.pow(number, 2));
        }
    }
}
