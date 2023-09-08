package task113;

public class CinemaHall {
    private String name;
    private HallType type;

    public CinemaHall(String name, HallType type) {
        this.name = name;
        this.type = type;
    }

    public HallType getType() {
        return type;
    }
}
