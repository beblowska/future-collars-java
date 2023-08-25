package task84;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Person> people = new TreeSet<>();

        people.add(new Person("Max", "June", 1992, 180, 75));
        people.add(new Person("Kai", "Smith", 2005, 160, 55));
        people.add(new Person("John", "Dog", 2000, 190, 85));

        System.out.println("People sorted by birth year:");
        for (Person person : people) {
            System.out.println(person + " --- " + person.birthYear);
        }

        Set<Person> peopleByHeight = new TreeSet<>(Comparator.comparingInt(person -> person.height));
        peopleByHeight.addAll(people);

        System.out.println("\nPeople sorted by height:");
        for (Person person : peopleByHeight) {
            System.out.println(person + " --- " + person.height);
        }

        Set<Person> peopleByWeight = new TreeSet<>(Comparator.comparingInt(person -> person.weight));
        peopleByWeight.addAll(people);

        System.out.println("\nPeople sorted by weight:");
        for (Person person : peopleByWeight) {
            System.out.println(person + " ---- " + person.weight);
        }
    }
}