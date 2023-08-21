package task84;

public class Person extends PersonDetails implements Comparable<Person> {
    public Person(String firstName, String lastName, int birthYear, int height, int weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Person otherPerson) {
        return Integer.compare(this.birthYear, otherPerson.birthYear);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

}
