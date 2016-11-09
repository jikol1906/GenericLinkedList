import java.util.Iterator;

/**
 * Created by borisgrunwald on 17/09/2016.
 */
public class Linkedlisttest {

    public static void main(String[] args) {

        MyQueue<String> q = new LinkedList<String>();

        q.add("hey");
        q.add("heyhey");
        q.add("lol");

        Iterator<String> it = q.iterator();

        it.remove();

        System.out.println(q);






    }



}
