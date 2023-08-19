package task51;

public class TextProcessor {
    public static boolean containsAnyCharacters(String text) {
        return text != null && !text.isEmpty();
    }

    public static boolean isPalindrome(String text) {
        if (text == null) {
            return false;
        }

        text = text.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int left = 0;
        int right = text.length() -1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static int calculateLength(String text) {
        if (text == null) {
            return 0;
        }
        return text.length();
    }
}
