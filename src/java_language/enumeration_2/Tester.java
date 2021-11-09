package java_language.enumeration_2;

import java_language.enumeration_2._enum.*;

public class Tester {
    public static void main(String[] args) {
        System.out.println(Type.TYPE1 + "\t" + Type.TYPE1.getTypeStr() + "\t" + Type.TYPE1.getNumber() + "\t" +
                Type.TYPE1.getId()); //Rewritten getId().
        System.out.println(Type.TYPE2 + "\t" + Type.TYPE2.getTypeStr() + "\t" + Type.TYPE2.getNumber() + "\t" +
                Type.TYPE2.getId()); //Rewritten getId().
        System.out.println(Type.TYPE3 + "\t" + Type.TYPE3.getTypeStr() + "\t" + Type.TYPE3.getNumber() + "\t" +
                Type.TYPE3.getId()); //Not rewritten.
        System.out.println(BloodType.A);
        System.out.println(BloodType.B);
        System.out.println(BloodType.AB);
        System.out.println(BloodType.O);
        System.out.println(BloodType.O.getInfo());

    }
}
