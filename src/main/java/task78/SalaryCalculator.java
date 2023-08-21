package task78;

import task78.interfaces.BasicSalary;
import task78.interfaces.SaturdayBonus;

public class SalaryCalculator {
    private final BasicSalary basicSalaryProvider;
    private final SaturdayBonus saturdayBonusProvider;

    public SalaryCalculator(BasicSalary basicSalaryProvider, SaturdayBonus saturdayBonusProvider) {
        this.basicSalaryProvider = basicSalaryProvider;
        this.saturdayBonusProvider = saturdayBonusProvider;
    }

    public double calculateSalary(int numberOfSaturdays, double onTimeBonus) {
        double baseSalary = basicSalaryProvider.getBasicSalary();
        double saturdayBonus = saturdayBonusProvider.getSaturdayBonus();

        return baseSalary + onTimeBonus + (saturdayBonus * numberOfSaturdays);
    }
}
