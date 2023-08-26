package task64;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordSearch {
    public static int countOccurrences(String filePath, String searchWord) {
        int wordCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                if (line.contains(searchWord)) {
                    wordCount++;
                }
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        return wordCount;
}
