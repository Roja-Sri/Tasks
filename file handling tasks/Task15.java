package filehandlingtasks;

import java.io.File;
import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter directory path: ");
        String path = scanner.nextLine();

        File directory = new File(path);

        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();

            System.out.println("\nContents of: " + path);
            System.out.println("--------------------------------------------------");

            if (files != null && files.length > 0) {
                for (File file : files) {
                    String type = file.isDirectory() ? "Directory" : "File";
                    long size = file.length(); // size in bytes
                    System.out.printf("%-30s %-10s %10d bytes\n", file.getName(), type, size);
                }
            } else {
                System.out.println("Directory is empty.");
            }

        } else {
            System.out.println("Invalid directory path.");
        }

        scanner.close();
    }
}
