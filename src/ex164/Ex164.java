package ex164;

import javax.swing.JOptionPane;
public class Ex164{
    //Algoritmo que faz contagens de acordo com a opção escolhida pelo usuário.
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
            for(int counter=1;counter<=option;counter++){
                if(counter==option){
                    System.out.println("(Parou)");
                    continue;
                }
                System.out.println(counter);
            }
            System.out.println("Terminou...");
        }else if(escolha==2){
            option=Integer.parseInt(JOptionPane.showInputDialog("Até quanto?"));
            switch(Boolean.toString(option<=0)) {
                case "true":
                    JOptionPane.showMessageDialog(null,"Nao permitido");
                    return;
            }
            System.out.println("Começou...");
            for(int counter=1;counter<=option;counter++){
                switch(Boolean.toString(counter==option)){
                    case "true":
                        System.out.println("(Parou)");
                        break;
                    case "false":
                        System.out.println(counter);
                        break;
                }
            }
            System.out.println("Terminou...");
        }else{JOptionPane.showMessageDialog(null,"Opcao invalida");}
    }
}
