package ex369;

import javax.swing.JOptionPane;
public class Ex369 {
    /*Algoritmo que gerencia um sistema de reservas de mesas para um evento
    específico: são 30 mesas com 5 lugares cada (indexadas com um código de 
    100 a 129).*/
    public static void main(String[] args){
        int mesas[]=new int[30],codigoMesa,quantidadePessoas;//Todas as 30 mesas
        int opcao=Integer.parseInt(JOptionPane.showInputDialog("(1) Para utilizar"
                + " o comando FOR\n(2) Para utilizar o comando WHILE\n(3) Para "
                + "utilizar o comando DO/WHILE"));
        if(opcao<1||opcao>3){
            JOptionPane.showMessageDialog(null,"Opcao Invalida!");
            System.exit(0);
        }
        System.out.println("<<<<<<Gerenciador De Mesas>>>>>>");
        JOptionPane.showMessageDialog(null,"<<<<<<Gerenciador De Mesas>>>>>>");
        codigoMesa=Integer.parseInt(JOptionPane.showInputDialog("Codigo da mesa"
                + " (0 para finalizar)"));
            switch(opcao){
                case 1:
                    //Usando Laço FOR
                    for(;codigoMesa!=0;){
                        if(codigoMesa<100||codigoMesa>129) JOptionPane.showMessageDialog(null,"Codigo invalido!");
                        else if(mesas[codigoMesa-100]==5) JOptionPane.showMessageDialog(null,"Mesa indisponível!");
                        else{
                            quantidadePessoas=Integer.parseInt(JOptionPane.
                                    showInputDialog("Codigo da mesa:"+codigoMesa+
                                            "   Vagas disponiveis:"+(5-mesas[codigoMesa-100])+
                                            "\nReservar para quantas pessoas? (-1 para sair)"));
                            for(;true;){
                                if(quantidadePessoas==-1) break;
                                else if(quantidadePessoas<0) JOptionPane.showMessageDialog(null,"Valor invalido!");
                                else if(quantidadePessoas==0) JOptionPane.showMessageDialog(null,"Impossivel reservar para ninguem!");
                                else if(quantidadePessoas>(5-mesas[codigoMesa-100])) JOptionPane.showMessageDialog(null,"Muitas pessoas para uma unica mesa!");
                                else{
                                    mesas[codigoMesa-100]+=quantidadePessoas;
                                    JOptionPane.showMessageDialog(null,"Mesa reservada!");
                                    break;
                                }
                                quantidadePessoas=Integer.parseInt(JOptionPane.
                                    showInputDialog("Codigo da mesa:"+codigoMesa+
                                            "   Vagas disponiveis:"+(5-mesas[codigoMesa-100])+
                                            "\nReservar para quantas pessoas? (-1 para sair)"));
                            }
                        }
                        codigoMesa=Integer.parseInt(JOptionPane.showInputDialog("Codigo da mesa"
                        + " (0 para finalizar)"));      
                    }
                    System.out.println("Versao com FOR");
                    break;
                case 2:
                    //Usando Laço WHILE
                    while(codigoMesa!=0){
                        if(codigoMesa<100||codigoMesa>129) JOptionPane.showMessageDialog(null,"Codigo invalido!");
                        else if(mesas[codigoMesa-100]==5) JOptionPane.showMessageDialog(null,"Mesa indisponível!");
                        else{
                            quantidadePessoas=Integer.parseInt(JOptionPane.
                                    showInputDialog("Codigo da mesa:"+codigoMesa+
                                            "   Vagas disponiveis:"+(5-mesas[codigoMesa-100])+
                                            "\nReservar para quantas pessoas? (-1 para sair)"));
                            while(true){
                                if(quantidadePessoas==-1) break;
                                else if(quantidadePessoas<0) JOptionPane.showMessageDialog(null,"Valor invalido!");
                                else if(quantidadePessoas==0) JOptionPane.showMessageDialog(null,"Impossivel reservar para ninguem!");
                                else if(quantidadePessoas>(5-mesas[codigoMesa-100])) JOptionPane.showMessageDialog(null,"Muitas pessoas para uma unica mesa!");
                                else{
                                    mesas[codigoMesa-100]+=quantidadePessoas;
                                    JOptionPane.showMessageDialog(null,"Mesa reservada!");
                                    break;
                                }
                                quantidadePessoas=Integer.parseInt(JOptionPane.
                                    showInputDialog("Codigo da mesa:"+codigoMesa+
                                            "   Vagas disponiveis:"+(5-mesas[codigoMesa-100])+
                                            "\nReservar para quantas pessoas? (-1 para sair)"));
                            }
                        }
                        codigoMesa=Integer.parseInt(JOptionPane.showInputDialog("Codigo da mesa"
                        + " (0 para finalizar)"));      
                    }
                    System.out.println("Versao com WHILE");
                    break;
                case 3:
                    //Usando Laço DO/WHILE
                    do{
                        if(codigoMesa==0)break;
                        if(codigoMesa<100||codigoMesa>129) JOptionPane.showMessageDialog(null,"Codigo invalido!");
                        else if(mesas[codigoMesa-100]==5) JOptionPane.showMessageDialog(null,"Mesa indisponível!");
                        else{
                            quantidadePessoas=Integer.parseInt(JOptionPane.
                                    showInputDialog("Codigo da mesa:"+codigoMesa+
                                            "   Vagas disponiveis:"+(5-mesas[codigoMesa-100])+
                                            "\nReservar para quantas pessoas? (-1 para sair)"));
                            do{
                                if(quantidadePessoas==-1) break;
                                else if(quantidadePessoas<0) JOptionPane.showMessageDialog(null,"Valor invalido!");
                                else if(quantidadePessoas==0) JOptionPane.showMessageDialog(null,"Impossivel reservar para ninguem!");
                                else if(quantidadePessoas>(5-mesas[codigoMesa-100])) JOptionPane.showMessageDialog(null,"Muitas pessoas para uma unica mesa!");
                                else{
                                    mesas[codigoMesa-100]+=quantidadePessoas;
                                    JOptionPane.showMessageDialog(null,"Mesa reservada!");
                                    break;
                                }
                                quantidadePessoas=Integer.parseInt(JOptionPane.
                                    showInputDialog("Codigo da mesa:"+codigoMesa+
                                            "   Vagas disponiveis:"+(5-mesas[codigoMesa-100])+
                                            "\nReservar para quantas pessoas? (-1 para sair)"));
                            }while(true);
                        }
                        codigoMesa=Integer.parseInt(JOptionPane.showInputDialog("Codigo da mesa"
                        + " (0 para finalizar)"));      
                    }while(true);
                    System.out.println("Versao com DO/WHILE");
                    break;
            }
    }
}
