package project;

public class Triangle {
    public static boolean isRightTriangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0){
            return false;
        }
        double longestSide = Math.max(Math.max(a, b), c);
        double sumOfSquares = Math.pow(a, 2) + Math.pow (b, 2) + Math.pow(c, 2) - Math.pow(longestSide , 2);
        return sumOfSquares == Math.pow(longestSide, 2);
        }
}
