package ex54;
import javax.swing.JOptionPane;
public class Ex54{
    //Algoritmo que calcula e imprime a área de um triângulo NAO EQUILATERO
    public static void main(String[] args){
	float a,b;//Declarando as variaveis que serão utilizadas
	a = Float.parseFloat(JOptionPane.showInputDialog("Entre com a base")); //Pegando do usuario, a base do triangulo e convertendo para float
	b = Float.parseFloat(JOptionPane.showInputDialog("Entre a altura do triangulo")); //Pegando do usuario, a altura do triangulo e convertendo para float
	JOptionPane.showMessageDialog(null,String.format("Area = %.2f",a*b/2));//Mostrando o resultado do calculo ao usuario
    }
}