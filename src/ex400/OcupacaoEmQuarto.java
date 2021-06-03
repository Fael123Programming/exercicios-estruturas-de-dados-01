package ex400;

public class OcupacaoEmQuarto {
    private String responsavel;
    private String tipoDeOcupacao;//aluguel ou reserva
    private String dataDeEntrada;
    private String dataDeSaida;
    private Quarto quartoOcupado;
    private int diarias;
    private float precoFinal;
    
    public OcupacaoEmQuarto(String resp,String tipo,String dataEntrada,int diarias,Quarto quartoOcupado){
        this.responsavel=resp;
        this.tipoDeOcupacao=tipo;
        this.dataDeEntrada=dataEntrada;
        this.diarias=diarias;//Quantos dias a ocupacao irá durar
        this.quartoOcupado=quartoOcupado;
        this.setSituacaoQuarto(tipo);
        this.setDataDeSaida(dataEntrada,diarias);
        this.precoFinal=this.diarias*this.quartoOcupado.getPrecoDiaria();
    }
    
    public Quarto getQuartoOcupado(){return this.quartoOcupado;}
    
    public String getPrecoFinal(){return String.format("%.2f",this.precoFinal);}
    
    public String getResponsavel(){return this.responsavel;}
    
    public void adicionarDespesasExtras(float valor){this.precoFinal+=valor;}
    
    public void setSituacaoQuarto(String tipoDeOcupacao){
        if(tipoDeOcupacao.equals("aluguel")) this.quartoOcupado.setSituacao("alugado");
        else if(tipoDeOcupacao.equals("reserva")) this.quartoOcupado.setSituacao("reservado");
    }
    
    public void setDataDeSaida(String dataEntrada,int diarias){this.dataDeSaida=String.format("%s + %d dia(s)",this.dataDeEntrada,this.diarias);}
    
    @Override
    public String toString(){
        return String.format("%s     Responsavel: %s     Data/Entrada: %s     "
                + "Data/Saida: %s     Diarias: %d",this.quartoOcupado,this.responsavel,this.dataDeEntrada,
                this.dataDeSaida,this.diarias);
    }
}
