package task47;

public class Main {
    public static void main(String[] args) {

        DayConverter dayConverter = new DayConverter();

        DayOfWeek dayOfWeek1 = DayOfWeek.MONDAY;
        String dayName1 = dayConverter.getDayName(dayOfWeek1);
        System.out.println("Day of week: " + dayName1);

        DayOfWeek dayOfWeek2 = DayOfWeek.TUESDAY;
        String dayName2 = dayConverter.getDayName(dayOfWeek2);
        System.out.println("Day of week: " + dayName2);
    }
}
