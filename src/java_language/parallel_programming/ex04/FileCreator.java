package java_language.parallel_programming.ex04;

import java.io.*;

public class FileCreator implements Runnable {
    private String path;
    private String information;

    public FileCreator(String path, String information) {
        if (path == null || information == null || path.isBlank() || information.isBlank()) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        this.path = path;
        this.information = information;
    }

    public String getPath(){ return path; }

    public String getInformation(){ return information; }

    public void setPath(String newPath){
        if (newPath == null || newPath.isBlank()) throw new IllegalArgumentException("Invalid path");
        path = newPath; }

    public void setInformation(String newInfo) {
        if (newInfo == null || newInfo.isBlank()) throw new IllegalArgumentException("Invalid information");
        information = newInfo; }

    @Override
    public void run(){
        try {
            PrintStream ps = new PrintStream(path);
            ps.println(information);
        } catch(FileNotFoundException exc) {
            System.out.println("Check the file path: an I/O error blocked this thread to execute");
        }
    }
}
