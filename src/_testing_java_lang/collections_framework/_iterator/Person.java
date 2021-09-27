package _testing_java_lang.collections_framework._iterator;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " - Age: " + this.age;
    }

    @Override
    public int compareTo(Person personToCompare) {
        return Integer.compare(this.age,personToCompare.getAge());
    }

}
