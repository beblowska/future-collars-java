package task95;

import static task95.BubbleSort.bubbleSort;
import static task95.BubbleSort.printArray;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original array:");
        printArray(intArray);

        bubbleSort(intArray);
        System.out.println("Sorted array:");
        printArray(intArray);

        String[] stringArray = {"apple", "orange", "banana", "kiwi", "grape"};
        System.out.println("Original array:");
        printArray(stringArray);

        bubbleSort(stringArray);
        System.out.println("Sorted array:");
        printArray(stringArray);
    }
}
