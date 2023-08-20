package task63;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NumberOfCharacters {
    public static void main(String[] args) throws FileNotFoundException {
        String filePath = ("src/main/resources63/data.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            int characterCount = 0;
            int data;

            while ((data = reader.read()) != -1) {
                characterCount++;
            }

            System.out.println("Number of characters: " + characterCount);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
