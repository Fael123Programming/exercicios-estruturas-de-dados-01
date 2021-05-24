package ex84;

import javax.swing.JOptionPane;
public class Ex84{
    public static void main(String[] args){
        //Algoritmo que verifica se um número inteiro é PAR ou ÍMPAR
	int a,escolha;//Variável utilizada
        escolha=Integer.parseInt(JOptionPane.showInputDialog("(1) Para rodar a "
                + "versão com if/else\n(2) Para rodar a versão com switch"));
        if(escolha==1){
            a=Integer.parseInt(JOptionPane.showInputDialog("Digite numero"));//Pegando um número do usuário e o convertendo para tipo inteiro
            //Versão com if/else
            if(a % 2 == 0) JOptionPane.showMessageDialog(null,"PAR");//Se o resultado de sua divisão módulo por 2 for igual a zero, o mesmo número é par 
            else JOptionPane.showMessageDialog(null,"IMPAR");//Se não for, ele é ímpar
        }else if(escolha==2){
            //Versão com switch
            a=Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
            switch(a%2){
                case 0:
                    JOptionPane.showMessageDialog(null,"PAR");
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null,"IMPAR");
                    break;
            }
        }else{JOptionPane.showMessageDialog(null,"Opcao invalida");}
    }
}
