package ex358;
import javax.swing.JOptionPane;
public class Ex358 {
    /*Algoritmo que pega o preço de compra e de venda de mercadorias,calcula e
    mostra quantas dão menos que 10% de lucro,entre 10% e 20% de lucro e mais 
    que 20% de lucro.*/
    public static void main(String[] args){
        float precoCompra,precoVenda,percentage;
        int lucroMenor10=0,lucro10E20=0,lucroMaior20=0,mercadorias=10;
        int opcao=Integer.parseInt(JOptionPane.showInputDialog("(1) Para utilizar"
                + " o comando FOR\n(2) Para utilizar o comando WHILE\n(3) Para "
                + "utilizar o comando DO/WHILE"));
        byte counter=0;
        switch(opcao){
            case 1:
                //Usando Laço FOR
                for(;counter<mercadorias;counter++){
                    precoCompra=Float.parseFloat(JOptionPane.showInputDialog((counter+1)+"ª mercadoria\nPreço de compra"));
                    precoVenda=Float.parseFloat(JOptionPane.showInputDialog((counter+1)+"ª mercadoria\nPreço de venda"));
                    percentage=(precoVenda-precoCompra)*(100/precoCompra);
                    if(percentage<10) lucroMenor10++;
                    else if(percentage<=20) lucro10E20++;
                    else lucroMaior20++;
                }
                JOptionPane.showMessageDialog(null,"Mercadorias que proporcionam \nlucro menor que 10%: "+lucroMenor10);
                JOptionPane.showMessageDialog(null,"Mercadorias que proporcionam \nlucro entre 10% e 20%: "+lucro10E20);
                JOptionPane.showMessageDialog(null,"Mercadorias que proporcionam \nlucro maior que 20%: "+lucroMaior20);
                System.out.println("Versao com FOR");
                break;
            case 2:
                //Usando Laço WHILE
                while(counter<mercadorias){
                    precoCompra=Float.parseFloat(JOptionPane.showInputDialog((counter+1)+"ª mercadoria\nPreço de compra"));
                    precoVenda=Float.parseFloat(JOptionPane.showInputDialog((counter+1)+"ª mercadoria\nPreço de venda"));
                    percentage=(precoVenda-precoCompra)*(100/precoCompra);
                    if(percentage<10) lucroMenor10++;
                    else if(percentage<=20) lucro10E20++;
                    else lucroMaior20++;
                    counter++;
                }
                JOptionPane.showMessageDialog(null,"Mercadorias que proporcionam \nlucro menor que 10%: "+lucroMenor10);
                JOptionPane.showMessageDialog(null,"Mercadorias que proporcionam \nlucro entre 10% e 20%: "+lucro10E20);
                JOptionPane.showMessageDialog(null,"Mercadorias que proporcionam \nlucro maior que 20%: "+lucroMaior20);
                System.out.println("Versao com WHILE");
                break;
            case 3:
                //Usando Laço DO/WHILE
                do{
                    precoCompra=Float.parseFloat(JOptionPane.showInputDialog((counter+1)+"ª mercadoria\nPreço de compra"));
                    precoVenda=Float.parseFloat(JOptionPane.showInputDialog((counter+1)+"ª mercadoria\nPreço de venda"));
                    percentage=(precoVenda-precoCompra)*(100/precoCompra);
                    if(percentage<10) lucroMenor10++;
                    else if(percentage<=20) lucro10E20++;
                    else lucroMaior20++;
                    counter++;
                }while(counter<mercadorias);
                JOptionPane.showMessageDialog(null,"Mercadorias que proporcionam \nlucro menor que 10%: "+lucroMenor10);
                JOptionPane.showMessageDialog(null,"Mercadorias que proporcionam \nlucro entre 10% e 20%: "+lucro10E20);
                JOptionPane.showMessageDialog(null,"Mercadorias que proporcionam \nlucro maior que 20%: "+lucroMaior20);
                System.out.println("Versao com DO/WHILE");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opcao invalida");
                break;
        }
    }
}
