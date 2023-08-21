package task93;

import java.util.Arrays;

public class OwnGenericList<E> implements OwnList {
    private static final int DEFAULT_CAPACITY = 10;

    private Object[] array;
    private int size;

    public OwnGenericList() {
        array = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public boolean add(Object e) {
        ensureCapacity();
        array[size++] = e;
        return true;
    }

    @Override
    public E get(int index) {
        checkBounds(index);
        return (E) array[index];
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(array[i])) {
                int numMoved = size - i - 1;
                if (numMoved > 0) {
                    System.arraycopy(array, i + 1, array, i, numMoved);
                }
                array[--size] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    private void ensureCapacity() {
        if (size == array.length) {
            int newCapacity = array.length * 2;
            array = Arrays.copyOf(array, newCapacity);
        }
    }

    private void checkBounds(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range: " + index);
        }
    }
}