package task104;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberExtractor {
    public List<String> extractIntegers(String text) {
        List<String> integers = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\b\\d+\\b");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            integers.add(matcher.group());
        }

        return integers;
    }

    public List<String> extractFloats(String text) {
        List<String> floats = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\b\\d+\\.\\d+\\b");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            floats.add(matcher.group());
        }

        return floats;
    }

    public List<String> extractScientificNotations(String text) {
        List<String> scientificNotations = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\b\\d+(\\.\\d+)?[eE][+-]?\\d+\\b");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            scientificNotations.add(matcher.group());
        }

        return scientificNotations;
    }
}
