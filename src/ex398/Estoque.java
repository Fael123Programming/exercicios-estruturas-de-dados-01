package ex398;

class Estoque {
    private Produto produtos[];
    private int quantidadeProdutosAdicionados=0;
    /*Além de ter quantos produtos já foram adicionados,produtosEmEstoque
    mostra qual a próxima posição do array produtos em que se deve adicionar
    novos elementos.*/
    
    public Estoque(int capacidadeTotal){this.produtos=new Produto[capacidadeTotal];}
    
    public boolean adicionarNovoProduto(Produto novoProduto){
        if(this.quantidadeProdutosAdicionados<this.produtos.length){
            //Se ainda tem-se espaço para adicionar novos produtos no estoque
            this.produtos[this.quantidadeProdutosAdicionados]=novoProduto;
            this.quantidadeProdutosAdicionados++;
            return true;
        }else return false;
    }
    
    public int obterPosicaoDeProdutoPorCodigo(int codigoDoProduto){
        for(int counter=0;counter<this.quantidadeProdutosAdicionados;counter++){
            if(this.produtos[counter].getCodigo()==codigoDoProduto) return counter;
        }
        return -1;//Não foi encontrado um produto com o código especificado
    }
    
    public Produto getProdutoPorPosicao(int pos){
        if(pos<0||pos>this.quantidadeProdutosAdicionados) return this.produtos[0];
        /*Se for pedido o retorno de um produto invalido,retorna o primeiro
        (se não houver um primeiro produto,será null)*/
        return this.produtos[pos];
    }
    
    public Produto[] getTodosOsProdutos(){return this.produtos;}
    
    public int getQuantidadeProdutosAdicionados(){return this.quantidadeProdutosAdicionados;}
    
    public boolean ordenarEstoque(String lacoParaUsar){
        if(this.quantidadeProdutosAdicionados<=1) return false; //Nada para ordenar
        else{
            int counter01=0,counter02,posicaoProdutoComMaiorEstoque=0;
            Produto auxiliar=new Produto();//Apenas auxiliar,para a ordenação.
            switch(lacoParaUsar.toLowerCase()){
                case "for":
                    for(;counter01<this.quantidadeProdutosAdicionados;counter01++){
                        for(counter02=counter01;counter02<this.quantidadeProdutosAdicionados;counter02++){
                            if(counter02==counter01){//Primeira iteração,temos apenas uma única posição de produto,counter02.
                                posicaoProdutoComMaiorEstoque=counter02;
                            }else if(this.getProdutoPorPosicao(counter02).getQuantidadeEmEstoque()>
                                    this.getProdutoPorPosicao(posicaoProdutoComMaiorEstoque).getQuantidadeEmEstoque()){
                                posicaoProdutoComMaiorEstoque=counter02;
                            }
                        }
                        if(posicaoProdutoComMaiorEstoque!=counter01){//Se for igual,já estará ordenado
                                auxiliar=this.getProdutoPorPosicao(counter01);
                                this.produtos[counter01]=this.getProdutoPorPosicao(posicaoProdutoComMaiorEstoque);
                                this.produtos[posicaoProdutoComMaiorEstoque]=auxiliar;
                        }
                    }
                    break;
                case "while":
                    while(counter01<this.quantidadeProdutosAdicionados){
                        counter02=counter01;
                        while(counter02<this.quantidadeProdutosAdicionados){
                            if(counter02==counter01){//Primeira iteração,temos apenas uma única posição de produto,counter02.
                                posicaoProdutoComMaiorEstoque=counter02;
                            }else if(this.getProdutoPorPosicao(counter02).getQuantidadeEmEstoque()>
                                    this.getProdutoPorPosicao(posicaoProdutoComMaiorEstoque).getQuantidadeEmEstoque()){
                                posicaoProdutoComMaiorEstoque=counter02;
                            }
                            counter02++;
                        }
                        if(posicaoProdutoComMaiorEstoque!=counter01){//Se for igual,já estará ordenado
                                auxiliar=this.getProdutoPorPosicao(counter01);
                                this.produtos[counter01]=this.getProdutoPorPosicao(posicaoProdutoComMaiorEstoque);
                                this.produtos[posicaoProdutoComMaiorEstoque]=auxiliar;
                        }
                        counter01++;
                    }
                    break;
                case "do/while":
                    do{
                        counter02=counter01;
                        do{
                            if(counter02==counter01){//Primeira iteração,temos apenas uma única posição de produto,counter02.
                                posicaoProdutoComMaiorEstoque=counter02;
                            }else if(this.getProdutoPorPosicao(counter02).getQuantidadeEmEstoque()>
                                    this.getProdutoPorPosicao(posicaoProdutoComMaiorEstoque).getQuantidadeEmEstoque()){
                                posicaoProdutoComMaiorEstoque=counter02;
                            }
                            counter02++;
                        }while(counter02<this.quantidadeProdutosAdicionados);
                        if(posicaoProdutoComMaiorEstoque!=counter01){//Se for igual,já estará ordenado
                                auxiliar=this.getProdutoPorPosicao(counter01);
                                this.produtos[counter01]=this.getProdutoPorPosicao(posicaoProdutoComMaiorEstoque);
                                this.produtos[posicaoProdutoComMaiorEstoque]=auxiliar;
                        }
                        counter01++;
                    }while(counter01<this.quantidadeProdutosAdicionados);
                    break;
            }
            return true;
        }
    }
}