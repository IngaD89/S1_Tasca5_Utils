package org.example.nivell1.exercici5;

import java.io.*;

public class UserManager {

    public void serializeObject(Object object, String filename) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename))) {
            outputStream.writeObject(object);
            System.out.println("Object serialized successfully.");
        } catch (IOException e) {
            System.out.println("Error while serializing");
        }
    }

    public Object deserializeObject(String filename) {
        Object obj = null;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename))) {
            System.out.println("Object deserialized successfully.");
             obj = inputStream.readObject();
            return obj;
        } catch (IOException e) {
            System.out.println("Error while deserializing");
        }catch (ClassNotFoundException e){
            System.out.println("Class not found " + e.getClass() + " "  + e.getMessage());
        }
        return obj;
    }
}
