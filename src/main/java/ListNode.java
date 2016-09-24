

/**
 * Created by borisgrunwald on 17/09/2016.
 */
public class ListNode<E> {

    public E data;
    public ListNode next;

    public ListNode(E data, ListNode<E> next) {

        this.data = data;
        this.next = next;

    }

    public ListNode(E data) {

        this(data, null);

    }

    public String toString() {

        return this.data + " next: " + this.next;

    }

}
