package _staticqueue.tests;

import _staticqueue.structureclasses.StaticQueue;

public class Test {
    public static void main(String[] args) {
        StaticQueue<Integer> integers = new StaticQueue<>(10);
        integers.enqueue(1);
        integers.enqueue(2);
        integers.enqueue(3);
        integers.enqueue(4);
        integers.enqueue(5);
        integers.enqueue(6);
        integers.enqueue(7);
        integers.enqueue(8);
        integers.enqueue(9);
        integers.enqueue(10);
        System.out.println(integers.isEmpty());
        System.out.println(integers.size());
        System.out.println(integers.first());
        System.out.println(integers);
        integers.dequeue();
        System.out.println(integers);
        System.out.println(integers.size());
        while (!integers.isEmpty()) {
            integers.dequeue();
            System.out.println(integers);
        }

    }
}
