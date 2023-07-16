import java.io.*;
import java.lang.reflect.*;
import java.nio.file.*;
import java.util.*;
import java.lang.System.*;

public class task2 {

    //Set exclude = ['test', 'Test', 'tests', 'Tests']

    public static void main(String[] args) throws IOException {
        String filePath = System.getProperty("user.dir");
        File[] fileList = getFiles(filePath);
        readFile(fileList);
    }

    public static File[] getFiles(String path) {
        File filePath = new File(path);
        String javaExtension = "java";
        String testFilePath = "test";
        int fileCount = 0;


        FileFilter javaFileFilter = fileName -> {
            String fileNameToString = fileName.toString();
            String fileExtension = fileNameToString.substring(fileNameToString.lastIndexOf('.') + 1);
            return fileExtension.equals(javaExtension) && !fileNameToString.contains(testFilePath);
        };
        File[] fileList = filePath.listFiles(javaFileFilter);
        for (File f : fileList) {
            fileCount++;
            System.out.println("File found is: " + f.getName());
        }
        System.out.println("Number of files is: " + fileCount);
        return fileList;
    }

    public static void readFile(File [] fileList) {

        File file;
        FileInputStream fileInputStream;
        byte[] fileBytes;
        String[] tokenizedCleanContents;

        for (File f : fileList){
            Class c = f.getClass();
            if (Modifier.isAbstract(c.getModifiers()))
                System.out.println(c.toString());
            else{
                System.out.println("no abs classes found");
        }
    }
}}

