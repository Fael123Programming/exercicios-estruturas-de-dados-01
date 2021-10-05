package java_language.java_io.handy_for_projects;

import java.io.*;
import java.util.*;

public class FileHandler {

    private FileHandler(){}

    public static boolean writeOver(String path, String information) {
        if (path == null || information == null) return false;
        try (FileOutputStream output = new FileOutputStream(path)) {
            OutputStreamWriter writer = new OutputStreamWriter(output);
            BufferedWriter buffer = new BufferedWriter(writer);
            buffer.write(information);
            buffer.close();
            return true;
        }catch(IOException e) {
            return false;
        }
    }

    public static boolean appendTo(String path, String information) {
        if (path == null || information == null) return false;
        try (FileOutputStream output = new FileOutputStream(path,true)) {
            OutputStreamWriter writer = new OutputStreamWriter(output);
            BufferedWriter buffer = new BufferedWriter(writer);
            buffer.newLine();
            buffer.write(information);
            buffer.close();
        }catch(IOException e) {
            return false;
        }
        return false;
    }

    public static String readFile(String path){
        try (Scanner fileScan = new Scanner(new File(path))){
            StringBuilder builder = new StringBuilder();
            while (fileScan.hasNextLine()) {
                builder.append(fileScan.nextLine()).append("\n");
            }
            return builder.toString();
        }catch(FileNotFoundException e){
            return null;
        }
    }

    public String getAllContent(String path) throws IOException {
        //Another way to read a file completely.
        if (path == null || path.length() == 0 || !FileHandler.fileExists(path)) return null;
        InputStream fileInput = new FileInputStream(path);
        InputStreamReader reader = new InputStreamReader(fileInput);
        BufferedReader buffer = new BufferedReader(reader);
        String temp = buffer.readLine();
        StringBuilder result = new StringBuilder();
        while (temp != null) {
            result.append(temp).append("\n");
            temp = buffer.readLine();
        }
        buffer.close();
        return result.toString();
    }

    public static boolean fileExists(String path) {
        try(Scanner fileScan = new Scanner(new File(path))) {
            return true;
        }catch(FileNotFoundException e) {
            return false;
        }
    }
}
