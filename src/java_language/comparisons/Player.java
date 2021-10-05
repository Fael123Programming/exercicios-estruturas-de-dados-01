package java_language.comparisons;

import java.util.*;

public class Player implements Comparable<Player> {
    private String nickname;
    private int score;

    public Player(String nickname) {
        this.nickname = nickname;
    }

    public void addScore(int quantity) {
        this.score += quantity;
    }

    public String getNickname() {
        return this.nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getScore() {
        return this.score;
    }

    @Override
    public String toString(){
        return "Nickname: " + this.nickname + "\t Score: " + this.score;
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.nickname,this.score);
    }

    @Override
    public boolean equals(Object toCompare) {
        if (!(toCompare instanceof Player casted)) return false;
        return this.nickname.equals(casted.getNickname()) && this.score == casted.getScore();
    }

    @Override
    public int compareTo(Player toCompare) {
        //Natural ordering of the class, although we can use a Comparator to change it.
        return Integer.compare(this.score, toCompare.getScore()) * -1; //Decreasing order based on the value of the scorers!
    }
}
