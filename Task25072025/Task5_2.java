package Task;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task5_2 {
    public static void main(String[] args) {
        Scanner fileScanner = null;

        try {
            File file = new File("data.txt");  
            fileScanner = new Scanner(file);

            System.out.println("Reading file contents:");
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } finally {
            if (fileScanner != null) {
                fileScanner.close();  
                System.out.println("File scanner closed.");
            }
        }
    }
}

