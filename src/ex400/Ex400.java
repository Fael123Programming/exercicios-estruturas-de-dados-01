package ex400;

import javax.swing.JOptionPane;
public class Ex400 {
    /*Algoritmo que implementa um sistema de controle de hotel: registra 
    reservas e aluguéis de quartos,calcula despesas e gastos de clientes,etc.*/
    public static void main(String[] args){
        byte opcao=Byte.parseByte(JOptionPane.showInputDialog("(1) Para utilizar"
                + " o comando FOR\n(2) Para utilizar o comando WHILE\n(3) Para "
                + "utilizar o comando DO/WHILE")),escolha;
        Hotel hotelFazendaSucesso= new Hotel(5);//50 quartos
            switch(opcao){
                case 1:
                    //Usando Laço FOR
                    escolha=menu("Hotel-Fazenda Sucesso\n1. Cadastrar quarto\n"
                            + "2. Listar todos os quartos\n3. Listar quartos"
                            + " ocupados\n4. Alugar/reservar quarto\n5. Regis"
                            + "trar despesas extras\n6. Calcular despesas de"
                            + " quarto\n7. Sair");
                    for(;escolha!=7;){
                        switch(escolha){
                            case 1:
                                cadastrarQuarto(hotelFazendaSucesso);
                                break;
                            case 2:
                                listarQuartos(hotelFazendaSucesso,"for","todos");
                                break;
                            case 3:
                                listarQuartos(hotelFazendaSucesso,"for","ocupados");
                                break;
                            case 4:
                                //ocuparQuarto();
                                break;
                            case 5:
                                //registrarDespesasExtras();
                                break;
                            case 6:
                                //encerrarQuarto();
                                break;
                            case 7:
                                finalizar();
                            default:
                                JOptionPane.showMessageDialog(null,"Opcao invalida");
                        }
                        escolha=menu("Hotel-Fazenda Sucesso\n1. Cadastrar quarto\n"
                            + "2. Listar todos os quartos\n3. Listar quartos"
                            + " ocupados\n4. Alugar/reservar quarto\n5. Regis"
                            + "trar despesas extras\n6. Calcular despesas de"
                            + " quarto\n7. Sair");
                    }
                    break;
                case 2:
                    //Usando Laço WHILE
                
                    break;
                case 3:
                    //Usando Laço DO/WHILE
                
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opcao invalida");
                    break;
            }
    }
    
    public static byte menu(String texto){return Byte.parseByte(JOptionPane.showInputDialog(texto));}

    public static void finalizar(){System.exit(0);}

    public static void cadastrarQuarto(Hotel ht){
        if(ht.estaLotado()) JOptionPane.showMessageDialog(null,"Quantidade maxima de quartos atingida!");
        else{
            int leitos=Integer.parseInt(JOptionPane.showInputDialog("Cadastrar quarto\nQuantidade de leitos?"));
            float precoDiaria=Float.parseFloat(JOptionPane.showInputDialog("Cadastrar quarto\nPreco da diaria?"));
            Quarto qt=new Quarto(leitos,precoDiaria);
            ht.cadastrarQuarto(qt);
            JOptionPane.showMessageDialog(null,"Cadastrado com sucesso!");
        }
    }
    
    public static void listarQuartos(Hotel ht,String lacoDeRepeticao,String estadoQuartos){
        if(ht.getNumeroDeQuartosCadastrados()==0) {
            JOptionPane.showMessageDialog(null,"Sem quartos cadastrados!");
            return;
        }
        if(!ht.haQuartosOcupados()&&estadoQuartos.equals("ocupados")){
            JOptionPane.showMessageDialog(null,"Sem quartos ocupados (reservados ou alugados)!");
            return;
        }
        int counter=0;
        switch(lacoDeRepeticao){
            case "for":
                System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< Quartos: "+estadoQuartos+" "
                        + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                for(;counter<ht.getNumeroDeQuartosCadastrados();counter++){
                    switch(estadoQuartos){
                        case "todos":
                            System.out.println(ht.getQuartos()[counter]);
                            break;
                        case "ocupados":
                            if(ht.getQuartos()[counter].getSituacao().
                                    equals("reservado")||ht.getQuartos()[counter].
                                            getSituacao().equals("alugado")){
                                System.out.println(ht.getQuartos()[counter]);
                            }
                    }
                }
                break;
        }
    }
}
