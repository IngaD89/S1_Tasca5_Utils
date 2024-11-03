package org.example.nivell1.exercici4;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        TXTFileReader TXTFileReader = new TXTFileReader();
        TXTFileReader.readTxtFiles(new File("src/main/resources/n1_ex4"));
    }
}
