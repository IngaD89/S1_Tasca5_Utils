package org.example.nivell1.exercici3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Path basePath = Paths.get(System.getProperty("user.dir"));

        File directoryToRead = basePath.resolve("src/main/resources").toFile();
        File outputFile = basePath.resolve("src/main/resources/n1_ex3/saveFilesAsTree.txt").toFile();

        SaveFilesInTXT saveFilesInTXT = new SaveFilesInTXT();
        try (PrintWriter writer = new PrintWriter(outputFile)) {
            saveFilesInTXT.printFilesAsTreeAndSaveInTXT(directoryToRead, 0, writer);
            System.out.println("Directory structure saved successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found " + e.getMessage());
        }
    }
}
