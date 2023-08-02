package project;

public class Main {

    public static void main (String[] args) throws java.lang.Exception {

        Calculator calculator = new Calculator();

        int sum = calculator.sum(10,2);
        System.out.println("Suma: " + sum);

        int difference = calculator.subtract(10,2);
        System.out.println("Różnica: " + difference);

        int product = calculator.multiply(10,2);
        System.out.println("Iloczyn: " + product);

        int quotient = calculator.divide(10,2);
        System.out.println("Iloraz: " + quotient);

    }
}
