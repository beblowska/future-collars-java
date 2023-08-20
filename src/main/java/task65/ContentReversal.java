package task65;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

public class ContentReversal {
    public static void main(String[] args) {
        String filePath = ("src/main/resources65/data.txt");
        Deque<String> lines = new ArrayDeque<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                lines.push(line);
            }

            while (!lines.isEmpty()) {
                System.out.println(lines.pop());
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
