package task67;


import static task67.RootCalculator.calculateRoot;

public class Main {
    public static void main(String[] args) {
        try {
            double number = 25;
            double result = calculateRoot(number);
            System.out.println("Root of: " + number + " is: " + result);
        } catch (IllegalArgumentException exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }
}