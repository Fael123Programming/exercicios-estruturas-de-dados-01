package java_language.class_string;

import java.io.PrintStream;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PrintStream cmd = System.out;
        String string = new String("This is a simple phrase!");
        string.toUpperCase(); //Strings cannot be modified in Java!
        string = string.toUpperCase(); //This way and only this way, we can modify a string: reassigning it
        cmd.println(string);
        cmd.println("----------------------------------");
        StringBuffer strBuf = new StringBuffer("Java is screaming to you!");
        //A StringBuffer object can be modified!
        strBuf.append("\nAre you listening?");
        strBuf.reverse();
        cmd.println(strBuf);
        cmd.println("----------------------------------");
        StringBuilder strBd = new StringBuilder("Thirty-three thoughtless boys were thinking about pointless things");
        //Also, a StringBuilder object can be modified
        strBd.replace(50, 59, "awesome");
        cmd.println(strBd);
        cmd.println("----------------------------------");
        Main.printCharByChar("Do you recognize it?");
        cmd.println("----------------------------------");
        Main.printBackwards("rafael quintino fonseca guimaraes");
        Main.printBackwards("socorram me subino on ibus em-marrocos");
        Main.printBackwards("anotaram ad atad a maratona");
        Main.printBackwards2("ana likes egg");
        cmd.println("----------------------------------");
        cmd.println(Main.convertToInt("762"));
        cmd.println(String.valueOf(Main.convertToInt("3.141592")) + 1);
        cmd.println(Character.getNumericValue('9'));
        cmd.println("----------------------------------");
        String str = "abc";
        String str2 = new String(new char[]{'a','b','c'});
        //The two lines above do the same thing!
        System.out.println("Are they equal? " + str.equals(str2));
        cmd.println(str.hashCode() + " " + str2.hashCode()); //Same values and same hash codes!
        cmd.println(str == str2); //But they are not in the same memory address
        /*A hash code is an integer value intended to represent and map data contained in an object!
        It is natively implemented and cannot be regarded as memory address.
        The method hashCode(): this method will return an integer as a result by mapping an integer
        to internal memory address in which object is stored. */
        String str3 = new String(new StringBuffer("Java"));
        String str4 = new String(new StringBuilder("General Zod").reverse().reverse());
        cmd.println(str3.concat(" was created by ").concat(str4));
        cmd.println("TO REPRESENT A CHAR VALUE IT IS USED " + Character.SIZE + " BITS. THEN, " + Character.BYTES + " BYTES");
        cmd.println(Character.isJavaIdentifierStart('_')); //First char
        cmd.println(Character.isJavaIdentifierPart('$')); //Rest of them
        int _$$_ = 1;
        cmd.println("_$$_ is valid to name an identifier!");
        String[] strings = new String[]{"Whatever","thing"};
        strings = new String[20];
        strings[0] = "First position";
        strings = new String[]{"Another","phrase"};
        cmd.println(Arrays.toString(strings));
        cmd.println("----------------------------------");
        cmd.println(Main.getInvertedString("Socorram-me, subi no ônibus em Marrocos"));
    }

    private static void printCharByChar(String str) {
        PrintStream cmd = System.out;
        for (int i = 0; i < str.length(); i++) {
            cmd.println(str.charAt(i));
        }
    }

    private static void printBackwards(String str) {
        PrintStream cmd = System.out;
        for (int i = str.length() - 1; i >= 0; i--) {
            cmd.print(str.charAt(i));
        }
        cmd.println();
    }

    private static void printBackwards2(String str) {
        System.out.println(new StringBuffer(str).reverse());
    }

    /**
     * This method converts a "stringed" number into an integer version of it. It also ignores all decimal places after
     * a dot (if the number is a floating point number).
     *
     * @param number a number surrounded by quotes (in string form)
     * @return an integer version of number
     */
    private static int convertToInt(String number) {
        int result = 0;
        if (number.contains(".")) number = number.substring(0, number.indexOf(".")); //To ignore floating point numbers
        char digit;
        for (int i = 0; i < number.length(); i++) {
            digit = number.charAt(i); //digit receives each character itself
            if (digit <= '9' && digit >= '0') {
                result += digit - '0'; //Using unicode table advantage to convert char to int
                //We could replace the line above by: result += Character.getNumericValue(digit);
                if (i < number.length() - 1)
                    result *= 10; //If we are not in the last repetition, we have to get in the next decimal place (ex.: 1 -> 10, 123 -> 123 -> 1230 and so on and so forth).
            }
        }
        if (number.charAt(0) == '-') result *= -1;
        return result;
    }

    private static String getInvertedString(String str) {
        StringBuffer result = new StringBuffer();
        for (String perStr : str.split(" ")) {
            result.append(new StringBuffer(perStr).reverse()).append(" ");
        }
        return result.toString().trim();
    }
}
