package task93;

public class OwnGenericListTest {
    public static void main(String[] args) {
        OwnGenericList<Integer> list = new OwnGenericList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("List size: " + list.size());

        System.out.println("Element at index 1: " + list.get(1));

        list.remove(Integer.valueOf(20));

        System.out.println("List size after removing 20: " + list.size());

        System.out.println("Elements in the list:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
