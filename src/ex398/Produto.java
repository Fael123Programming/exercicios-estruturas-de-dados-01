package ex398;
public class Produto {
    private int codigo;
    private int quantidadeEmEstoque;
    private float precoPorUnidade;
    
    public Produto(int cd,int qe,float ppu){
        this.codigo=cd;
        this.quantidadeEmEstoque=qe;
        this.precoPorUnidade=ppu;
    }
    
    public Produto(){}
    
    public boolean venderProduto(int quantidade){
        if(quantidade>this.quantidadeEmEstoque) return false;
        this.quantidadeEmEstoque-=quantidade;
        return true;
    }
    
    public int getCodigo(){return this.codigo;}
    
    public int getQuantidadeEmEstoque(){return this.quantidadeEmEstoque;}
    
    public float getPreco(){return this.precoPorUnidade;}
}
