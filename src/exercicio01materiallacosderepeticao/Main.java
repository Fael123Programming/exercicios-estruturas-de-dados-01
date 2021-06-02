package exercicio01materiallacosderepeticao;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
        int opcao=Integer.parseInt(JOptionPane.showInputDialog("(1) Para utilizar"
                + " o comando FOR\n(2) Para utilizar o comando WHILE\n(3) Para "
                + "utilizar o comando DO/WHILE"));
        byte x=0;
        switch(opcao){
            case 1:
                //Usando Laços FOR
                for(;x<10;x++) System.out.println("Valor de x: "+x);
                System.out.println("Fim do laco for");
                break;
            case 2:
                //Usando Laços WHILE
                while(x<10){
                    System.out.println("Valor de x: "+x);
                    x++;
                }
                System.out.println("Fim do laco while");
                break;
            case 3:
                //Usando Laços DO/WHILE
                do{
                    System.out.println("Valor de x: "+x);
                    x++;
                }while(x<10);
                System.out.println("Fim do laco do/while");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opcao invalida");
                break;
        }
    }
}
