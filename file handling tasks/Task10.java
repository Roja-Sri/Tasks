package filehandlingtasks;

import java.io.*;
import java.util.ArrayList;

public class Task10 {

    public static void main(String[] args) {
        String fileName = "students.ser";

        // Step 1: Create and populate the list
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Rahul", 101, 85));
        studentList.add(new Student("Anita", 102, 90));
        studentList.add(new Student("Vikram", 103, 78));

        // Step 2: Serialize the list
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
            out.writeObject(studentList);
            System.out.println("✅ Students serialized to " + fileName);
        } catch (IOException e) {
            System.out.println("❌ Error serializing students.");
            e.printStackTrace();
        }

        // Step 3: Deserialize and display the list
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
            ArrayList<Student> deserializedList = (ArrayList<Student>) in.readObject();
            System.out.println("\n📋 Deserialized Student List:");
            for (Student s : deserializedList) {
                s.display();
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("❌ Error deserializing students.");
            e.printStackTrace();
        }
    }
}

