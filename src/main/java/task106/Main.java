package task106;

import java.time.DayOfWeek;

public class Main {
    public static void main(String[] args) {
        String birthDateStr = "1995-06-23";
        DateOfBirth dateOfBirth = new DateOfBirth(birthDateStr);

        int age = dateOfBirth.calculateAge();
        DayOfWeek dayOfWeek = dateOfBirth.getDayOfWeek();
        int weekNumber = dateOfBirth.getWeekNumber();

        System.out.println("Date of birth: " + birthDateStr);
        System.out.println("Age: " + age);
        System.out.println("Day of the week: " + dayOfWeek);
        System.out.println("Week of the year: " + weekNumber);
    }
}
