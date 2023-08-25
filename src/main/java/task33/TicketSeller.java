package task33;

public class TicketSeller extends BaseEmployee {
    public TicketSeller(String firstName, String lastName, int basicSalary, int employmentYear) {
        super(firstName, lastName, basicSalary, employmentYear);
    }

    @Override
    public int calculateMonthlySalary() {
        return getBasicSalary();
    }
}
