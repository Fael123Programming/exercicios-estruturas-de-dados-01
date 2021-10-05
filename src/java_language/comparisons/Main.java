package java_language.comparisons;

import java.util.*;
//
public class Main {
    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();
        players.add(new Player("Josh17"));
        players.get(0).addScore(4567);
        players.add(new Player("Mario_000"));
        players.get(1).addScore(5000);
        players.add(new Player("Andrew88"));
        players.get(2).addScore(2500);
        players.add(new Player("Kratos"));
        System.out.println("Insertion order");
        Main.print(players);
        Collections.sort(players); //players will be sorted using Comparable interface.
        System.out.println("Decreasing order");
        Main.print(players);
        players.sort(new IncreasingOrder()); //The same of Collections.sort(players,new IncreasingOder());
        System.out.println("Increasing order");
        Main.print(players);
    }

    private static void print(List<Player> pls) {
        if (pls.isEmpty()) return;
        System.out.println("--------------------------------------");
        for (Player pl : pls) {
            System.out.println(pl);
        }
    }
}
