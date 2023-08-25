package task53;

import task53.math.Add;
import task53.math.Division;
import task53.math.Multiplication;
import task53.math.Subtraction;

public class Main {
    public static void main(String[] args) {
        Operation addition = new Add();
        Operation subtraction = new Subtraction();
        Operation multiplication = new Multiplication();
        Operation division = new Division();

        Calculator calculator = new Calculator(addition);

        double resultAdd = calculator.calculate(10, 2);
        System.out.println("Addition result: " + resultAdd);

        calculator = new Calculator(subtraction);
        double resultSub = calculator.calculate(10, 2);
        System.out.println("Subtraction result: " + resultSub);

        calculator = new Calculator(multiplication);
        double resultMulti = calculator.calculate(10, 2);
        System.out.println("Multiplication result: " + resultMulti);

        calculator = new Calculator(division);
        double resultDiv = calculator.calculate(10, 2);
        System.out.println("Division result: " + resultDiv);
    }
}


