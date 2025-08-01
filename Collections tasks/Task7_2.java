package collectionstasks;

import java.util.*;

public class Task7_2 {
    public static void main(String[] args) {
        // Sample list of programming languages
        List<String> languages = Arrays.asList("Java", "Python", "C", "Java", "JavaScript", "Java");

        // Count how many times "Java" appears
        int count = Collections.frequency(languages, "Java");

        // Display the result
        System.out.println("\"Java\" appears " + count + " times.");
    }
}

