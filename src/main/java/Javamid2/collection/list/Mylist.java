package Javamid2.collection.list;

public interface Mylist<E> {
    int size();

    void add (int index, E e);

    void add(E e);

    E remove (int index);

    E get (int index);

    E set (int index, E e);

    int indexOf (E e);


}
