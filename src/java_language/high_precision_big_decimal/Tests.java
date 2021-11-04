package java_language.high_precision_big_decimal;

import java.math.BigDecimal;

public class Tests {
    public static void main(String[] args) {
        double n1 = 0.03;
        double n2 = 0.02;
        System.out.println("Using primitive type double: " + n1 + " - " + n2 + " = " + (n1 - n2));
        BigDecimal x1 = new BigDecimal("0.03"); //Using constructor.
        BigDecimal x2 = new BigDecimal("0.02");
        System.out.println("Using BigDecimal instances: " + x1 + " - " + x2 + " = " + x1.subtract(x2));
        System.out.println(x1 + " * " + x2 + " = " + (x1.multiply(x2)));
        System.out.println(x1 + " ^ 2 = " + (x1.pow(2)));
        BigDecimal n1BD = BigDecimal.valueOf(n1), n2BD = BigDecimal.valueOf(n2); //Using valueOf() methods.
        System.out.println(n1BD.subtract(n2BD));
        System.out.println(n1BD.divide(n2BD));
        System.out.println(n1BD.doubleValue());
        System.out.println(n1BD.intValue());
        String strNum = x1.toString();
        System.out.println(strNum + 1);
        System.out.println(x1.compareTo(x2) < 0); //x1 < x2 (their values).
        System.out.println(x2.compareTo(x1) > 0); // x2 > x1 (their values).
        System.out.println((x1.compareTo(x2) == 0) + " " + x1.equals(x2)); // x1 == x2 (their values).
        //compareTo() returns -1 if the caller BigDecimal is less than the one passed.
        //1 if the opposite.
        //0 if they're equal.
        BigDecimal endless = (new BigDecimal("1")).divide(new BigDecimal("3"));
        System.out.println(endless); //Infinite decimal places!
    }
}
