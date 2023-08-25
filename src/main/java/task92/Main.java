package task92;

public class Main {
    public static void main(String[] args) {
        FifoQueue queue = new FifoQueue();

        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("First element: " + queue.element());

        System.out.println("Deleted element: " + queue.remove());
        System.out.println("Deleted element: " + queue.remove());

        queue.add(40);
        queue.add(50);

        System.out.println("First element after second add: " + queue.element());

        System.out.println("Deleted element: " + queue.remove());
        System.out.println("Deleted element: " + queue.remove());
    }
}
