package collectionstasks;
import java.util.*;

// Student4 class with ID
class Student4 {
    String id;
    String name;
    int marks;

    public Student4(String id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Marks: " + marks;
    }
}

public class Task5_4 {
    public static void main(String[] args) {
        // Create a List of Student4 objects
        List<Student4> studentList = Arrays.asList(
            new Student4("S001", "Alice", 85),
            new Student4("S002", "Bob", 72),
            new Student4("S003", "Clare", 90),
            new Student4("S004", "David", 78)
        );

        // Convert List to Map<String, Student4> using ID as key
        Map<String, Student4> studentMap = new HashMap<>();
        for (Student4 s : studentList) {
            studentMap.put(s.id, s);
        }

        // Print the Map
        System.out.println("Student Map (ID → Student):");
        for (Map.Entry<String, Student4> entry : studentMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
