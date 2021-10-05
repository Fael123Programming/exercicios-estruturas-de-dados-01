package java_language.collections_framework.shuffling;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List <Character> chars = new ArrayList<>();
        chars.add('A');
        chars.add('Z');
        chars.add('D');
        chars.add('c');
        chars.add('b');
        System.out.println("Insertion order: " + chars);
        Collections.sort(chars);
        System.out.println("Sorted: " + chars);
        Collections.reverse(chars);
        System.out.println("Sorted and inverted: " + chars);
        Collections.shuffle(chars);
        System.out.println("Shuffled: " + chars);
    }
}
