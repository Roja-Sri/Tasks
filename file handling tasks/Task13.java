package filehandlingtasks;

import java.io.*;

public class Task13 {

    public static void main(String[] args) {
        String inputFile = "data.txt";
        String outputFile = "output.txt";

        try (
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
        ) {
            String line;

            while ((line = reader.readLine()) != null) {
                String modifiedLine = line.replaceAll("Java", "Python");
                writer.write(modifiedLine);
                writer.newLine(); 
            }

            System.out.println(" Replacement completed. Output saved to " + outputFile);

        } catch (IOException e) {
            System.out.println(" Error processing the file.");
            e.printStackTrace();
        }
    }
}
