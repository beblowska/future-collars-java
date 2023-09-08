package task81;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NamesManipulation {
    public static List<String> removeDuplicates(List<String> inputList) {
        Set<String> uniqueNames = new HashSet<>(inputList);
        return new ArrayList<>(uniqueNames);
    }

    public static List<String> reverseList(List<String> inputList) {
        List<String> reversedList = new ArrayList<>(inputList);
        Collections.reverse(reversedList);
        return reversedList;
    }

        public static List<String> replaceName(List<String> inputList, String oldName, String newName) {
        List<String> modifiedList = new ArrayList<>(inputList);
        Collections.replaceAll(modifiedList, oldName, newName);
        return modifiedList;
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Anna");
        names.add("Katarzyna");
        names.add("Tymon");
        names.add("Tadeusz");
        names.add("Anna");
        names.add("Karolina");
        names.add("Dorota");
        names.add("Piotr");

        List<String> uniqueNames = removeDuplicates(names);
        System.out.println("No duplicates list: " + uniqueNames);

        List<String> reversedNames = reverseList(names);
        System.out.println("Reversed names list: " + reversedNames);

        String oldName = "Anna";
        String newName = "Joanna";
        List<String> modifiedNames = replaceName(names, oldName, newName);
        System.out.println("Modified elements " + oldName + " -> " + newName + ": " + modifiedNames);
    }
}
