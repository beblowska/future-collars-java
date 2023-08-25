package task91;


public class OwnHashmap implements OwnMap {
    private static final int INITIAL_CAPACITY = 16;
    private Node[] buckets;
    private int size;

    public OwnHashmap() {
        buckets = new Node[INITIAL_CAPACITY];
        size = 0;
    }

    @Override
    public boolean put(String key, String value) {
        int index = getIndex(key);
        Node newNode = new Node(key, value);

        if (buckets[index] == null) {
            buckets[index] = newNode;
        } else {
            Node current = buckets[index];
            while (current.next != null) {
                if (current.key.equals(key)) {
                    current.value = value;
                    return true;
                }
                current = current.next;
            }
            if (current.key.equals(key)) {
                current.value = value;
                return true;
            }
            current.next = newNode;
        }

        size++;
        return true;
    }

    @Override
    public boolean containsKey(String key) {
        int index = getIndex(key);
        Node current = buckets[index];

        while (current != null) {
            if (current.key.equals(key)) {
                return true;
            }
            current = current.next;
        }

        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        for (Node bucket : buckets) {
            Node current = bucket;
            while (current != null) {
                if (current.value.equals(value)) {
                    return true;
                }
                current = current.next;
            }
        }

        return false;
    }

    @Override
    public String remove(String key) {
        int index = getIndex(key);
        Node current = buckets[index];
        Node previous = null;

        while (current != null) {
            if (current.key.equals(key)) {
                if (previous == null) {
                    buckets[index] = current.next;
                } else {
                    previous.next = current.next;
                }
                size--;
                return current.value;
            }
            previous = current;
            current = current.next;
        }

        return null;
    }

    @Override
    public String get(String key) {
        int index = getIndex(key);
        Node current = buckets[index];

        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }

        return null;
    }

    private int getIndex(String key) {
        return Math.abs(key.hashCode()) % buckets.length;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (Node bucket : buckets) {
            Node current = bucket;
            while (current != null) {
                sb.append(current.key).append("=").append(current.value).append(", ");
                current = current.next;
            }
        }
        if (sb.length() > 1) {
            sb.setLength(sb.length() - 2); // remove the trailing comma and space
        }
        sb.append("}");
        return sb.toString();
    }

    public int size() {
        return size;
    }

    private static class Node {
        String key;
        String value;
        Node next;

        Node(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}

