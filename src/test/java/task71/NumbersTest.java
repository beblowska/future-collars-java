package task71;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.CsvSource;

public class NumbersTest {
    private final Numbers numbers = new Numbers();

    @ParameterizedTest
    @ValueSource(ints = {4})
    void testIsDivisibleByTwo(int number) {
        Assertions.assertTrue(numbers.isDividedByTwo(number));
    }

    @ParameterizedTest
    @CsvSource({"432, 9"})
    void testSumOfDigits(int number, int expectedSum) {
        Assertions.assertEquals(expectedSum, numbers.sumOfDigits(number));
    }
}
