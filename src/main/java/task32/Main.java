package task32;

public class Main {
    public static void main(String[] args) {

        Film film = new Film("Minions","Kyle Balda, Pierre Coffin", 90, 2015);

        System.out.println("Title: " + film.getTitle());
        System.out.println("Director: " + film.getDirector());
        System.out.println("Film time in minutes: " + film.getDurationInMinutes());
        System.out.println("Production year: " + film.getProductionYear());
    }
}
