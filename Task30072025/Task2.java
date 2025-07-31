package wrappertasks;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(10.5);
        numbers.add(20.0);
        numbers.add(15.5);
        numbers.add(30.0);

        
        double sum = 0;
        for (double num : numbers) { 
            sum += num;
        }

        // Step 3: Calculate and display average
        double average = sum / numbers.size();

        System.out.println("Numbers: " + numbers);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}

