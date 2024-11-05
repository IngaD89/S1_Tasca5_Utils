package org.example.nivell1.exercici1;


import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    private static final DirectoryManager DIRECTORY_MANAGER = new DirectoryManager();

    public static void main(String[] args) {
        Path basePath = Paths.get(System.getProperty("user.dir"));
        Path relativePath = basePath.resolve("src/main/resources/n1_ex1");

        try {
            List<File> files = DIRECTORY_MANAGER.readDirectory(String.valueOf(relativePath));
            files.forEach(file -> System.out.println(file.getName()));
        } catch (EmptyDirectoryException e) {
            System.out.println("ERROR " + e.getMessage());
        }

    }
}