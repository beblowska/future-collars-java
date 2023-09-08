package task75;

import java.time.Month;

enum Season {
    WINTER, SPRING, SUMMER, FALL
}

public class SeasonMapper {

    public static Season mapToSeason(Month month) {
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
