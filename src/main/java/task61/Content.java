package task61;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Content {
    public static void main(String[] args) throws IOException {

        try {
            String text = Files.readString(Paths.get("src/main/resources/data.txt"));
            System.out.println(text);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}