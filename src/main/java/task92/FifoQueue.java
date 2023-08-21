package task92;

public class FifoQueue implements OwnQueue {
    private static final int INITIAL_CAPACITY = 10;
    private Integer[] array;
    private int front;
    private int rear;
    private int size;

    public FifoQueue() {
        array = new Integer[INITIAL_CAPACITY];
        front = 0;
        rear = -1;
        size = 0;
    }

    @Override
    public boolean add(Integer e) {
        ensureCapacity();

        rear = (rear + 1) % array.length;
        array[rear] = e;
        size++;
        return true;
    }

    @Override
    public Integer remove() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        Integer removedElement = array[front];
        array[front] = null;
        front = (front + 1) % array.length;
        size--;
        return removedElement;
    }

    @Override
    public Integer element() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return array[front];
    }

    private boolean isEmpty() {
        return size == 0;
    }

    private void ensureCapacity() {
        if (size == array.length) {
            Integer[] newArray = new Integer[array.length * 2];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[(front + i) % array.length];
            }
            array = newArray;
            front = 0;
            rear = size - 1;
        }
    }
}
