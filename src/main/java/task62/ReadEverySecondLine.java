package task62;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadEverySecondLine {
    public static void main(String[] args) {
        String filePath = ("src/main/resources/data.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineCount = 1;

            while ((line = reader.readLine()) != null) {
                if (lineCount % 2 == 0) {
                    System.out.println(line);
                }
                lineCount++;
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}