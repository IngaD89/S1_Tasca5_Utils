package org.example.nivell1.exercici1;


import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DirectoryManager {

    public List<File> readDirectory(String path) throws EmptyDirectoryException {
        File file;
        List<File> collect = null;

        file = new File(path);
        if(file.isDirectory()){
            File[] files = file.listFiles();
            if(files == null || files.length == 0){
                throw new EmptyDirectoryException();
            }
            collect = Arrays
                    .stream(files)
                    .filter(f -> f != null && f.isFile())
                    .sorted(Comparator.naturalOrder())
                    .collect(Collectors.toList());

        }

        return collect;
    }


}
