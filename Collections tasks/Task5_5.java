package collectionstasks;
import java.util.*;

// Student5 class
class Student5 {
    String name;
    int marks;

    public Student5(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " - " + marks;
    }
}

// Comparator for sorting students by marks in descending order
class MarksComparator implements Comparator<Student5> {
    @Override
    public int compare(Student5 s1, Student5 s2) {
        return s2.marks - s1.marks; // Descending order
    }
}

public class Task5_5 {
    public static void main(String[] args) {
        List<Student5> students = Arrays.asList(
            new Student5("Alice", 85),
            new Student5("Bob", 72),
            new Student5("Clare", 90),
            new Student5("David", 78),
            new Student5("Eva", 88)
        );

        // PriorityQueue with custom comparator to get highest marks first
        PriorityQueue<Student5> pq = new PriorityQueue<>(new MarksComparator());
        pq.addAll(students);

        System.out.println("Top 3 highest scoring students:");
        for (int i = 0; i < 3 && !pq.isEmpty(); i++) {
            System.out.println(pq.poll());
        }
    }
}

