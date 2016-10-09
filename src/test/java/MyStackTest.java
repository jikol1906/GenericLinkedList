import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by borisgrunwald on 27/09/2016.
 */
public class MyStackTest {

    MyStack<String> s = new LinkedList<String>();

    @Before
    public void setUp() throws Exception {

        s.push("1");
        s.push("2");
        s.push("3");
        s.push("4");
        s.push("5");
        s.push("6");

    }

    @Test
    public void pop() throws Exception {

        s.pop();
        s.pop();

        assertEquals("4", s.peek());

    }

    @Test
    public void push() throws Exception {

    }

}