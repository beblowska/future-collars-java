package task72;

public class TextConverter {
    public String convertToUpperCase(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Invalid input.");
        }
        return text.toUpperCase();
    }
}

