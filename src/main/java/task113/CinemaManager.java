package task113;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CinemaManager {
    private List<CinemaHall> cinemaHalls;

    public CinemaManager() {
        cinemaHalls = new ArrayList<>();
        cinemaHalls.add(new CinemaHall("Hall 1", "2D"));
        cinemaHalls.add(new CinemaHall("Hall 2", "3D"));
        cinemaHalls.add(new CinemaHall("Hall 3", "4D"));
        cinemaHalls.add(new CinemaHall("Hall 4", "3D"));
        cinemaHalls.add(new CinemaHall("Hall 5", "2D"));
        cinemaHalls.add(new CinemaHall("Hall 6", "2D"));
        cinemaHalls.add(new CinemaHall("Hall 7", "4D"));
        cinemaHalls.add(new CinemaHall("Hall 8", "3D"));
        cinemaHalls.add(new CinemaHall("Hall 9", "2D"));
        cinemaHalls.add(new CinemaHall("Hall 10", "4D"));
    }

    public Map<HallType, Long> countHallsByType() {
        return cinemaHalls.stream()
                .collect(Collectors.groupingBy(CinemaHall::getType, Collectors.counting()));
    }
}
