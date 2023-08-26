package task63;

public class Main {
    public static void main(String[] args) {
        String filePath = "src/main/resources63/data.txt";
        int characterCount = CharacterCounter.countCharacters(filePath);
        if (characterCount != -1) {
            System.out.println("Number of characters: " + characterCount);
        } else {
            System.out.println("An error occurred while counting characters.");
        }
    }
}
