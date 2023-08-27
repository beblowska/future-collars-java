package task101;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/phonebook_data.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String searchName = "Emilia Wąs";
        Optional<Person> searchResult = phoneBook.searchByName(searchName);

        if (searchResult.isPresent()) {
            Person person = searchResult.get();
            System.out.println("Found person:");
            System.out.println("Name: " + person.getFullName());
            System.out.println("Phone Number: " + person.getPhoneNumber());
            System.out.println("Address: " + person.getAddress());
        } else {
            System.out.println("Person not found.");
        }
    }
}
