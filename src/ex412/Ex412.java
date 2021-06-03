package ex412;

import javax.swing.JOptionPane;
public class Ex412 {
    /*Algoritmo que pega números inteiros do usuário e preenche uma matriz de
    ordem 5. Ao final,mostra os dados dessa matriz e os números que,somadas
    suas coordenadas (linha+coluna) encontram-se números pares.*/
    public static void main(String[] args){
        int matriz[][]={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        /*for(int c1=0;c1<5;c1++){
            for(int c2=0;c2<5;c2++){
                matriz[c1][c2]=Integer.parseInt(JOptionPane.showInputDialog("Elemento ["+c1+""+c2+"]"));
            }
        }*/
        System.out.println("TODA A MATRIZ\n");
        for(int c1=0;c1<5;c1++){
            for(int c2=0;c2<5;c2++){
                   System.out.print("["+matriz[c1][c2]+"]");
                   if(c2<4) System.out.print("\t");
            }
            System.out.println("\n\n");
        }
        System.out.println("\n\n");
        System.out.println("APENAS OS NUMEROS EM QUE A SOMA DE SUAS COORDENADAS EH UM NUMERO PAR\n");
        for(int c1=0;c1<5;c1++){
            for(int c2=0;c2<5;c2++){
                if((c1+c2)%2==0){
                    System.out.print("["+matriz[c1][c2]+"]");
                    if(c1!=4||c2!=4) System.out.print("\t");
                    /*Se pelo menos um dos dois contadores são diferentes de 4,imprima uma tabulação.
                    Não imprimirá quando os dois forem iguais a 4.*/
                }
            }
        }
        System.out.println("");
    }
}
