package task46;

public class Main {
    public static void main(String[] args) {
        BillCalculator billCalculator = new BillCalculator();

        double bill1 = 100.0;
        float service1 = 10.0f;
        double totalWithService =  billCalculator.calculate(bill1, service1);
        System.out.println("Total with service: " + totalWithService);

        double bill2 = 100.0;
        float service2 = 10.0f;
        double discount2 = 20.0;
        double totalWithDiscount = billCalculator.calculate(bill2, service2, discount2);
        System.out.println("Total with discount: " + totalWithDiscount);

        double bill3 = 100.0;
        float service3 = 10.0f;
        short takeaway3 = 5;
        double totalWithTakeaway = billCalculator.calculate(bill3, service3, takeaway3);
    }
}
