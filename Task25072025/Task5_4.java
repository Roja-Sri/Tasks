package Task;

public class Task5_4 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};

        try {
            int result = numbers[3] / 0; 
            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: You tried to access an invalid array index.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }

        System.out.println("Program continues after handling exceptions.");
    }
}
