package task103;

public class Main {
    public static void main(String[] args) {
        UrlValidator urlValidator = new UrlValidator();

        String url1 = "http://www.onet.pl";
        String url2 = "https://mail.google.com";
        String url3 = "http://wiadomosci.onet.pl";
        String url4 = "http://onet.pl";

        System.out.println("URL 1 is valid: " + urlValidator.validateUrl(url1));
        System.out.println("URL 2 is valid: " + urlValidator.validateUrl(url2));
        System.out.println("URL 3 is valid: " + urlValidator.validateUrl(url3));
        System.out.println("URL 4 is valid: " + urlValidator.validateUrl(url4));
    }
}
