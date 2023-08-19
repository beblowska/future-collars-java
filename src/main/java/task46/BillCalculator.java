package task46;

public class BillCalculator {

    // Wartość rachunku + opłata serwisowa
    public double calculate(double bill, float service) {
        return bill + service;
    }

    // Wartość rachunku + opata serwisowa + zniżka
    public double calculate(double bill, float service, double discount) {
        return (bill - discount) + service;
    }

    // Wartość rachunku + opłata serwisowa + opakowanie
    public double calculate(double bill, float service, short takeaway) {
        return bill + service + takeaway;
    }
}
