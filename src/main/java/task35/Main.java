package task35;

public class Main {
    public static void main(String[] args) {
        double sideA = 3.0;
        double sideB = 4.0;
        double sideC = 5.0;

        boolean isRight = Triangle.isRightTriangle(sideA, sideB, sideC);

        System.out.println("Side A: " + sideA );
        System.out.println("Side B: " + sideB );
        System.out.println("Side C: " + sideC );

        if (isRight) {
            System.out.println("The given sides form a right triangle.");
        } else {
            System.out.println("The given sides do not form a right triangle.");
        }
    }
}
