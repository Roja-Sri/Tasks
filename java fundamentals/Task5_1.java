package javafundamentalstasks;

public class Task5_1 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java javafundamentalstasks.Task5_1 <num1> <num2>");
            return;
        }

        // Convert command-line arguments (Strings) to integers
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        int sum = num1 + num2;

        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        System.out.println("Sum: " + sum);
    }
}

