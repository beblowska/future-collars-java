package project;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EvenOddNumbersCheckerTest {

    @Test
    public void shouldTestEvenNumbers() {
        EvenOddNumbersChecker checker = new EvenOddNumbersChecker();
        assertTrue(checker.isEven(2));
        assertTrue(checker.isEven(20));
        assertTrue(checker.isEven(-10));
    }

    @Test
    public void shouldTestOddNumbers() {
        EvenOddNumbersChecker checker = new EvenOddNumbersChecker();
        assertTrue(checker.isOdd(3));
        assertTrue(checker.isOdd(15));
        assertTrue(checker.isOdd(-27));
    }

}
