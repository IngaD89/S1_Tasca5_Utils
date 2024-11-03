package org.example.nivell1.exercici4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TXTFileReader {

    public void readTxtFiles(File directory) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    readTxtFiles(file);
                } else if (file.getName().toLowerCase().endsWith(".txt")) {
                    System.out.println("==================================");
                    System.out.println("File: " + file.getName());
                    System.out.println("Last modification: " + updatedAt(file));
                    System.out.println("Content: " + readTxt(file));
                    System.out.println("==================================");
                }
            }
        }
    }

    private String readTxt(File file) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                content.append(line).append(System.lineSeparator());
            }
        } catch (IOException e) {
            return "Error while reading file content";
        }
        return content.toString();
    }

    private String updatedAt(File file) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(new Date(file.lastModified()));
    }
}
