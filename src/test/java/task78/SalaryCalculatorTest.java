package task78;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import task78.interfaces.BasicSalary;
import task78.interfaces.SaturdayBonus;

public class SalaryCalculatorTest {
    @Test
    public void shouldCalculateSalary() {
        BasicSalary basicSalaryProvider = mock(BasicSalary.class);
        SaturdayBonus saturdayBonusProvider = mock(SaturdayBonus.class);

        when(basicSalaryProvider.getBasicSalary()).thenReturn(2000.0);
        when(saturdayBonusProvider.getSaturdayBonus()).thenReturn(50.0);

        SalaryCalculator salaryCalculator = new SalaryCalculator(basicSalaryProvider, saturdayBonusProvider);

        double result = salaryCalculator.calculateSalary(4, 100.0);

        assertEquals(2300.0, result, 0.01);
    }
}
