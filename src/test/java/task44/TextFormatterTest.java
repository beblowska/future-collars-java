package task44;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextFormatterTest {
    @Test
    public void shouldFormatUppercase() {
        TextFormatter formatter = new UppercaseFormatter();

        String input = "Hello";
        String expectedOutput = "HELLO";
        String formattedText = formatter.formatText(input);

        assertEquals(expectedOutput, formattedText);
    }

    @Test
    public void shouldFormatLowercase() {
        TextFormatter formatter = new LowercaseFormatter();

        String input = "Hello";
        String expectedOutput = "hello";
        String formattedText = formatter.formatText(input);

        assertEquals(expectedOutput, formattedText);
    }
}
