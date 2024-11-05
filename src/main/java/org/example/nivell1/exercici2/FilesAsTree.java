package org.example.nivell1.exercici2;


import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;

import java.util.Date;


public class FilesAsTree {
//TODO exceptions

    public void printFilesAsTree(String filePath, int grade) throws FileNotFoundException, DirectoryIsEmptyException {
        File directory = new File(filePath);

        if (!directory.exists()) {
            throw new FileNotFoundException();
        }
        if (directory.isDirectory()) {
            System.out.println(colorText(tabulation(grade) + "D--- " + directory.getName(), "CYAN")
                    + colorText(" ____last modification___: ", "YELLOW")
                    + colorText(updatedAt(directory), "GREEN"));
            File[] files = directory.listFiles();
            if (files == null || files.length == 0) {
                throw new DirectoryIsEmptyException();
            }
            for (File file : files) {
                if (file.isDirectory()) {
                    printFilesAsTree(file.getPath(), grade + 1);
                } else {
                    System.out.println(
                            colorText(tabulation(grade + 1) + "F--- " + file.getName(), "CYAN")
                                    + colorText(" ___last modification of file___", "YELLOW")
                                    + colorText(updatedAt(file), "GREEN"));
                }
            }

        }
    }

    private String tabulation(int grade) {
        StringBuilder tab = new StringBuilder();
        for (int i = 0; i < grade; i++) {
            tab.append("|  ");
        }
        return tab.toString();
    }

    private String updatedAt(File file) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(new Date(file.lastModified()));
    }

    private String colorText(String text, String color) {
        String colorCode = switch (color.toUpperCase()) {
            case "CYAN" -> "\u001B[36m";
            case "YELLOW" -> "\u001B[33m";
            case "GREEN" -> "\u001B[32m";
            default -> "\u001B[0m";
        };
        return colorCode + text + "\u001B[0m";
    }
}
