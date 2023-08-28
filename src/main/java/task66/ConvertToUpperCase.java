package task66;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ConvertToUpperCase {
    public static void processFile(String inputFilePath, String outputFilePath) {
        List<String> lines = readLines(inputFilePath);
        List<String> uppercasedLines = mapToUppercase(lines);
        saveLines(outputFilePath, uppercasedLines);
    }

    private static List<String> readLines(String filePath) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return lines;
    }

    private static List<String> mapToUppercase(List<String> lines) {
        List<String> uppercasedLines = new ArrayList<>();
        for (String line : lines) {
            uppercasedLines.add(line.toUpperCase());
        }
        return uppercasedLines;
    }

    private static void saveLines(String filePath, List<String> lines) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
