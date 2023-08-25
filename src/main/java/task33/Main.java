package task33;

public class Main {
    public static void main(String[] args) {
        TicketSeller ticketSeller = new TicketSeller("John", "Dog", 3000, 2015);
        Manager manager = new Manager("Jane", "Cat", 5000, 2010, 500);

        System.out.println("Ticket Seller Salary: " + ticketSeller.calculateMonthlySalary());
        System.out.println("Manager Salary: " + manager.calculateMonthlySalary());

        System.out.println("Ticket Seller Years of Work: " + ticketSeller.getYearsOfWork());
        System.out.println("Manager Years of Work: " + manager.getYearsOfWork());
    }
}
