package task111;

public class Main {
    public static void main(String[] args) {
        int start = 1;
        int end = 100;

        DivisibleBy3Finder.findDivisibleBy3(start, end)
                .forEach(System.out::println);
    }
}
