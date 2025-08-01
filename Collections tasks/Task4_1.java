package collectionstasks;
import java.util.ArrayList;
import java.util.Iterator;

public class Task4_1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alex");
        names.add("Bob");
        names.add("Alice");
        names.add("Clare");
        names.add("Aman");

        // Use Iterator to remove names starting with 'A'
        Iterator<String> itr = names.iterator();
        while (itr.hasNext()) {
            String name = itr.next();
            if (name.startsWith("A")) {
                itr.remove();  // Safe removal during iteration
            }
        }

        // Print updated list
        System.out.println("Names after removing those starting with 'A':");
        System.out.println(names);
    }
}

