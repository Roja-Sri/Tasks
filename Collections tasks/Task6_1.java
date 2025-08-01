package collectionstasks;

import java.util.*;
import java.util.stream.Collectors;

public class Task6_1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "James", "Bob", "Jack", "Clare");

        // Use Stream API to filter names starting with "J"
        List<String> filtered = names.stream()
                                     .filter(name -> name.startsWith("J"))
                                     .collect(Collectors.toList());

        // Print the result
        System.out.println("Names starting with 'J': " + filtered);
    }
}
