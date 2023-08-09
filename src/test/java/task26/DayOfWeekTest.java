package task26;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class DayOfWeekTest {
    DayOfWeek dayOfWeek = new DayOfWeek();
    @Test
    public void testMonday() {
        Assertions.assertEquals("Monday", dayOfWeek.getWeekDay(1));
    }
    @Test
    public void testTuesday() {
        Assertions.assertEquals("Tuesday", dayOfWeek.getWeekDay(2));
    }

    @Test
    public void testWednesday() {
        Assertions.assertEquals("Wednesday", dayOfWeek.getWeekDay(3));
    }

    @Test
    public void testThursday() {
        Assertions.assertEquals("Thursday", dayOfWeek.getWeekDay(4));
    }

    @Test
    public void testFriday() {
        Assertions.assertEquals("Friday", dayOfWeek.getWeekDay(5));
    }

    @Test
    public void testSaturday() {
        Assertions.assertEquals("Weekend", dayOfWeek.getWeekDay(6));
    }

    @Test
    public void testSunday() {
        Assertions.assertEquals("Weekend", dayOfWeek.getWeekDay(7));
    }

    @Test
    public void testInvalidDay() {
        Assertions.assertEquals("There is no such a day!", dayOfWeek.getWeekDay(8));
    }
}