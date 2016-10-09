import java.util.Iterator;

/**
 * Created by borisgrunwald on 17/09/2016.
 */
public class LinkedList<E> implements MyQueue<E>, MyStack<E> {

    private ListNode<E> front;
    private int size = 0;


    public LinkedList() {

        front = null;

    }

    public void add(E data) {

        if (front == null) {

            front = new ListNode<E>(data);

        } else {


            ListNode curr = front;

            while (curr.next != null) {

                curr = curr.next;

            }

            curr.next = new ListNode<E>(data);
        }

        size++;


    }


    public void add(E data, int index) {

        if (front == null && index != 0) {
            throw new IndexOutOfBoundsException();
        }

        ListNode curr = nodeAt(index - 1);

        curr.next = new ListNode<E>(data, curr.next);

        size++;

    }

    public void remove(int index) {

        if (front == null) {
            throw new IndexOutOfBoundsException("Cannot remove from empty list");
        }

        if (index == 0) {
            front = front.next;
        } else {
            ListNode<E> curr = nodeAt(index - 1);

            if (curr.next == null) {
                throw new IndexOutOfBoundsException("Index > size");
                //If it is the last node in the list.
            } else if (curr.next.next == null) {
                curr.next = null;
                //If it is neither last or front node.
            } else {
                curr.next = curr.next.next;
            }


        }

        size--;


    }

    public E get(int index) {

        ListNode<E> curr = nodeAt(index);

        return curr.data;

    }

    public int size() {
        return size;
    }

    public void clear() {

        front = null;

    }

    private ListNode<E> nodeAt(int index) {

        if (index > size) {
            throw new IndexOutOfBoundsException("Index > size");
        }

        ListNode curr = front;

        for (int i = 0; i < index; i++) {

            curr = curr.next;

        }

        return curr;


    }


    public boolean isEmpty() {

        if (front == null) {
            return true;
        }

        return false;

    }


    @Override
    public String toString() {

        if (front == null) {

            return "[]";

        } else {

            String toReturn = "[" + front.data;

            ListNode curr = front.next;

            while (curr != null) {
                toReturn += ", " + curr.data;
                curr = curr.next;
            }

            return toReturn + "]";

        }

    }

    //MyQueue operations

    public E remove() {

        if (front == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }

        ListNode<E> curr = nodeAt(size() - 2);
        ListNode<E> temp = curr.next;
        curr.next = null;
        size--;
        return temp.data;
    }

    public E peek() {

        if (front == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }

        ListNode<E> curr = nodeAt(size() - 1);
        return curr.data;

    }

    //MyStack operations

    public E pop() {

        ListNode<E> temp = nodeAt(size - 1);
        remove(size - 1);
        return temp.data;

    }

    public void push(E data) {

        add(data);

    }

//___________________________ITERATOR________________________//


    public Iterator<E> iterator() {
        return new It();
    }

    private class It implements Iterator<E> {

        ListNode<E> current;
        int index;


        public It() {
            current = front;
            index = 0;
        }

        public boolean hasNext() {

            return current != null;
        }

        public void remove() {

            LinkedList.this.remove(index-1);

        }

        public E next() {
            E temp = current.data;
            current = current.next;
            index++;
            return temp;
        }
    }
}
