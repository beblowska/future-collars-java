package task114;

import java.util.Arrays;
import java.util.List;

import static task114.Specializations.extractSpecializations;

public class Main {
    public static void main(String[] args) {
        List<String> inputList = Arrays.asList(
                "Szpital:Chirurg:Radiolog:Chirurg Szczękowy:Pediatra",
                "Przychodnia:Pediatra",
                "Przychodnia:Internista:Laryngolog:Pediatra"
        );

        List<String> uniqueSpecializations = extractSpecializations(inputList);

        System.out.println("Unique specializations:");
        uniqueSpecializations.forEach(System.out::println);
    }
}
