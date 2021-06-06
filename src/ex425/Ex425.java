package ex425;
import javax.swing.JOptionPane;
public class Ex425 {
    /*Algoritmo que implementa um sistema de controle de cadastramento e quantidade
    de plantas em uma floricultura.*/
    public static void main(String[] args) {
        Estoque plantas=new Estoque(5);
        int opcao=Integer.parseInt(JOptionPane.showInputDialog("(1) Para utilizar"
                + " o comando FOR\n(2) Para utilizar o comando WHILE\n(3) Para "
                + "utilizar o comando DO/WHILE"));
        byte escolha;
        switch(opcao){
            case 1:
                //Usando Laço FOR
                for(;true;){  
                    escolha=menu("Sistema para Floricultura\n1. Cadastrar nova planta\n2. Atualizar estoque de uma planta"
                            + "\n3. Relatorio do estoque de plantas\n4. Sair");
                    switch(escolha){
                        case 1:
                            cadastrarPlanta(plantas);
                            break;
                        case 2:
                            atualizarEstoqueDePlanta(plantas,"for");
                            break;
                        case 3:
                            relatorioDePlantas(plantas,"for");
                            break;
                        case 4:
                            finalizar();
                        default:JOptionPane.showMessageDialog(null,"Opcao invalida!");
                    }
                }
            case 2:
                //Usando Laço WHILE
                while(true){  
                    escolha=menu("Sistema para Floricultura\n1. Cadastrar nova planta\n2. Atualizar estoque de uma planta"
                            + "\n3. Relatorio do estoque de plantas\n4. Sair");
                    switch(escolha){
                        case 1:
                            cadastrarPlanta(plantas);
                            break;
                        case 2:
                            atualizarEstoqueDePlanta(plantas,"while");
                            break;
                        case 3:
                            relatorioDePlantas(plantas,"while");
                            break;
                        case 4:
                            finalizar();
                        default:JOptionPane.showMessageDialog(null,"Opcao invalida!");
                    }
                }
            case 3:
                //Usando Laço DO/WHILE
                do{  
                    escolha=menu("Sistema para Floricultura\n1. Cadastrar nova planta\n2. Atualizar estoque de uma planta"
                            + "\n3. Relatorio do estoque de plantas\n4. Sair");
                    switch(escolha){
                        case 1:
                            cadastrarPlanta(plantas);
                            break;
                        case 2:
                            atualizarEstoqueDePlanta(plantas,"do/while");
                            break;
                        case 3:
                            relatorioDePlantas(plantas,"do/while");
                            break;
                        case 4:
                            finalizar();
                        default:JOptionPane.showMessageDialog(null,"Opcao invalida!");
                    }
                }while(true);
            default:
                JOptionPane.showMessageDialog(null,"Opcao invalida");
                break;
        }
    }
    
    public static byte menu(String texto){return Byte.parseByte(JOptionPane.showInputDialog(texto));}
   
    public static void cadastrarPlanta(Estoque est){
       if(est.getQuantidadeDePlantasAdicionadas()==est.getPlantas().length){
           JOptionPane.showMessageDialog(null,"Quantidade maxima de plantas cadastradas atingida!");
           return;
       }
       String nomePlanta=JOptionPane.showInputDialog("Cadastrar nova planta\nNome da planta?");
       int qtdMin=Integer.parseInt(JOptionPane.showInputDialog("Cadastrar nova planta\nQuantidade minima para estoque?"));
       est.cadastrarNovaPlanta(new Planta(nomePlanta,qtdMin));
       JOptionPane.showMessageDialog(null,"Planta cadastrada com sucesso!");
   }
   
    public static void atualizarEstoqueDePlanta(Estoque est,String loopParaUsar){
        if(est.getQuantidadeDePlantasAdicionadas()==0){
            JOptionPane.showMessageDialog(null,"Nenhuma planta foi cadastrada!");
            return;
        }
        String nomePlanta=JOptionPane.showInputDialog("Atualizar estoque de planta\nNome da planta?");
        Planta pl=procurarPlanta(est,nomePlanta,loopParaUsar);
        if(pl==null){
            JOptionPane.showMessageDialog(null,"Planta nao encontrada!");
            return;
        } 
        int qtd=Integer.parseInt(JOptionPane.showInputDialog("Atualizar estoque de planta"
                + "\nQuantidade a atualizar?"));
        pl.setQuantidadeAtual(qtd);
        JOptionPane.showMessageDialog(null,"Quantidade de planta atualizada com sucesso!");
    }
   
    public static Planta procurarPlanta(Estoque est,String nomePlanta,String loopParaUsar){
        int counter=0;
        Planta pl;
        switch(loopParaUsar.toLowerCase()){
            case "for":
                for(;counter<est.getQuantidadeDePlantasAdicionadas();counter++){
                    pl=est.getPlantas()[counter];
                    if(pl.getNome().toLowerCase().equals(nomePlanta.toLowerCase())) return pl;
                }
                return null;
            case "while":
                while(counter<est.getQuantidadeDePlantasAdicionadas()){
                    pl=est.getPlantas()[counter];
                    if(pl.getNome().toLowerCase().equals(nomePlanta.toLowerCase())) return pl;
                    counter++;
                }
                return null;
            case "do/while":
                do{
                    pl=est.getPlantas()[counter];
                    if(pl.getNome().toLowerCase().equals(nomePlanta.toLowerCase())) return pl;
                    counter++;
                }while(counter<est.getQuantidadeDePlantasAdicionadas());
            default: return null;
        }
    }
    
    public static void relatorioDePlantas(Estoque est,String loopParaUsar){
        if(est.getQuantidadeDePlantasAdicionadas()==0){
            JOptionPane.showMessageDialog(null,"Nenhuma planta foi cadastrada!");
            return;
        }
        int counter=0;
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< Relatorio de plantas >>>>>>>>"
                + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        Planta pls[]=est.getPlantas();
        switch(loopParaUsar.toLowerCase()){
            case "for":
                for(;counter<est.getQuantidadeDePlantasAdicionadas();counter++){
                    System.out.println(pls[counter]);
                }
                break;
            case "while":
                while(counter<est.getQuantidadeDePlantasAdicionadas()){
                    System.out.println(pls[counter]);
                    counter++;
                }
                break;
            case "do/while":
                do{
                    System.out.println(pls[counter]);
                    counter++;
                }while(counter<est.getQuantidadeDePlantasAdicionadas());
        }
        System.out.println("\n\n");
    }
    
    public static void finalizar(){System.exit(0);}
}