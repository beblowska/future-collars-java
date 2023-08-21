package task106;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class DateOfBirth {
    private LocalDate birthDate;

    public DateOfBirth(String birthDateStr) {
        this.birthDate = LocalDate.parse(birthDateStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    public int calculateAge() {
        return LocalDate.now().getYear() - birthDate.getYear();
    }

    public DayOfWeek getDayOfWeek() {
        return birthDate.getDayOfWeek();
    }

    public int getWeekNumber() {
        WeekFields weekFields = WeekFields.of(Locale.getDefault());
        return birthDate.get(weekFields.weekOfWeekBasedYear());
    }
}
