package task104;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String text = "342\n" +
                "5.34\n" +
                "756\n" +
                "1.234e+07\n" +
                "7.234243E-02\n" +
                "6.09\n" +
                "3457\n" +
                "87\n" +
                "1.0001\n" +
                "3\n" +
                "5";

        NumberExtractor extractor = new NumberExtractor();

        List<String> integers = extractor.extractIntegers(text);
        System.out.println("Integers: " + integers);

        List<String> floats = extractor.extractFloats(text);
        System.out.println("Floats: " + floats);

        List<String> scientificNotations = extractor.extractScientificNotations(text);
        System.out.println("Scientific Notations: " + scientificNotations);
    }
}
