package task24;

public class Main {
    public static void main(String[] args) {

        AgeVerification verifier = new AgeVerification();

        int age = 22;

        boolean isValid = verifier.isAgeValid(age);

        System.out.println("Podany wiek jest większy lub równy 18: " + isValid);

    }
}

