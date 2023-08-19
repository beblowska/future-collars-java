package task43;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreaAndPerimeterTest {
    @Test
    public void testSquare() {
        AreaAndPerimeter square = new Square(5.0);

        assertEquals(25, square.getArea());
        assertEquals(20, square.getPerimeter());
    }

    @Test
    public void testRectangle() {
        AreaAndPerimeter rectangle = new Rectangle(5.0, 8);

        assertEquals(40, rectangle.getArea());
        assertEquals(26, rectangle.getPerimeter());
    }
}

