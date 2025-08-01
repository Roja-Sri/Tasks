package collectionstasks;

import java.util.*;

public class Task7_1 {
    public static void main(String[] args) {
        // Create and populate an ArrayList
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry", "Date"));

        // Print original list
        System.out.println("Original List: " + list);

        // Reverse the list
        Collections.reverse(list);

        // Print reversed list
        System.out.println("Reversed List: " + list);
    }
}
