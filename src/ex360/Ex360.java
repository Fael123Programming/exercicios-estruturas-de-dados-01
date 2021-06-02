package ex360;

import javax.swing.JOptionPane;

public class Ex360 {
    /*Algoritmo que pega a data de nascimento de uma pessoa,no formato ddmm,e
    mostra qual é o seu signo.*/
    public static void main(String [] args){
        Horoscopo hosc=new Horoscopo();//ddmm
        int opcao=Integer.parseInt(JOptionPane.showInputDialog("(1) Para utilizar"
                + " o comando FOR\n(2) Para utilizar o comando WHILE\n(3) Para "
                + "utilizar o comando DO/WHILE"));
        if(opcao<1||opcao>3){
            JOptionPane.showMessageDialog(null,"Opcao invalida");
            System.exit(0);//Finaliza a rotina principal
        }
        String dataAniversario=JOptionPane.showInputDialog("Informe uma "
                + "data de aniversario (formato ddmm)\n9999 para finalizar");
            switch(opcao){
                case 1:
                    //Usando Laço FOR
                    for(;!dataAniversario.equals("9999");){
                        JOptionPane.showMessageDialog(null,"Signo: "+hosc.qualEOSigno(dataAniversario));
                        dataAniversario=JOptionPane.showInputDialog("Informe uma "
                        +"data de aniversario (formato ddmm)\n9999 para finalizar");
                    }
                    System.out.println("Versao com FOR");
                    break;
                case 2:
                    //Usando Laço WHILE
                    while(!dataAniversario.equals("9999")){
                        JOptionPane.showMessageDialog(null,"Signo: "+hosc.qualEOSigno(dataAniversario));
                        dataAniversario=JOptionPane.showInputDialog("Informe uma "
                        +"data de aniversario (formato ddmm)\n9999 para finalizar");
                    }
                    System.out.println("Versao com WHILE");
                    break;
                case 3:
                    //Usando Laço DO/WHILE
                    do{
                        if(dataAniversario.equals("9999")) break;
                        JOptionPane.showMessageDialog(null,"Signo: "+hosc.qualEOSigno(dataAniversario));
                        dataAniversario=JOptionPane.showInputDialog("Informe uma "
                        +"data de aniversario (formato ddmm)\n9999 para finalizar");
                    }while(true);
                    System.out.println("Versao com DO/WHILE");
                    break;
            }
    }
}
