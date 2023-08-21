package task101;

import java.util.ArrayList;
import java.util.Optional;
import java.util.List;

public class PhoneBook {
    private List<Person> entries;

    public PhoneBook() {
        entries = new ArrayList<>();
    }

    public void addPerson(Person person) {
        entries.add(person);
    }

    public Optional<Person> searchByName(String fullName) {
        for (Person person : entries) {
            if (person.getFullName().equalsIgnoreCase(fullName)) {
                return Optional.of(person);
            }
        }
        return Optional.empty();
    }
}
