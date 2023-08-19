package task46;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BillCalculatorTest {

    @Test
    public void shouldCalculateWithService() {
        BillCalculator billCalculator = new BillCalculator();

        double bill = 100.0;
        float service = 10.0f;
        double expectedTotal = 110.0;

        double actualTotal = billCalculator.calculate(bill, service);

        assertEquals(expectedTotal, actualTotal);
    }

    @Test
    public void shouldCalculateWithDiscount() {
        BillCalculator billCalculator = new BillCalculator();

        double bill = 100.0;
        float service = 10.0f;
        double discount = 20.0;
        double expectedTotal = 90.0;

        double actualTotal = billCalculator.calculate(bill, service, discount);

        assertEquals(expectedTotal, actualTotal);
    }
    @Test
    public void shouldCalculateWithTakeaway() {
        BillCalculator billCalculator = new BillCalculator();

        double bill = 100.0;
        float service = 10.0f;
        short takeaway = 5;
        double expectedTotal = 115.0;

        double actualTotal = billCalculator.calculate(bill, service, takeaway);

        assertEquals(expectedTotal, actualTotal);
    }
}
