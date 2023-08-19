package task49;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {

    @Test
    public void testToString() {
        Triangle triangle = new Triangle(5.0, 7.0);
        String expectedString = "Triangle{width=5.0, height=7.0}";
        assertEquals(expectedString, triangle.toString());
    }
}
