package task64;

public class Main {
  public static void main(String[] args) {
        String filePath = "src/main/resources64/data.txt";
        String searchWord = "Java";

        System.out.println("Search word: " + searchWord);

        int wordCount = countOccurrences(filePath, searchWord);
        System.out.println("Word search: " + searchWord);
        System.out.println("Word found " + wordCount + " times.");
    }
}
