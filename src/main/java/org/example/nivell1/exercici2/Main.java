package org.example.nivell1.exercici2;


import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {

        FilesAsTree files = new FilesAsTree();

        Path basePath = Paths.get(System.getProperty("user.dir"));
        Path relativePath = basePath.resolve("src/main/resources/n1_ex2");

        try {
            files.printFilesAsTree(String.valueOf(relativePath), 2);
        } catch (FileNotFoundException e) {
            System.out.println("Directorio no encontrado " + e.getMessage());
        }catch (DirectoryIsEmptyException e){
            System.out.println("Directorio no contiene archivos " + e.getMessage());
        }
    }
}
