package task124;

import java.util.List;

public class CalculationThread extends Thread {
    private List<Integer> numbers;
    private double average;
    private int sum;

    public CalculationThread(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public double getAverage() {
        return average;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public void run() {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        sum = total;
        average = (double) total / numbers.size();
    }
}