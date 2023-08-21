package task68;

import task68.exceptions.WrongTypeOfDataException;
import task68.exceptions.IllegalLengthException;

public class PeselValidator {
    public static void validatePesel(String pesel) throws WrongTypeOfDataException, IllegalLengthException {
        if (pesel == null || !pesel.matches("\\d+")) {
            throw new WrongTypeOfDataException("PESEL must be a numeric string.");
        }
        if (pesel.length() != 11) {
            throw new IllegalArgumentException("Invalid PESEL length.");
        }
    }
}
