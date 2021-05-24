package ex169;

import javax.swing.JOptionPane;
public class Ex169 {
    /*Algoritmo que mostra todos os elementos abaixo da diagonal principal de
    uma matriz de ordem 10.*/
    public static void main(String[] args){
        boolean escolha=JOptionPane.showInputDialog("(1) Para rodar a versao "
                + "com if/else\n(2) Para rodar a versao com switch").equals("1")
                ?true:false;
        System.out.println("TODOS OS ELEMENTOS ABAIXO DA DIAGONAL PRINCIPAL DE "
                + "UMA MATRIZ DE ORDEM 10");
        System.out.println("\n");
        for(int line=2;line<=10;line++){
            for(int column=1;column<line;column++){
                if(escolha){
                    if(column==line-1) System.out.print(line+"-"+column+"\n\n");
                    else System.out.print(line+"-"+column+"\t");
                }else{
                    switch(Boolean.toString(column==line-1)){
                        case "true":
                            System.out.print(line+"-"+column+"\n\n");
                            break;
                        case "false":
                            System.out.print(line+"-"+column+"\t");
                            break;
                    }
                }
            }
        }
    }
}
