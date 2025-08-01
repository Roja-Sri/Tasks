package collectionstasks;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Task3_3 {
    public static void main(String[] args) {
        // Unsorted HashMap
        HashMap<Integer, String> unsortedMap = new HashMap<>();
        unsortedMap.put(3, "Banana");
        unsortedMap.put(1, "Apple");
        unsortedMap.put(4, "Mango");
        unsortedMap.put(2, "Grapes");

        // Convert to TreeMap to sort by keys
        TreeMap<Integer, String> sortedMap = new TreeMap<>(unsortedMap);

        // Print the sorted map
        System.out.println("Sorted Map by Keys:");
        for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}

