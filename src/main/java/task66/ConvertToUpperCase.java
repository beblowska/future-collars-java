package task66;

import java.io.*;

public class ConvertToUpperCase {
    public static void main(String[] args) {
        String inputFilePath = ("src/main/resources66/data.txt");
        String outputFilePath = ("src/main/resources66/output.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

                String line;

                while ((line = reader.readLine()) != null) {
                    String upperCase = line.toUpperCase();
                    writer.write(upperCase);
                    writer.newLine();
                    System.out.println(" ");
                    System.out.println("Original: " + line);
                    System.out.println("Uppercase: " + upperCase);
                }

            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
