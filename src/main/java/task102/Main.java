package task102;

public class Main {
    public static void main(String[] args) {
        PeselValidator peselValidator = new PeselValidator();

        String pesel1 = "12345678901";
        String pesel2 = "987654321000";

        System.out.println("PESEL 1 is valid: " + peselValidator.validatePesel(pesel1));
        System.out.println("PESEL 2 is valid: " + peselValidator.validatePesel(pesel2));
    }
}
