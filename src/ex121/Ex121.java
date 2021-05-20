package ex121;

import javax.swing.JOptionPane;
public class Ex121{
    /*Algoritmo que lê 5 números inteiros diferentes e identifica o maior e o 
    menor.*/
    public static void main(String[] args){
	int n1,maior=0,menor=0,zeros=0;/*n1 conterá cada valor digitado pelo usuário e 
        será utilizada para descobrirmos quem são os maiores e menores valores.
        zeros é utilizada para verificarmos quantos zeros o usuário digitou.
        Ela deve ser usada pois todo array de números inteiros que não foi 
        inicializado pelo usuário (como nesse caso),possui como valor padrão
        para suas posições,o próprio zero. No entanto,não queremos que esses
        valores padrões sejam usados quando verificarmos se há números repetidos.*/
	int vector[] = new int[5];/*Array usado para conter todos os valores 
        //digitados pelo usuário. Desta forma,podemos descobrir números repetidos.*/
	for(int counter=0;counter<5;counter++){
            n1 = Integer.parseInt(JOptionPane.showInputDialog(String.format("Digite o %d numero",counter+1)));
            //Pegando cada valor,convertendo-o para inteiro e passando o mesmo à nossa variável n1.
            if(n1==0) zeros++;
            vector[counter] = n1;//Passando cada valor digitado pelo usuário para dentro de nosso vetor.
            if(counter>0){//Na primeira iteração,vector terá apenas um número.
                for(int subcounter:vector){//Percorrendo o vetor vector para sabermos se algum dado está repetido.
                    if(subcounter==n1&&zeros==2) {//Se houver algum,encerramos nosso programa imediatamente.
                        JOptionPane.showMessageDialog(null,"Os valores devem ser diferentes"); 
                        return;
                    }
                }
            }
            if(counter==0){//Se estivermos em nossa primeira iteração,até o momento,o maior e menor valores serão o único que temos,ou seja,n1 atual.
		maior = n1;//Passando o valor de n1
		menor = n1;//a cada uma das variáveis.
            }else{//se não estivermos na primeira iteração,então n1 atual não é o único valor até o momento. Assim, precisamos verificar.
		if(n1 > maior) maior = n1;//Se n1 atual é maior que o valor contido na variável maior,então atribuímos à maior o valor de n1 atual.
                if(n1 < menor) menor = n1;//Se n1 atual é menor que o valor contido na variável menor,então atribuímos à menor o valor de n1 atual.
            }
	}
	JOptionPane.showMessageDialog(null,"Maior= "+ maior);//Por fim, se o usuário não entrou dados repetidos, é mostrado o maior e o menor valor digitados.
	JOptionPane.showMessageDialog(null,"Menor= "+ menor);//é mostrado o maior e o menor valor digitados.
    }
}