package task24;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class AgeVerificationTest {

   @Test
    public void shouldTestValidAge() {
        AgeVerification verifier = new AgeVerification();
        assertTrue(verifier.isAgeValid(18));
    }

    @Test
    public void shouldTestInvalidAge() {
        AgeVerification verifier = new AgeVerification();
        assertFalse(verifier.isAgeValid(16));
    }
}

