package ex168;

import javax.swing.JOptionPane;
public class Ex168 {
    //Algoritmo que mostra a diagonal principal de uma matriz de ordem 10.
    public static void main(String[] args){
        boolean escolha=JOptionPane.showInputDialog("(1) Para rodar a versao "
                + "com if/else\n(2) Para rodar a versao com switch").equals("1")
                ?true:false;
        System.out.println("APENAS A DIAGONAL PRINCIPAL DE UMA MATRIZ DE ORDEM 10");
        for(int line=1;line<=10;line++){
            for(int column=1;column<=10;column++){
                if(escolha){
                    if(line==column) System.out.print(line+"-"+column);
                }else{
                    switch(Boolean.toString(line==column)){
                        case "true":
                            System.out.print(line+"-"+column);
                            break;
                    }
                }
            }
            System.out.println("\n");
            for(int t=1;t<=line;t++) System.out.print("\t");
        }
    }
}
