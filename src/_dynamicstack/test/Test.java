package _dynamicstack.test;

import _dynamicstack.structureclasses.Stack;

public class Test {
    public static void main(String[] args) {
        Stack<Integer> integers = new Stack<>();
        integers.push(1);
        integers.push(10);
        integers.push(100);
        integers.push(1000);
        integers.push(10000);
        integers.push(100000);
        System.out.println(integers.size());
        System.out.println("Is it empty? " + integers.isEmpty());
        System.out.println(integers.top());
        System.out.println(integers);
        while (!integers.isEmpty()) {
            integers.pop();
            System.out.println(integers);
        }
        System.out.println("Is it empty? " + integers.isEmpty());
        System.out.println(integers.size());
        System.out.println(integers);
    }
}
