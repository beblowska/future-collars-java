package task105;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
    private static final int MIN_LENGTH = 7;

    public static boolean validatePassword(String password) {
        if (password.length() < MIN_LENGTH) {
            return false;
        }

        if (!containsUppercaseLetter(password)) {
            return false;
        }

        if (!containsDigit(password)) {
            return false;
        }

        if (containsCurrentYear(password)) {
            return false;
        }

        return true;
    }

    private static boolean containsUppercaseLetter(String password) {
        return password.chars().anyMatch(Character::isUpperCase);
    }

    private static boolean containsDigit(String password) {
        return password.chars().anyMatch(Character::isDigit);
    }

    private static boolean containsCurrentYear(String password) {
        int currentYear = LocalDate.now().getYear();
        String currentYearStr = String.valueOf(currentYear);
        String shortYearStr = currentYearStr.substring(2);

        return password.contains(currentYearStr) || password.contains(shortYearStr);
    }

    public static boolean containsSpecialCharacter(String password) {
        Pattern pattern = Pattern.compile("[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]");
        Matcher matcher = pattern.matcher(password);
        return matcher.find();
    }
}
