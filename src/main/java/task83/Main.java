package task83;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<String> list = new DoublyLinkedList<>();

        list.add("Anna");
        list.add("Katarzyna");
        list.add("Tymon");

        System.out.println("Size of the list: " + list.size());

        list.add(1, "Piotr");

        System.out.println("Size of the list after adding: " + list.size());

        System.out.println("Element at index 2: " + list.get(2));

        list.remove(1);

        System.out.println("Size of the list after removal: " + list.size());
    }
}
