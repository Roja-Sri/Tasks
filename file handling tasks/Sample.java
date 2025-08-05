package filehandlingtasks;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Sample {

    public static void main(String[] args) {
        String fileName = "sample.txt";
        String content = """
                Java is fun
                Learn it well
                Practice every day
                Be confident
                """;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
            System.out.println("sample.txt created successfully.");
        } catch (IOException e) {
            System.out.println("Error creating sample.txt");
            e.printStackTrace();
        }
    }
}

