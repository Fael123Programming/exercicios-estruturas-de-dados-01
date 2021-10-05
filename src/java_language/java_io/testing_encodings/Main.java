package java_language.java_io.testing_encodings;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) {
        //Charset.availableCharsets().values() to see what encodings the latest JVM supports!
        Main.seeSymbolEncodingRepresentations("ç","ISO-8859-1", "UTF-8","UTF-16","US-ASCII","Cp1252");
        Main.seeSymbolEncodingRepresentations("a","ISO-8859-1", "UTF-8","UTF-16","US-ASCII","Cp1252");
    }

    private static void seeSymbolEncodingRepresentations(String symbol, String... encodings) {
        String hex;
        byte[] bytes; //To keep all bytes used in each encoding to represent the data held in letter.
        System.out.println("Representing (" + symbol + ")");
        for (String encoding : encodings) {
            try {
                bytes = symbol.getBytes(encoding);
                System.out.println(encoding + ": " + bytes.length + " byte(s)");
                System.out.print("Hexadecimal representation: ");
                for (byte bt : bytes) { //Converting each byte into hexadecimal!
                    hex = Integer.toHexString((bt + 256) % 256).toUpperCase();
                    if (hex.length() == 1) {
                        hex = "0" + hex;
                    }
                    System.out.print(hex);
                }
                System.out.println("\n----------------------------------");
            } catch (UnsupportedEncodingException e) {
                System.out.println("Unsupported encoding");
                return;
            }
        }
    }
}
