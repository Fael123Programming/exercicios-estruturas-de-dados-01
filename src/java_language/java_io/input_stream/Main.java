package java_language.java_io.input_stream;

import java_language.java_io.handy_for_projects.FileHandler;

import java.io.*; //This API provides ways to handle input and output streams of data even files, etc.

public class Main {
    public static void main(String[] args) throws IOException { //When reading a file, that exception must be treated or rethrown!
        //OutputStream and InputStream are abstract classes which define the standard behaviour of data flows in Java.
        //You can read bytes or write bytes!
        FileInputStream fileReader; //This class is one of the children of InputStream and is used to read bytes from files.
        fileReader = new FileInputStream("src/java_language/java_io/texts/goodmorning.txt");
        int var = fileReader.read(); //It reads the next byte of data from that very file.
        System.out.println(var);
        //Anyway, we need to convert these bytes into a specific encoding system (such as UTF-8, UTF-16, ISO-8859-1, etc.) given to the unicode code for it.
        //We have to use the class InputStreamReader.
        InputStreamReader decoder = new InputStreamReader(fileReader);
        //As second argument of the constructor above, we can pass a specific charset (encoding system).
        int var2 = decoder.read();
        System.out.println(var2);
        BufferedReader bfr = new BufferedReader(decoder);
        //This class grabs together the encoded chars we got in last step and creates a String object.
        //Decorator Pattern (composition pattern) is used here!
        System.out.println(bfr.readLine());
        //Using my own file reader! -----------------------------------------------
        System.out.println("In the path -> src/java_language/java_io/texts/helloworld.txt, I found");
        System.out.println(FileHandler.readFile("src/java_language/java_io/texts/helloworld.txt"));
        System.out.println("\nNext file at: src/java_language/java_io/texts/goodmorning.txt");
        System.out.println(FileHandler.readFile("src/java_language/java_io/texts/goodmorning.txt"));
        System.out.println("Now, at src/ex_4_5_4_data_structure_book/Main.java");
        System.out.println(FileHandler.readFile("src/ex_4_5_4_data_structure_book/Main.java"));
        System.out.println("\n" + FileHandler.readFile("C:/Users/rafae/OneDrive/Documents/PRG/java/JavaParkingManager/ParkingProject.java"));
        //-------------------------------------------------------------------------
        //Now let's change a little piece of code to read Strings from keyboard instead of files.
        InputStream newInput = System.in; //<- change of reference variable!
        InputStreamReader inputReader = new InputStreamReader(newInput);
        BufferedReader reader = new BufferedReader(inputReader);
        String str = reader.readLine();
        while (str != null) { //This will lead us to endless readings of strings on terminal!
            System.out.println(str);
            str = reader.readLine();
        }
        reader.close();
    }
}
