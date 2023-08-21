package task68;

import task68.exceptions.IllegalLengthException;
import task68.exceptions.WrongTypeOfDataException;

import static task68.PeselValidator.validatePesel;

public class Main {
    public static void main(String[] args) {
        try {
            String pesel = "81020300068n";
            validatePesel(pesel);
            System.out.println("PESEL: " + pesel);
            System.out.println("PESEL validated successfully");
        } catch (WrongTypeOfDataException | IllegalLengthException exception) {
            System.out.println("Validation error: " + exception.getMessage());
        }
    }
}
