package filehandlingtasks;

import java.io.FileWriter;
import java.io.IOException;

public class Task1 {

    public static void main(String[] args) {
        String fileName = "info.txt";

        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Java I/O is powerful!\n");
            writer.close();

            FileWriter appender = new FileWriter(fileName, true);
            appender.write("Learn Java step-by-step");
            appender.close();

            System.out.println("File written successfully: " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing the file.");
            e.printStackTrace();
        }
    }
}

