package org.example.nivell1.exercici1;

public class DirectoryPath {
    private String path;

    public DirectoryPath(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return this.path;
    }
}
