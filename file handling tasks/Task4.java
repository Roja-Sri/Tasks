package filehandlingtasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task4 {

    public static void main(String[] args) {
        String sourceFile = "info.txt";
        String destinationFile = "copy.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
            FileWriter writer = new FileWriter(destinationFile);

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line + "\n");  
            }

            reader.close();
            writer.close();

            System.out.println("Content copied successfully to " + destinationFile);
        } catch (IOException e) {
            System.out.println("An error occurred while copying the file.");
            e.printStackTrace();
        }
    }
}

