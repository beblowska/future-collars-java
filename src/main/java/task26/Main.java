package task26;

public class Main {

    public static void main(String[] args) {
        DayOfWeek dayOfWeek = new DayOfWeek();

        int dayNumber = 5;
        String dayOfWeekName = dayOfWeek.getWeekDay(dayNumber);

        System.out.println("Day of the week: " + dayOfWeekName);
    }
}
