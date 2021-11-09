package java_language.enumeration;

import java_language.enumeration.classes.Customer;
import java_language.enumeration.enum_.Type;

public class TestEnum01 {
    public static void main(String[] args) {
        Customer customer = new Customer("Erich Gamma", Type.LEVEL_THREE, Customer.Country.USA);
        System.out.println(customer);
        Customer whoever = new Customer("Pedro Alvarez Cabral", Type.LEVEL_TWO, Customer.Country.PORTUGAL);
        System.out.println(whoever);
    }
}
