package ex404;
import javax.swing.JOptionPane;
public class Ex404 {
    /*Algoritmo que pega 100 números inteiros do usuário,preenche uma matriz de ordem 10
    com esses dados e,após,imprime os elementos dessa mesma matriz formada,que se 
    encontram acima da diagonal principal.*/
    public static void main(String[] args){
        int matriz[][]={{1,2,3,4,5,6,7,8,9,10},{11,12,13,14,15,16,17,18,19,20},{21,22,23,24,25,26,27,28,29,30},
            {31,32,33,34,35,36,37,38,39,40},{41,42,43,44,45,46,47,48,49,50},{51,52,53,54,55,56,57,58,59,60},
            {61,62,63,64,65,66,67,68,69,70},{71,72,73,74,75,76,77,78,79,80},{81,82,83,84,85,86,87,88,89,90},
            {91,92,93,94,95,96,97,98,99,100}};
        /*for(byte c1=0;c1<10;c1++){
            for(byte c2=0;c2<10;c2++){
                matriz[c1][c2]=Integer.parseInt(JOptionPane.showInputDialog("Elemento ["+c1+"]"+"["+c2+"]"));
            }
        }*/
        for(int c1=0;c1<9;c1++){
            for(int tab=0;tab<c1+1;tab++) System.out.print("\t");
            for(int c2=c1+1;c2<10;c2++){
                System.out.print("["+matriz[c1][c2]+"]\t");
            }
            System.out.println("\n\n");
        }
        System.out.println("\n\n");
        for(int c1=0;c1<10;c1++){
            for(int c2=0;c2<10;c2++)
                System.out.print("["+matriz[c1][c2]+"]\t");
            System.out.println("\n\n");
        }
    }
}
