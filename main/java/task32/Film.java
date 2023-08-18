package task32;

public class Film {
    private String title;
    private String director;
    private int filmTimeInMinutes;
    private int productionYear;

    public Film(String title, String director, int filmTimeInMinutes, int productionYear) {
        this. title = title;
        this.director = director;
        this.filmTimeInMinutes = filmTimeInMinutes;
        this.productionYear = productionYear;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getFilmTimeInMinutes() {
        return filmTimeInMinutes;
    }

    public int getProductionYear() {
        return productionYear;
    }
}
