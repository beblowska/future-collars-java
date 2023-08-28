package task75;

import java.time.Month;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class SeasonMapperTest {
    @ParameterizedTest
    @EnumSource(Month.class)
    public void testGetSeason(Month month) {
        Season expectedSeason = mapMonthToSeason(month);
        assertEquals(expectedSeason, SeasonMapper.mapToSeason(month));
    }

    private Season mapMonthToSeason(Month month) {
        switch (month) {
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                return Season.WINTER;
            case MARCH:
            case APRIL:
            case MAY:
                return Season.SPRING;
            case JUNE:
            case JULY:
            case AUGUST:
                return Season.SUMMER;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                return Season.FALL;
            default:
                throw new IllegalArgumentException("Invalid month.");
        }
    }
}
