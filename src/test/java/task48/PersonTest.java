package task48;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @Test
    public void testEquals() {
        Person person1 = new Person("Adam", 30);
        Person person2 = new Person("Adam", 30);
        Person person3 = new Person("Alicja", 25);

        assertTrue(person1.equals(person2));
        assertTrue(person2.equals(person1));

        assertFalse(person1.equals(person3));
        assertFalse(person3.equals(person1));

        assertTrue(person1.equals(person1));
    }

    @Test
    public void testHashCode() {
        Person person1 = new Person("Adam", 30);
        Person person2 = new Person("Adam", 30);
        Person person3 = new Person("Alicja", 25);

        assertEquals(person1.hashCode(), person2.hashCode());

        assertNotEquals(person1.hashCode(), person3.hashCode());
    }
}
