package collectionstasks;
import java.util.*;

public class Task1_2 {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 2, 8, 1, 9, 3));
		
		// Ascending order
        Collections.sort(numbers);
        System.out.println("Ascending Order: " + numbers);

        // Descending order
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Descending Order: " + numbers);
		
		}

}
