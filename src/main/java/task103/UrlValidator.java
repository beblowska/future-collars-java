package task103;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UrlValidator {
    private static final String URL_PATTERN = "^(http|https)://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}(/\\S*)?$";
    private Pattern urlRegex;

    public UrlValidator() {
        urlRegex = Pattern.compile(URL_PATTERN);
    }

    public boolean validateUrl(String url) {
        Matcher matcher = urlRegex.matcher(url);
        return matcher.matches();
    }
}
