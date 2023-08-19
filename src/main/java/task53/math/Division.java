package task53.math;

import task53.Operation;

public class Division implements Operation {
    @Override
    public double calculate(double operand1, double operand2) {
        return operand1 / operand2;
    }
}

