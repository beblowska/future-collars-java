package task91;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OwnHashmapTest {
    private OwnHashmap map;

    @BeforeEach
    public void setUp() {
        map = new OwnHashmap();
    }

    @Test
    public void testPutAndGet() {
        map.put("key1", "value1");
        map.put("key2", "value2");

        assertEquals("value1", map.get("key1"));
        assertEquals("value2", map.get("key2"));
    }

    @Test
    public void testContainsKey() {
        map.put("key1", "value1");
        assertTrue(map.containsKey("key1"));
        assertFalse(map.containsKey("nonExistentKey"));
    }

    @Test
    public void testContainsValue() {
        map.put("key1", "value1");
        assertTrue(map.containsValue("value1"));
        assertFalse(map.containsValue("nonExistentValue"));
    }

    @Test
    public void testRemove() {
        map.put("key1", "value1");
        map.put("key2", "value2");
        assertEquals("value1", map.remove("key1"));
        assertNull(map.get("key1"));
        assertEquals("value2", map.remove("key2"));
        assertNull(map.get("key2"));
    }

    @Test
    public void testSize() {
        map.put("key1", "value1");
        map.put("key2", "value2");
        assertEquals(2, map.size());
        map.remove("key1");
        assertEquals(1, map.size());
        map.remove("key2");
        assertEquals(0, map.size());
    }
}

