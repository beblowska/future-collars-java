package project;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void shouldSum() {
        int sum = Calculator.sum(1,2);

        Assertions.assertEquals(3, sum);
    }

    @Test
    void shouldSubtract() {
        int subtract = Calculator.subtract(5,2);

        Assertions.assertEquals(3, subtract);
    }

    @Test
    void shouldMultiply() {
        int multiply = Calculator.multiply(5,2);

        Assertions.assertEquals(10, multiply);
    }

    @Test
    void shouldDivide() {
        int divide = Calculator.divide(10, 2);

        Assertions.assertEquals(5, divide);
    }
}
