import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class LinkedListTest {


    LinkedList<String> list;

    @Before
    public void setUp() throws Exception {

        list = new LinkedList<String>();

        list.add("heh");
        list.add("nicelol");
        list.add("wut");
        list.add("word");
        list.add("anotherword");


    }

    @Test
    public void testGet() {

        assertEquals("nicelol", list.get(1));
        assertEquals("anotherword", list.get(4));

    }

    @Test
    public void addTest() {

        list.add("nice");

        assertEquals(6, list.size());
        assertEquals("nice", list.get(5));


    }


    @Test
    public void addAtSpecificIndex() {

        list.add("hey", 2);
        list.add("word", 4);

        assertEquals("hey", list.get(2));
        assertEquals("word", list.get(4));


    }

    @Test
    public void removeTest() {

        list.remove(0);
        list.remove(3);
        list.remove(2);

        assertNotEquals("heh", list.get(0));
        assertEquals("nicelol", list.get(0));
        assertEquals("wut", list.get(1));

    }





}