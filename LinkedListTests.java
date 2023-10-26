import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTests {
    @Test
    public void testConstructor() {
        LinkedList l1 = new LinkedList();
        assertEquals(0, l1.length());
    }

    @Test
    public void testAppend() {
        LinkedList l1 = new LinkedList();
        l1.append(1);
        l1.append(10);
        l1.append(100);
        assertEquals("1 10 100 ", l1.toString());
    }

    @Test
    public void testFirst() {
        LinkedList l1 = new LinkedList();
        l1.prepend(100);
        l1.prepend(50);
        assertEquals(50, l1.first());
        l1.prepend(25);
        assertEquals(25, l1.first());
    }

    @Test
    public void testLast() {
        LinkedList l1 = new LinkedList();
        l1.append(10);
        assertEquals(10, l1.last());
        l1.prepend(5);
        assertEquals(10, l1.last());
        l1.append(30);
        assertEquals(30, l1.last());
        assertEquals(3, l1.length());
        assertEquals("5 10 30 ", l1.toString());

    }
}