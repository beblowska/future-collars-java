package task48;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @Test
    public void shouldBeEqual() {
        Person person1 = new Person("Adam", 30);
        Person person2 = new Person("Adam", 30);

        assertEquals(person1, person2);
        assertEquals(person2, person1);
        assertEquals(person1, person1);
    }

    @Test
    public void shouldNotBeEqual() {
        Person person1 = new Person("Adam", 30);
        Person person3 = new Person("Alicja", 25);

        assertNotEquals(person1, person3);
        assertNotEquals(person3, person1);
    }
    @Test
    public void shouldBedHashCodeForEqualPersons() {
        Person person1 = new Person("Adam", 30);
        Person person2 = new Person("Adam", 30);

        assertEquals(person1.hashCode(), person2.hashCode());
    }

    @Test
    public void shouldBeHashCodeForDifferentPersons() {
        Person person1 = new Person("Adam", 30);
        Person person3 = new Person("Alicja", 25);

        assertNotEquals(person1.hashCode(), person3.hashCode());
    }
}
