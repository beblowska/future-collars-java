package task102;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PeselValidator {
    private static final String PESEL_PATTERN = "^[0-9]{11}$";
    private Pattern peselRegex;

    public PeselValidator() {
        peselRegex = Pattern.compile(PESEL_PATTERN);
    }

    public boolean validatePesel(String pesel) {
        Matcher matcher = peselRegex.matcher(pesel);
        return matcher.matches();
    }
}
