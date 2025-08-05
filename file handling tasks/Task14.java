package filehandlingtasks;

import java.io.*;

public class Task14 {

    public static void main(String[] args) {
        String file1 = "file1.txt";
        String file2 = "file2.txt";
        String mergedFile = "merged.txt";

        createFileIfNotExists(file1, new String[] {
            "Java is great.",
            "File handling is useful."
        });

        createFileIfNotExists(file2, new String[] {
            "Merging files is easy.",
            "Practice makes perfect."
        });

        mergeFiles(file1, file2, mergedFile);
    }

    
    private static void createFileIfNotExists(String fileName, String[] lines) {
        File file = new File(fileName);
        if (!file.exists()) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                for (String line : lines) {
                    writer.write(line);
                    writer.newLine();
                }
                System.out.println("✅ Created " + fileName);
            } catch (IOException e) {
                System.out.println("❌ Error creating " + fileName + ": " + e.getMessage());
            }
        }
    }


    private static void mergeFiles(String file1, String file2, String mergedFile) {
        try (
            BufferedReader reader1 = new BufferedReader(new FileReader(file1));
            BufferedReader reader2 = new BufferedReader(new FileReader(file2));
            BufferedWriter writer = new BufferedWriter(new FileWriter(mergedFile))
        ) {
            String line;


            while ((line = reader1.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }


            while ((line = reader2.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            System.out.println(" Files merged successfully into " + mergedFile);

        } catch (IOException e) {
            System.out.println(" Error while merging files: " + e.getMessage());
        }
    }
}

