package task60;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        File file = new File("src/main/resources/data.txt");

        String fileName = file.getName();
        boolean isReadable = file.canRead();
        boolean exists = file.exists();

        String content = "Kurs\nJava\nLekcja 6\nPliki\nWyjątki\nPliki\nKoniec pliku";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("data.txt"))) {
            writer.write(content);

    } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
