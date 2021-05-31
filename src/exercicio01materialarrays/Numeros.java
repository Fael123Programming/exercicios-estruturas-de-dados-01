package exercicio01materialarrays;

import javax.swing.JOptionPane;
public class Numeros {
    public static void main(String[] args){
        /*Exercício 1 do material intitulado "Arrays".
        Preencher um vetor com 10 números e depois mostrar seus dados.*/
        int opcao=Integer.parseInt(JOptionPane.showInputDialog("(1) Para utilizar"
                + " o comando FOR\n(2) Para utilizar o comando WHILE\n(3) Para "
                + "utilizar o comando DO/WHILE"));
        byte numbers[]= new byte[10],counter=0;
        switch(opcao){
            case 1:
                //Usando Laços FOR
                JOptionPane.showMessageDialog(null,"Preenchendo um vetor com os"
                        + " 10\nprimeiros numeros naturais...");
                for(;counter<10;counter++) numbers[counter]=counter;
                JOptionPane.showMessageDialog(null,"Agora,mostrando esses valores...");
                for(counter=0;counter<10;counter++){
                    JOptionPane.showMessageDialog(null,"Posicao ("+counter+")"
                            + "="+numbers[counter]);
                    System.out.println("Posicao ("+counter+")="+numbers[counter]);
                }
                break;
            case 2:
                //Usando Laços WHILE
                JOptionPane.showMessageDialog(null,"Preenchendo um vetor com os"
                        + " 10\nprimeiros numeros naturais...");
                while(counter<10){
                    numbers[counter]=counter;
                    counter++;
                }
                JOptionPane.showMessageDialog(null,"Agora,mostrando esses valores...");
                counter=0;
                while(counter<10){
                    JOptionPane.showMessageDialog(null,"Posicao ("+counter+")"
                            + "="+numbers[counter]);
                    System.out.println("Posicao ("+counter+")="+numbers[counter]);
                    counter++;
                }
                break;
            case 3:
                //Usando Laços DO/WHILE
                JOptionPane.showMessageDialog(null,"Preenchendo um vetor com os"
                        + " 10\nprimeiros numeros naturais...");
                do{
                    numbers[counter]=counter;
                    counter++;
                }while(counter<10);
                JOptionPane.showMessageDialog(null,"Agora,mostrando esses valores...");
                counter=0;
                do{
                    JOptionPane.showMessageDialog(null,"Posicao ("+counter+")"
                            + "="+numbers[counter]);
                    System.out.println("Posicao ("+counter+")="+numbers[counter]);
                    counter++;
                }while(counter<10);
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opcao invalida");
                break;
        }
    }
}
