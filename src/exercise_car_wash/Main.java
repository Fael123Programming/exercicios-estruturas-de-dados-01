package exercise_car_wash;

import _staticqueue.structureclasses.StaticQueue;
import _dynamicqueue.structureclasses.Queue;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        StaticQueue<Car> washingCars = new StaticQueue<>(15);
        StaticQueue<Car> carsToWash = new StaticQueue<>(3);
        Queue<Car> washedCars = new Queue<>();
        boolean washedCarsQueueIsAlreadySorted = false;
        while (true) {
            switch (JOptionPane.showInputDialog("""
                    ##### Lava-rapido #####
                    1. Mostrar carros em lavagem
                    2. Mostrar carros na fila de espera
                    3. Adicionar carro para lavar
                    4. Ver carros ja lavados
                    5. Ordenar fila de carros ja lavados
                    6. Sair
                    Sua opção""")) {
                case "1":
                    if (washingCars.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "##### Nenhum carro esta sendo lavado ##### ");
                        break;
                    }
                    System.out.println("##### Carro(s) em lavagem #####");
                    for (Car car : washingCars.getElements())
                        System.out.println(car);
                    System.out.println("\n");
                    JOptionPane.showMessageDialog(null, "##### Carro(s) em lavagem mostrado(s) no console #####");
                    break;
                case "2":
                    if (carsToWash.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "##### Nenhum carro na fila de espera #####");
                        break;
                    }
                    System.out.println("##### Carro(s) na fila de espera #####");
                    for (Car car : carsToWash.getElements())
                        System.out.println(car);
                    System.out.println("\n");
                    JOptionPane.showMessageDialog(null, "##### Carro(s) na fila de espera mostrado(s) no console #####");
                    break;
                case "3":
                    String brand = JOptionPane.showInputDialog("##### Adicionar novo carro #####\nInsira a marca do carro");
                    String model = JOptionPane.showInputDialog("##### Adicionar novo carro #####\nInsira o modelo do carro");
                    String color = JOptionPane.showInputDialog("##### Adicionar novo carro #####\nInsira a cor do carro");
                    int carIdent = Integer.parseInt(JOptionPane.showInputDialog("##### Adicionar novo carro #####\nInsira o codigo de identificacao do carro"));
                    String ownerName = JOptionPane.showInputDialog("##### Adicionar novo carro #####\nInsira o nome do dono do carro");
                    Car newCar = new Car(brand, model, color, carIdent, ownerName);
                    if (washingCars.isFull()) {
                        carsToWash.enqueue(newCar);
                        if (carsToWash.isFull()) {
                            washedCars.enqueue((Car) washingCars.first());
                            washingCars.dequeue();
                            washingCars.enqueue(carsToWash.first());
                            carsToWash.dequeue();
                            washedCarsQueueIsAlreadySorted = false;//It's not sorted because in line 53 a new car was inserted.
                        }
                        JOptionPane.showMessageDialog(null, "##### Carro adicionado a fila de espera #####");
                    } else {
                        washingCars.enqueue(newCar);
                        JOptionPane.showMessageDialog(null, "##### Carro adicionado a lavagem #####");
                    }
                    break;
                case "4":
                    if (washedCars.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "##### Nenhum carro foi lavado ainda #####");
                        break;
                    }
                    System.out.println("##### Carro(s) ja lavado(s) #####\n");
                    Car []washedCarsArray = (Car[]) washedCars.getElements();
                    for(Car car : washedCarsArray)
                        System.out.println(car);
                    System.out.println("\n\n");
                    JOptionPane.showMessageDialog(null, "##### Carro(s) ja lavado(s) mostrado(s) no console #####");
                    break;
                case "5":
                    if (washedCars.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "##### Nenhum carro foi lavado ainda #####");
                    } else if (washedCars.size() == 1) {
                        JOptionPane.showMessageDialog(null, "##### Apenas um carro foi lavado #####");
                    } else if (washedCarsQueueIsAlreadySorted) {
                        JOptionPane.showMessageDialog(null, "##### Fila de carros lavados ja esta ordenada #####");
                    } else {
                        Arrays.sort(washedCars.getElements());
                        JOptionPane.showMessageDialog(null, "##### Fila de carros lavados ordenada #####");
                        washedCarsQueueIsAlreadySorted = true;
                    }
                    break;
                case "6":
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "##### Escolha uma opcao valida #####");
            }
        }
    }
}
