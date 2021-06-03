package ex400;
import java.util.Date;
import javax.swing.JOptionPane;
public class Ex400 {
    /*Algoritmo que implementa um sistema de controle de hotel: registra 
    reservas e aluguéis de quartos,calcula despesas e gastos de clientes,etc.*/
    public static void main(String[] args){
        byte opcao=Byte.parseByte(JOptionPane.showInputDialog("(1) Para utilizar"
                + " o comando FOR\n(2) Para utilizar o comando WHILE\n(3) Para "
                + "utilizar o comando DO/WHILE")),escolha;
        Hotel hotelFazendaSucesso= new Hotel(50);//50 quartos
        escolha=menu("Hotel-Fazenda Sucesso\n1. Cadastrar quarto\n"
                            + "2. Listar todos os quartos\n3. Listar quartos"
                            + " ocupados\n4. Alugar/reservar quarto\n5. Regis"
                            + "trar despesas extras\n6.  Encerrar ocupacao em"
                            + " quarto\n7. Sair");
            switch(opcao){
                case 1:
                    //Usando Laço FOR
                    for(;true;){
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
                                ocuparQuarto(hotelFazendaSucesso);
                                break;
                            case 5:
                                adicionarDespesasExtras(hotelFazendaSucesso);
                                break;
                            case 6:
                                encerrarOcupacaoEmQuarto(hotelFazendaSucesso);
                                break;
                            case 7:
                                finalizar();
                            default:
                                JOptionPane.showMessageDialog(null,"Opcao invalida");
                        }
                        escolha=menu("Hotel-Fazenda Sucesso\n1. Cadastrar quarto\n"
                            + "2. Listar todos os quartos\n3. Listar quartos"
                            + " ocupados\n4. Alugar/reservar quarto\n5. Regis"
                            + "trar despesas extras\n6.  Encerrar ocupacao em"
                            + " quarto\n7. Sair");
                    }
                case 2:
                    //Usando Laço WHILE
                    while(true){
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
                                ocuparQuarto(hotelFazendaSucesso);
                                break;
                            case 5:
                                adicionarDespesasExtras(hotelFazendaSucesso);
                                break;
                            case 6:
                                encerrarOcupacaoEmQuarto(hotelFazendaSucesso);
                                break;
                            case 7:
                                finalizar();
                            default:
                                JOptionPane.showMessageDialog(null,"Opcao invalida");
                        }
                        escolha=menu("Hotel-Fazenda Sucesso\n1. Cadastrar quarto\n"
                            + "2. Listar todos os quartos\n3. Listar quartos"
                            + " ocupados\n4. Alugar/reservar quarto\n5. Regis"
                            + "trar despesas extras\n6.  Encerrar ocupacao em"
                            + " quarto\n7. Sair");
                    }
                case 3:
                    //Usando Laço DO/WHILE
                    do{
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
                                ocuparQuarto(hotelFazendaSucesso);
                                break;
                            case 5:
                                adicionarDespesasExtras(hotelFazendaSucesso);
                                break;
                            case 6:
                                encerrarOcupacaoEmQuarto(hotelFazendaSucesso);
                                break;
                            case 7:
                                finalizar();
                            default:
                                JOptionPane.showMessageDialog(null,"Opcao invalida");
                        }
                        escolha=menu("Hotel-Fazenda Sucesso\n1. Cadastrar quarto\n"
                            + "2. Listar todos os quartos\n3. Listar quartos"
                            + " ocupados\n4. Alugar/reservar quarto\n5. Regis"
                            + "trar despesas extras\n6.  Encerrar ocupacao em"
                            + " quarto\n7. Sair");
                    }while(true);
                default:
                    JOptionPane.showMessageDialog(null,"Opcao invalida");
                    break;
            }
    }
    
    public static byte menu(String texto){return Byte.parseByte(JOptionPane.showInputDialog(texto));}

    public static void finalizar(){System.exit(0);}

    public static void cadastrarQuarto(Hotel ht){
        if(ht.getNumeroDeQuartosCadastrados()==ht.getQuartos().length) 
            JOptionPane.showMessageDialog(null,"Quantidade maxima de quartos atingida!");
        else{
            int leitos=Integer.parseInt(JOptionPane.showInputDialog("Cadastrar quarto\nQuantidade de leitos?"));
            float precoDiaria=Float.parseFloat(JOptionPane.showInputDialog("Cadastrar quarto\nPreco da diaria?"));
            Quarto qt=new Quarto(leitos,precoDiaria);
            ht.cadastrarQuarto(qt);
            JOptionPane.showMessageDialog(null,"Cadastrado com sucesso!");
        }
    }
    
    public static void listarQuartos(Hotel ht,String lacoDeRepeticao,String estadoQuartos){
        /*estadoQuartos recebe uma condição para que determinados quartos que a possuem,
        sejam mostrados: todos (mostra todos os quartos) ou ocupados (mostra apenas os 
        alugados ou reservados).*/
        if(ht.getNumeroDeQuartosCadastrados()==0) {
            JOptionPane.showMessageDialog(null,"Sem quartos cadastrados!");
            return;
        }
        if(ht.getNumeroDeOcupacoesRegistradas()==0&&estadoQuartos.equals("ocupados")){
            /*Se for pedido para mostrar os quartos ocupados do hotel e não haver
            nenhum.*/
            JOptionPane.showMessageDialog(null,"Sem quartos ocupados (reservados ou alugados)!");
            return;
        }
        int counter=0,counterArrayOcupacoes=0;
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<"
                + "<<<<<<<<<< Quartos: "+estadoQuartos+" >>>>>>>>>>>>>>>>>>>>"
                        + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        switch(lacoDeRepeticao){
            case "for":
                for(;counter<ht.getNumeroDeQuartosCadastrados();counter++){
                    switch(estadoQuartos){
                        case "todos":
                            if(ht.getQuartos()[counter].getSituacao().equals("livre")){
                                System.out.println(ht.getQuartos()[counter]);
                            }else {
                                System.out.println(ht.obterOcupacaoDeQuartoPorCodigoDeQuarto
                                (ht.getQuartos()[counter].getCodigo()));
                            }
                            break;
                        case "ocupados":
                            if(ht.getQuartos()[counter].getSituacao().
                                    equals("reservado")||ht.getQuartos()[counter].
                                            getSituacao().equals("alugado")){
                                System.out.println(ht.obterOcupacaoDeQuartoPorCodigoDeQuarto
                                (ht.getQuartos()[counter].getCodigo()));
                            }
                    }
                }
                break;
            case "while":
                while(counter<ht.getNumeroDeQuartosCadastrados()){
                    switch(estadoQuartos){
                        case "todos":
                            if(ht.getQuartos()[counter].getSituacao().equals("livre")){
                                System.out.println(ht.getQuartos()[counter]);
                            }else {
                                System.out.println(ht.obterOcupacaoDeQuartoPorCodigoDeQuarto
                                (ht.getQuartos()[counter].getCodigo()));
                            }
                            break;
                        case "ocupados":
                            if(ht.getQuartos()[counter].getSituacao().
                                    equals("reservado")||ht.getQuartos()[counter].
                                            getSituacao().equals("alugado")){
                                System.out.println(ht.obterOcupacaoDeQuartoPorCodigoDeQuarto
                                (ht.getQuartos()[counter].getCodigo()));
                            }
                    }
                    counter++;
                }
                break;
            case "do/while":
                do{
                    switch(estadoQuartos){
                        case "todos":
                            if(ht.getQuartos()[counter].getSituacao().equals("livre")){
                                System.out.println(ht.getQuartos()[counter]);
                            }else {
                                System.out.println(ht.obterOcupacaoDeQuartoPorCodigoDeQuarto
                                (ht.getQuartos()[counter].getCodigo()));
                            }
                            break;
                        case "ocupados":
                            if(ht.getQuartos()[counter].getSituacao().
                                    equals("reservado")||ht.getQuartos()[counter].
                                            getSituacao().equals("alugado")){
                                System.out.println(ht.obterOcupacaoDeQuartoPorCodigoDeQuarto
                                (ht.getQuartos()[counter].getCodigo()));
                            }
                    }
                    counter++;
                }while(counter<ht.getNumeroDeQuartosCadastrados());
        }
    }

    public static void ocuparQuarto(Hotel ht){
        if(ht.getNumeroDeQuartosCadastrados()==0){
            JOptionPane.showMessageDialog(null,"Sem quartos cadastrados!");
            return;
        }
        if(ht.getNumeroDeOcupacoesRegistradas()==ht.getNumeroDeQuartosCadastrados()){
            JOptionPane.showMessageDialog(null,"Sem quartos disponiveis!");
            return;
        }
        byte opcao=menu("Ocupar quarto\n1. Alugar\n2. Reservar");
        int diarias;
        String nomeOcupante,codigoQuarto;
        switch(opcao){
            case 1:
                nomeOcupante=JOptionPane.showInputDialog("Alugar quarto\nNome do ocupante?");
                diarias=Integer.parseInt(JOptionPane.showInputDialog("Alugar quarto\nQuantidade de diarias?"));
                codigoQuarto=JOptionPane.showInputDialog("Alugar quarto\nCodigo do quarto?");
                if(quartoValidoParaOcupar(ht,codigoQuarto)){
                    if(JOptionPane.showInputDialog("Alugar quarto\nConfirmar aluguel?").
                            toLowerCase().equals("sim")){
                        Date dt=new Date();
                        String []dataAuxiliar=dt.toString().split(" ");
                        String dataDeEntrada=dataAuxiliar[2]+"/"+getNumeroDeMes(dataAuxiliar[1])+"/"+dataAuxiliar[5];
                        OcupacaoEmQuarto novaOcupacao=new OcupacaoEmQuarto(nomeOcupante,"aluguel",
                                dataDeEntrada,diarias,ht.obterQuartoPorCodigo(codigoQuarto));
                        ht.registrarOcupacao(novaOcupacao);
                        JOptionPane.showMessageDialog(null,"Aluguel registrado com sucesso!");
                    }else{
                        JOptionPane.showMessageDialog(null,"Operacao cancelada!");
                    }
                }
                break;
            case 2:
                String dataInicioEstadia;
                nomeOcupante=JOptionPane.showInputDialog("Reservar quarto\nNome do ocupante?");
                dataInicioEstadia=JOptionPane.showInputDialog("Reservar quarto\nData do inicio da estadia\n(formato dd/mm/aaaa)");
                diarias=Integer.parseInt(JOptionPane.showInputDialog("Reservar quarto\nQuantidade de diarias?"));
                codigoQuarto=JOptionPane.showInputDialog("Reservar quarto\nCodigo do quarto?");
                if(quartoValidoParaOcupar(ht,codigoQuarto)){
                    if(JOptionPane.showInputDialog("Reservar quarto\nConfirmar reserva?").
                            toLowerCase().equals("sim")){
                        OcupacaoEmQuarto novaOcupacao=new OcupacaoEmQuarto(nomeOcupante,"reserva",
                                dataInicioEstadia,diarias,ht.obterQuartoPorCodigo(codigoQuarto));
                        ht.registrarOcupacao(novaOcupacao);
                        JOptionPane.showMessageDialog(null,"Reserva registrada com sucesso!");
                    }else{
                        JOptionPane.showMessageDialog(null,"Operacao cancelada!");
                    }
                }
                break;
        }
    }
    
    public static void adicionarDespesasExtras(Hotel ht){
        if(ht.getNumeroDeQuartosCadastrados()==0) {
            JOptionPane.showMessageDialog(null,"Nenhum quarto cadastrado!");
            return;
        }
        if(ht.getNumeroDeOcupacoesRegistradas()==0) {
            JOptionPane.showMessageDialog(null,"Nenhum quarto ocupado!");
            return;
        }
        float despesasExtras=Float.parseFloat(JOptionPane.showInputDialog
        ("Adicionar despesas extras\nValor?"));
        String codigoSupostoQuartoOcupado=JOptionPane.showInputDialog
        ("Adicionar despesas extras\nCodigo do quarto?");
        OcupacaoEmQuarto oeq=ht.obterOcupacaoDeQuartoPorCodigoDeQuarto(codigoSupostoQuartoOcupado);
        if(oeq==null){
            JOptionPane.showMessageDialog(null,"Este quarto nao esta ocupado por alguem ou nao foi encontrado!");
            return;
        }
        if(JOptionPane.showInputDialog("Codigo do quarto: "+oeq.
           getQuartoOcupado().getCodigo()+"     Responsavel: "+oeq.getResponsavel()
        +"\nConfirmar operacao?").toLowerCase().equals("sim")){
            oeq.adicionarDespesasExtras(despesasExtras);
            JOptionPane.showMessageDialog(null,"Operacao realizada com sucesso!");
        }else JOptionPane.showMessageDialog(null,"Operacao cancelada!");
    }
    
    public static void encerrarOcupacaoEmQuarto(Hotel ht){
        if(ht.getNumeroDeQuartosCadastrados()==0) {
            JOptionPane.showMessageDialog(null,"Nenhum quarto cadastrado!");
            return;
        }
        if(ht.getNumeroDeOcupacoesRegistradas()==0) {
            JOptionPane.showMessageDialog(null,"Nenhum quarto ocupado!");
            return;
        }
        String codigoSupostoQuarto=JOptionPane.showInputDialog("Encerrar ocupacao"
                + " de quarto\nCodigo do quarto?");
        OcupacaoEmQuarto oeq=ht.obterOcupacaoDeQuartoPorCodigoDeQuarto(codigoSupostoQuarto);
        if(oeq==null){
            JOptionPane.showMessageDialog(null,"Este quarto nao esta ocupado por"
                    + " alguem ou nao foi encontrado!");
            return;
        }
        if(JOptionPane.showInputDialog(null,"Responsavel: "+oeq.getResponsavel()+
                "     Valor total: R$"+oeq.getPrecoFinal()+"\nConfirmar operacao?").toLowerCase().equals("sim")){
            ht.encerrarOcupacaoEmQuarto(oeq);
            JOptionPane.showMessageDialog(null,"Ocupacao em quarto encerrada com sucesso!");
        }else JOptionPane.showMessageDialog(null,"Operacao cancelada!");
    }
    
    public static boolean quartoValidoParaOcupar(Hotel ht,String codigoQuarto){
        Quarto supostoQuarto=ht.obterQuartoPorCodigo(codigoQuarto);
        if(supostoQuarto==null) {//Quarto não existe.
            JOptionPane.showMessageDialog(null,"Quarto nao encontrado!");
            return false;
        }
        else if(supostoQuarto.getSituacao().equals("alugado")){
            JOptionPane.showMessageDialog(null,"Quarto alugado!");
            return false;
        }else if(supostoQuarto.getSituacao().equals("reservado")){
            JOptionPane.showMessageDialog(null,"Quarto reservado!");
            return false;
        }else{
            JOptionPane.showMessageDialog(null,"<< Quarto "+supostoQuarto.getCodigo()+" >>");
            JOptionPane.showMessageDialog(null,supostoQuarto);
            return true;
        }
    }
    
    public static String getNumeroDeMes(String nomeMes){
        switch(nomeMes.toLowerCase()){
            case "jan": return "01";
            case "feb": return "02";
            case "mar": return "03";
            case "apr": return "04";
            case "may": return "05";
            case "jun": return "06";
            case "jul": return "07";
            case "aug": return "08";
            case "sep": return "09";
            case "oct": return "10";
            case "nov": return "11";
            case "dec": return "12";
            default: return "Error";
        }
    }
}
