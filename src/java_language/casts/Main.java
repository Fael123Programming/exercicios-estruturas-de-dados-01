package java_language.casts;

public class Main {
    public static void main(String[] args) {
        int x = 10;
        String xStr = "" + 10;
        xStr = Integer.toString(x);
        x = Integer.parseInt(xStr);
        //Every class that represents number (Short, Integer, Long, Float and Double) has those methods: toString and parse.
        //Let us use the wrapping classes with a keeper object.
        Keeper kp = new Keeper();
        kp.add(x);//Autoboxing! A primitive type is cast to a reference variable automatically.
        long big = 123123L;
        kp.add(big);
        short small = 1;
        kp.add(small);
        Integer newX = Integer.valueOf(x);
        System.out.println(newX);
        System.out.println(newX.intValue());
        newX = null; //It does not leave of being a reference variable!
        System.out.println(newX);
    }
}
