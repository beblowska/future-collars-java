package task51;

public class TextProcessor {
    public static void processText(String text) {
        if (containsAnyCharacters(text)) {
            System.out.println("The text contains characters: " + text);

            if (isPalindrome(text)) {
                System.out.println("The text is palindrome.");
            } else {
                System.out.println("The text is not a palindrome.");
            }

            int length = calculateLength(text);
            System.out.println("The length of the text is: " + length);
        } else {
            System.out.println("No text.");
        }
    }

    private static boolean containsAnyCharacters(String text) {
        return text != null && !text.isEmpty();
    }

    private static boolean isPalindrome(String text) {
        if (text == null) {
            return false;
        }

        text = text.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private static int calculateLength(String text) {
        if (text == null) {
            return 0;
        }
        return text.length();
    }
}
