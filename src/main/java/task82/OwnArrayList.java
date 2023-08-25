package task82;


public class OwnArrayList implements OwnList{
    private static final int INITIAL_CAPACITY = 10;
    private Integer[] array;
    private int size;

    public OwnArrayList() {
        array = new Integer[INITIAL_CAPACITY];
        size = 0;
    }
    @Override
    public int size() {
        return size;
    }
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void add(Integer element) {
        ensureCapacity();
        array[size++] = element;
    }
    @Override
    public Integer get(int index) {
        checkBounds(index);
        return array[index];
    }
    @Override
    public void add(int index, Integer element) {
        checkBoundsForAdd(index);
        ensureCapacity();
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = element;
        size++;
    }
    @Override
    public Integer remove(int index) {
        checkBounds(index);
        Integer removedElement = array[index];
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        array[--size] = null;
        return removedElement;
    }
    private void ensureCapacity() {
        if (size == array.length) {
            Integer[] newArray = new Integer[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
    }
    private void checkBounds(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range: " + index);
        }
    }
    private void checkBoundsForAdd(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of range: " + index);
        }
    }
}
