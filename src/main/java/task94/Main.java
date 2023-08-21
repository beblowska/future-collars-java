package task94;

public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Age", 25);
        System.out.println(pair1.getKey() + ": " + pair1.getValue());

        Pair<String, String> pair2 = new Pair<>("Name", "John");
        System.out.println(pair2.getKey() + ": " + pair2.getValue());
    }
}