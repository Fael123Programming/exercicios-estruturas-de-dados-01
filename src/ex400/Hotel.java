package ex400;

public class Hotel {
    private Quarto[]quartos;
    private int numeroDeQuartosCadastrados;
    private boolean lotado;
    
    public Hotel(int capacidadeTotal){
        this.quartos=new Quarto[capacidadeTotal];
    }
    
    public boolean cadastrarQuarto(Quarto novoQuarto){
        if(lotado) return false;
        this.quartos[this.numeroDeQuartosCadastrados]=novoQuarto;
        novoQuarto.setCodigoQuarto('A', numeroDeQuartosCadastrados);
        this.numeroDeQuartosCadastrados++;
        if(this.numeroDeQuartosCadastrados==this.quartos.length) lotado=true;
        return true;
    }
    
    public boolean estaLotado(){return this.lotado;}
    
    public boolean haQuartosOcupados(){
        if(this.numeroDeQuartosCadastrados==0) return false;
        for(Quarto qt:this.quartos){
            if(qt.getSituacao().equals("reservado")||
                    qt.getSituacao().equals("alugado")) return true;
        }
        return false;
    }
    
    public Quarto[] getQuartos(){return this.quartos;}
    
    public int getNumeroDeQuartosCadastrados(){return this.numeroDeQuartosCadastrados;}
    
}
