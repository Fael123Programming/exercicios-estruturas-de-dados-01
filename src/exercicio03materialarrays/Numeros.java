package exercicio03materialarrays;

import javax.swing.JOptionPane;
public class Numeros {
    /*Exercicio 3 do material intitulado "Arrays".
    Preencher um vetor com números inteiros e,depois,ordená-lo,mostrando seus
    dados em cada etapa.*/
    public static void main(String[] args){
        int opcao=Integer.parseInt(JOptionPane.showInputDialog("(1) Para utilizar"
                + " o comando FOR\n(2) Para utilizar o comando WHILE\n(3) Para "
                + "utilizar o comando DO/WHILE"));
        int numbers[]= new int[10],counter01=0,counter02=0,menorAtual=0,posicaoMenorAtual=0,aux;
        switch(opcao){
            case 1:
                //Usando Laços FOR
                JOptionPane.showMessageDialog(null,"Preenchendo o vetor...");
                for(;counter01<10;counter01++){
                    numbers[counter01]=Integer.parseInt(JOptionPane.showInputDialog((counter01+1)+"º numero"));
                }
                JOptionPane.showMessageDialog(null,"Mostrando os dados digitados...");
                for(counter01=0;counter01<10;counter01++){
                    JOptionPane.showMessageDialog(null,"Posicao("+counter01+")="+numbers[counter01]);
                    System.out.println("Posicao("+counter01+")="+numbers[counter01]);
                }
                for(counter01=0;counter01<10;counter01++){
                    for(counter02=0;counter02<10;counter02++){
                        if(counter02==0) {
                            menorAtual=numbers[counter02];
                            posicaoMenorAtual=counter02;
                        }else if(numbers[counter02]<menorAtual) {
                            menorAtual=numbers[counter02];
                            posicaoMenorAtual=counter02;
                        }
                    }
                    aux=numbers[counter01];
                    numbers[counter01]=numbers[posicaoMenorAtual];
                    numbers[posicaoMenorAtual]=aux;
                }
                JOptionPane.showMessageDialog(null,"Mostrando os dados digitados apos serem ordenados...");
                for(counter01=0;counter01<10;counter01++){
                    JOptionPane.showMessageDialog(null,"Posicao("+counter01+")="+numbers[counter01]);
                    System.out.println("Posicao("+counter01+")="+numbers[counter01]);
                }
                break;
            case 2:
                //Usando Laços WHILE
                
                break;
            case 3:
                //Usando Laços DO/WHILE
                
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opcao invalida");
                break;
        }
    }
}
