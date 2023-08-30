package task33;

public class Manager extends BaseEmployee {
    private int bonus;

    public Manager(String firstName, String lastName, int basicSalary, int employmentYear, int bonus) {
        super(firstName, lastName, basicSalary, employmentYear);
        this.bonus = bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public int calculateMonthlySalary() {
        return getBasicSalary() + bonus;
    }
}
