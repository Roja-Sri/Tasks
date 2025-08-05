package filehandlingtasks;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "userdata.txt";

        try {
            // Take user input
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.print("Enter your email: ");
            String email = scanner.nextLine();

            System.out.print("Enter your address: ");
            String address = scanner.nextLine();

            // Write input to file
            FileWriter writer = new FileWriter(fileName);
            writer.write("Name: " + name + "\n");
            writer.write("Email: " + email + "\n");
            writer.write("Address: " + address + "\n");

            writer.close();
            System.out.println("User data saved to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}

