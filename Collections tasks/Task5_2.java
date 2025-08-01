package collectionstasks;
import java.util.*;

// Student3 class
class Student3 {
    String name;
    int marks;

    public Student3(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " - " + marks;
    }
}

// Comparator to sort Student3 objects by name
class NameComparator implements Comparator<Student3> {
    @Override
    public int compare(Student3 s1, Student3 s2) {
        return s1.name.compareToIgnoreCase(s2.name);  // Case-insensitive alphabetical order
    }
}

public class Task5_2 {
    public static void main(String[] args) {
        ArrayList<Student3> list = new ArrayList<>();
        list.add(new Student3("Clare", 90));
        list.add(new Student3("Bob", 72));
        list.add(new Student3("David", 78));
        list.add(new Student3("Alice", 85));

        // Sort using custom Comparator by name
        Collections.sort(list, new NameComparator());

        // Print the sorted list
        System.out.println("Students sorted by name (alphabetically):");
        for (Student3 s : list) {
            System.out.println(s);
        }
    }
}
