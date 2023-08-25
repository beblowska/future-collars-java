package task72;

public class Main {
    public static void main(String[] args) {
        TextConverter textConverter = new TextConverter();

        String input = "Hello!";
        String convertedText = textConverter.convertToUpperCase(input);

        System.out.println("Input: " + input);
        System.out.println("Converted: " + convertedText);
    }
}
