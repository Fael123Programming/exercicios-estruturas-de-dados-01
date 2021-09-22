package _recursion;
public class TowerOfHanoi {
    private static long movements=0;
    
    private TowerOfHanoi(){}
    
    public static void play(int quantityOfDiscs,char originTower,char 
    targetTower,char auxiliaryTower){
        //Pattern game: Call TowerOfHanoi.play(n,'A','C','B') where 'n' is up to you.
        long totalOfMovements=(long) Math.pow(2,quantityOfDiscs)-1;
        Time.startCounting();//Inicia a contagem de tempo.
        TowerOfHanoi.executeAlgorithm(quantityOfDiscs,originTower,targetTower,auxiliaryTower);
        /*Nessa linha de código,o computador irá executar todos os passos necessários para a resolução
        completa do propósito do jogo.*/
        Time.finishCounting();//Finaliza a contagem de tempo.
        System.out.printf("Tempo total gasto na resolução: %s%nMovimentos efetuados:"
                + " %d%nMovimentos mínimos necessários: 2^%d-1=%d%n",
                Time.getTime(),TowerOfHanoi.movements,quantityOfDiscs,totalOfMovements);
        TowerOfHanoi.movements=0;
    }
  
    private static void executeAlgorithm(int quantityOfDiscs,char originTower,
            char targetTower,char auxiliaryTower){
        if(quantityOfDiscs==1){
            TowerOfHanoi.movements++;
            return;
        }
        TowerOfHanoi.executeAlgorithm(quantityOfDiscs-1,originTower,auxiliaryTower,targetTower);
        TowerOfHanoi.movements++;
        TowerOfHanoi.executeAlgorithm(quantityOfDiscs-1,auxiliaryTower,targetTower,originTower);
    }
    
    private static void executeAlgorithmWithMessages(int quantityOfDiscs,char originTower,
            char targetTower,char auxiliaryTower){
        if(quantityOfDiscs==1){
            System.out.printf("Mover disco 1 da torre %c para a torre %c%n",originTower,targetTower);
            TowerOfHanoi.movements++;
            return;
        }
        TowerOfHanoi.executeAlgorithm(quantityOfDiscs-1,originTower,auxiliaryTower,targetTower);
        System.out.printf("Mover disco %d da torre %c para a torre %c%n",quantityOfDiscs,originTower,targetTower);
        TowerOfHanoi.movements++;
        TowerOfHanoi.executeAlgorithm(quantityOfDiscs-1,auxiliaryTower,targetTower,originTower);
    }
}
