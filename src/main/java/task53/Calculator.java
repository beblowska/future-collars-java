package task53;

public class Calculator {
    private Operation operation;

    public Calculator(Operation operation) {
        this.operation = operation;
    }

    public double calculate(double operand1, double operand2) {
        return operation.calculate(operand1, operand2);
    }
}
