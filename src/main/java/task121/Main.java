package task121;

import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Use: java Main <URL> <file name>");
            return;
        }

        String url = args[0];
        String fileName = args[1];

        try {
            String content = WebPageDownloader.downloadWebPage(url);
            FileWriter.saveToFile(content, fileName);
            System.out.println("The page content is downloaded and saved.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}