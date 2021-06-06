package ex425;
class Estoque {
    private Planta[] plantas;
    private int quantidadeDePlantasAdicionadas;
    
    public Estoque(int qtdMaximaDePlantas){
        this.plantas=new Planta[qtdMaximaDePlantas];
        this.quantidadeDePlantasAdicionadas=0;
    }
    
    public Planta[] getPlantas(){return this.plantas;}
    
    public int getQuantidadeDePlantasAdicionadas(){return this.quantidadeDePlantasAdicionadas;}
    
    public boolean cadastrarNovaPlanta(Planta novaPlanta){
        if(this.quantidadeDePlantasAdicionadas==this.plantas.length) return false;
        this.plantas[this.quantidadeDePlantasAdicionadas]=novaPlanta;
        this.quantidadeDePlantasAdicionadas++;
        return true;
    }
}
