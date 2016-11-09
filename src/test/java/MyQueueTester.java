import org.junit.Before;
import org.junit.Test;


import java.util.Iterator;

import static org.junit.Assert.assertEquals;

/**
 * Created by borisgrunwald on 26/09/2016.
 */
public class MyQueueTester {

    MyQueue<String> q = new LinkedList<String>();
    MyQueue<String> q2 = new LinkedList<String>();

    @Before
    public void setUp() throws Exception {

        q.add("word");
        q.add("word2");
        q.add("word3");
        q.add("word4");

        q2.add("word");
        q2.add("word2");
        q2.add("word3");
        q2.add("word4");

    }

    @Test
    public void testRemove() {

        q.remove();
        q.remove();

        assertEquals("word2", q.peek());
        assertEquals("[word, word2]", q.toString());


    }

    @Test
    public void testIterator() throws Exception {

        Iterator<String> it = q.iterator();

        assertEquals("word", it.next());
        assertEquals("word2", it.next());
        assertEquals("word3", it.next());
        assertEquals("word4", it.next());

        Iterator<String> it2 = q2.iterator();

        while(it2.hasNext()) {
            String first = it2.next();
            if(first.equals("word2")) {
                it2.remove();
            }
        }

        assertEquals("[word, word3, word4]", q2.toString());



    }
}
