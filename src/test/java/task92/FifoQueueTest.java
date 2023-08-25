package task92;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FifoQueueTest {
    private OwnQueue queue;

    @BeforeEach
    void setUp() {
        queue = new FifoQueue();
    }

    @Test
    void testAddAndRemove() {
        queue.add(1);
        queue.add(2);

        assertEquals(1, queue.remove());
        assertEquals(2, queue.remove());
    }

    @Test
    void testElement() {
        queue.add(1);
        queue.add(2);

        assertEquals(1, queue.element());
        assertEquals(1, queue.element());
    }

    @Test
    void testRemoveOnEmptyQueue() {
        assertThrows(IllegalStateException.class, () -> queue.remove());
    }

    @Test
    void testElementOnEmptyQueue() {
        assertThrows(IllegalStateException.class, () -> queue.element());
    }
}
