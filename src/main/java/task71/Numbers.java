package task71;

public class Numbers {
    public boolean isDividedByTwo(int number) {
        return number % 2 == 0;
    }

    public int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0){
        sum += number % 10;
        number /= 10;
    }
    return sum;
    }
}
