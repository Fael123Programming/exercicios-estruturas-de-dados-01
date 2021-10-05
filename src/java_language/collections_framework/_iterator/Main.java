package java_language.collections_framework._iterator;

import java.util.*;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        //In this document, we will present how to use Iterators to traverse Collections.
        //Iterator with a set!
        Set <String> names = new HashSet<>(); //'Generics' is also called as type parameters!
        names.add("Josh Eduard");
        names.add("James Martin");
        names.add("Marianna Grande");
        names.add("Ana Maria Braga");
        names.add("Rafael Fonseca");
        Iterator <String> it = names.iterator();
        while (it.hasNext()) { //It checks if there is another element in Collection!
            String name = it.next(); //Returns the next element.
            if (name.equals("Rafael Fonseca")) {
                it.remove(); //Removes the current element it points to.
                continue;
            }
            System.out.println(name);
        }
        TreeSet <Person> people = new TreeSet<>();
        //Person already implemented the interface Comparable.
        //So it has its own and natural way to order instantiated objects.
        people.add(new Person("James Gosling",30));
        people.add(new Person("Edouard Mane",25));
        people.add(new Person("Matthiew Lam",45));
        Iterator <Person> it2 = people.iterator();
        //Remember that the iterator must be as the same type as the collection it is going to be used with.
        System.out.println(it2.next());
        System.out.println(it2.next());
        System.out.println(it2.next());
        if (!it2.hasNext()) {
            System.out.println("There is no more elements");
        }
        //Iterator with lists!
        System.out.println("------------------------------------------");
        List <Person> employees = new ArrayList<>();
        employees.add(new Person("James Gosling",30));
        employees.add(new Person("Edouard Mane",25));
        employees.add(new Person("Matthiew Lam",45));
        ListIterator <Person> it3 = employees.listIterator();
        //A specific iterator for lists!
        while (it3.hasNext()) {
            it3.next();
        }
        while (it3.hasPrevious()) {
            System.out.println(it3.previous());
        }
        System.out.println("--------------------------------------");
        it3.set(new Person("Rafael Fonseca",19)); //James Gosling was swapped!
        it3.next();
        it3.add(new Person("Sancho Pança",40)); //Sancho Pança was introduced!
        while (it3.hasPrevious()) {
            it3.previous();
        }
        while (it3.hasNext()) {
            System.out.println(it3.next());
        }
    }
}
