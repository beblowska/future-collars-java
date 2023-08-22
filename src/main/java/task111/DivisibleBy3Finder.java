package task111;

import java.util.stream.IntStream;

public class DivisibleBy3Finder {
    public static IntStream findDivisibleBy3(int start, int end) {
        return IntStream.rangeClosed(start, end)
                .filter(n -> n % 3 == 0);
    }
}
