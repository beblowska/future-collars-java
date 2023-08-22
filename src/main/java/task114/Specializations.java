package task114;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Specializations {
    public static List<String> extractSpecializations(List<String> inputList) {
        return inputList.stream()
                .flatMap(s -> Arrays.stream(s.split(":")))
                .skip(1)
                .distinct()
                .collect(Collectors.toList());
    }
}
