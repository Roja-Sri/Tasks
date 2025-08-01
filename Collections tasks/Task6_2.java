package collectionstasks;

import java.util.*;
import java.util.stream.Collectors;

public class Task6_2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6);

        // Use Stream API to square each number
        List<Integer> squared = numbers.stream()
                                       .map(n -> n * n)
                                       .collect(Collectors.toList());

        // Print the result
        System.out.println("Original numbers: " + numbers);
        System.out.println("Squared numbers: " + squared);
    }
}
