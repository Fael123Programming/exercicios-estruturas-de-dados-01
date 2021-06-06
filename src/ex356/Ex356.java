package ex356;

import javax.swing.JOptionPane;
public class Ex356{
    /*Algoritmo que armazena os nomes e notas de 2 provas de 15 alunos.
    Calcula e armazena a média arredondada. Armazena,também,a situação
    de cada aluno: aprovado (AP) ou reprovado (RP). Ao final,imprime
    uma tabela contendo nome,notas,média e situação de cada aluno.*/
    public static void main(String[] args){
        int quantidadeDeAlunosDaSala=5;
        SalaDeAula novaSala=new SalaDeAula(quantidadeDeAlunosDaSala);
        String nome;
        float notaProva01,notaProva02;
        int opcao=Integer.parseInt(JOptionPane.showInputDialog("(1) Para utilizar"
                + " o comando FOR\n(2) Para utilizar o comando WHILE\n(3) Para "
                + "utilizar o comando DO/WHILE"));
        byte counter=0;
        switch(opcao){
            case 1:
                //Usando Laço FOR
                for(;counter<quantidadeDeAlunosDaSala;counter++){
                    nome=JOptionPane.showInputDialog((counter+1)+"° aluno\nNome");
                    notaProva01=Float.parseFloat(JOptionPane.showInputDialog((counter+1)+"° aluno\nNota prova 1"));
                    notaProva02=Float.parseFloat(JOptionPane.showInputDialog((counter+1)+"° aluno\nNota prova 2"));
                    Aluno novoAluno=new Aluno(nome,notaProva01,notaProva02);
                    novoAluno.calcularMedia();
                    novaSala.adicionarAluno(novoAluno);
                }
                novaSala.mostrarInformacoesDosAlunos();
                System.out.println("Versao com FOR");
                break;
            case 2:
                //Usando Laço WHILE
                while(counter<quantidadeDeAlunosDaSala){
                    nome=JOptionPane.showInputDialog((counter+1)+"° aluno\nNome");
                    notaProva01=Float.parseFloat(JOptionPane.showInputDialog((counter+1)+"° aluno\nNota prova 1"));
                    notaProva02=Float.parseFloat(JOptionPane.showInputDialog((counter+1)+"° aluno\nNota prova 2"));
                    Aluno novoAluno=new Aluno(nome,notaProva01,notaProva02);
                    novoAluno.calcularMedia();
                    novaSala.adicionarAluno(novoAluno);
                    counter++;
                }
                novaSala.mostrarInformacoesDosAlunos();
                System.out.println("Versao com WHILE");
                break;
            case 3:
                //Usando Laço DO/WHILE
                do{
                    nome=JOptionPane.showInputDialog((counter+1)+"° aluno\nNome");
                    notaProva01=Float.parseFloat(JOptionPane.showInputDialog((counter+1)+"° aluno\nNota prova 1"));
                    notaProva02=Float.parseFloat(JOptionPane.showInputDialog((counter+1)+"° aluno\nNota prova 2"));
                    Aluno novoAluno=new Aluno(nome,notaProva01,notaProva02);
                    novoAluno.calcularMedia();
                    novaSala.adicionarAluno(novoAluno);
                    counter++;
                }while(counter<quantidadeDeAlunosDaSala);
                novaSala.mostrarInformacoesDosAlunos();
                System.out.println("Versao com DO/WHILE");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opcao invalida");
                break;
        }
    }
}