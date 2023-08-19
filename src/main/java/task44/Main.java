package task44;

public class Main {
    public static void main(String[] args) {
        TextFormatter uppercaseFormatter = new UppercaseFormatter();
        TextFormatter lowercaseFormatter = new LowercaseFormatter();

        String text = "Hello";

        System.out.println("Uppercase: " + uppercaseFormatter.formatText(text));
        System.out.println("Lowercase: " + lowercaseFormatter.formatText(text));
    }
}
