package javafundamentalstasks;

public class Task11_1 {
    public static void main(String[] args) {
        String text = "JavaProgramming";

        // Length
        System.out.println("Length of string: " + text.length());

        // Uppercase & Lowercase
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());

        // Substring
        System.out.println("Substring (0 to 4): " + text.substring(0, 4));

        // Index of a character
        System.out.println("Index of 'P': " + text.indexOf('P'));
    }
}
