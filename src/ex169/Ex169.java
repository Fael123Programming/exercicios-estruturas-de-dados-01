package ex169;

public class Ex169 {
    /*Algoritmo que mostra todos os elementos abaixo da diagonal principal de
    uma matriz de ordem 10.*/
    public static void main(String[] args){
        System.out.println("TODOS OS ELEMENTOS ABAIXO DA DIAGONAL PRINCIPAL DE "
                + "UMA MATRIZ DE ORDEM 10");
        System.out.println("\n");
        for(int line=2;line<=10;line++){
            for(int column=1;column<line;column++){
                System.out.print(line+"-"+column+"\t");
            }
            System.out.println("\n");
        }
    }
}
