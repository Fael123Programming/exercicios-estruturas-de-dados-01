package java_language.java_io.output_stream;

import java_language.java_io.handy_for_projects.FileHandler;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //Now, let's use some classes to write on files!
        //It is quite similar to the process of reading!
        final String filePath = "src/java_language/java_io/texts/goodmorning.txt";
        OutputStream outputStream = new FileOutputStream(filePath,true); //Instead of replace content, we will just add more content into the file!
        OutputStreamWriter writer = new OutputStreamWriter(outputStream);
        BufferedWriter buffer = new BufferedWriter(writer);
        System.out.println("Before writing: \n" + FileHandler.readFile(filePath));
        buffer.newLine(); //Appends a new line to the last line of the file.
        buffer.write("Are those clothes leather?");
        buffer.close(); //Closing stream! There could be used a FileOutputStream/InputStream object to do so also.
        System.out.println("After writing: \n" + FileHandler.readFile(filePath));
        //NEVER FORGET: A READER OR WRITER NEED TO BE CLOSED AT EVERY OPERATION.
    }
}
