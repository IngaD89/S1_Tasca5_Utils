package org.example.nivell1.exercici1;

public class EmptyDirectoryException extends Exception{
    public EmptyDirectoryException() {
        super("EXCEPTION: Directory is empty");
    }
}
