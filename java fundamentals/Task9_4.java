package javafundamentalstasks;

import java.util.Scanner;

public class Task9_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter a positive number (enter 1 to stop): ");
            number = sc.nextInt();
            if (number != 1) {
                System.out.println("You entered: " + number);
            }
        } while (number != 1);

        System.out.println("Program stopped. You entered 1.");
        sc.close();
    }
}

