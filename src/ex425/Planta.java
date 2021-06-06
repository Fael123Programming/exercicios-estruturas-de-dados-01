package ex425;
public class Planta {
    private String nome;
    private int quantidadeAtual;
    private int quantidadeMinima;
    
    public Planta(String nm,int qtdMin){
        this.nome=nm;
        this.quantidadeMinima=qtdMin;
        this.quantidadeAtual=0;
    }
    
    public String getNome(){return this.nome;}
    
    public int getQuantidadeAtual(){return this.quantidadeAtual;}
    
    public int getQuantidadeMinima(){return this.quantidadeMinima;}
    
    public void setQuantidadeAtual(int qtd){this.quantidadeAtual=qtd;}
    
    @Override
    public String toString(){
        if(this.quantidadeAtual>=this.quantidadeMinima){
            return String.format("Planta: %s     Quantidade atual: %d     Quantidade"
                + " minima exigida: %d     ESTOQUE DENTRO DA QUANTIDADE MINIMA",this.nome,
                this.quantidadeAtual,this.quantidadeMinima);
        }else{
            return String.format("Planta: %s     Quantidade atual: %d     Quantidade"
                + " minima exigida: %d     COMPRE MAIS %d UNIDADE(S)",this.nome,
                this.quantidadeAtual,this.quantidadeMinima,this.quantidadeMinima-
                        this.quantidadeAtual);
        }
    }
}
