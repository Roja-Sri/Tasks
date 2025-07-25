
package tasks;

import java.util.*;

public class Task12 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jyoshna", "Radha", "Anil", "Hari", "Lavanya");

        // Print all names
        System.out.println("All names:");
        names.forEach(n -> System.out.println(n));

        // Filter names starting with "A"
        System.out.println("\nNames starting with A:");
        for (String name : names) {
            if (name.startsWith("A")) {
                System.out.println(name);
            }
        }

        // Sort names alphabetically
        System.out.println("\nSorted names:");
        List<String> sortedNames = new ArrayList<>(names);
        Collections.sort(sortedNames);
        sortedNames.forEach(n -> System.out.println(n));
    }
}

