package filehandlingtasks;

import java.io.*;
import java.util.Scanner;

public class Task8 {

    private static final String FILE_NAME = "contacts.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Contact Manager ---");
            System.out.println("1. Add Contact");
            System.out.println("2. Display All Contacts");
            System.out.println("3. Search Contact by Name");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addContact(scanner);
                    break;
                case 2:
                    displayContacts();
                    break;
                case 3:
                    searchContact(scanner);
                    break;
                case 4:
                    System.out.println("Exiting Contact Manager. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter 1-4.");
            }
        } while (choice != 4);

        scanner.close();
    }

    // Option 1: Add contact
    private static void addContact(Scanner scanner) {
        System.out.print("Enter name: ");
        String name = scanner.nextLine().trim();

        System.out.print("Enter phone number: ");
        String phone = scanner.nextLine().trim();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(name + "," + phone);
            writer.newLine();
            System.out.println("Contact saved.");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
            e.printStackTrace();
        }
    }

    // Option 2: Display all contacts
    private static void displayContacts() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            System.out.println("No contacts found.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            System.out.println("\n--- All Contacts ---");
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    System.out.println("Name: " + parts[0] + " | Phone: " + parts[1]);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
            e.printStackTrace();
        }
    }

    // Option 3: Search contact by name
    private static void searchContact(Scanner scanner) {
        System.out.print("Enter name to search: ");
        String searchName = scanner.nextLine().trim().toLowerCase();
        boolean found = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            System.out.println("\n--- Search Results ---");
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2 && parts[0].toLowerCase().contains(searchName)) {
                    System.out.println("Name: " + parts[0] + " | Phone: " + parts[1]);
                    found = true;
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
            e.printStackTrace();
        }

        if (!found) {
            System.out.println("No contact found with the name \"" + searchName + "\".");
        }
    }
}

