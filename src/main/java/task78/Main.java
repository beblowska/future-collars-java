package task78;

import task78.interfaces.BasicSalary;
import task78.interfaces.SaturdayBonus;
import task78.providers.BasicSalaryProvider;
import task78.providers.SaturdayBonusProvider;

public class Main {
    public static void main(String[] args) {
        BasicSalary basicSalaryProvider = new BasicSalaryProvider();
        SaturdayBonus saturdayBonusProvider = new SaturdayBonusProvider();

        SalaryCalculator salaryCalculator = new SalaryCalculator(basicSalaryProvider, saturdayBonusProvider);

        int numberOfSaturdays = 4;
        double onTimeBonus = 200.0;

        double calculatedSalary = salaryCalculator.calculateSalary(numberOfSaturdays, onTimeBonus);

        System.out.println("Employee salary: " + calculatedSalary);
    }
}