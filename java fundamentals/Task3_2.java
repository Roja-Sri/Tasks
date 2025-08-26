package javafundamentalstasks;

public class Task3_2 {
    public static void main(String[] args) {
        // Check if a name is provided
        if (args.length > 0) {
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } else {
            System.out.println("Hello, User!");
        }

        System.out.println("Today is a great day to code Java!");
    }
}

