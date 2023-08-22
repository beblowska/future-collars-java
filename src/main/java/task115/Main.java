package task115;

import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "berry", "table", "power");

        Set<Character> uniqueLetters = UniqueLetters.findUniqueLetters(words);

        System.out.println("Unique letters in the words:");
        for (char letter : uniqueLetters) {
            System.out.print(letter + " ");
        }
    }
}
