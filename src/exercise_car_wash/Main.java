package exercise_car_wash;

import _staticqueue.StaticQueue;
import _dynamicqueue.DynamicQueue;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        StaticQueue washingCars=new StaticQueue(15);
        StaticQueue carsToWash=new StaticQueue(3);
        DynamicQueue washedCars=new DynamicQueue();
        boolean washedCarsQueueIsAlreadySorted=false;
        while(true){
            switch(JOptionPane.showInputDialog("##### Lava-rapido #####\n1. Mostrar carros em lavagem\n"
                    + "2. Mostrar carros na fila de espera\n3. Adicionar carro para lavar\n4. Ver carros "
                    + "ja lavados\n5. Ordenar fila de carros ja lavados\n6. Sair\nSua opção")){
                case "1":
                    if(washingCars.isEmpty()){
                        JOptionPane.showMessageDialog(null,"##### Nenhum carro esta sendo lavado ##### ");
                        break;
                    }
                    System.out.println("##### Carro(s) em lavagem #####\n");
                    for(byte counter=0;counter<washingCars.size();counter++){
                        System.out.println(washingCars.get(counter));
                    }
                    System.out.println("\n\n");
                    JOptionPane.showMessageDialog(null,"##### Carro(s) em lavagem mostrado(s) no console #####");
                    break;
                case "2":
                    if(carsToWash.isEmpty()){
                        JOptionPane.showMessageDialog(null,"##### Nenhum carro na fila de espera #####");
                        break;
                    }
                    System.out.println("##### Carro(s) na fila de espera #####\n");
                    for(byte counter=0;counter<carsToWash.size();counter++){
                        System.out.println(carsToWash.get(counter));
                    }
                    System.out.println("\n\n");
                    JOptionPane.showMessageDialog(null,"##### Carro(s) na fila de espera mostrado(s) no console #####");
                    break;
                case "3":
                    String brand=JOptionPane.showInputDialog("##### Adicionar novo carro #####\nInsira a marca do carro");
                    String model=JOptionPane.showInputDialog("##### Adicionar novo carro #####\nInsira o modelo do carro");
                    String color=JOptionPane.showInputDialog("##### Adicionar novo carro #####\nInsira a cor do carro");
                    int carIdent=Integer.parseInt(JOptionPane.showInputDialog("##### Adicionar novo carro #####\nInsira o codigo de identificacao do carro"));
                    String ownerName=JOptionPane.showInputDialog("##### Adicionar novo carro #####\nInsira o nome do dono do carro");
                    Car newCar= new Car(brand,model,color,carIdent,ownerName);
                    if(washingCars.isFull()){
                        carsToWash.insert(newCar);
                        if(carsToWash.isFull()){
                            washedCars.insert(washingCars.peek());
                            washingCars.remove();
                            washingCars.insert(carsToWash.peek());
                            carsToWash.remove();
                            washedCarsQueueIsAlreadySorted=false;//It's not sorted because in line 53 a new car was inserted.
                        }
                        JOptionPane.showMessageDialog(null,"##### Carro adicionado a fila de espera #####");
                    }else{
                        washingCars.insert(newCar);
                        JOptionPane.showMessageDialog(null,"##### Carro adicionado a lavagem #####");
                    }
                    break;
                case "4":
                    if(washedCars.isEmpty()){
                        JOptionPane.showMessageDialog(null,"##### Nenhum carro foi lavado ainda #####");
                        break;
                    }
                    System.out.println("##### Carro(s) ja lavado(s) #####\n");
                    for(byte counter=0;counter<washedCars.size();counter++){
                        System.out.println(washedCars.get(counter));
                    }
                    System.out.println("\n\n");
                    JOptionPane.showMessageDialog(null,"##### Carro(s) ja lavado(s) mostrado(s) no console #####");
                    break;
                case "5":
                    if(washedCars.isEmpty()){
                        JOptionPane.showMessageDialog(null,"##### Nenhum carro foi lavado ainda #####");
                    }else if(washedCars.size()==1){
                        JOptionPane.showMessageDialog(null,"##### Apenas um carro foi lavado #####");
                    }else if(washedCarsQueueIsAlreadySorted){
                        JOptionPane.showMessageDialog(null,"##### Fila de carros lavados ja esta ordenada #####");
                    }else{
                        Collections.sort(washedCars.getObjects());
                        JOptionPane.showMessageDialog(null,"##### Fila de carros lavados ordenada #####");
                        washedCarsQueueIsAlreadySorted=true;
                    }
                    break;
                case "6": System.exit(0);
                default: JOptionPane.showMessageDialog(null,"##### Escolha uma opcao valida #####");
            }
        }
    }
}
