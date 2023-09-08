package task60;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;

public class WriteToFile {
    public static void saveToFile(String content, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
