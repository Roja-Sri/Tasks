package collectionstasks;
import java.util.HashMap;

public class Task3_2 {
    public static void main(String[] args) {
        String input = "hello";
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        // Count frequency of each character
        for (char ch : input.toCharArray()) {
            if (frequencyMap.containsKey(ch)) {
                frequencyMap.put(ch, frequencyMap.get(ch) + 1);
            } else {
                frequencyMap.put(ch, 1);
            }
        }

        // Print the frequency map
        System.out.println(frequencyMap);
    }
}

