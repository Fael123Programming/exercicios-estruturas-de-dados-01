package exercicio04materialarrays;
import javax.swing.JOptionPane;
public class Numeros {
    public static void main(String[] args){
        /*Exercício 4 do material intitulado "Arrays.
        Preenche um vetor bidimensional (matriz) com os 10 primeiros
        números naturais e seus respectivos quadrados. Após, mostra todos os
        valores.*/
        byte numbers[][]= new byte[2][10],counter01=0;
        /*No vetor numbers,a linha 0 irá conter os números naturais de 0 a 9. Já a
        linha 1,conterá seus quadrados.*/
        int opcao=Integer.parseInt(JOptionPane.showInputDialog("(1) Para utilizar"
                + " o comando FOR\n(2) Para utilizar o comando WHILE\n(3) Para "
                + "utilizar o comando DO/WHILE"));
        
        switch(opcao){
            case 1:
                //Usando Laços FOR
                JOptionPane.showMessageDialog(null,"Preenchendo o vetor...");
                for(;counter01<10;counter01++){
                    numbers[0][counter01]=counter01;
                    numbers[1][counter01]=(byte)Math.pow(counter01,2);
                }
                JOptionPane.showMessageDialog(null,"Mostrando os dados colocados no vetor...");
                for(counter01=0;counter01<10;counter01++){
                    JOptionPane.showMessageDialog(null,numbers[0][counter01]+"->"+numbers[1][counter01]);
                    System.out.println(numbers[0][counter01]+"->"+numbers[1][counter01]);
                }
                break;
            case 2:
                //Usando Laços WHILE
                JOptionPane.showMessageDialog(null,"Preenchendo o vetor...");
                while(counter01<10){
                    numbers[0][counter01]=counter01;
                    numbers[1][counter01]=(byte)Math.pow(counter01,2);
                    counter01++;
                }
                JOptionPane.showMessageDialog(null,"Mostrando os dados colocados no vetor...");
                counter01=0;
                while(counter01<10){
                    JOptionPane.showMessageDialog(null,numbers[0][counter01]+"->"+numbers[1][counter01]);
                    System.out.println(numbers[0][counter01]+"->"+numbers[1][counter01]);
                    counter01++;
                }
                break;
            case 3:
                //Usando Laços DO/WHILE
                JOptionPane.showMessageDialog(null,"Preenchendo o vetor...");
                do{
                    numbers[0][counter01]=counter01;
                    numbers[1][counter01]=(byte)Math.pow(counter01,2);
                    counter01++;
                }while(counter01<10);
                counter01=0;
                JOptionPane.showMessageDialog(null,"Mostrando os dados colocados no vetor...");
                do{
                    JOptionPane.showMessageDialog(null,numbers[0][counter01]+"->"+numbers[1][counter01]);
                    System.out.println(numbers[0][counter01]+"->"+numbers[1][counter01]);
                    counter01++;
                }while(counter01<10);
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opcao invalida");
                break;
        }
    }
}
