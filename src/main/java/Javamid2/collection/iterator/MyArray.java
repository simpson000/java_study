package Javamid2.collection.iterator;

import java.util.Iterator;

public class MyArray implements Iterable<Integer> {
    private int[] array;

    public MyArray(int[] array) {
        this.array = array;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyArrayIterator(array);
    }
}
