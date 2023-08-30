package task33;

abstract class BaseEmployee {
    private String firstName;
    private String lastName;
    private int basicSalary;
    private int employmentYear;

    public BaseEmployee(String firstName, String lastName, int basicSalary, int employmentYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.basicSalary = basicSalary;
        this.employmentYear = employmentYear;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public int getEmploymentYear() {
        return employmentYear;
    }

    public int getYearsOfWork() {
        int currentYear = 2023;
        return currentYear - employmentYear;
    }

    public abstract int calculateMonthlySalary();
}


