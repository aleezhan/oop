package kz.aitu.oop.examples;

// Java Program to illustrate reading from Text File
// using Scanner Class
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) throws Exception {

    }

    public String getFile() throws FileNotFoundException {

        File file = new File("/Users/alizhan/Desktop/OOP/input.txt ");
        Scanner sc = new Scanner(file);

        String result = "";
        while (sc.hasNextLine())
            result += sc.nextLine() + "\n";

        return result;
    }
}