package task91;

public class Main {
    public static void main(String[] args) {
        OwnHashmap map = new OwnHashmap()
                ;

        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");

        System.out.println("Map size: " + map.size());
        System.out.println("Contains key 'key1': " + map.containsKey("key1"));
        System.out.println("Contains value 'value2': " + map.containsValue("value2"));

        System.out.println("Value for 'key2': " + map.get("key2"));
        System.out.println("Removing 'key1': " + map.remove("key1"));

        System.out.println("Map size after removal: " + map.size());
        System.out.println("Contains key 'key1' after removal: " + map.containsKey("key1"));
    }
}

