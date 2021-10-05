package java_language.comparisons;

import java.util.Comparator;

public class IncreasingOrder implements Comparator<Player> {
//An object of this class can be passed as a Comparator because it signs the contract of implementing the method compare.
    @Override
    public int compare(Player pl1, Player pl2) {
        return Integer.compare(pl1.getScore(), pl2.getScore()); //It is used to organize a list of players by their scorers increasingly.
    }
}
