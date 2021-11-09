package java_language.parallel_programming.ex04;

import java.io.*;

public class TestEx04 {
    public static void main(String[] args) throws IOException {
        final String path = "src/java_language/parallel_programming/ex04/myFile.pdf";
        File myFile = new File(path);
        if (myFile.createNewFile()) {
            System.out.println("File created at location: " + path);
        } else {
            System.out.println("There was a problem...");
        }
        PrintStream ps = new PrintStream(path);
        ps.append("History (from Greek ἱστορία, historia, meaning \"inquiry; knowledge acquired by investigation\") is " +
                "the study of the past. Events before the invention of writing systems are considered prehistory. \"His" +
                "tory\" is an umbrella term comprising past events as well as the memory, discovery, collection, organiz" +
                "ation, presentation, and interpretation of these events. Historians seek knowledge of the past using his" +
                "torical sources such as written documents, oral accounts, art and material artifacts, and ecological mar" +
                "kers.\n\nHistory also includes the academic discipline which uses narrative to describe, examine, quest" +
                "ion, and analyze past events, and investigate their patterns of cause and effect. Historians often deba" +
                "te which narrative best explains an event, as well as the significance of different causes and effects." +
                " Historians also debate the nature of history as an end in itself, as well as its usefulness to give pers" +
                "pective on the problems of the present.\n\nStories common to a particular culture, but not supported by " +
                "external sources (such as the tales surrounding King Arthur), are usually classified as cultural heritage" +
                " or legends. History differs from myth in that it is supported by evidence. However, ancient cultural inf" +
                "luences have helped spawn variant interpretations of the nature of history which have evolved over the ce" +
                "nturies and continue to change today. The modern study of history is wide-ranging, and includes the study" +
                " of specific regions and the study of certain topical or thematic elements of historical investigation. H" +
                "istory is often taught as part of primary and secondary education, and the academic study of history is a " +
                "major discipline in university studies.\n\nHerodotus, a 5th-century BC Greek historian, is often consider" +
                "ed the \"father of history\" in the Western tradition, although he has also been criticized as the \"fath" +
                "er of lies\". Along with his contemporary Thucydides, he helped form the foundations for the modern stud" +
                "y of past events and societies. Their works continue to be read today, and the gap between the culture-f" +
                "ocused Herodotus and the military-focused Thucydides remains a point of contention or approach in modern " +
                "historical writing. In East Asia, a state chronicle, the Spring and Autumn Annals, was reputed to date fr" +
                "om as early as 722 BC, although only 2nd-century BC texts have survived. (Full article...)");
        ps.close();
        System.out.println("Creating two files \"at the same time\"...");
        FileCreator pythonFile = new FileCreator("src/java_language/parallel_programming/ex04/helloWorld.py",
                "from time import sleep\nprint(\"Hello world\")\nsleep(5)");
        Thread threadPythonFile = new Thread(pythonFile);
        threadPythonFile.start(); //Create a new Python file from inside this project.
        FileCreator batFile = new FileCreator("src/java_language/parallel_programming/ex04/helloworld.bat",
                "Python C:\\Users\\rafae\\OneDrive\\Documents\\PRG\\java\\exercicios-estruturas-de-dados-01\\" +
                        "src\\java_language\\parallel_programming\\ex04\\helloworld.py");
        Thread threadBatFile = new Thread(batFile);
        threadBatFile.start(); //Create a new bat file from inside this project.
    }
}
