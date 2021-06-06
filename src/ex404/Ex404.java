package ex404;
import javax.swing.JOptionPane;
public class Ex404 {
    /*Algoritmo que pega 100 números inteiros do usuário,preenche uma matriz de ordem 10
    com esses dados e,após,imprime os elementos dessa mesma matriz formada,que se 
    encontram acima da diagonal principal.*/
    public static void main(String[] args){
        int matriz[][]={{0,1,1,1,1,1,1,1,1,1},{0,0,1,1,1,1,1,1,1,1},{0,0,0,1,1,1,1,1,1,1},
            {0,0,0,0,1,1,1,1,1,1},{0,0,0,0,0,1,1,1,1,1},{0,0,0,0,0,0,1,1,1,1},
            {0,0,0,0,0,0,0,1,1,1},{0,0,0,0,0,0,0,0,1,1},{0,0,0,0,0,0,0,0,0,1},
            {0,0,0,0,0,0,0,0,0,0}};
        int opcao=Integer.parseInt(JOptionPane.showInputDialog("(1) Para rodar com comando FOR\n"
                + "(2) Para rodar com comando WHILE\n(3) Para rodar com comando DO/WHILE")),c1,c2,tab;
        switch(opcao){
            case 1:
                /*for(c1=0;c1<10;c1++){
                    for(c2=0;c2<10;c2++){
                        matriz[c1][c2]=Integer.parseInt(JOptionPane.showInputDialog("Elemento ["+c1+""+c2+"]"));
                    }
                }*/
                for(c1=0;c1<9;c1++){
                    for(tab=0;tab<c1+1;tab++) System.out.print("\t");
                    for(c2=c1+1;c2<10;c2++) {
                        if(c2<9) System.out.print("["+matriz[c1][c2]+"]\t");
                        else System.out.print("["+matriz[c1][c2]+"]\n\n\n");
                    }
                }
                System.out.println("\n\n");
                for(c1=0;c1<10;c1++){
                    for(c2=0;c2<10;c2++) {
                        if(c2<9) System.out.print("["+matriz[c1][c2]+"]\t");
                        else System.out.print("["+matriz[c1][c2]+"]\n\n\n");
                    }
                }
                System.out.println("Versao com FOR");
                break;
            case 2:
                c1=0;
              /*while(c1<10){
                    c2=0;
                    while(c2<10){
                        matriz[c1][c2]=Integer.parseInt(JOptionPane.showInputDialog("Elemento ["+c1+""+c2+"]"));
                        c2++;
                    }
                    c1++;
                }*/
                c1=0;
                while(c1<9){
                    tab=0;
                    while(tab<c1+1) {
                        System.out.print("\t");
                        tab++;
                    }
                    c2=c1+1;
                    while(c2<10) {
                        if(c2<9) System.out.print("["+matriz[c1][c2]+"]\t");
                        else System.out.print("["+matriz[c1][c2]+"]\n\n\n");
                        c2++;
                    }
                    c1++;
                }
                System.out.println("\n\n");
                c1=0;
                while(c1<10){
                    c2=0;
                    while(c2<10) {
                        if(c2<9) System.out.print("["+matriz[c1][c2]+"]\t");
                        else System.out.print("["+matriz[c1][c2]+"]\n\n\n");
                        c2++;
                    }
                    c1++;
                }
                System.out.println("Versao com WHILE");
                break;
            case 3:
                c1=0;
                /*do{
                    c2=0;
                    do{
                        matriz[c1][c2]=Integer.parseInt(JOptionPane.showInputDialog("Elemento ["+c1+""+c2+"]"));
                        c2++;
                    }while(c2<10);
                    c1++;
                }while(c1<10);*/
                c1=0;
                do{
                    tab=0;
                    do{
                        System.out.print("\t");
                        tab++;
                    }while(tab<c1+1);
                    c2=c1+1;
                    do{
                        if(c2<9) System.out.print("["+matriz[c1][c2]+"]\t");
                        else System.out.print("["+matriz[c1][c2]+"]\n\n\n");
                        c2++;
                    }while(c2<10);
                    c1++;
                }while(c1<9);
                System.out.println("\n\n");
                c1=0;
                do{
                    c2=0;
                    do{
                        if(c2<9) System.out.print("["+matriz[c1][c2]+"]\t");
                        else System.out.print("["+matriz[c1][c2]+"]\n\n\n");
                        c2++;
                    }while(c2<10);
                    c1++;
                }while(c1<10);
                System.out.println("Versao com DO/WHILE");
                break;
            default:JOptionPane.showMessageDialog(null,"Opcao invalida!");
        }  
    }
}
