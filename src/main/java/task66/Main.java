package task66;

import static task66.ConvertToUpperCase.processFile;

public class Main {
    public static void main(String[] args) {
        String inputFilePath = "src/main/resources66/data.txt";
        String outputFilePath = "src/main/resources66/output.txt";

        processFile(inputFilePath, outputFilePath);
    }
}
