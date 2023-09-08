package task115;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueLetters {
    public static Set<Character> findUniqueLetters(List<String> words) {
         return words.stream()
                .flatMap(word -> word.chars().mapToObj(ch -> (char) ch))
                .filter(Character::isLetter)
                .map(Character::toUpperCase)
                .collect(Collectors.toSet());
    }
}
