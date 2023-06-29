package project;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class AgeVerificationTest {

   @Test
    public void shouldTestValidAge() {
        AgeVerification verifier = new AgeVerification();
        assertTrue(verifier.isAgeValid(18));
        assertTrue(verifier.isAgeValid(22));
        assertTrue(verifier.isAgeValid(45));
    }

    @Test
    public void shouldTestInvalidAge() {
        AgeVerification verifier = new AgeVerification();
        assertFalse(verifier.isAgeValid(16));
        assertFalse(verifier.isAgeValid(15));
        assertFalse(verifier.isAgeValid(10));
    }
}

