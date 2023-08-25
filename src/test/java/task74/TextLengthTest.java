package task74;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TextLengthTest {
    public static Stream<String> provideTexts() {
        return Stream.of(
                "Hello"
        );
    }

    @ParameterizedTest
    @MethodSource("provideTexts")
    public void testTextLength(String text) {
        int expectedLength = text.length();
        int actualLength = TextLength.getTextLength(text);
        Assertions.assertEquals(expectedLength, actualLength);
    }
}
