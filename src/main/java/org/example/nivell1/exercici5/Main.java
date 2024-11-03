package org.example.nivell1.exercici5;

public class Main {
    public static void main(String[] args) {
        User user = new User("John", "Doe", 30);
        UserManager userManager = new UserManager();

        userManager.serializeObject(user, "person.ser");

        User deserializedPerson = (User) userManager.deserializeObject("person.ser");

        if (deserializedPerson != null) {
            System.out.println("Name: " + deserializedPerson.getName());
            System.out.println("Last Name: " + deserializedPerson.getLastName());
            System.out.println("Age: " + deserializedPerson.getAge());
        }
    }
}
