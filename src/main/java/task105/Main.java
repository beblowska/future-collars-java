package task105;

import static task105.PasswordValidator.validatePassword;

public class Main {
    public static void main(String[] args) {
        String password = "lub!eRower2028";
        boolean isValid = validatePassword(password);

        if (isValid) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is invalid.");
        }
    }
}
