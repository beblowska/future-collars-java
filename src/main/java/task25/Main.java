package project;

public class Main {

    public static void main(String[] args) {
        EvenOddNumbersChecker checker = new EvenOddNumbersChecker();

        int number = 28;

        boolean isEven = checker.isEven(number);
        boolean isOdd = checker.isOdd(number);

        System.out.println("Twoja liczba jest parzysta: " + isEven);
        System.out.println("Twoja liczba jest nieparzysta: " + isOdd);
    }
}
