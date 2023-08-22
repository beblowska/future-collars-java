package task115;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueLetters {
    public static Set<Character> findUniqueLetters(List<String> words) {
        Set<Character> uniqueLetters = new HashSet<>();

        for (String word : words) {
            char[] letters = word.toCharArray();
            for (char letter : letters) {
                if (Character.isLetter(letter)) {
                    uniqueLetters.add(Character.toUpperCase(letter));
                }
            }
        }

        return uniqueLetters;
    }
}
