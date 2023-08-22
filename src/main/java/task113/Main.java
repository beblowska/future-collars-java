package task113;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        CinemaManager cinemaManager = new CinemaManager();

        Map<String, Long> hallCountByType = cinemaManager.countHallsByType();

        System.out.println("Cinema Halls by type:");
        hallCountByType.forEach((type, count) -> System.out.println(type + ": " + count));
    }
}
