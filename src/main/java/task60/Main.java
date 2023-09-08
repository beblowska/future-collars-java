package task60;

import static task60.WriteToFile.saveToFile;

public class Main {
    public static void main(String[] args) {
        String content = "Kurs\nJava\nLekcja 6\nPliki\nWyjątki\nPliki\nKoniec pliku";
        String filePath = "src/main/resources/data.txt";
        saveToFile(content, filePath);
    }
}
