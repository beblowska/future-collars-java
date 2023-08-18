package task32;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmTest {
    @Test
    public void testFilm(){
        String title = "Pocahontas";
        String director = "Eric Goldberg, Mike Gabriel";
        int filmInMinutes = 81;
        int productionYear = 1995;

        Film film = new Film(title, director, filmInMinutes, productionYear);

        Assertions.assertEquals(title, film.getTitle());
        Assertions.assertEquals(director, film.getDirector());
        Assertions.assertEquals(filmInMinutes, film.getFilmTimeInMinutes());
        Assertions.assertEquals(productionYear, film.getProductionYear());
    }
}
