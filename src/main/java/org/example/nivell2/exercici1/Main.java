package org.example.nivell2.exercici1;


import java.io.*;
import java.util.Arrays;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        SaveTxtUsingProperties saveTxt = new SaveTxtUsingProperties();

        Properties config = new Properties();

        try {
            config.load(new FileReader("src/main/resources/n2_ex1/config.properties"));
            PrintWriter writer = new PrintWriter(config.getProperty("output"));
            File fileToRead = new File(config.getProperty("read"));
            saveTxt.saveLogToFileWithProperties(fileToRead, 2, writer);
            System.out.println("Directory structure saved successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Properties file not found " + e.getMessage());
        }
    }
}
