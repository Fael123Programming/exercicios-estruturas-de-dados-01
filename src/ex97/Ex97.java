package ex97;
import javax.swing.JOptionPane;
public class Ex97{
    //Algoritmo que verifica se um número inteiro é divisível por 10,5,2 ou por
    //nenhum destes
    public static void main(String[] args){
	int numero;//Variável utilizada
	boolean controle = true;//Variável utilizada para assemelharmos a 
        //versão switch com a if/else,ou seja,para que apenas uma condição seja
        //atendida.
	numero = Integer.parseInt(JOptionPane.showInputDialog("Digite numero"));
        //Pegando um número inteiro do usuário.
		
	//Versão if/else
	if(numero % 10 == 0) JOptionPane.showMessageDialog(null,"Multiplo de 10");    //Se o resultado da 
	else if(numero % 2 == 0) JOptionPane.showMessageDialog(null,"Multiplo de 2"); //divisão módulo deste 
	else if(numero % 5 == 0) JOptionPane.showMessageDialog(null,"Multiplo de 5"); //número por outro número
	else JOptionPane.showMessageDialog(null,"Nao e multiplo de 10,5 e 2");        //for igual a zero,isso significa
                                       						      //que ele é divisível exato (sem restos) por ele.																					
																					  //e é seu múltiplo.
	//Versão switch
	switch(numero%10){
            case 0:
		JOptionPane.showMessageDialog(null,"Multiplo de 10");
		controle = false;
		break;
	}
	if(controle){// Se o número não for múltiplo de 10.
            switch(numero%2){
		case 0:
                    JOptionPane.showMessageDialog(null,"Multiplo de 2");
                    controle = false;
                    break;
            }
	}
		
	if(controle){ //Neste ponto do algoritmo,se o número não for múltiplo 
        //de 10 e 2.
            switch(numero%5){
		case 0:
                    JOptionPane.showMessageDialog(null,"Multiplo de 5");
                    controle = false;
                    break;
            }
        }
               
                
	if(controle) {//Se o número não for múltiplo de 10,5 e 2.
		JOptionPane.showMessageDialog(null,"Nao e multiplo de 10,5 e 2");
	}
    }
}