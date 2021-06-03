package ex400;

public class Hotel {
    private Quarto[]quartos;
    private OcupacaoEmQuarto[] ocupacoes;
    private int numeroDeOcupacoesRegistradas;
    private int numeroDeQuartosCadastrados;
    
    public Hotel(int capacidadeTotal){
        this.quartos=new Quarto[capacidadeTotal];
        this.ocupacoes=new OcupacaoEmQuarto[capacidadeTotal];
        this.numeroDeQuartosCadastrados=0;
        this.numeroDeOcupacoesRegistradas=0;
    }
    
    public boolean cadastrarQuarto(Quarto novoQuarto){
        if(this.numeroDeQuartosCadastrados==this.quartos.length) return false;
        this.quartos[this.numeroDeQuartosCadastrados]=novoQuarto;
        novoQuarto.setCodigoQuarto('A', numeroDeQuartosCadastrados);
        this.numeroDeQuartosCadastrados++;
        return true;
    }
    
    public boolean registrarOcupacao(OcupacaoEmQuarto novaOcupacao){
        this.ocupacoes[this.numeroDeOcupacoesRegistradas]=novaOcupacao;
        this.numeroDeOcupacoesRegistradas++;
        return true;
    }
    
    public int getNumeroDeQuartosCadastrados(){return this.numeroDeQuartosCadastrados;}
    
    public int getNumeroDeOcupacoesRegistradas(){return this.numeroDeOcupacoesRegistradas;}
    
    public Quarto[] getQuartos(){return this.quartos;}
    
    public OcupacaoEmQuarto[] getOcupacoes(){return this.ocupacoes;}
    
    public OcupacaoEmQuarto obterOcupacaoDeQuartoPorCodigoDeQuarto(String codigoQuarto){
        for(int counter=0;counter<this.numeroDeOcupacoesRegistradas;counter++){
            if(this.ocupacoes[counter].getQuartoOcupado().getCodigo().equals(codigoQuarto)){
                return this.ocupacoes[counter];
            }
        }
        return null;//Se uma ocupacao que possui um quarto com o codigo codigoQuarto nao for encontrada.
    }
    
    public Quarto obterQuartoPorCodigo(String codigoQuarto){
        if(this.numeroDeQuartosCadastrados==0) return null;
        for(int counter=0;counter<this.numeroDeQuartosCadastrados;counter++){
            if(this.quartos[counter].getCodigo().equals(codigoQuarto)) return this.quartos[counter];
        }
        return null;//Quarto não encontrado
    }
    
    public boolean encerrarOcupacaoEmQuarto(OcupacaoEmQuarto oeq){
        oeq.getQuartoOcupado().setSituacao("livre");
        this.ocupacoes[this.obterPosicaoDeOcupacaoEmOcupacoes(oeq)]=null;
        this.numeroDeOcupacoesRegistradas--;
        this.ordenarVetorOcupacoes(this.ocupacoes);
        return true;
    }
    
    private boolean ordenarVetorOcupacoes(OcupacaoEmQuarto[] oeq){
        int posicaoObjetoNull=0;
        while(this.ocupacoes[posicaoObjetoNull]!=null){posicaoObjetoNull++;}
        //posicaoObjetoNull terá ao final desse loop while,aquilo que faz jus ao seu nome!
        if(posicaoObjetoNull==this.numeroDeOcupacoesRegistradas) return true;//Já está ordenado
        for(int counter=posicaoObjetoNull;counter<this.numeroDeOcupacoesRegistradas;counter++){
            this.ocupacoes[counter]=this.ocupacoes[counter+1];
        }
        return true;
    }
    
    private int obterPosicaoDeOcupacaoEmOcupacoes(OcupacaoEmQuarto oeq){
        for(int counter=0;counter<this.numeroDeOcupacoesRegistradas;counter++){
            if(this.ocupacoes[counter]==oeq) return counter;
        }
        return -1;
    }
}
