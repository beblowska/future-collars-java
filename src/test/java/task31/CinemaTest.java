package task31;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CinemaTest {

    @Test
    public void testSeatInitialization() {
        int seatNumber = 1;
        int rowNumber = 2;

        Cinema cinema = new Cinema(seatNumber, rowNumber);

        Assertions.assertEquals(seatNumber, cinema.getSeatNumber());
        Assertions.assertEquals(rowNumber, cinema.getRowNumber());
        Assertions.assertFalse(cinema.isOccupied());
    }


    @Test
    public void testOccupySeat() {
        Cinema cinema = new Cinema(1, 2);

        Assertions.assertFalse(cinema.isOccupied());

        cinema.occupy();

        Assertions.assertTrue(cinema.isOccupied());
    }

    @Test
    public void testReleaseSeat() {
        Cinema cinema = new Cinema(1, 2);

        cinema.occupy();
        Assertions.assertTrue(cinema.isOccupied());

        cinema.free();

        Assertions.assertFalse(cinema.isOccupied());
    }
}
