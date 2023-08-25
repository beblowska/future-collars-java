package task78.providers;

import task78.interfaces.BasicSalary;

public class BasicSalaryProvider implements BasicSalary {
    @Override
    public double getBasicSalary() {
        return 3000.0;
    }
}
