package collectionstasks;
import java.util.*;


public class Task1_3 {
	public static void main(String[] args) {
        List<String> languages = new ArrayList<>(Arrays.asList("Java", "C", "Java", "Python"));

        Set<String> uniqueLanguages = new LinkedHashSet<>(languages);

        // Print unique elements
        System.out.println("List after removing duplicates:");
        for (String lang : uniqueLanguages) {
            System.out.println(lang);
        }
    }
}
