package task69;

public class DivisionValidator {
    public void validate(int[] values) {
        for (int value : values) {
            try {
                validateNumber(value);
            } catch (IllegalArgumentException exception) {
                System.out.println("Invalid number: " + value +". " + exception.getMessage());
            }
        }
    }
    private void validateNumber(int number) {
        if (number % 3 != 0) {
            throw new IllegalArgumentException("Number is not divided by 3.");
        }
    }
}
