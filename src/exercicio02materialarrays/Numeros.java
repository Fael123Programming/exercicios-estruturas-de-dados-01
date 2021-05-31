package exercicio02materialarrays;

import javax.swing.JOptionPane;
public class Numeros {
    /*Exercício 2 do material intitulado "Arrays".
    Preencher um vetor com números, sendo um sempre a metade do anterior,
    partindo de 1 até 20.*/
    public static void main(String[] args){
        float numbers[]=new float[20];
        int opcao=Integer.parseInt(JOptionPane.showInputDialog("(1) Para utilizar"
                + " o comando FOR\n(2) Para utilizar o comando WHILE\n(3) Para "
                + "utilizar o comando DO/WHILE")),counter=0;
        
        switch(opcao){
            case 1:
                //Usando Laços FOR
                JOptionPane.showMessageDialog(null,"Preenchendo o vetor...");
                for(;counter<20;counter++){
                    if(counter==0) numbers[counter]=1.0f;
                    else numbers[counter]=numbers[counter-1]/2;
                }
                JOptionPane.showMessageDialog(null,"Mostrando os valores preenchidos...");
                for(counter=0;counter<20;counter++){
                    JOptionPane.showMessageDialog(null,"Posicao("+counter+")="+numbers[counter]);
                    System.out.println("Posicao("+counter+")="+numbers[counter]);
                }
                break;
            case 2:
                //Usando Laços WHILE
                JOptionPane.showMessageDialog(null,"Preenchendo o vetor...");
                while(counter<20){
                    if(counter==0) numbers[counter]=1.0f;
                    else numbers[counter]=numbers[counter-1]/2;
                    counter++;
                }
                JOptionPane.showMessageDialog(null,"Mostrando os valores preenchidos...");
                counter=0;
                while(counter<20){
                    JOptionPane.showMessageDialog(null,"Posicao("+counter+")="+numbers[counter]);
                    System.out.println("Posicao("+counter+")="+numbers[counter]);
                    counter++;
                }
                break;
            case 3:
                //Usando Laços DO/WHILE
                JOptionPane.showMessageDialog(null,"Preenchendo o vetor...");
                do{
                    if(counter==0) numbers[counter]=1.0f;
                    else numbers[counter]=numbers[counter-1]/2;
                    counter++;
                }while(counter<20);
                JOptionPane.showMessageDialog(null,"Mostrando os valores preenchidos...");
                counter=0;
                do{
                    JOptionPane.showMessageDialog(null,"Posicao("+counter+")="+numbers[counter]);
                    System.out.println("Posicao("+counter+")="+numbers[counter]);
                    counter++;
                }while(counter<20);
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opcao invalida");
                break;
        }
    }
}
