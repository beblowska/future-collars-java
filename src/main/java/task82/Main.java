package task82;

public class Main {
    public static void main(String[] args) {
        OwnList list = new OwnArrayList();

        list.add(5);
        list.add(10);
        list.add(15);

        System.out.println("Size of the list: " + list.size());
        System.out.println("Element at index 1: " + list.get(1));

        list.add(1, 20);
        list.remove(2);

        System.out.println("Size of the list after modifications: " + list.size());
        System.out.println("Element at index 1 after modifications: " + list.get(1));
    }
}
