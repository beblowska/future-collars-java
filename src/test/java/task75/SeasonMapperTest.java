package task75;

import java.time.Month;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class SeasonMapperTest {
    @Test
    public void testGetSeason() {
        assertEquals(Season.WINTER, SeasonMapper.mapToSeason(Month.DECEMBER));
        assertEquals(Season.WINTER, SeasonMapper.mapToSeason(Month.JANUARY));
        assertEquals(Season.WINTER, SeasonMapper.mapToSeason(Month.FEBRUARY));
        assertEquals(Season.SPRING, SeasonMapper.mapToSeason(Month.MARCH));
        assertEquals(Season.SPRING, SeasonMapper.mapToSeason(Month.APRIL));
        assertEquals(Season.SPRING, SeasonMapper.mapToSeason(Month.MAY));
        assertEquals(Season.SUMMER, SeasonMapper.mapToSeason(Month.JUNE));
        assertEquals(Season.SUMMER, SeasonMapper.mapToSeason(Month.JULY));
        assertEquals(Season.SUMMER, SeasonMapper.mapToSeason(Month.AUGUST));
        assertEquals(Season.FALL, SeasonMapper.mapToSeason(Month.SEPTEMBER));
        assertEquals(Season.FALL, SeasonMapper.mapToSeason(Month.OCTOBER));
        assertEquals(Season.FALL, SeasonMapper.mapToSeason(Month.NOVEMBER));
    }
}
