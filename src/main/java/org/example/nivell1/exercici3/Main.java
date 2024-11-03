package org.example.nivell1.exercici3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        File directoryToRead = new File("src/main/resources");

        File outputFile = new File("src/main/resources/n1_ex3/saveFilesAsTree.txt");

        SaveFilesInTXT saveFilesInTXT = new SaveFilesInTXT();
        try (PrintWriter writer = new PrintWriter(outputFile)) {
            saveFilesInTXT.printFilesAsTreeAndSaveInTXT(directoryToRead, 0, writer);
            System.out.println("Directory structure saved successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found " + e.getMessage());
        }
    }
}
