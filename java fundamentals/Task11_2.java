package javafundamentalstasks;

public class Task11_2 {
    public static void main(String[] args) {
        // Create StringBuffer and append sentence
        StringBuffer sb = new StringBuffer("Java is fun");

        System.out.println("Original: " + sb);

        // Append
        sb.append(" to learn!");
        System.out.println("After append: " + sb);

        // Insert
        sb.insert(5, "really ");
        System.out.println("After insert: " + sb);

        // Delete
        sb.delete(5, 12);
        System.out.println("After delete: " + sb);
    }
}
