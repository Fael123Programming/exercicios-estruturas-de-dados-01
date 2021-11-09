package java_language.enumeration.classes;

import java_language.enumeration.enum_.Type;

public class Customer {
    private final String name;
    private final Type type;
    private final Country country;
    //When creating a new Customer, type can receive only one of those values
    //defined in the enumeration Type.
    //When printing those values, they are converted to string.

    public Customer(String name, Type type, Country country) {
        this.name = name;
        this.type = type;
        this.country = country;
    }

    public String toString(){
        return "{name: " + name + ", customerType: " + type + ", country: " + country + "}";
    }

//    Enum is nothing more than a set of constant values that can be used to standardized
//    data in an object.
    public enum Country {
        BRAZIL, USA, CANADA, ARGENTINA, BELGIUM, FRANCE, GERMANY, RUSSIA, SWEDEN, MEXICO, SPAIN,
        SOUTH_AFRICA, UNITED_KINGDOM, ITALY, PORTUGAL
    } //Inner enum does need static modifier.
}
