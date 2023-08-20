package task64;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordSearch {
    public static void main(String[] args) {
        String filePath = "src/main/resources64/data.txt";
        String searchWord = "Java";
        int wordCount = 0;

        System.out.println("Search word: " + searchWord);

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;


            while ((line = reader.readLine()) != null) {
                if (line.contains(searchWord)) {
                    wordCount++;
                    System.out.println("Word found " + wordCount + " times.");
                }
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
