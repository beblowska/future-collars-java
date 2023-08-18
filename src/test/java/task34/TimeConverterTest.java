package task34;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeConverterTest {
    @Test
    void testMinutesToSecondsPositive() {
        int result = TimeConverter.minutesToSeconds(5);
        assertEquals(300, result, "5 minutes should be equal to 300 seconds");
    }

    @Test
    void testMinutesToSecondsZero() {
        int result = TimeConverter.minutesToSeconds(0);
        assertEquals(0, result, "0 minutes should be equal to 0 seconds");
    }

    @Test
    void testMinutesToSecondsNegative() {
        int result = TimeConverter.minutesToSeconds(-3);
        assertEquals(-180, result, "-3 minutes should be equal to -180 seconds");
    }

}
