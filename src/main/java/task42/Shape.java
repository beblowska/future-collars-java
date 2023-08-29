package task42;

public abstract class Shape {
    public abstract double getArea();
    public abstract double getPerimeter();
}

class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
}

class Triangle extends Shape {
    private double base;
    private double height;
    private double sideB;
    private double sideC;

    public Triangle(double base, double height, double sideB, double sideC) {
        this.base = base;
        this.height = height;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public double getPerimeter() {
        return base + sideB + sideC;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double getArea() {

        return length * width;
    }

    @Override
    public double getPerimeter() {

        return 2 * (length + width);
    }
}
