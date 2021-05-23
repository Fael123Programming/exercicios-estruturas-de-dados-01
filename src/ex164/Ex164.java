package ex164;

import javax.swing.JOptionPane;
public class Ex164 {
    //Algoritmo que faz contagens de acordo com a opção escolhida pelo usuário.S
    public static void main(String[] args){
        int option,escolha;
        escolha=Integer.parseInt(JOptionPane.showInputDialog("(1) Para rodar"
                + " a versao com if/else\n(2) Para rodar a versao com switch"));
        if(escolha==1){
            option=Integer.parseInt(JOptionPane.showInputDialog("Até quanto?"));
            if(option<=0) {
                JOptionPane.showMessageDialog(null,"Nao permitido");
                return;
            }
            System.out.println("Começou...");
            for(int counter=0;counter<option;counter++){
                if(counter<(option-1)) System.out.println(counter+1);
                else System.out.println("(Parou)");
            }
            System.out.println("Terminou...");
        }else if(escolha==2){
            option=Integer.parseInt(JOptionPane.showInputDialog("Até quanto?"));
            if(option<=0) {
                JOptionPane.showMessageDialog(null,"Nao permitido");
                return;
            }
            System.out.println("Começou...");
            for(int counter=0;counter<option;counter++){
                switch(Boolean.toString(counter<(option-1))){
                    case "true":
                        System.out.println(counter+1);
                        break;
                    case "false":
                        System.out.println("(Parou)");
                        break;
                }
            }
            System.out.println("Terminou...");
        }else{JOptionPane.showMessageDialog(null,"Opcao invalida");}
    }
}
