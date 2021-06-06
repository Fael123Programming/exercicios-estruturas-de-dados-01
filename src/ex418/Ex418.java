package ex418;
import javax.swing.JOptionPane;
public class Ex418 {
    /*Algoritmo que pega números inteiros do usuário,preenche duas matrizes de
    ordem 4 e mostra a soma entre essas duas matrizes.*/
    public static void main(String[] args){
        int matriz01[][]=new int[4][4],matriz02[][]=new int[4][4],
        resultadoDaSoma[][]=new int[4][4];
        int opcao=Integer.parseInt(JOptionPane.showInputDialog("(1) Para utilizar"
                + " o comando FOR\n(2) Para utilizar o comando WHILE\n(3) Para "
                + "utilizar o comando DO/WHILE")),counter01,counter02;
            switch(opcao){
                case 1:
                    //Usando Laço FOR
                    //Preenchendo a primeira matriz.
                    for(counter01=0;counter01<4;counter01++){
                        for(counter02=0;counter02<4;counter02++){
                            matriz01[counter01][counter02]=Integer.parseInt(JOptionPane.
                            showInputDialog("PRIMEIRA MATRIZ\nElemento ["+counter01+""+counter02+"]"));
                        }
                    }
                    //Mostrando os elementos da primeira matriz.
                    System.out.println("\tPRIMEIRA MATRIZ");
                    for(counter01=0;counter01<4;counter01++){
                        for(counter02=0;counter02<4;counter02++){
                            if(counter02<3)System.out.print("["+matriz01[counter01][counter02]+"]\t");
                            else System.out.print("["+matriz01[counter01][counter02]+"]");
                        }
                        System.out.println("\n\n");
                    }//Preenchendo a segunda matriz e a matriz resultado da soma.
                    for(counter01=0;counter01<4;counter01++){
                        for(counter02=0;counter02<4;counter02++){
                            matriz02[counter01][counter02]=Integer.parseInt(JOptionPane.
                                    showInputDialog("SEGUNDA MATRIZ\nElemento ["+counter01+""+counter02+"]"));
                            resultadoDaSoma[counter01][counter02]=matriz01[counter01][counter02]+matriz02[counter01][counter02];
                            //Aproveitando esse laço para já preencher a matriz resultadoDaSoma.
                        }
                    }
                    //Mostrando os elementos da segunda matriz.
                    System.out.println("\tSEGUNDA MATRIZ");
                    for(counter01=0;counter01<4;counter01++){
                        for(counter02=0;counter02<4;counter02++){
                            if(counter02<3)System.out.print("["+matriz02[counter01][counter02]+"]\t");
                            else System.out.print("["+matriz02[counter01][counter02]+"]");
                        }
                        System.out.println("\n\n");
                    }
                    //Mostrando os elementos da matriz resultado da soma.
                    System.out.println("\tMATRIZ RESULTADO DA SOMA");
                    for(counter01=0;counter01<4;counter01++){
                        for(counter02=0;counter02<4;counter02++){
                            if(counter02<3)System.out.print("["+resultadoDaSoma[counter01][counter02]+"]\t");
                            else System.out.print("["+resultadoDaSoma[counter01][counter02]+"]");
                        }
                        System.out.println("\n\n");
                    }
                    break;
                case 2:
                    //Usando Laço WHILE
                    //Preenchendo a primeira matriz.
                    counter01=0;
                    while(counter01<4){
                        counter02=0;
                        while(counter02<4){
                            matriz01[counter01][counter02]=Integer.parseInt(JOptionPane.
                            showInputDialog("PRIMEIRA MATRIZ\nElemento ["+counter01+""+counter02+"]"));
                            counter02++;
                        }
                        counter01++;
                    }
                    //Mostrando os elementos da primeira matriz.
                    System.out.println("\tPRIMEIRA MATRIZ");
                    counter01=0;
                    while(counter01<4){
                        counter02=0;
                        while(counter02<4){
                            if(counter02<3)System.out.print("["+matriz01[counter01][counter02]+"]\t");
                            else System.out.print("["+matriz01[counter01][counter02]+"]");
                            counter02++;
                        }
                        System.out.println("\n\n");
                        counter01++;
                    }
                    //Preenchendo a segunda matriz e a matriz resultado da soma.
                    counter01=0;
                    while(counter01<4){
                        counter02=0;
                        while(counter02<4){
                            matriz02[counter01][counter02]=Integer.parseInt(JOptionPane.
                                    showInputDialog("SEGUNDA MATRIZ\nElemento ["+counter01+""+counter02+"]"));
                            resultadoDaSoma[counter01][counter02]=matriz01[counter01][counter02]+matriz02[counter01][counter02];
                            //Aproveitando esse laço para já preencher a matriz resultadoDaSoma.
                            counter02++;
                        }
                        counter01++;
                    }
                    //Mostrando os elementos da segunda matriz.
                    System.out.println("\tSEGUNDA MATRIZ");
                    counter01=0;
                    while(counter01<4){
                        counter02=0;
                        while(counter02<4){
                            if(counter02<3)System.out.print("["+matriz02[counter01][counter02]+"]\t");
                            else System.out.print("["+matriz02[counter01][counter02]+"]");
                            counter02++;
                        }
                        System.out.println("\n\n");
                        counter01++;
                    }
                    //Mostrando os elementos da matriz resultado da soma.
                    System.out.println("\tMATRIZ RESULTADO DA SOMA");
                    counter01=0;
                    while(counter01<4){
                        counter02=0;
                        while(counter02<4){
                            if(counter02<3)System.out.print("["+resultadoDaSoma[counter01][counter02]+"]\t");
                            else System.out.print("["+resultadoDaSoma[counter01][counter02]+"]");
                            counter02++;
                        }
                        System.out.println("\n\n");
                        counter01++;
                    }
                    break;
                case 3:
                    //Usando Laço DO/WHILE
                    //Preenchendo a primeira matriz.
                    counter01=0;
                    do{
                        counter02=0;
                        do{
                            matriz01[counter01][counter02]=Integer.parseInt(JOptionPane.
                            showInputDialog("PRIMEIRA MATRIZ\nElemento ["+counter01+""+counter02+"]"));
                            counter02++;
                        }while(counter02<4);
                        counter01++;
                    }while(counter01<4);
                    //Mostrando os elementos da primeira matriz.
                    System.out.println("\tPRIMEIRA MATRIZ");
                    counter01=0;
                    do{
                        counter02=0;
                        do{
                            if(counter02<3)System.out.print("["+matriz01[counter01][counter02]+"]\t");
                            else System.out.print("["+matriz01[counter01][counter02]+"]");
                            counter02++;
                        }while(counter02<4);
                        System.out.println("\n\n");
                        counter01++;
                    }while(counter01<4);
                    //Preenchendo a segunda matriz e a matriz resultado da soma.
                    counter01=0;
                    do{
                        counter02=0;
                        do{
                            matriz02[counter01][counter02]=Integer.parseInt(JOptionPane.
                                    showInputDialog("SEGUNDA MATRIZ\nElemento ["+counter01+""+counter02+"]"));
                            resultadoDaSoma[counter01][counter02]=matriz01[counter01][counter02]+matriz02[counter01][counter02];
                            //Aproveitando esse laço para já preencher a matriz resultadoDaSoma.
                            counter02++;
                        }while(counter02<4);
                        counter01++;
                    }while(counter01<4);
                    //Mostrando os elementos da segunda matriz.
                    System.out.println("\tSEGUNDA MATRIZ");
                    counter01=0;
                    do{
                        counter02=0;
                        do{
                            if(counter02<3)System.out.print("["+matriz02[counter01][counter02]+"]\t");
                            else System.out.print("["+matriz02[counter01][counter02]+"]");
                            counter02++;
                        }while(counter02<4);
                        System.out.println("\n\n");
                        counter01++;
                    }while(counter01<4);
                    //Mostrando os elementos da matriz resultado da soma.
                    System.out.println("\tMATRIZ RESULTADO DA SOMA");
                    counter01=0;
                    do{
                        counter02=0;
                        do{
                            if(counter02<3)System.out.print("["+resultadoDaSoma[counter01][counter02]+"]\t");
                            else System.out.print("["+resultadoDaSoma[counter01][counter02]+"]");
                            counter02++;
                        }while(counter02<4);
                        System.out.println("\n\n");
                        counter01++;
                    }while(counter01<4);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opcao invalida");
                    break;
            }
    }       
}
