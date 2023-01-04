package lab11.task1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TestMultiMapValue {
    private MultiMapValue<String, String> map;

    @BeforeEach
    public void setup() {
        map = new MultiMapValue<>();
    }

    @AfterEach
    public void clean() {
        map = null;
    }

    @Test
    public void testAddElementWithOneValue() {
        map.add("key", "value");
        Assertions.assertFalse(map.isEmpty());
        Assertions.assertEquals(1, map.size());
        Assertions.assertEquals(1, map.getValues("key").size());
    }

    @Test
    public void testAddElementWithMoreValues() {
        map.add("key", "value1");
        map.add("key", "value2");
        Assertions.assertFalse(map.isEmpty());
        Assertions.assertEquals(1, map.size());
        Assertions.assertEquals(2, map.getValues("key").size());
    }

    @Test
    public void testAddTwoElements() {
        map.add("key", "value1");
        map.add("keylo", "ana are mere");
        Assertions.assertFalse(map.isEmpty());
        Assertions.assertEquals(2, map.size());
        Assertions.assertEquals(1, map.getValues("key").size());
        Assertions.assertEquals(1, map.getValues("keylo").size());
    }

    @Test
    public void testGetFirst() {
        map.add("key", "value1");
        map.add("key", "value2");
        Assertions.assertEquals("value1", map.getFirst("key"));
    }

    @Test
    public void testContainsKey() {
        map.add("key", "value1");
        map.add("keylo", "ana are mere");
        Assertions.assertTrue(map.containsKey("keylo"));
    }

    @Test
    public void testSize() {
        map.add("key", "value1");
        map.add("key", "value2");
        Assertions.assertEquals(2, map.size());
    }

    @Test
    public void testRemoveKey() {
        map.add("key", "value1");
        map.add("keylo", "value2");
        map.remove("keylo");
        Assertions.assertEquals(1, map.size());
    }

    @Test
    public void testAddAllWithList() {
        ArrayList<String> test = new ArrayList<>();
        test.add("Marian");
        test.add("Landar");
        map.addAll("key", test);
        Assertions.assertEquals("Marian", map.getFirst("key"));
    }

    @Test
    public void testAddAllWithMultiMapValue() {
        map.add("key", "value1");
        map.add("keylo", "value2");
        MultiMapValue<String, String> map2 = new MultiMapValue<>();
        map2.addAll(map);
        Assertions.assertEquals(2, map2.size());
    }
}
