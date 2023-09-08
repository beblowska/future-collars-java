package task105;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
    private static final int MIN_LENGTH = 7;

   public static boolean validatePassword(String password) {
        return hasUppercaseLetter(password) &&
               hasDigit(password) &&
               hasMinimumLength(password) &&
               !containsCurrentYear(password);
    }

    private static boolean hasUppercaseLetter(String password) {
        Pattern pattern = Pattern.compile("[A-Z]");
        Matcher matcher = pattern.matcher(password);
        return matcher.find();
    }

    private static boolean hasDigit(String password) {
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(password);
        return matcher.find();
    }

    private static boolean hasMinimumLength(String password) {
        return password.length() >= MIN_LENGTH;
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
