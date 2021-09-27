package _recursion;

import java.io.PrintStream;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] n1 = {1032, 1976}, n2 = {3, 1}, n3 = {18, 6};
        /*Comparing if three "different" rational numbers are different or not using mdc.
        I reduced their components into the minimum values for their numerators and denominators dividing them for their respective mdcs.*/
        int maxN1 = Recursion.mdcT(n1[0], n1[1]), maxN2 = Recursion.mdcT(n2[0], n2[1]), maxN3 = Recursion.mdcT(n3[0], n3[1]);
        System.out.println(Arrays.toString(Main.div(n1, maxN1)));
        System.out.println(Arrays.toString(Main.div(n2, maxN2)));
        System.out.println(Arrays.toString(Main.div(n3, maxN3)));
        System.out.println(Recursion.mdcI(2, 4) + " " + Recursion.mdcI(15, 3));
        System.out.println(Recursion.mdc(2, 4) + " " + Recursion.mdc(15, 3));
        System.out.println(Recursion.mdcI(1032, 1032));
        //------------------------------------------------------------------------------
        /*System.out.println( Recursion.mdcL(256,96));
        TowerOfHanoi.play(1,'A','C','B');
        System.out.println("\n");
        TowerOfHanoi.play(10,'A','C','B');
        System.out.println("\n");
        TowerOfHanoi.play(20,'A','C','B');
        System.out.println("\n");
        TowerOfHanoi.play(30,'A','C','B');
        System.out.println("\n");
        TowerOfHanoi.play(40,'A','C','B'); //It spent 34 minutes to finalize.
        System.out.println("\n");
        TowerOfHanoi.play(41,'A','C','B'); //It spent 55 minutes to finalize.
        System.out.println("\n");*/
        PrintStream cmd = System.out;
        for (int i = 0; i <= 8; i++) cmd.print(Recursion.fib(i) + "\t");
    }

    private static int[] div(int[] rational, int divider) {
        return new int[]{rational[0] / divider, rational[1] / divider};
    }
}
