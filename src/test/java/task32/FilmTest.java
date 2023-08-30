package task32;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class FilmTest {
    @Test
    public void shouldCreateFilm(){
        String title = "Pocahontas";
        String director = "Eric Goldberg, Mike Gabriel";
        int filmInMinutes = 81;
        int productionYear = 1995;

        Film film = new Film(title, director, filmInMinutes, productionYear);

        Assertions.assertEquals(title, film.getTitle());
        Assertions.assertEquals(director, film.getDirector());
        Assertions.assertEquals(filmInMinutes, film.getDurationInMinutes());
        Assertions.assertEquals(productionYear, film.getProductionYear());
    }
}
