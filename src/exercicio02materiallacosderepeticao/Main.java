package exercicio02materiallacosderepeticao;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
        int opcao=Integer.parseInt(JOptionPane.showInputDialog("(1) Para utilizar"
                + " o comando FOR\n(2) Para utilizar o comando WHILE\n(3) Para "
                + "utilizar o comando DO/WHILE")),counter01=0,counter02;
        int []x=new int[10];
        int [][]m= new int[10][10];
        switch(opcao){
            case 1:
                //Usando Laços FOR
                for(;counter01<10;counter01++){
                    x[counter01]=(int)Math.pow(counter01,2);
                    System.out.println("\nValor de x["+counter01+"]="+x[counter01]+"\n");
                    for(counter02=9;counter02>=0;counter02--){
                        m[counter01][counter02]=counter01*counter02;
                        System.out.println("Valor de m["+counter01+"]["+counter02+"]="+m[counter01][counter02]);
                    }
                }
                System.out.println("Laco for");
                break;
            case 2:
                //Usando Laços WHILE
                while(counter01<10){
                    x[counter01]=(int)Math.pow(counter01,2);
                    System.out.println("\nValor de x["+counter01+"]="+x[counter01]+"\n");
                    counter02=9;
                    while(counter02>=0){
                        m[counter01][counter02]=counter01*counter02;
                        System.out.println("Valor de m["+counter01+"]["+counter02+"]="+m[counter01][counter02]);
                        counter02--;
                    }
                    counter01++;
                }
                System.out.println("Laco while");
                break;
            case 3:
                //Usando Laços DO/WHILE
                do{
                    x[counter01]=(int)Math.pow(counter01,2);
                    System.out.println("\nValor de x["+counter01+"]="+x[counter01]+"\n");
                    counter02=9;
                    do{
                        m[counter01][counter02]=counter01*counter02;
                        System.out.println("Valor de m["+counter01+"]["+counter02+"]="+m[counter01][counter02]);
                        counter02--;
                    }while(counter02>=0);
                    counter01++;
                }while(counter01<10);
                System.out.println("Laco do/while");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opcao invalida");
                break;
        }
    }
}
