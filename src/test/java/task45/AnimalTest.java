package task45;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalTest {

    @Test
    public void testGetName() {
        Animal animal = new Animal("Peper");

        assertEquals("Peper", animal.getName());
    }
}
