package task72;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextConverterTest {


    @ParameterizedTest
    @ValueSource(strings = {"Hello"})
    public void testConvertToUpperCase(String input) {
        TextConverter textConverter = new TextConverter();
        String converted = textConverter.convertToUpperCase(input);
        assertEquals(input.toUpperCase(), converted);
    }

    @Test
    public void testConvertToUpperCaseWithNull() {
        TextConverter textConverter = new TextConverter();
        String converted = textConverter.convertToUpperCase(null);
        assertEquals(null, converted);
    }

    @Test
    public void testConvertToUpperCaseWithEmptyString() {
        TextConverter textConverter = new TextConverter();
        String converted = textConverter.convertToUpperCase("");
        assertEquals("", converted);
    }
}

