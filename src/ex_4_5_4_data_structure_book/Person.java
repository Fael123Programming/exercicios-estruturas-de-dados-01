package ex_4_5_4_data_structure_book;

public class Person {
    private String name ;
    private int number ;

    public Person ( String name , int number ) {
        this.name = name ;
        this.number = number ;
    }

    public String getName() {
        return this.name ;
    }

    public int getNumber() {
        return this.number ;
    }

    @Override
    public String toString () {
        return "Name: " + this.name + " " + "Number: " + this.number;
    }
}
