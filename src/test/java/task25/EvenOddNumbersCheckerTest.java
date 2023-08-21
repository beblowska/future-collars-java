package task25;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class EvenOddNumbersCheckerTest {

    @Test
    public void shouldTestEvenNumbers() {
        EvenOddNumbersChecker checker = new EvenOddNumbersChecker();
        assertTrue(checker.isEven(2));
    }

    @Test
    public void shouldTestOddNumbers() {
        EvenOddNumbersChecker checker = new EvenOddNumbersChecker();
        assertTrue(checker.isOdd(3));
    }

}
