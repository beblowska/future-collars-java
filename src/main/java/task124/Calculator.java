package task124;

import java.util.List;

public class Calculator {
    public static void calculate(List<Integer> numbers) {
        CalculationThread sumThread = new CalculationThread(numbers);
        CalculationThread averageThread = new CalculationThread(numbers);

        sumThread.start();
        averageThread.start();

        try {
            sumThread.join();
            averageThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Sum: " + sumThread.getSum());
        System.out.println("Average: " + averageThread.getAverage());
    }
}
