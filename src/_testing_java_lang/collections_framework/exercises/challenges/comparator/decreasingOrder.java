package _testing_java_lang.collections_framework.exercises.challenges.comparator;

import java.util.Comparator;
//A comparator can be used to simplify the ways of ordering you can apply for a specific class, even though
//it already has a natural ordering (for example, based on an implementation of the interface Comparable).

public class decreasingOrder implements Comparator<Integer> { //A comparator of Integers!

    @Override
    public int compare(Integer n1,Integer n2) {
        return Integer.compare(n1,n2) * -1; //Compare numbers to order them decreasingly.
    }
    //It seems that this method above can be used instead of compareTo.
}
