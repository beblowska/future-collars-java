package task121;

import java.io.IOException;
import java.io.PrintWriter;

public class FileWriter {

    public static void saveToFile(String content, String fileName) throws IOException {
        try (PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
            writer.print(content);
        }
    }
}
