package org.example.nivell1.exercici1;


import java.io.File;
import java.util.List;

public class Main {

    private static final DirectoryManager DIRECTORY_MANAGER = new DirectoryManager();

    public static void main(String[] args) {
        try {
            List<File> files = DIRECTORY_MANAGER.readDirectory("src/main/resources/n1_ex1");
            files.forEach(file -> System.out.println(file.getName()));
        } catch (EmptyDirectoryException e) {
            System.out.println("ERROR " + e.getMessage());
        }

    }
}