package ex400;

public class Quarto {
    private int leitos;
    private float precoDiaria;//preço pela diária (preço total será precoDiaria*diarias) 
    private String situacao;//alugado,livre ou reservado
    private String dataDeEntrada;
    private String dataDeSaida;
    private String codigo;
    private int diarias;
    
    public Quarto(int lts,float pd){
        this.leitos=lts;
        this.precoDiaria=pd;
        this.situacao="livre";
    }
    
    public String getSituacao(){return this.situacao;}
    
    public void setCodigoQuarto(char simbolo,int numero){
        this.codigo=Character.toString(simbolo)+Integer.toString(numero);
    }
    
    @Override
    public String toString(){
        return String.format("Codigo do quarto: %s     Leitos: %d     Preco/diaria:"
                + " R$%.2f     Situacao: %s",this.codigo,this.leitos,this.precoDiaria
        ,this.situacao);
    }
}
