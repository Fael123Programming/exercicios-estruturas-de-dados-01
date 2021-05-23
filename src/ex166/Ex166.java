package ex166;

import javax.swing.JOptionPane;
public class Ex166 {
    /*Algoritmo que desenha uma matriz de ordem 10,indicando a indexação de cada
    posição.*/
    public static void main(String[] args){
        boolean escolha=JOptionPane.showInputDialog("(1) Para rodar a versao"
                + " com if/else\n(2) Para rodar a versao com switch").
                equals("1")?true:false;
        System.out.println("TODA UMA MATRIZ DE ORDEM 10");
        for(int line=1;line<=10;line++){
            for(int column=1;column<=10;column++){
                if(escolha){
                    if(column==10) System.out.println(line+"-"+column+"\n");
                    else System.out.print(line+"-"+column+"\t");
                }else{
                    switch(column){
                        case 10:
                            System.out.println(line+"-"+column+"\n");
                            break;
                        default:
                            System.out.print(line+"-"+column+"\t");
                            break;
                    }
                }
            }
        }
    }
}

