package task42;

public class Main {
    public static void main(String[] argv) {
        Shape square = new Square(5);
        Shape triangle = new Triangle (6, 4, 7,8,9);
        Shape circle = new Circle(2.0);
        Shape rectangle = new Rectangle(6.0, 8.0);

        System.out.println("SQUARE:");
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());

        System.out.println(" ");

        System.out.println("TRIANGLE:");
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());

        System.out.println(" ");

        System.out.println("CIRCLE:");
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        System.out.println(" ");

        System.out.println("RECTANGLE:");
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }
}
