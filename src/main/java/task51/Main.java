package task51;

import static task51.TextProcessor.*;

public class Main {
    public static void main(String[] args) {
        String text = "Ala ma kota";

        if (containsAnyCharacters(text)) {
            System.out.println("The text contains character." + " " + text);

            if (isPalindrome(text)) {
                System.out.println("The text is palindrome");
            } else {
                System.out.println("The text is not a palindrome.");
            }
            int length = calculateLength(text);
            System.out.println("The length of the text is: " + length);
            } else {
            System.out.println("No text");
        }
    }
}
