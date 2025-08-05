package filehandlingtasks;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Task9 {

    public static void main(String[] args) {
        String fileName = "sample.txt"; 
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("File does not exist: " + fileName);
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = reader.readLine()) != null) {
                lineCount++;
          
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }

                String noSpaces = line.replaceAll("\\s+", "");
                charCount += noSpaces.length();
            }

            System.out.println("Analysis of '" + fileName + "'");
            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters (excluding spaces): " + charCount);

        } catch (IOException e) {
            System.out.println(" Error reading file: " + fileName);
            e.printStackTrace();
        }
    }
}
