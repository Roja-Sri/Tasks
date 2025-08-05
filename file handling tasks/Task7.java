package filehandlingtasks;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task7 {

    public static void main(String[] args) {
        String fileName = "app.log";

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String timestamp = now.format(formatter);

        String logEntry = "[" + timestamp + "] Application started";

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.write(logEntry);
            writer.newLine();  
            writer.close();

            System.out.println("Log entry written to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to log file.");
            e.printStackTrace();
        }
    }
}

