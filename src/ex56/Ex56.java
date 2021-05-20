package ex56;

import javax.swing.JOptionPane;
public class Ex56{
    //Algoritmo que pega nome e idade do usuário e os mostra a ele
    public static void main(String[] args){
	String nome;//Variável usada
	int idade;//Variável usada
	nome = JOptionPane.showInputDialog("Digite nome");//Pegando o nome do usuário
	idade = Integer.parseInt(JOptionPane.showInputDialog("Digite idade"));//Pegando sua idade e convertendo para tipo inteiro
	JOptionPane.showMessageDialog(null,"Nome = "+nome);//Mostrando seu nome
	JOptionPane.showMessageDialog(null,"Idade = "+idade);//Mostrando sua idade
    }
}
