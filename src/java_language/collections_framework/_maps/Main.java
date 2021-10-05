package java_language.collections_framework._maps;

import java_language.example_constructing_houses.structural.House;

import java.util.*;

//Maps are the best choice to use for making searches for objects depending on an information of them.

public class Main {
    public static void main(String[] args) {
        Map<String, House> houses = new HashMap<>();
        //Do not forget: maps have a different behaviour then they do not implement the Collection interface!
        //String is the type of the keys.
        //House is the type of the values the keys point to.
        //Two methods are principal: put(key,value) and get(key).
        houses.put("mine",new House("White",10));
        houses.put("neighbour",new House("Pink",12));
        House hs = houses.get("mine");
        System.out.println(hs.info());
        System.out.println(houses.containsKey("mine"));
        System.out.println(houses.containsValue("1000"));
        System.out.println(houses.keySet());
        System.out.println(houses.values());
        TreeMap<Integer,String> nouns = new TreeMap<>();
        nouns.put(25,"Twenty-five");
        nouns.put(79,"seventy-nine");
        System.out.println(nouns.firstKey());
        System.out.println(nouns.get(79));
        Hashtable<Integer,String> ht = new Hashtable<>();
        ht.put(34,"Whatever");
        System.out.println(ht.get(34));
        Properties settings = new Properties();
        //A map made specifically to handle strings as keys and values.
        //Well-used to hold information of applications.
        settings.setProperty("login.user","John123");
        settings.setProperty("login.password","pink_underwear");
        //Using setProperty() you are creating a list of properties!
        //It is handy to make data persistence.
        System.out.println(settings.get("login.password"));
        settings.put("login.url","[...]"); //Not advisable to use. Instead, use setProperty.
        System.out.println(settings.get("login.url"));
    }
}
