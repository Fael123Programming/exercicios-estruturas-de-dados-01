package ex356;

public class Aluno {
    private String nome;
    private float notaProva01;
    private float notaProva02;
    private float media;
    private String situacao;
    
    public Aluno(String nm,float np01,float np02){
        this.nome=nm;
        this.notaProva01=(float)np01;
        this.notaProva02=(float)np02;
    }
    
    public Aluno(){}
    
    public void calcularMedia(){
        this.media=(this.notaProva01+this.notaProva02)/2;
        if(this.media<6.0) this.situacao="RP";
        else this.situacao="AP";
    }
    
    @Override
    public String toString(){
        return String.format("Nome: %s     Nota prova 1: %.2f     Nota prova 2: %.2f"
                + "     Media: %.2f     Situacao: %s",this.nome,this.notaProva01,
                this.notaProva02,this.media,this.situacao);
    }
    
}
