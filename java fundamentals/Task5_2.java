package javafundamentalstasks;

public class Task5_2 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java javafundamentalstasks.Task5_2 <string>");
            return;
        }

        String input = args[0];
        String reversed = "";

        // Reverse the string manually
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    }
}

