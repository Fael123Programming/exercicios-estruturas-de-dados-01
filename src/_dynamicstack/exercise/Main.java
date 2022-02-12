package _dynamicstack.exercise;

import _dynamicstack.structureclasses.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> even = new Stack<>();
        Stack<Integer> odd = new Stack<>();
        int randomNumber = Main.generateNumber(-127, 128);
        while (randomNumber != 0) { //Pegando números e colocando-os dentro da pilha específica.
            if (randomNumber % 2 == 0)
                even.push(randomNumber);
            else
                odd.push(randomNumber);
            randomNumber = Main.generateNumber(-127, 128);
        }
        if (even.isEmpty() || odd.isEmpty())
            System.exit(0);
        System.out.println("Dados na pilha de números ímpares:\n");
        Main.showDataOfElements(odd.getElements());
        System.out.println("\n\nDados na pilha de números pares:\n");
        Main.showDataOfElements(even.getElements());
        while (!odd.isEmpty() && !even.isEmpty()) {
            System.out.printf("\n\nRetirando %d da pilha de números ímpares.\n", odd.top());
            odd.pop();
            System.out.printf("Retirando %d da pilha de números pares.", even.top());
            even.pop();
        }
        if (odd.isEmpty() && even.isEmpty())
            System.exit(0);
        if (odd.isEmpty()) {
            System.out.printf("\n\nPilha de números pares ainda possui %d elemento(s)\nSao eles:\n", even.size());
            Main.showDataOfElements(even.getElements());
        } else if (even.isEmpty()) {
            System.out.printf("\n\nPilha de números ímpares ainda possui %d elemento(s)\nSao eles:\n", odd.size());
            Main.showDataOfElements(odd.getElements());
        }
    }

    public static void showDataOfElements(Object[] elements) {
        if (elements == null)
            return;
        for (int counter = 0; counter < elements.length; counter++) {
            if (counter == 0)
                System.out.println("[TOP]: " + elements[counter]);
            else
                System.out.println("[TOP-" + counter + "]: " + elements[counter]);
        }
    }

    public static int generateNumber(int firstBound, int secondBound) {
        return (int) (firstBound + Math.random() * ((secondBound + 1) - firstBound));
    }
}
