package ex428;
import javax.swing.JOptionPane;
public class Ex428{
    /*Algoritmo que armazena dados de alunos de determinados cursos. Após,
    verifica qual dos alunos possui o CR (coeficiente de rendimento) mais alto.*/
    public static void main(String[] args) {
        int opcao=Integer.parseInt(JOptionPane.showInputDialog("(1) Para utilizar"
                + " o comando FOR\n(2) Para utilizar o comando WHILE\n(3) Para "
                + "utilizar o comando DO/WHILE")),counter01,counter02=0,codigo,posMelhorAluna=-1,aux;
        int dados[][]=new int[10][4];
        /*Coluna 0: matrícula dos alunos;
          Coluna 1: sexo;
          Coluna 2: código do curso;
          Coluna 3: CR.*/
        String ganhadoras="";
            switch(opcao){
                case 1:
                    //Usando Laço FOR
                    for(counter01=0;counter01<10;counter01++){
                        dados[counter01][0]=Integer.parseInt(JOptionPane.showInputDialog("Digite a matricula no formato aascccnnn"));
                        aux=dados[counter01][0]/1000000;
                        //Com essa divisão inteira,pegamos apenas aas da matrícula.
                        aux=dados[counter01][0]-aux*1000000;
                        //Com essa operação,pegamos apenas cccnnn da matrícula.
                        dados[counter01][2]=aux/1000;
                        //Com essa operação,pegamos apenas ccc da matrícula;
                        dados[counter01][1]=Integer.parseInt(JOptionPane.showInputDialog("Digite o sexo do aluno(a) (0-feminino,1-masculino)"));
                        dados[counter01][3]=Integer.parseInt(JOptionPane.showInputDialog("Digite o CR do aluno(a)"));
                    }
                    codigo=Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do curso"));
                    for(counter01=0;counter01<10;counter01++){
                        if(dados[counter01][2]==codigo&&dados[counter01][1]==0){
                            /*Se o código do curso que um aluno faz é igual ao código
                            do curso pedido para ser verificado e se o aluno é menina.*/
                            if(counter02==0){
                                /*Aqui verificamos a menina que faz o curso a ser analisado,
                                com o maior CR. counter02 é apenas uma variável contadora para
                                podermos encontrar a posição de maior CR em nosso vetor dados.*/
                                posMelhorAluna=counter01;//Primeira ocorrência de uma menina que faz o curso pedido.
                            }else{
                                if(dados[counter01][3]>dados[posMelhorAluna][3]) posMelhorAluna=counter01;
                                /*Se houver outras meninas nesse mesmo curso,seus respectivos CRs
                                são analisados para se encontrar o maior.*/
                            }
                            counter02++;
                        }
                    }
                    ganhadoras+=posMelhorAluna+"/";
                    if(counter02>1){//Verificando se há mais de uma ganhadora.
                        for(counter01=0;counter01<10;counter01++){
                            if(counter01!=posMelhorAluna){
                                if(dados[counter01][2]==codigo&&dados[counter01][1]==0
                                        &&dados[counter01][3]==dados[posMelhorAluna][3])
                                    ganhadoras+=counter01+"/";        
                            }
                        }
                    }
                    if(ganhadoras.equals(posMelhorAluna+"/")){
                        if(posMelhorAluna==-1) JOptionPane.showMessageDialog(null,"Nenhuma menina fazendo esse curso!");
                        else JOptionPane.showMessageDialog(null,"Aluna premiada\nMatricula: "+dados[posMelhorAluna][0]+"\nCR: "+dados[posMelhorAluna][3]);
                    }else{
                        String ganhadorasVetor[]=ganhadoras.split("/");
                        int posicoesDasGanhadoras[]=new int[ganhadorasVetor.length],pos;
                        for(counter01=0;counter01<posicoesDasGanhadoras.length;counter01++) posicoesDasGanhadoras[counter01]=Integer.parseInt(ganhadorasVetor[counter01]);
                        JOptionPane.showMessageDialog(null,posicoesDasGanhadoras.length+" alunas tiveram mesmo CR");
                        System.out.println(posicoesDasGanhadoras.length+" alunas tiveram mesmo CR");
                        for(counter01=0;counter01<posicoesDasGanhadoras.length;counter01++){
                            pos=posicoesDasGanhadoras[counter01];
                            System.out.println("Aluna com matricula:"+dados[pos][0]+" e CR:"+dados[pos][3]);
                        }
                    }
                    break;
                case 2:
                    //Usando Laço WHILE
                    counter01=0;
                    while(counter01<10){
                        dados[counter01][0]=Integer.parseInt(JOptionPane.showInputDialog("Digite a matricula no formato aascccnnn"));
                        aux=dados[counter01][0]/1000000;
                        //Com essa divisão inteira,pegamos apenas aas da matrícula.
                        aux=dados[counter01][0]-aux*1000000;
                        //Com essa operação,pegamos apenas cccnnn da matrícula.
                        dados[counter01][2]=aux/1000;
                        //Com essa operação,pegamos apenas ccc da matrícula;
                        dados[counter01][1]=Integer.parseInt(JOptionPane.showInputDialog("Digite o sexo do aluno(a) (0-feminino,1-masculino)"));
                        dados[counter01][3]=Integer.parseInt(JOptionPane.showInputDialog("Digite o CR do aluno(a)"));
                        counter01++;
                    }
                    codigo=Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do curso"));
                    counter01=0;
                    while(counter01<10){
                        if(dados[counter01][2]==codigo&&dados[counter01][1]==0){
                            /*Se o código do curso que um aluno faz é igual ao código
                            do curso pedido para ser verificado e se o aluno é menina.*/
                            if(counter02==0){
                                /*Aqui verificamos a menina que faz o curso a ser analisado,
                                com o maior CR. counter02 é apenas uma variável contadora para
                                podermos encontrar a posição de maior CR em nosso vetor dados.*/
                                posMelhorAluna=counter01;//Primeira ocorrência de uma menina que faz o curso pedido.
                            }else{
                                if(dados[counter01][3]>dados[posMelhorAluna][3]) posMelhorAluna=counter01;
                                /*Se houver outras meninas nesse mesmo curso,seus respectivos CRs
                                são analisados para se encontrar o maior.*/
                            }
                            counter02++;
                        }
                        counter01++;
                    }
                    ganhadoras+=posMelhorAluna+"/";
                    counter01=0;
                    if(counter02>1){//Verificando se há mais de uma ganhadora.
                        while(counter01<10){
                            if(counter01!=posMelhorAluna){
                                if(dados[counter01][2]==codigo&&dados[counter01][1]==0
                                        &&dados[counter01][3]==dados[posMelhorAluna][3])
                                    ganhadoras+=counter01+"/";        
                            }
                            counter01++;
                        }
                    }
                    if(ganhadoras.equals(posMelhorAluna+"/")){
                        if(posMelhorAluna==-1) JOptionPane.showMessageDialog(null,"Nenhuma menina fazendo esse curso!");
                        else JOptionPane.showMessageDialog(null,"Aluna premiada\nMatricula: "+dados[posMelhorAluna][0]+"\nCR: "+dados[posMelhorAluna][3]);
                    }else{
                        String ganhadorasVetor[]=ganhadoras.split("/");
                        int posicoesDasGanhadoras[]=new int[ganhadorasVetor.length],pos;
                        counter01=0;
                        while(counter01<posicoesDasGanhadoras.length){
                            posicoesDasGanhadoras[counter01]=Integer.parseInt(ganhadorasVetor[counter01]);
                            counter01++;
                        }
                        JOptionPane.showMessageDialog(null,posicoesDasGanhadoras.length+" alunas tiveram mesmo CR");
                        System.out.println(posicoesDasGanhadoras.length+" alunas tiveram mesmo CR");
                        counter01=0;
                        while(counter01<posicoesDasGanhadoras.length){
                            pos=posicoesDasGanhadoras[counter01];
                            System.out.println("Aluna com matricula:"+dados[pos][0]+" e CR:"+dados[pos][3]);
                            counter01++;
                        }
                    }
                    break;
                case 3:
                    //Usando Laço DO/WHILE
                    counter01=0;
                    do{
                        dados[counter01][0]=Integer.parseInt(JOptionPane.showInputDialog("Digite a matricula no formato aascccnnn"));
                        aux=dados[counter01][0]/1000000;
                        //Com essa divisão inteira,pegamos apenas aas da matrícula.
                        aux=dados[counter01][0]-aux*1000000;
                        //Com essa operação,pegamos apenas cccnnn da matrícula.
                        dados[counter01][2]=aux/1000;
                        //Com essa operação,pegamos apenas ccc da matrícula;
                        dados[counter01][1]=Integer.parseInt(JOptionPane.showInputDialog("Digite o sexo do aluno(a) (0-feminino,1-masculino)"));
                        dados[counter01][3]=Integer.parseInt(JOptionPane.showInputDialog("Digite o CR do aluno(a)"));
                        counter01++;
                    }while(counter01<10);
                    codigo=Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do curso"));
                    counter01=0;
                    do{
                        if(dados[counter01][2]==codigo&&dados[counter01][1]==0){
                            /*Se o código do curso que um aluno faz é igual ao código
                            do curso pedido para ser verificado e se o aluno é menina.*/
                            if(counter02==0){
                                /*Aqui verificamos a menina que faz o curso a ser analisado,
                                com o maior CR. counter02 é apenas uma variável contadora para
                                podermos encontrar a posição de maior CR em nosso vetor dados.*/
                                posMelhorAluna=counter01;//Primeira ocorrência de uma menina que faz o curso pedido.
                            }else{
                                if(dados[counter01][3]>dados[posMelhorAluna][3]) posMelhorAluna=counter01;
                                /*Se houver outras meninas nesse mesmo curso,seus respectivos CRs
                                são analisados para se encontrar o maior.*/
                            }
                            counter02++;
                        }
                        counter01++;
                    }while(counter01<10);
                    ganhadoras+=posMelhorAluna+"/";
                    counter01=0;
                    if(counter02>1){//Verificando se há mais de uma ganhadora.
                        do{
                            if(counter01!=posMelhorAluna){
                                if(dados[counter01][2]==codigo&&dados[counter01][1]==0
                                        &&dados[counter01][3]==dados[posMelhorAluna][3])
                                    ganhadoras+=counter01+"/";        
                            }
                            counter01++;
                        }while(counter01<10);
                    }
                    if(ganhadoras.equals(posMelhorAluna+"/")){
                        if(posMelhorAluna==-1) JOptionPane.showMessageDialog(null,"Nenhuma menina fazendo esse curso!");
                        else JOptionPane.showMessageDialog(null,"Aluna premiada\nMatricula: "+dados[posMelhorAluna][0]+"\nCR: "+dados[posMelhorAluna][3]);
                    }else{
                        String ganhadorasVetor[]=ganhadoras.split("/");
                        int posicoesDasGanhadoras[]=new int[ganhadorasVetor.length],pos;
                        counter01=0;
                        do{
                            posicoesDasGanhadoras[counter01]=Integer.parseInt(ganhadorasVetor[counter01]);
                            counter01++;
                        }while(counter01<posicoesDasGanhadoras.length);
                        JOptionPane.showMessageDialog(null,posicoesDasGanhadoras.length+" alunas tiveram mesmo CR");
                        System.out.println(posicoesDasGanhadoras.length+" alunas tiveram mesmo CR");
                        counter01=0;
                        do{
                            pos=posicoesDasGanhadoras[counter01];
                            System.out.println("Aluna com matricula:"+dados[pos][0]+" e CR:"+dados[pos][3]);
                            counter01++;
                        }while(counter01<posicoesDasGanhadoras.length);
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opcao invalida");
                    break;
            }
    }
}