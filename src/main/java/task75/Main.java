package task75;

import java.time.Month;

import static task75.SeasonMapper.mapToSeason;

public class Main {
    public static void main(String[] args) {
        Month currentMonth = Month.AUGUST;
        Season season = mapToSeason(currentMonth);
        System.out.println("Month: " + currentMonth + " Season: " + season);
    }
}
