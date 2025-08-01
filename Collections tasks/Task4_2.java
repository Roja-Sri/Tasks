package collectionstasks;
import java.util.ArrayList;
import java.util.ListIterator;

public class Task4_2 {
    public static void main(String[] args) {
        // Create and populate the list
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // Create a ListIterator
        ListIterator<String> iterator = colors.listIterator();

        // Forward traversal
        System.out.println("Forward Traversal:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Backward traversal
        System.out.println("\nBackward Traversal:");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}

