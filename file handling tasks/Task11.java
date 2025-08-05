package filehandlingtasks;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {
        String fileName = "nonexistent.txt";

        try {
            File file = new File(fileName);
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }

            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Please check the file name.");
        }
    }
}

