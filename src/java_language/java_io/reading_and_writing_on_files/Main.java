package java_language.java_io.reading_and_writing_on_files;

import java_language.java_io.handy_for_projects.FileHandler;

public class Main {
    public static void main(String[] args){
        //System.out.println(FileHandler.readFile("src/java_language/java_io/texts/captmidn.txt"));
        FileHandler.appendTo("src/java_language/java_io/texts/goodmorning.txt","Okay...");
        System.out.println(FileHandler.readFile("src/java_language/java_io/texts/goodmorning.txt"));
    }
}
