package task71;

public class Main {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();

        int number = 24;
        boolean isDividedByTwo = numbers.isDividedByTwo(number);
        System.out.println(number + " is divisible by two: " + isDividedByTwo);

        int sum = numbers.sumOfDigits(number);
        System.out.println("Sum of digits in " + number + " : " + sum);

    }
}
