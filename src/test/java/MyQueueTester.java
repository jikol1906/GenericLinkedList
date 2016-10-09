import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

/**
 * Created by borisgrunwald on 26/09/2016.
 */
public class MyQueueTester {

    MyQueue<String> q = new LinkedList<String>();

    @Before
    public void setUp() throws Exception {

        q.add("word");
        q.add("word2");
        q.add("word3");
        q.add("word4");

    }

    @Test
    public void testRemove() {

        q.remove();
        q.remove();

        assertEquals("word2", q.peek());
        assertEquals("[word, word2]", q.toString());


    }


}
