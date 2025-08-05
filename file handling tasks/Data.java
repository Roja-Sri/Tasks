package filehandlingtasks;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Data {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("data.txt"))) {
            writer.write("Java is awesome.\nI am learning Java!");
            System.out.println("data.txt created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

