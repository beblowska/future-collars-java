package task93;

public class Main {
    public static void main(String[] args) {
        OwnGenericList<String> list = new OwnGenericList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("List size: " + list.size());

        System.out.println("Element at index 1: " + list.get(1));

        list.remove("Banana");

        System.out.println("List size after removing 'Banana': " + list.size());

        System.out.println("Elements in the list:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
