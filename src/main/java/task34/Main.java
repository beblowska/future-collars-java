package task34;

public class Main {
    public static void main(String[] args) {
        int minutes = 10;
        int seconds = TimeConverter.minutesToSeconds(minutes);
        System.out.println(minutes + " minutes is equal to " + seconds + " seconds.");
    }
}
