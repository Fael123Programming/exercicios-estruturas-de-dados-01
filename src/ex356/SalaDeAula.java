package ex356;

public class SalaDeAula {
    private int quantidadeDeAlunosMaxima;
    private Aluno[] alunos;
    private int quantidadeDeAlunosInseridos=0;
    
    public SalaDeAula(int qda){
        this.quantidadeDeAlunosMaxima=qda;
        alunos=new Aluno[qda];
    }
    
    public boolean adicionarAluno(Aluno novoAluno){
        if(this.quantidadeDeAlunosInseridos<this.quantidadeDeAlunosMaxima){
            alunos[this.quantidadeDeAlunosInseridos]=novoAluno;
            this.quantidadeDeAlunosInseridos++;
            return true;
        }
        return false;
    }
    
    public void mostrarInformacoesDosAlunos(){
        if(this.quantidadeDeAlunosInseridos>0){
            System.out.printf("%-50s%-20s%-20s%-20s%10s%n","NOME","NOTA PROVA 01","NOTA PROVA 02","MEDIA","SITUACAO");
            for(byte counter=0;counter<this.quantidadeDeAlunosInseridos;counter++)
                System.out.println(this.alunos[counter]);
        }else{System.out.println("Sem alunos inseridos!");}
    }
}
