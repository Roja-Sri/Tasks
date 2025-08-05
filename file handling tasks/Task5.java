package filehandlingtasks;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class Task5 {

    public static void main(String[] args) {
        String fileName = "student.ser";

        Student student = new Student("Rahul", 101, 85);

        try {
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(student);
            out.close();
            fileOut.close();

            System.out.println("Object serialized and written to " + fileName);
        } catch (IOException e) {
            System.out.println("Serialization error:");
            e.printStackTrace();
        }

        try {
            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Student deserializedStudent = (Student) in.readObject();
            in.close();
            fileIn.close();

            System.out.println("\nDeserialized Student:");
            deserializedStudent.display();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization error:");
            e.printStackTrace();
        }
    }
}

