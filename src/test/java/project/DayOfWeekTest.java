package project;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class DayOfWeekTest {
    DayOfWeek dayOfWeek = new DayOfWeek();
    @Test
    public void testWeekdays() {

        // Day of week
        Assertions.assertEquals("Monday", dayOfWeek.getDayNumber(1));
        Assertions.assertEquals("Tuesday", dayOfWeek.getDayNumber(2));
        Assertions.assertEquals("Wednesday", dayOfWeek.getDayNumber(3));
        Assertions.assertEquals("Thursday", dayOfWeek.getDayNumber(4));
        Assertions.assertEquals("Friday", dayOfWeek.getDayNumber(5));

        // Weekend
        Assertions.assertEquals("Weekend", dayOfWeek.getDayNumber(6));
        Assertions.assertEquals("Weekend", dayOfWeek.getDayNumber(7));

        // Other
        Assertions.assertEquals("There is no such a day!", dayOfWeek.getDayNumber(8));
        Assertions.assertEquals("There is no such a day!", dayOfWeek.getDayNumber(10));
    }

}
