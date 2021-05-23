package ex163;

import javax.swing.JOptionPane;
public class Ex163 {
    /*Algoritmo que simula proceduralmente uma rotina de exercícios físicos:
    o praticante corre 3 voltas em torno de um lago por dia e, a cada volta, faz
    5 abdominais. Cada um dos eventos realizados são mostrados na tela ao usuá-
    rio.*/
    public static void main(String[] args){
        int escolha;
        escolha=Integer.parseInt(JOptionPane.showInputDialog("(1) Para rodar "
                + "a versao com if/else\n(2) Para rodar a versao com switch"));
        if(escolha==1){
            for(int voltaNoLago=0;voltaNoLago<3;voltaNoLago++){
                if(voltaNoLago<=1)JOptionPane.showMessageDialog(null,"Volta no lago: "+(voltaNoLago+1)+"a");
                else JOptionPane.showMessageDialog(null,"Ultima volta no lago do dia: "+(voltaNoLago+1)+"a");
                for(int abdominal=0;abdominal<5;abdominal++){
                    if(voltaNoLago<=1){
                        if(abdominal<=3) JOptionPane.showMessageDialog(null,"Abdominal: "+(abdominal+1)+"a");
                        else JOptionPane.showMessageDialog(null,"Ultima abdominal dessa volta: "+(abdominal+1)+"a");
                    }else{
                        if(abdominal<=3) JOptionPane.showMessageDialog(null,"Abdominal: "+(abdominal+1)+"a");
                        else JOptionPane.showMessageDialog(null,"Ultima abdominal do dia: "+(abdominal+1)+"a");
                    }
                }
            }
            JOptionPane.showMessageDialog(null,"Vamos embora!");
        }else if(escolha==2){
            for(int voltaNoLago=0;voltaNoLago<3;voltaNoLago++){
                switch(Boolean.toString(voltaNoLago<=1)){
                    case "true":
                        JOptionPane.showMessageDialog(null,"Volta no lago: "+(voltaNoLago+1)+"a");
                        break;
                    case "false":
                        JOptionPane.showMessageDialog(null,"Ultima volta no lago do dia: "+(voltaNoLago+1)+"a");
                        break;
                }
                for(int abdominal=0;abdominal<5;abdominal++){
                    switch(Boolean.toString(voltaNoLago<=1)){
                        case "true":
                            switch(Boolean.toString(abdominal<=3)){
                                case "true":
                                    JOptionPane.showMessageDialog(null,"Abdominal: "+(abdominal+1)+"a");
                                    break;
                                case "false":
                                    JOptionPane.showMessageDialog(null,"Ultima abdominal dessa volta: "+(abdominal+1)+"a");
                                    break;
                            }
                            break;
                        case "false":
                            switch(Boolean.toString(abdominal<=3)){
                                case "true":
                                    JOptionPane.showMessageDialog(null,"Abdominal: "+(abdominal+1)+"a");
                                    break;
                                case "false":
                                    JOptionPane.showMessageDialog(null,"Ultima abdominal do dia: "+(abdominal+1)+"a");
                                    break;
                            }
                            break;
                    }
                }
            }
            JOptionPane.showMessageDialog(null,"Vamos embora!");
        }else{JOptionPane.showMessageDialog(null,"Opcao invalida");}
    }
}
