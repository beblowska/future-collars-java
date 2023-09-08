package task63;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NumberOfCharacters {
    public static int countCharacters(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            int characterCount = 0;
            int data;

            while ((data = reader.read()) != -1) {
                characterCount++;
            }

            return characterCount;
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
