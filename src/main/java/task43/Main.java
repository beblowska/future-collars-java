package task43;

public class Main {
    public static void main(String[] args) {

        AreaAndPerimeter square = new Square(2);
        AreaAndPerimeter rectangle = new Rectangle(2,8);

        System.out.println("SQUARE");
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());

        System.out.println(" ");

        System.out.println("RECTANGLE");
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }
}
