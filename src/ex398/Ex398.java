package ex398;
import javax.swing.JOptionPane;
public class Ex398 {
    /*Algoritmo que implementa um sistema de cadastramento e venda de produtos
    de uma empresa. Ao final,mostra um relatório completo contendo informações
    dos produtos com ênfase nas quantidades de cada um deles em estoque.*/
    public static void main(String [] args){          
        int opcao=Integer.parseInt(JOptionPane.showInputDialog("(1) Para utilizar"
                + " o comando FOR\n(2) Para utilizar o comando WHILE\n(3) Para "
                + "utilizar o comando DO/WHILE"));
        if(opcao<1||opcao>3){
            JOptionPane.showMessageDialog(null,"Opcao invalida");
            System.exit(0);
        }
        int quantidadeDeProdutos=Integer.parseInt(JOptionPane.showInputDialog("Quantos produtos?"));
        if(quantidadeDeProdutos<=0){
            JOptionPane.showMessageDialog(null,"Voce nao quer trabalhar hoje!");
            System.exit(0);
        }
        int codigoProduto,quantidade,posicaoDeProduto,produtosVendidosNoDia=0;
        float precoPorUnidade,totalGanhoNoDia=0f;
        byte counter=0;
        Estoque estoqueDeQueijos=new Estoque(quantidadeDeProdutos);
        System.out.println("<<<<<<Cadastramento De Produtos>>>>>>");
        JOptionPane.showMessageDialog(null,"<<<<<<Cadastramento De Produtos>>>>>>");
        switch(opcao){
            case 1:
                //Usando Laço FOR
                for(;counter<quantidadeDeProdutos;counter++){
                    codigoProduto=Integer.parseInt(JOptionPane.showInputDialog((counter+1)+"º produto\nCodigo (-1 para terminar)"));
                    if(codigoProduto==-1) break;
                    precoPorUnidade=Float.parseFloat(JOptionPane.showInputDialog((counter+1)+"º produto\nPreço por unidade"));
                    quantidade=Integer.parseInt(JOptionPane.showInputDialog((counter+1)+"º produto\nQuantidade em estoque"));
                    estoqueDeQueijos.adicionarNovoProduto(new Produto(codigoProduto,quantidade,precoPorUnidade));
                }
                if(estoqueDeQueijos.getQuantidadeProdutosAdicionados()==0){
                    JOptionPane.showMessageDialog(null,"Nenhum produto adicionado");
                    System.exit(0);
                }
                System.out.println("<<<<<<Vendas De Produtos>>>>>>");
                JOptionPane.showMessageDialog(null,"<<<<<<Vendas De Produtos>>>>>>");
                codigoProduto=Integer.parseInt(JOptionPane.showInputDialog("Codigo do produto (0 para terminar)"));
                for(;codigoProduto!=0;){
                    posicaoDeProduto=estoqueDeQueijos.obterPosicaoDeProdutoPorCodigo(codigoProduto);
                    if(posicaoDeProduto==-1){
                        JOptionPane.showMessageDialog(null,"Produto Nao-Cadastrado");
                    }else{
                        Produto pdt=estoqueDeQueijos.getProdutoPorPosicao(posicaoDeProduto);
                        if(pdt.getQuantidadeEmEstoque()==0) JOptionPane.showMessageDialog(null,"Sem estoque deste produto");
                        else{
                            quantidade=Integer.parseInt(JOptionPane.showInputDialog(String.format("Codigo do produto:%d%n"
                                +"Quantidade Em Estoque:%d%nPreco por unidade: R$%.2f%nQuantidade a vender? (-1 para voltar)",
                                pdt.getCodigo(),pdt.getQuantidadeEmEstoque(),pdt.getPreco())));
                            for(;true;){
                                if(quantidade==-1) break;
                                else if(quantidade<=0) JOptionPane.showMessageDialog(null, "Quantidade invalida");
                                else if(quantidade>pdt.getQuantidadeEmEstoque()) JOptionPane.showMessageDialog(null,"Estoque insuficiente");
                                else{
                                    pdt.venderProduto(quantidade);
                                    JOptionPane.showMessageDialog(null,String.format("Valor total: R$%.2f%nProduto vendido com sucesso!",
                                            pdt.getPreco()*quantidade));
                                    produtosVendidosNoDia+=quantidade;
                                    totalGanhoNoDia+=(pdt.getPreco()*quantidade);
                                    break;
                                }
                                quantidade=Integer.parseInt(JOptionPane.showInputDialog(String.format("Codigo do produto:%d%n"
                                +"Quantidade Em Estoque:%d%nPreco por unidade: R$%.2f%nQuantidade a vender? (-1 para voltar)",
                                pdt.getCodigo(),pdt.getQuantidadeEmEstoque(),pdt.getPreco())));
                            }
                        }
                    }
                    codigoProduto=Integer.parseInt(JOptionPane.showInputDialog("Codigo do produto (0 para terminar)"));
                }
                JOptionPane.showMessageDialog(null,String.format("Total de produtos vendidos no dia: %d%nTotal ganho no dia:"
                        + " R$%.2f",produtosVendidosNoDia,totalGanhoNoDia));
                estoqueDeQueijos.ordenarEstoque("for");//Laço de repetição para usar
                relatorioDeProdutos("for",estoqueDeQueijos);//Laço de repetição para usar
                break;
            case 2:
                //Usando Laço WHILE
                while(counter<quantidadeDeProdutos){
                    codigoProduto=Integer.parseInt(JOptionPane.showInputDialog((counter+1)+"º produto\nCodigo (-1 para terminar)"));
                    if(codigoProduto==-1) break;
                    precoPorUnidade=Float.parseFloat(JOptionPane.showInputDialog((counter+1)+"º produto\nPreço por unidade"));
                    quantidade=Integer.parseInt(JOptionPane.showInputDialog((counter+1)+"º produto\nQuantidade em estoque"));
                    estoqueDeQueijos.adicionarNovoProduto(new Produto(codigoProduto,quantidade,precoPorUnidade));
                    counter++;
                }
                if(estoqueDeQueijos.getQuantidadeProdutosAdicionados()==0){
                    JOptionPane.showMessageDialog(null,"Nenhum produto adicionado");
                    System.exit(0);
                }
                System.out.println("<<<<<<Vendas De Produtos>>>>>>");
                JOptionPane.showMessageDialog(null,"<<<<<<Vendas De Produtos>>>>>>");
                codigoProduto=Integer.parseInt(JOptionPane.showInputDialog("Codigo do produto (0 para terminar)"));
                while(codigoProduto!=0){
                    posicaoDeProduto=estoqueDeQueijos.obterPosicaoDeProdutoPorCodigo(codigoProduto);
                    if(posicaoDeProduto==-1){
                        JOptionPane.showMessageDialog(null,"Produto Nao-Cadastrado");
                    }else{
                        Produto pdt=estoqueDeQueijos.getProdutoPorPosicao(posicaoDeProduto);
                        if(pdt.getQuantidadeEmEstoque()==0) JOptionPane.showMessageDialog(null,"Sem estoque deste produto");
                        else{
                            quantidade=Integer.parseInt(JOptionPane.showInputDialog(String.format("Codigo do produto:%d%n"
                                +"Quantidade Em Estoque:%d%nPreco por unidade: R$%.2f%nQuantidade a vender? (-1 para voltar)",
                                pdt.getCodigo(),pdt.getQuantidadeEmEstoque(),pdt.getPreco())));
                            while(true){
                                if(quantidade==-1) break;
                                else if(quantidade<=0) JOptionPane.showMessageDialog(null, "Quantidade invalida");
                                else if(quantidade>pdt.getQuantidadeEmEstoque()) JOptionPane.showMessageDialog(null,"Estoque insuficiente");
                                else{
                                    pdt.venderProduto(quantidade);
                                    JOptionPane.showMessageDialog(null,String.format("Valor total: R$%.2f%nProduto vendido com sucesso!",
                                            pdt.getPreco()*quantidade));
                                    produtosVendidosNoDia+=quantidade;
                                    totalGanhoNoDia+=(pdt.getPreco()*quantidade);
                                    break;
                                }
                                quantidade=Integer.parseInt(JOptionPane.showInputDialog(String.format("Codigo do produto:%d%n"
                                +"Quantidade Em Estoque:%d%nPreco por unidade: R$%.2f%nQuantidade a vender? (-1 para voltar)",
                                pdt.getCodigo(),pdt.getQuantidadeEmEstoque(),pdt.getPreco())));
                            }
                        }
                    }
                    codigoProduto=Integer.parseInt(JOptionPane.showInputDialog("Codigo do produto (0 para terminar)"));
                }
                JOptionPane.showMessageDialog(null,String.format("Total de produtos vendidos no dia: %d%nTotal ganho no dia:"
                        + " R$%.2f",produtosVendidosNoDia,totalGanhoNoDia));
                estoqueDeQueijos.ordenarEstoque("while");//Laço de repetição para usar
                relatorioDeProdutos("while",estoqueDeQueijos);//Laço de repetição para usar
                break;
            case 3:
                //Usando Laço DO/WHILE
                 while(counter<quantidadeDeProdutos){
                    codigoProduto=Integer.parseInt(JOptionPane.showInputDialog((counter+1)+"º produto\nCodigo (-1 para terminar)"));
                    if(codigoProduto==-1) break;
                    precoPorUnidade=Float.parseFloat(JOptionPane.showInputDialog((counter+1)+"º produto\nPreço por unidade"));
                    quantidade=Integer.parseInt(JOptionPane.showInputDialog((counter+1)+"º produto\nQuantidade em estoque"));
                    estoqueDeQueijos.adicionarNovoProduto(new Produto(codigoProduto,quantidade,precoPorUnidade));
                    counter++;
                }
                if(estoqueDeQueijos.getQuantidadeProdutosAdicionados()==0){
                    JOptionPane.showMessageDialog(null,"Nenhum produto adicionado");
                    System.exit(0);
                }
                System.out.println("<<<<<<Vendas De Produtos>>>>>>");
                JOptionPane.showMessageDialog(null,"<<<<<<Vendas De Produtos>>>>>>");
                codigoProduto=Integer.parseInt(JOptionPane.showInputDialog("Codigo do produto (0 para terminar)"));
                do{
                    if(codigoProduto==0) break;
                    posicaoDeProduto=estoqueDeQueijos.obterPosicaoDeProdutoPorCodigo(codigoProduto);
                    if(posicaoDeProduto==-1){
                        JOptionPane.showMessageDialog(null,"Produto Nao-Cadastrado");
                    }else{
                        Produto pdt=estoqueDeQueijos.getProdutoPorPosicao(posicaoDeProduto);
                        if(pdt.getQuantidadeEmEstoque()==0) JOptionPane.showMessageDialog(null,"Sem estoque deste produto");
                        else{
                            quantidade=Integer.parseInt(JOptionPane.showInputDialog(String.format("Codigo do produto:%d%n"
                                +"Quantidade Em Estoque:%d%nPreco por unidade: R$%.2f%nQuantidade a vender? (-1 para voltar)",
                                pdt.getCodigo(),pdt.getQuantidadeEmEstoque(),pdt.getPreco())));
                            do{
                                if(quantidade==-1) break;
                                else if(quantidade<=0) JOptionPane.showMessageDialog(null, "Quantidade invalida");
                                else if(quantidade>pdt.getQuantidadeEmEstoque()) JOptionPane.showMessageDialog(null,"Estoque insuficiente");
                                else{
                                    pdt.venderProduto(quantidade);
                                    JOptionPane.showMessageDialog(null,String.format("Valor total: R$%.2f%nProduto vendido com sucesso!",
                                            pdt.getPreco()*quantidade));
                                    produtosVendidosNoDia+=quantidade;
                                    totalGanhoNoDia+=(pdt.getPreco()*quantidade);
                                    break;
                                }
                                quantidade=Integer.parseInt(JOptionPane.showInputDialog(String.format("Codigo do produto:%d%n"
                                +"Quantidade Em Estoque:%d%nPreco por unidade: R$%.2f%nQuantidade a vender? (-1 para voltar)",
                                pdt.getCodigo(),pdt.getQuantidadeEmEstoque(),pdt.getPreco())));
                            }while(true);
                        }
                    }
                    codigoProduto=Integer.parseInt(JOptionPane.showInputDialog("Codigo do produto (0 para terminar)"));
                }while(true);
                JOptionPane.showMessageDialog(null,String.format("Total de produtos vendidos no dia: %d%nTotal ganho no dia:"
                        + " R$%.2f",produtosVendidosNoDia,totalGanhoNoDia));
                estoqueDeQueijos.ordenarEstoque("do/while");//Laço de repetição para usar
                relatorioDeProdutos("do/while",estoqueDeQueijos);//Laço de repetição para usar
                break;
        }
    }
    
    public static void relatorioDeProdutos(String lacoParaUsar,Estoque est){
        int counter=0;
        switch(lacoParaUsar.toLowerCase()){
            case "for":
                System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< RELATORIO FINA"
                        + "L DE PRODUTOS >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                for(;counter<est.getQuantidadeProdutosAdicionados();counter++){
                    System.out.printf("Codigo do produto:%d      Quantidade em estoque:"
                            + "%d      Preco por unidade:%.2f%n",est.getProdutoPorPosicao(counter).getCodigo(),
                            est.getProdutoPorPosicao(counter).getQuantidadeEmEstoque(),
                            est.getProdutoPorPosicao(counter).getPreco());
                }
                System.out.println("----------------------------------------"
                        + "----------------------------------------"
                        + "----------------------------------------"
                        + "----------------");
                break;
            case "while":
                System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< RELATORIO FINA"
                        + "L DE PRODUTOS >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                while(counter<est.getQuantidadeProdutosAdicionados()){
                    System.out.printf("Codigo do produto:%d      Quantidade em estoque:"
                            + "%d      Preco por unidade:%.2f%n",est.getProdutoPorPosicao(counter).getCodigo(),
                            est.getProdutoPorPosicao(counter).getQuantidadeEmEstoque(),
                            est.getProdutoPorPosicao(counter).getPreco());
                    counter++;
                }
                System.out.println("----------------------------------------"
                        + "----------------------------------------"
                        + "----------------------------------------"
                        + "----------------");
                break;
            case "do/while":
                System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< RELATORIO FINA"
                        + "L DE PRODUTOS >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                do{
                    System.out.printf("Codigo do produto:%d      Quantidade em estoque:"
                            + "%d      Preco por unidade:%.2f%n",est.getProdutoPorPosicao(counter).getCodigo(),
                            est.getProdutoPorPosicao(counter).getQuantidadeEmEstoque(),
                            est.getProdutoPorPosicao(counter).getPreco());
                    counter++;
                }while(counter<est.getQuantidadeProdutosAdicionados());
                System.out.println("----------------------------------------"
                        + "----------------------------------------"
                        + "----------------------------------------"
                        + "----------------");
                break;
        }
    }
}