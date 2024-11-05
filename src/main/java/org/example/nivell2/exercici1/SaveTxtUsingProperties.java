package org.example.nivell2.exercici1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class SaveTxtUsingProperties {
    public void saveLogToFileWithProperties(File directory, int grade, PrintWriter writer) throws FileNotFoundException {
        if(!directory.exists()){
            throw new FileNotFoundException();
        }
        try {
            if (directory.isDirectory()) {
                writer.println(tabulation(grade) + "D--- " + directory.getName()
                        + " ____last modification___: "
                        + updatedAt(directory));
                File[] files = directory.listFiles();
                if (files != null) {
                    Arrays.sort(files);
                    for (File file : files) {
                        if (file.isDirectory()) {
                            saveLogToFileWithProperties(file, grade + 1, writer);
                        } else {
                            writer.println(
                                    tabulation(grade + 1) + "F--- " + file.getName()
                                            + " ___last modification of file___ "
                                            + updatedAt(file));
                        }
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error while print files as tree " + e.getMessage());
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
}