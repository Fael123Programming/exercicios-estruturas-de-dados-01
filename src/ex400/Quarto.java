package ex400;
public class Quarto {
    private int leitos;
    private float precoDiaria;//preço pela diária (preço total será precoDiaria*diarias) 
    private String situacao;//alugado,livre ou reservado
    private String codigo;
    
    public Quarto(int lts,float pd){
        this.leitos=lts;
        this.precoDiaria=pd;
        this.situacao="livre";
    }
    
    public int getLeitos(){return this.leitos;}
    
    public float getPrecoDiaria(){return this.precoDiaria;}
    
    public String getSituacao(){return this.situacao;}
    
    public String getCodigo(){return this.codigo;}
    
    public void setCodigoQuarto(char simbolo,int numero){this.codigo=Character.toString(simbolo)+Integer.toString(numero);}
    
    public void setSituacao(String situacao){this.situacao=situacao;}
    
    @Override
    public String toString(){
        return String.format("Codigo do quarto: %s     Leitos: %d     Preco/diaria:"
                + " R$%.2f     Situacao: %s",this.codigo,this.leitos,this.precoDiaria
        ,this.situacao);
    }
}
