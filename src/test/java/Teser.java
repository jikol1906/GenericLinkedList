import org.junit.Before;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Teser {


    static LinkedList<String> list = new LinkedList<String>();

     void addElements() {

        list.add("heh");
        list.add("nicelol");
        list.add("wut");

    }


    @Test
    public void addTest() {

        addElements();

        assertEquals(2, list.size());

    }

   /* public void addAtIndex() {

        list.add("hey", 2);

        assertEquals("hey",list.get(2));

    }*/

    //public void sizeTest() {



   // }



}