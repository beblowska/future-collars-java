package task42;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeTest {

    @Test
    public void testSquare() {
        Shape square = new Square(4.0);

        assertEquals(16.0, square.getArea());
        assertEquals(16.0, square.getPerimeter());
    }

    @Test
    public void testTriangle() {
        Shape triangle = new Triangle(5.0, 3.0, 4.0, 4.0);

        assertEquals(7.5, triangle.getArea());
        assertEquals(13.0, triangle.getPerimeter());
    }

    @Test
    public void testCircle() {
        Shape circle = new Circle(3.0);

        assertEquals(28.27, circle.getArea(), 0.01);
        assertEquals(18.84, circle.getPerimeter(), 0.01);
    }

    @Test
    public void testRectangle() {
        Shape rectangle = new Rectangle(6.0, 4.0);

        assertEquals(24, rectangle.getArea());
        assertEquals(20, rectangle.getPerimeter());
    }
}
