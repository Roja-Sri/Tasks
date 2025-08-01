package collectionstasks;
import java.util.*;

// Student2 class implementing Comparable<Student2>
class Student2 implements Comparable<Student2> {
    String name;
    int marks;

    public Student2(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Sort by marks in ascending order
    @Override
    public int compareTo(Student2 other) {
        return this.marks - other.marks;
    }

    @Override
    public String toString() {
        return name + " - " + marks;
    }
}

public class Task5_1 {
    public static void main(String[] args) {
        ArrayList<Student2> list = new ArrayList<>();
        list.add(new Student2("Alice", 85));
        list.add(new Student2("Bob", 72));
        list.add(new Student2("Clare", 90));
        list.add(new Student2("David", 78));

        // Sort using Comparable (by marks)
        Collections.sort(list);

        // Print the sorted list
        System.out.println("Students sorted by marks (ascending):");
        for (Student2 s : list) {
            System.out.println(s);
        }
    }
}
