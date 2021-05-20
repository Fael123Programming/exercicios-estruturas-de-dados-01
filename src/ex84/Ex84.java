package ex84;

import javax.swing.JOptionPane;
public class Ex84{
    public static void main(String[] args){
	int a;//Variável utilizada
	a = Integer.parseInt(JOptionPane.showInputDialog("Digite numero"));//Pegando um número do usuário e o convertendo para tipo inteiro
		
	//Versão com if/else
	if(a % 2 == 0) JOptionPane.showMessageDialog(null,"PAR");//Se o resultado de sua divisão módulo por 2 for igual a zero, o mesmo número é par 
	else JOptionPane.showMessageDialog(null,"IMPAR");//Se não for, ele é ímpar
		
	//Versão com switch
	switch(a%2){
            case 0:
                JOptionPane.showMessageDialog(null,"PAR");
                break;
            case 1:
		JOptionPane.showMessageDialog(null,"IMPAR");
		break;
        }
    }
}
