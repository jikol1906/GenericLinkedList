

/**
 * Created by borisgrunwald on 26/09/2016.
 */
public interface MyQueue<E> extends Iterable<E> {

    public void add(E data);

    public E remove();

    public boolean isEmpty();

    public E peek();

    public int size();

}
