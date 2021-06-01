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
        boolean vetorDesordenado=false;
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
                    if(!vetorDesordenado && counter01<9){//Verificando se o vetor está desordenado ou não
                       if(numbers[counter01]>numbers[counter01+1]) vetorDesordenado=true;
                       /*Foi utilizado if !vetorDesordenado para que seja feito apenas uma vez,
                       ou seja, se foi percebido que o vetor está desordenado, não precisa ficar
                       checando a cada iteração.*/
                    }
                }
                if(vetorDesordenado){
                    for(counter01=0;counter01<10;counter01++){
                        /*O comando de repetição seguinte descobre quem é o menor número
                        dentro do vetor numbers (a partir da posição indicada por counter03)*/
                        for(counter02=counter01;counter02<10;counter02++){
                            if(counter02==counter01) {
                                menorAtual=numbers[counter02];
                                posicaoMenorAtual=counter02;
                            }else if(numbers[counter02]<menorAtual) {
                                menorAtual=numbers[counter02];
                                posicaoMenorAtual=counter02;
                            }
                        }
                        if(numbers[counter01]!=menorAtual){
                            aux=numbers[counter01];
                            numbers[counter01]=numbers[posicaoMenorAtual];
                            numbers[posicaoMenorAtual]=aux;
                        }
                    }
                    System.out.println("");
                    JOptionPane.showMessageDialog(null,"Mostrando os dados digitados apos serem ordenados...");
                    for(counter01=0;counter01<10;counter01++){
                        JOptionPane.showMessageDialog(null,"Posicao("+counter01+")="+numbers[counter01]);
                        System.out.println("Posicao("+counter01+")="+numbers[counter01]);
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"Os dados digitados já estão ordenados!");
                }
                break;
            case 2:
                //Usando Laços WHILE
                JOptionPane.showMessageDialog(null,"Preenchendo o vetor...");
                while(counter01<10){
                    numbers[counter01]=Integer.parseInt(JOptionPane.showInputDialog((counter01+1)+"º numero"));
                    counter01++;
                }
                JOptionPane.showMessageDialog(null,"Mostrando os dados digitados...");
                counter01=0;
                while(counter01<10){
                    JOptionPane.showMessageDialog(null,"Posicao("+counter01+")="+numbers[counter01]);
                    System.out.println("Posicao("+counter01+")="+numbers[counter01]);
                    if(!vetorDesordenado && counter01<9){//Verificando se o vetor está desordenado ou não
                       if(numbers[counter01]>numbers[counter01+1]) vetorDesordenado=true;
                       /*Foi utilizado if (!vetorDesordenado...) para que seja feito apenas uma vez,
                       ou seja, se foi percebido que o vetor está desordenado, não precisa ficar
                       checando a cada iteração.*/
                    }
                    counter01++;
                }
                if(vetorDesordenado){
                    counter01=0;
                    while(counter01<10){
                        /*O comando de repetição seguinte descobre quem é o menor número
                        dentro do vetor numbers (a partir da posição indicada por counter01)*/
                        counter02=counter01;
                        while(counter02<10){
                            if(counter02==counter01) {
                                menorAtual=numbers[counter02];
                                posicaoMenorAtual=counter02;
                            }else if(numbers[counter02]<menorAtual) {
                                menorAtual=numbers[counter02];
                                posicaoMenorAtual=counter02;
                            }
                            counter02++;
                        }
                        if(numbers[counter01]!=menorAtual){
                            aux=numbers[counter01];
                            numbers[counter01]=numbers[posicaoMenorAtual];
                            numbers[posicaoMenorAtual]=aux;
                        }
                        counter01++;
                    }
                    System.out.println("");
                    JOptionPane.showMessageDialog(null,"Mostrando os dados digitados apos serem ordenados...");
                    counter01=0;
                    while(counter01<10){
                        JOptionPane.showMessageDialog(null,"Posicao("+counter01+")="+numbers[counter01]);
                        System.out.println("Posicao("+counter01+")="+numbers[counter01]);
                        counter01++;
                    }
                }else JOptionPane.showMessageDialog(null,"Os dados digitados já estão ordenados!");
                break;
            case 3:
                //Usando Laços DO/WHILE
                JOptionPane.showMessageDialog(null,"Preenchendo o vetor...");
                do{
                    numbers[counter01]=Integer.parseInt(JOptionPane.showInputDialog((counter01+1)+"º numero"));
                    counter01++;
                }while(counter01<10);
                JOptionPane.showMessageDialog(null,"Mostrando os dados digitados...");
                counter01=0;
                do{
                    JOptionPane.showMessageDialog(null,"Posicao("+counter01+")="+numbers[counter01]);
                    System.out.println("Posicao("+counter01+")="+numbers[counter01]);
                    if(!vetorDesordenado && counter01<9){//Verificando se o vetor está desordenado ou não
                       if(numbers[counter01]>numbers[counter01+1]) vetorDesordenado=true;
                       /*Foi utilizado if (!vetorDesordenado...) para que seja feito apenas uma vez,
                       ou seja, se foi percebido que o vetor está desordenado, não precisa ficar
                       checando a cada iteração.*/
                    }
                    counter01++;
                }while(counter01<10);
                if(vetorDesordenado){
                    counter01=0;
                    do{
                        /*O comando de repetição seguinte descobre quem é o menor número
                        dentro do vetor numbers (a partir da posição indicada por counter01)*/
                        counter02=counter01;
                        do{
                            if(counter02==counter01) {
                                menorAtual=numbers[counter02];
                                posicaoMenorAtual=counter02;
                            }else if(numbers[counter02]<menorAtual) {
                                menorAtual=numbers[counter02];
                                posicaoMenorAtual=counter02;
                            }
                            counter02++;
                        }while(counter02<10);
                        if(numbers[counter01]!=menorAtual){
                            aux=numbers[counter01];
                            numbers[counter01]=numbers[posicaoMenorAtual];
                            numbers[posicaoMenorAtual]=aux;
                        }
                        counter01++;
                    }while(counter01<10);
                    System.out.println("");
                    JOptionPane.showMessageDialog(null,"Mostrando os dados digitados apos serem ordenados...");
                    counter01=0;
                    do{
                        JOptionPane.showMessageDialog(null,"Posicao("+counter01+")="+numbers[counter01]);
                        System.out.println("Posicao("+counter01+")="+numbers[counter01]);
                        counter01++;
                    }while(counter01<10);
                }else JOptionPane.showMessageDialog(null,"Os dados digitados já estão ordenados!");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opcao invalida");
                break;
        }
    }
}
