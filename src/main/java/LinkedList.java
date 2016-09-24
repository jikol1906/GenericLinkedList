

/**
 * Created by borisgrunwald on 17/09/2016.
 */
public class LinkedList<E> {

    private ListNode<E> front;


    public LinkedList() {

        front = null;

    }

    public void add(E data) {

        if(front == null) {

            front = new ListNode<E>(data);

        } else {

            ListNode curr = front;

            while(curr.next != null) {
                curr = curr.next;
            }

            curr.next = new ListNode<E>(data);

        }


    }

    public void add(E data, int index) {

        if(front == null && index != 0) {
            throw new IndexOutOfBoundsException();
        }

        ListNode curr = front;

        for(int i = 0; i < index-1; i++) {

            curr = curr.next;

        }

        curr.next = new ListNode<E>(data, curr.next);

    }

    public E get(int index) {

        ListNode<E> curr = nodeAt(index);

        return curr.data;

    }

    public int size() {

        if(front == null) {
            return 0;
        }

        int count = 1;

        ListNode curr = front;

        while(curr.next != null) {
            count++;
            curr = curr.next;
        }

        return count;

    }

    private ListNode<E> nodeAt(int index) {

        ListNode curr = front;

        for(int i = 0; i < index; i++) {

            curr = curr.next;

        }

        return curr;


    }



    @Override
    public String toString() {

        if(front == null) {

            return "[]";

        } else {

            String toReturn = "[" + front.data;

            ListNode curr = front.next;

            while(curr != null) {
                toReturn += curr.data + ", ";
                curr = curr.next;
            }

            return toReturn + "]";

        }

    }



}
