package project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {
    @Test
    public void shouldBeRightTriangle() {
        boolean isRight = Triangle.isRightTriangle(3, 4, 5);
        Assertions.assertTrue(isRight);
    }

    @Test
    public void shouldBeNotRightTriangle() {
        boolean isRight = Triangle.isRightTriangle(2, 3, 4);
        Assertions.assertFalse(isRight);
    }
}
