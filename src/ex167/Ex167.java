package ex167;

public class Ex167 {
    /*Algoritmo que desenha a parte superior de uma matriz de ordem 10,ou seja,
    apenas os elementos que estão visualmente acima da diagonal principal.*/
    public static void main(String[] args){
        System.out.println("APENAS OS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL DE UMA MATRIZ DE ORDEM 10");
        for(int line=1;line<=9;line++){
            for(int column=line+1;column<=10;column++){
                System.out.print("\t"+line+"-"+column);    
            }
            System.out.println("\n");
            for(int t=1;t<=line;t++) System.out.print("\t");
        }
    }
}