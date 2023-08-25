package task32;

public class Film {
    private final String title;
    private final String director;
    private final int durationInMinutes;
    private final int productionYear;

    public Film(String title, String director, int filmTimeInMinutes, int productionYear) {
        this. title = title;
        this.director = director;
        this.durationInMinutes = filmTimeInMinutes;
        this.productionYear = productionYear;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public int getProductionYear() {
        return productionYear;
    }
}
